import java.util.Scanner;

import mowerCommand.BatteryPoweredMower;
import mowerCommand.ElectricPoweredMower;
import mowerCommand.GasPoweredMower;
import mowerCommand.LawnMower;
import mowerCommand.LawnMowerDescribe;
import mowerCommand.ManualPoweredMower;
import mowerCommand.Mower;
import mowerFacade.Order;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int option, count;
		String choice = null;
		System.out.println("\n*** Welcome to Lawn Mowers for yard maintenance and lawn care ***");

		while (true) {
			System.out.println("\nSelect any option: " + "\n\t1. Manual Powered Mower" + "\n\t2. Electric Powered Mower"
					+ "\n\t3. Gas-Powered Mower" + "\n\t4. Battery-Powered Mower" + "\n\t5. Exit");
			option = input.nextInt();

			Mower mower = new Mower();
			LawnMowerDescribe lawnMowerDescribe = new LawnMowerDescribe();
			LawnMower lawnMower = null;

			if (option == 1) {
				lawnMower = new ManualPoweredMower(lawnMowerDescribe);
				mower.view(lawnMower);
				mower.displayDescription();
			} else if (option == 2) {
				lawnMower = new ElectricPoweredMower(lawnMowerDescribe);
				mower.view(lawnMower);
				mower.displayDescription();
			} else if (option == 3) {
				lawnMower = new GasPoweredMower(lawnMowerDescribe);
				mower.view(lawnMower);
				mower.displayDescription();
			} else if (option == 4) {
				lawnMower = new BatteryPoweredMower(lawnMowerDescribe);
				mower.view(lawnMower);
				mower.displayDescription();
			} else if (option == 5) {
				System.out.println("Thank You!!!");
				break;
			}
			System.out.println("Do you want to order (Y/N): ");
			choice = input.next();
			if (choice.equalsIgnoreCase("y")) {
				System.out.println("Enter order count: ");
				count = input.nextInt();
				Order order = new Order();
				if (option == 1) {
					order.viewManualPoweredOrder();
				} else if (option == 2) {
					order.viewElectricPoweredOrder();
				} else if (option == 3) {
					order.viewGasPoweredOrder();
				} else if (option == 4) {
					order.viewBatteryPoweredOrder();
				}
			} else {
				continue;
			}
		}
	}

}
