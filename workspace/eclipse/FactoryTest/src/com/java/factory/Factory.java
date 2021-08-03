package com.java.factory;
/*
 * 
 * ����ģʽ
 */
public class Factory {
	// ����
	public static void main(String[] args) {
		ICar c1 = new AudiCarFactory().getCar();
		c1.dirve();
		ICar c2 = new BYDCarFactory().getCar();
	    c2.dirve();
	}
}

//************************����������*********************
interface ICar {
	public void dirve();
}

class BYD implements ICar {

	@Override
	public void dirve() {
		System.out.println("����-->���ǵ�����ʻ��");
	}

}

class Audi implements ICar {

	@Override
	public void dirve() {
		System.out.println("����-->�µ�����ʻ��");
	}
}

//************************����***************************
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


