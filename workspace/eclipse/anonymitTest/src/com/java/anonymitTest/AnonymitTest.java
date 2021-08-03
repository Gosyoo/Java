package com.java.anonymitTest;

/*
 * 匿名对象；抽象类的匿名子类  的测试
 */
public class AnonymitTest {

	// 匿名对象
	public static void main(String[] args) {

		// 非匿名对象
		Person person = new Student();
		method(person);

		// 匿名对象
		method(new Student());

		// 非匿名对象非匿名子类
		Person p = new Worker();
		method1(p);

		// 匿名对象非匿名子类
		method1(new Worker());

		// 非匿名对象匿名子类
		Person person2 = new Person() { // 并非new了一个Person对象（Person为抽象类，不能new对象）
										// 在子类只用一次时可以使用匿名子类的方法

			@Override
			public void walk() { // 需要重写需要的抽象方法
				System.out.println("非匿名对象匿名子类 -- 走路");
			}

			@Override
			public void eat() {
				System.out.println("非匿名对象匿名子类 -- 吃饭");
			}
		};
		
		method1(person2);

		// 匿名对象匿名子类
		method1(new Person() {

			@Override
			public void walk() {
				System.out.println("匿名对象匿名子类 -- 走路");
			}

			@Override
			public void eat() {
				System.out.println("匿名对象匿名子类 -- 吃饭");
			}
		});

	}

	public static void method1(Person p) {
		p.eat();
		p.walk();
	}

	public static void method(Person p) {
		p.eat();
		p.walk();
	}
}
