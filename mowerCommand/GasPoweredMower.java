package mowerCommand;

public class GasPoweredMower implements LawnMower {

	private LawnMowerDescribe lawnMowerDescribe;

	public GasPoweredMower(LawnMowerDescribe lawnMowerDescribe) {
		this.lawnMowerDescribe = lawnMowerDescribe;
	}

	@Override
	public String describe() {
		// TODO Auto-generated method stub
		return lawnMowerDescribe.GasPoweredMower();
	}

}
