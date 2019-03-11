package gameControllers;

import java.util.HashMap;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import models.Level;
import models.PowerUp;

public class Hell {

	private HashMap<Integer, Level> levelManager = new HashMap<>();
	private PowerUp[] powerUpArray = new PowerUp[4];
	private static float totalSoulModifier;
	private int currentAmountOfSouls;
	private int maxSoulsPossible;
	private Timer income = new Timer(true);

	public Hell(int difficultySoulIncomeMultiplier) {
		createLevels();
		createPowerUps();
		appendLevelData();
		appendPowerUpData();
		modifierModifier(difficultySoulIncomeMultiplier/2f);
		maxSoulsPossible();
		soulIncomeManager();
	}
	
	private void createLevels() {

		int levelNumber;
		int maxSoulCap = 10000;
		int currentSoulAmount = getCurrentAmountOfSouls();

		for (int i = 0; i < 7; i++) {
			levelNumber = i + 1;
			Level l = new Level(levelNumber, maxSoulCap, currentSoulAmount);
			levelManager.put(levelNumber, l);
		}
	}

	public boolean fillALevel(int level, int amountToAdd) {
		boolean maxMet = false;
		Level l = levelManager.get(level);
		if (amountToAdd >= l.getMaxSoulCap() - l.getCurrentSoulAmount()) {
			setCurrentAmountOfSouls(getCurrentAmountOfSouls() + (l.getCurrentSoulAmount() - l.getMaxSoulCap())); 
			l.setCurrentSoulAmount(l.getMaxSoulCap());
			maxMet = true;
		}
		return maxMet;
	}

	public String displayerLevelMaxCapacity(int levelNumber) {
		StringBuilder maxCapacity = new StringBuilder();
		Level l = levelManager.get(levelNumber);
		maxCapacity.append(l.getMaxSoulCap());

		return maxCapacity.toString();
	}

	public String displayLevelCurrentCapacity(int levelNumber) {

		StringBuilder currentCapacity = new StringBuilder();
		Level l = levelManager.get(levelNumber);
		currentCapacity.append(l.getCurrentSoulAmount());

		return currentCapacity.toString();

	}

	private void maxCapModifier() {
		boolean isFilled;
		int passiveMod = 0;
		Level l = null;
		for (int i = 0; i < 7; i++) {
			isFilled = fillALevel((i + 1), 0);
			if (isFilled) {
				l = levelManager.get(i + 1);
				passiveMod += l.getMaxSoulCapModifier();
				modifierModifier(passiveMod);
			}
		}
	}

	private void createPowerUps() {
		int baseSoulFee = 0;
		int soulFee;
		int powerUpTier;

		for (int i = 0; i < 4; i++) {
			powerUpTier = i + 1;
			if (i == 0) {
				baseSoulFee = 2500;
				PowerUp pu = new PowerUp(baseSoulFee, powerUpTier);
				powerUpArray[i] = pu;
			} else {

				int temp = baseSoulFee * i+1;
				soulFee = baseSoulFee + temp;
				PowerUp pu = new PowerUp(soulFee, powerUpTier);
				powerUpArray[i] = pu;
			}
		}
	}

	private void powerUpManager(int powerUpSelected) {
		PowerUp pu = null;
		int tierOneCounter;
		int tierTwoCounter;
		int tierThreeCounter;
		int tierFourCounter;

		tierOneCounter = 0;
		tierTwoCounter = 0;
		tierThreeCounter = 0;
		tierFourCounter = 0;

		if (tierOneCounter < 4 && powerUpSelected == 1) {
			tierOneCounter++;
			pu = powerUpArray[0];
			powerUpUpgrader(pu);
			modifierModifier(pu.getPowerupmodifier());
			System.out.println(pu.getPowerupmodifier());
			pu = null;
		}else {
			//make unavailable
		}
		if (tierTwoCounter < 4 && powerUpSelected == 2) {
			tierTwoCounter++;
			pu = powerUpArray[1];
			powerUpUpgrader(pu);
			modifierModifier(pu.getPowerupmodifier());
			System.out.println(pu.getPowerupmodifier());
			pu = null;
		}
		if (tierThreeCounter < 4 && powerUpSelected == 3) {
			tierThreeCounter++;
			pu = powerUpArray[2];
			powerUpUpgrader(pu);
			modifierModifier(pu.getPowerupmodifier());
			System.out.println(pu.getPowerupmodifier());
			pu = null;
		}
		if (tierFourCounter < 4 && powerUpSelected == 4) {
			tierFourCounter++;
			pu = powerUpArray[3];
			powerUpUpgrader(pu);
			modifierModifier(pu.getPowerupmodifier());
			System.out.println(pu.getPowerupmodifier());
			pu = null;
		}

	}

	private void powerUpUpgrader(PowerUp powerUp) {
		
		powerUp.setSoulFee((int)Math.round(powerUp.getSoulFee() * .5));
		
	}

	private void modifierModifier(float modifier) {

		totalSoulModifier += modifier;

	}

	private void soulIncomeManager() {

		TimerTask incomePerTick = new TimerTask() {

			@Override
			public void run() {

				if(getCurrentAmountOfSouls() > getMaxSoulsPossible()) {
					setCurrentAmountOfSouls(getMaxSoulsPossible());
					income.cancel();
				}
				setCurrentAmountOfSouls(getCurrentAmountOfSouls() + Math.round((10 * getTotalSoulModifier())));
				System.out.println(getCurrentAmountOfSouls());
				//make this method return an int and tie the int a progress chart that shows the user how many souls are left to collect
				
			}
			
		};
		
		income.scheduleAtFixedRate(incomePerTick, 0, 1);
		
	}
	
	private void maxSoulsPossible() {
		int soulsNeededForLevels = 0;
		for(int i = 0; i < levelManager.size(); i++) {			
			soulsNeededForLevels += levelManager.get(i+1).getMaxSoulCap();
			if(i < 4) {
				soulsNeededForLevels += powerUpArray[i].getSoulFee();
			}
		}
		setMaxSoulsPossible(soulsNeededForLevels);
	}

	public HashMap<Integer, Level> getLevelManager() {
		return levelManager;
	}

	public void setLevelManager(HashMap<Integer, Level> levelManager) {
		this.levelManager = levelManager;
	}

	public PowerUp[] getPowerUpArray() {
		return powerUpArray;
	}

	public void setPowerUpArray(PowerUp[] powerUpArray) {
		this.powerUpArray = powerUpArray;
	}

	public float getTotalSoulModifier() {
		return totalSoulModifier;
	}

	public int getCurrentAmountOfSouls() {
		return currentAmountOfSouls;
	}

	public void setCurrentAmountOfSouls(int currentAmountOfSouls) {
		this.currentAmountOfSouls = currentAmountOfSouls;
	}

	public static void setTotalSoulModifier(int totalSoulModifier) {
		Hell.totalSoulModifier = totalSoulModifier;
	}

	public int getMaxSoulsPossible() {
		return maxSoulsPossible;
	}

	public void setMaxSoulsPossible(int maxSoulsPossible) {
		this.maxSoulsPossible = maxSoulsPossible;
	}

	private String appendLevelData() {
		StringBuilder sb = new StringBuilder();
		Level l = null;
		
		for(int i = 0; i < levelManager.size(); i++) {
				l = levelManager.get(i + 1);
				sb.append(l.toString()).append("\r");
		}
		return sb.toString();
	}
	
	private String appendPowerUpData() { 
		StringBuilder sb = new StringBuilder();
		PowerUp pu = null;
		
		for(int i = 0; i < 4; i++) {
			pu = powerUpArray[i];
			sb.append(pu.toString()).append("\r");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Difficulty: ").append("arbtriary\r")
		.append("Passive modifier: ").append(getTotalSoulModifier()).append("\r")
		.append(appendPowerUpData()).append(appendLevelData());
		return builder.toString();
	}

}
