package mowerFacade;

public class Order {

	private MowerFacadeOrder manualPoweredOrder;
	private ElectricPoweredOrder electricPoweredOrder;
	private GasPoweredOrder gasPoweredOrder;
	private BatteryPoweredOrder batteryPoweredOrder;

	public Order() {
		manualPoweredOrder = new ManualPoweredOrder();
		electricPoweredOrder = new ElectricPoweredOrder();
		gasPoweredOrder = new GasPoweredOrder();
		batteryPoweredOrder = new BatteryPoweredOrder();
	}

	public void viewManualPoweredOrder() {
		manualPoweredOrder.mowerOrder();
	}

	public void viewElectricPoweredOrder() {
		electricPoweredOrder.mowerOrder();
	}

	public void viewGasPoweredOrder() {
		gasPoweredOrder.mowerOrder();
	}

	public void viewBatteryPoweredOrder() {
		batteryPoweredOrder.mowerOrder();
	}
}
