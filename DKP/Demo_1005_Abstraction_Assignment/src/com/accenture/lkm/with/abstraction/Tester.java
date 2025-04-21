package com.accenture.lkm.with.abstraction;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape1 = new Circle();
		shape1.draw();
		shape1.erase();
		
		Shape shape2 = new Triangle();
		shape2.draw();
		shape2.erase();
		
	}

}
