package gameControllers;

import java.util.HashMap;

import enums.DifficultyType;
import models.Level;
import models.PowerUp;

public class Hell {
	
	private DifficultyType difficultyType;
	private int difficultySoulIncomeMultiplier;
	private HashMap<Integer, Level> levelManager;
	private PowerUp[] powerUpArray = new PowerUp[4];
	private static int totalSoulModifier;
	private int currentAmountOfSouls;
	
	public Hell() {
		
	}
	private void createLevels(){
		
		int levelNumber;
		int maxSoulCap = 10000;
		int currentSoulAmount = getCurrentAmountOfSouls();
		
		for(int i =0; i < 7; i++){
			levelNumber = i + 1;
			Level l = new Level(levelNumber, maxSoulCap, currentSoulAmount);
			levelManager.put(levelNumber,l);
		}
	}
	
	private boolean levelCapacityManager(int levelNumber) {
		boolean maxMet = false;
		Level l = levelManager.get(levelNumber);
		if(l.getCurrentSoulAmount() >= l.getMaxSoulCap()){
			l.setCurrentSoulAmount(l.getMaxSoulCap());
			maxMet = true;
		}
		return maxMet;
	}
	
	private String displayerLevelMaxCapacity(int levelNumber) {
		StringBuilder maxCapacity = new StringBuilder();
		Level l = levelManager.get(levelNumber);
		maxCapacity.append(l.getMaxSoulCap());
		
		return maxCapacity.toString();
	}
	
	private String displayLevelCurrentCapacity(int levelNumber) {
		
		StringBuilder currentCapacity = new StringBuilder();
		Level l = levelManager.get(levelNumber);
		currentCapacity.append(l.getCurrentSoulAmount());
		
		return currentCapacity.toString();
		
	}
	
	private void maxCapModifier() {
		boolean isFilled;
		int passiveMod = 0;
		Level l = null;
		for(int i = 0; i < 7; i++){
			isFilled = levelCapacityManager((i+1));
			if(isFilled){
				l = levelManager.get(i+1);
				passiveMod  +=  l.getMaxSoulCapModifier();
				modifierModifier(passiveMod);
			}
		}
	}
	
	private void createPowerUps() {
		int baseSoulFee = 0;
		int soulFee;
		int powerUpTier;
		
		
		for(int i = 0; i < 4; i++){
			powerUpTier = i +1;
		if(i == 0){
			baseSoulFee = 2500;
			PowerUp pu = new PowerUp(baseSoulFee, powerUpTier);
			powerUpArray[i] = pu;
		}else{
			double temp = baseSoulFee * .5;
			soulFee = (int) (baseSoulFee + temp);
			PowerUp pu = new PowerUp(soulFee, powerUpTier);
			powerUpArray[i] = pu;
			}
		}
	}
	private void powerUpManager() {
		int tierOneCounter;
		int tierTwoCounter;
		int tierThreeCounter;
		int tierFourCounter;
		
		
	}
	
	
	private void tierOnePowerUps() {
		
	}
	
	private void tierTwoPowerUps() {
		
	}
	
	private void tierThreePowerUps() {
		
	}
	
	private void tierFourPowerUps() {
		
	}
	
	private void modifierModifier(int modifier) {
		
		totalSoulModifier += modifier;
		
	}

	public DifficultyType getDifficultyType() {
		return difficultyType;
	}

	public void setDifficultyType(DifficultyType difficultyType) {
		this.difficultyType = difficultyType;
	}

	public int getDifficultySoulIncomeMultiplier() {
		return difficultySoulIncomeMultiplier;
	}

	public void setDifficultySoulIncomeMultiplier(int difficultySoulIncomeMultiplier) {
		this.difficultySoulIncomeMultiplier = difficultySoulIncomeMultiplier;
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

	public int getTotalSoulModifier() {
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

	
}
