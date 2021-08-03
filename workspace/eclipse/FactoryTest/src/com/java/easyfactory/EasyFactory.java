package com.java.easyfactory;
/*
 * 
 * 简单工厂模式
 */
public class EasyFactory {
	// 测试
	public static void main(String[] args) {
		Car c1 = CarFactory.getCar("奥迪");
		c1.dirve();
		Car c2 = CarFactory.getCar("比亚迪");
	    c2.dirve();
	}
}

interface Car {
	public void dirve();
}

class BYD implements Car {

	@Override
	public void dirve() {
		System.out.println("简单工厂-->比亚迪在行驶！");
	}

}

class Audi implements Car {

	@Override
	public void dirve() {
		System.out.println("简单工厂-->奥迪在行驶！");
	}
}

class CarFactory {

	public static Car getCar(String car) {
		if (car.equals("比亚迪")) {
			return new BYD();
		} else if (car.equals("奥迪")) {
			return new Audi();
		} else
			return null;
	}
}
