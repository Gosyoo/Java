package com.java.anonymitTest;

/*
 * �������󣻳��������������  �Ĳ���
 */
public class AnonymitTest {

	// ��������
	public static void main(String[] args) {

		// ����������
		Person person = new Student();
		method(person);

		// ��������
		method(new Student());

		// �������������������
		Person p = new Worker();
		method1(p);

		// �����������������
		method1(new Worker());

		// ������������������
		Person person2 = new Person() { // ����new��һ��Person����PersonΪ�����࣬����new����
										// ������ֻ��һ��ʱ����ʹ����������ķ���

			@Override
			public void walk() { // ��Ҫ��д��Ҫ�ĳ��󷽷�
				System.out.println("������������������ -- ��·");
			}

			@Override
			public void eat() {
				System.out.println("������������������ -- �Է�");
			}
		};
		
		method1(person2);

		// ����������������
		method1(new Person() {

			@Override
			public void walk() {
				System.out.println("���������������� -- ��·");
			}

			@Override
			public void eat() {
				System.out.println("���������������� -- �Է�");
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
