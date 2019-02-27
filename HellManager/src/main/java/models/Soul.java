package models;

import enums.SoulType;

public class Soul {
	private SoulType soulType;
	
	public Soul(SoulType soulType) {
		
		setSoulType(soulType);
		
	}

	public SoulType getSoulType() {
		return soulType;
	}

	public void setSoulType(SoulType soulType) {
		this.soulType = soulType;
	}

}
