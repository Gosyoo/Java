package com.java.easyfactory;
/*
 * 
 * �򵥹���ģʽ
 */
public class EasyFactory {
	// ����
	public static void main(String[] args) {
		Car c1 = CarFactory.getCar("�µ�");
		c1.dirve();
		Car c2 = CarFactory.getCar("���ǵ�");
	    c2.dirve();
	}
}

interface Car {
	public void dirve();
}

class BYD implements Car {

	@Override
	public void dirve() {
		System.out.println("�򵥹���-->���ǵ�����ʻ��");
	}

}

class Audi implements Car {

	@Override
	public void dirve() {
		System.out.println("�򵥹���-->�µ�����ʻ��");
	}
}

class CarFactory {

	public static Car getCar(String car) {
		if (car.equals("���ǵ�")) {
			return new BYD();
		} else if (car.equals("�µ�")) {
			return new Audi();
		} else
			return null;
	}
}
