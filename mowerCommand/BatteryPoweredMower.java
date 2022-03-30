package mowerCommand;

public class BatteryPoweredMower implements LawnMower {

	private LawnMowerDescribe lawnMowerDescribe;

	public BatteryPoweredMower(LawnMowerDescribe lawnMowerDescribe) {
		this.lawnMowerDescribe = lawnMowerDescribe;
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return lawnMowerDescribe.BatteryPoweredMower();
	}

}
