package mowerCommand;

public class ElectricPoweredMower implements LawnMower {

	private LawnMowerDescribe lawnMowerDescribe;

	public ElectricPoweredMower(LawnMowerDescribe lawnMowerDescribe) {
		this.lawnMowerDescribe = lawnMowerDescribe;
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return lawnMowerDescribe.ElectricPoweredMower();
	}

}
