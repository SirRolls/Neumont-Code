package models;

public class PowerUp {
	private int soulFee;
	private int powerUpTier;
	private final int POWERUPMODIFIER;
	
	
	public PowerUp(int POWERUPMODIFIER, int soulFee, int powerUpTier) {
		
		setSoulFee(soulFee);
		setPowerUpTier(powerUpTier);
		this.POWERUPMODIFIER = POWERUPMODIFIER;
	
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
	
	

}
