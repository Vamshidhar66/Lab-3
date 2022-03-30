package mowerCommand;

public class LawnMowerDescribe {

	public String ManualPoweredMower() {
		return "\nManual Powered Mower:"
				+ "\n\tManual powered mowers essentially push mowers.They are best suited to small lawns.";
	}

	public String ElectricPoweredMower() {
		return "\nElectric Powered Mower:"
				+ "\n\tThese corded mowers are powered by electricity through a cable attached to the mower.";
	}

	public String GasPoweredMower() {
		return "\nGas-Powered Mower:"
				+ "\n\tGas-powered lawnmowers have engines that run on petrol and larger in size.";
	}

	public String BatteryPoweredMower() {
		return "\nBattery-Powered Mower:"
				+ "\n\tBattery-powered mowers run off a battery, usually, a lithium-ion battery.";
	}
}
