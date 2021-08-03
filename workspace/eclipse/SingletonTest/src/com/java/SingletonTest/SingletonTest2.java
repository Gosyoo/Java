package com.java.SingletonTest;
/*
 * 2.Singleton 单例设计模式2
 * 
 * 第二种：懒汉式
 *         需要时才创建
 */
public class SingletonTest2 {
	public static void main(String[] args) {
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		
		//如果为true，则说明地址值相同，指向唯一的Bank实例对象
		System.out.println(order1 == order2);  //true  
	}

}

class Order{
	
	//1.需要一个私有的构造器，使得该类不能被new创建
	private Order() {
		
	}
	
	//2.声明一个私有的当前类的属性，没有初始化
	//4.此对象也必须声明为静态的
	private static Order instance = null;
	
	//3.提供一个公开的静态方法供外部调用
	public  static Order getInstance() {
		if(instance == null) {  //判断是否存在一个instance，如果没有，则创建一个新的
			instance = new Order();			
		}
		return instance;   //如果已经存在，就办该对象返回出去
	} 
}
