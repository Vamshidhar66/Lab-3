import static org.junit.Assert.*;

import org.junit.Before;

import mowerCommand.LawnMowerDescribe;
import mowerCommand.ManualPoweredMower;
import mowerFacade.ElectricPoweredOrder;

public class Test {

	@org.junit.Test
	public void testMowerFacade() {
		LawnMowerDescribe lawnMowerDescribe = new LawnMowerDescribe();
		assertEquals(
				"\nManual Powered Mower:"
						+ "\n\tManual powered mowers essentially push mowers.They are best suited to small lawns.",
				lawnMowerDescribe.ManualPoweredMower());
	}

	public void testMowerCommand() {
		LawnMowerDescribe lawnMowerDescribe = new LawnMowerDescribe();
		assertEquals(
				"\nGas-Powered Mower:"
						+ "\n\tGas-powered lawnmowers have engines that run on petrol and larger in size.",
				lawnMowerDescribe.GasPoweredMower());
	}
}