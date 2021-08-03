package com.java.SingletonTest;

/*
 * Singleton:单例设计模式
 *    想要唯一的创建一个实例对象
 *  
 * 第一种：饿汉式
 * 
 * 饿汉式优点： 线程安全的
 *       缺点：生命周期过长
 * 懒汉式优点： 延迟对象的创建
 *       缺点：暂时线程不安全--->多线程时会有方法改为安全的  
 */
public class SingletonTest1 {
	public static void main(String[] args) {

		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		
		//如果为true，则说明地址值相同，指向唯一的Bank实例对象
		System.out.println(bank1 == bank2);  //true
	}

}

class Bank {
	// 1.需要一个私有的构造器，使得该类不能被new创建
	private Bank() {

	}

	//2.在类的内部声明一个当前类的对象，并实例化
	//4.需要设置为静态的（共享）只在类声明时创建一次
	private static Bank instance = new Bank();
	
	//3.创建一个公开的静态方法，返回唯一的类的实例供外部使用
	public static Bank getInstance(){
		return instance;
	}
}
