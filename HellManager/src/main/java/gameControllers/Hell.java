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
	
	public Hell() {
		
	}
	
	private Soul createSoul() {
		SoulType soulType = SoulType.REPENTANCE;
		Soul soul = new Soul(soulType);
		
		return soul;
	}
	private void createLevels(){
		
	}
	private Level getLevel() {
		
		
		return new Level(0,0,0,0);
	}
	
	private void levelCapacityManager() {
		
	}
	
	private void displayerLevelMaxCapacity() {
		
	}
	
	private void displayLevelCurrentCapacity() {
		
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
	
}
