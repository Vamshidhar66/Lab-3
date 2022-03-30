package mowerCommand;

import java.util.ArrayList;
import java.util.List;

public class Mower {
	private List<LawnMower> lawnMowerList = new ArrayList<LawnMower>();

	public void view(LawnMower lawnMower) {
		lawnMowerList.add(lawnMower);
	}

	public void displayDescription() {
		for (LawnMower lawnMower : lawnMowerList) {
			System.out.println(lawnMower.describe());
		}
	}
}