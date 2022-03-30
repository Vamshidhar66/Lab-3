package mowerCommand;

public class ManualPoweredMower implements LawnMower {

	private LawnMowerDescribe lawnMowerDescribe;

	public ManualPoweredMower(LawnMowerDescribe lawnMowerDescribe) {
		this.lawnMowerDescribe = lawnMowerDescribe;
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return lawnMowerDescribe.ManualPoweredMower();
	}

}
