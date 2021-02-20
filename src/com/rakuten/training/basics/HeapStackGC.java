package com.rakuten.training.basics;

public class HeapStackGC {

	public static void method1() {
		DOWFinder ref2 = new DOWFinder();
		// do something with ref2
	}

	public static void main(String[] args) {
		int i = 10;
		DOWFinder ref1 = new DOWFinder();
		method1();
		// something
		System.out.println("Done!!");
	}

}

class Point {
	private double x;
	private double y;

	public Point(int _x, int _y) {
		x = _x;
		y = -y;
	}

	public double getX() {
		return x;
	}

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
//		Point p2 = p1;
		Point p2 = new Point(10, 20);
		if (p1 == p2)
			System.out.println("Objects are same");
		else
			System.out.println("Objects are not same");
	}
}
