package models;

public class Level {
	private int levelNumber;
	private int maxSoulCap;
	private int currentSoulAmount;
	private boolean isFilled;
	private int maxSoulCapModifier;
	
	public Level(int levelNumber, int maxSoulCap, int currentSoulAmount) {
		setLevelNumber(levelNumber);
		setMaxSoulCap(maxSoulCap);
		setCurrentSoulAmount(currentSoulAmount);
		
	}

	public int getLevelNumber() {
		return levelNumber;
	}

	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}

	public int getMaxSoulCap() {
		return maxSoulCap;
	}

	public void setMaxSoulCap(int maxSoulCap) {
		this.maxSoulCap = maxSoulCap;
	}

	public int getCurrentSoulAmount() {
		return currentSoulAmount;
	}

	public void setCurrentSoulAmount(int currentSoulAmount) {
		this.currentSoulAmount = currentSoulAmount;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public int getMaxSoulCapModifier() {
		return maxSoulCapModifier;
	}

	public void setMaxSoulCapModifier(int maxSoulCapModifier) {
		this.maxSoulCapModifier = maxSoulCapModifier;
	}
	
	
}
