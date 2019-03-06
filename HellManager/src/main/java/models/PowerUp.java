package models;

public class PowerUp {
	private int soulFee;
	private int powerUpTier;
	private static final int POWERUPMODIFIER = 7;
	
	
	public PowerUp(int soulFee, int powerUpTier) {
		
		setSoulFee(soulFee);
		setPowerUpTier(powerUpTier);
	
	}

	public int getPowerupmodifier() {
		return POWERUPMODIFIER;
	}


	public int getSoulFee() {
		return soulFee;
	}


	public void setSoulFee(int soulFee) {
		this.soulFee = soulFee;
	}


	public int getPowerUpTier() {
		return powerUpTier;
	}


	public void setPowerUpTier(int powerUpTier) {
		this.powerUpTier = powerUpTier;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Power Up").append(getPowerUpTier()+"\n")
		.append("Souls required: ").append(getSoulFee()+"\n")
		.append("Power Up Modifier: ").append(getPowerupmodifier()).append("\n");
		return builder.toString();
	}
	
	

}
