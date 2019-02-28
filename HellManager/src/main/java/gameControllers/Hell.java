package gameControllers;

import java.util.HashMap;

import enums.DifficultyType;
import enums.SoulType;
import models.Level;
import models.PowerUp;
import models.Soul;

public class Hell {
	
	private DifficultyType difficultyType;
	private int difficultySoulIncomeMultiplier;
	private HashMap<Integer, Level> levelManager;
	private int passiveLevelCapModifier;
	private PowerUp[] powerUpArray = new PowerUp[4];
	private int currentAmountOfSouls;
	
	public Hell() {
		
	}
	
	private Soul createSoul() {
		SoulType soulType = SoulType.REPENTANCE;
		Soul soul = new Soul(soulType);
		
		return soul;
	}
	private void createLevels(){
		int levelNum;
		int maxSoulCap;
		int currentSoulAmount = getCurrentSoulAmount();
		
		for(int i =0; i < 7; i++){
			levelNum = i + 1;
			if(levelNum == 1){
				maxSoulCap = 10,000;(arbitrary)
			}else{
				int temp = maxSoulCap * .20;
				maxSoulCap += temp;
			}
			Level l = new Level(levelNumber, maxSoulCap, currentSoulAmount);
			levelManager.put(levelNumber,l);
		}
	}
	private Level getLevel() {
		
		
		return new Level(0,0,0,0);
	}
	
	private boolean levelCapacityManager(int levelNumber) {
		boolean maxMet = false
		Level l = levelManager.get(levelNumber);
		if(l.getCurrentSoulAmount() >= l.getMaxSoulCap()){
			l.setCurrentSoulAmount() = l.getMaxSoulCap();
			maxMet = true;
		}
		return maxMet;
	}
	
	private String displayLevelMaxCapacity(int levelNumber) {
		StringBuiler maxCapacity = new StringBuilder();
		Level l = levelManager.get(levelNumber);
		maxCapacity.append(l.getMaxSoulCap());
		return maxCapacity.toString();
	}
	
	private String displayLevelCurrentCapacity() {
		StringBuiler maxCapacity = new StringBuilder();
		Level l = levelManager.get(levelNumber);
		maxCapacity.append(l.getCurrentSoulAmount());
		return maxCapacity.toString();
	}
	
	private int maxCapModifier(Level levelFilled) {
		
		
		return 0;
	}
	
	private void powerUpManager() {
		
	}
	
	private void createPowerUps() {
		
	}
	
	private void tierOnePowerUps() {
		
	}
	
	private void tierTwoPowerUps() {
		
	}
	
	private void tierThreePowerUps() {
		
	}
	
	private void tierFourPowerUps() {
		
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

	public int getPassiveLevelCapModifier() {
		return passiveLevelCapModifier;
	}

	public void setPassiveLevelCapModifier(int passiveLevelCapModifier) {
		this.passiveLevelCapModifier = passiveLevelCapModifier;
	}

	public PowerUp[] getPowerUpArray() {
		return powerUpArray;
	}

	public void setPowerUpArray(PowerUp[] powerUpArray) {
		this.powerUpArray = powerUpArray;
	}
	public void setCurrentAmountOfSouls(int currentAmountOfSouls){
		this.currentAmountOfSouls = currentAmountOfSouls;
	}
	public int getCurrentAmountOfSouls(){
		return currentAmountOfSouls();
	}
	
}
