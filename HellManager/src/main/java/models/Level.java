package models;

public class Level {
	private int levelNumber;
	private final int maxSoulCap;
	private int currentSoulAmount;
	private boolean isFilled;
	private int maxSoulCapModifier = 3;
	
	public Level(int levelNumber, int maxSoulCap, int currentSoulAmount) {
		setLevelNumber(levelNumber);
		setCurrentSoulAmount(currentSoulAmount);
		if(levelNumber > 1) {
			for(int i = 0; i < levelNumber; i++) {
				maxSoulCap *= 1.2;
				
			}
		}
		this.maxSoulCap = maxSoulCap;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Level Number:").append(getLevelNumber()+"\n")
		.append("Max Soul Cap =").append(getMaxSoulCap()+"\n")
				.append("Current Soul Amount:").append(getCurrentSoulAmount()+"\n")
				.append("Max Soul Cap Modifier:").append(getMaxSoulCapModifier()).append("\n");
		return builder.toString();
	}
	
	
	
}
