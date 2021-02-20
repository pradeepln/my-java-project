package com.rakuten.training.basics;

public class Driver {

	public void testDrive(Vehicle v) {
		v.start();
		System.out.println("-------- Wroooom ---------");

		if (v instanceof Truck) {
			Truck t = (Truck) v;
			t.honkHorribly();
		}

		v.stop();
	}

}
