package com.java.factory;
/*
 * 
 * 工厂模式
 */
public class Factory {
	// 测试
	public static void main(String[] args) {
		ICar c1 = new AudiCarFactory().getCar();
		c1.dirve();
		ICar c2 = new BYDCarFactory().getCar();
	    c2.dirve();
	}
}

//************************被创建的类*********************
interface ICar {
	public void dirve();
}

class BYD implements ICar {

	@Override
	public void dirve() {
		System.out.println("工厂-->比亚迪在行驶！");
	}

}

class Audi implements ICar {

	@Override
	public void dirve() {
		System.out.println("工厂-->奥迪在行驶！");
	}
}

//************************工厂***************************
interface IFactory{
	public ICar getCar();
}

class BYDCarFactory implements IFactory{

	@Override
	public BYD getCar() {
		return new BYD();
	}

}

class AudiCarFactory implements IFactory{

	@Override
	public  Audi getCar() {
		return new Audi();
	} 
	
}


