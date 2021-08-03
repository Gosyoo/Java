package com.java.SingletonTest;

/*
 * Singleton:�������ģʽ
 *    ��ҪΨһ�Ĵ���һ��ʵ������
 *  
 * ��һ�֣�����ʽ
 * 
 * ����ʽ�ŵ㣺 �̰߳�ȫ��
 *       ȱ�㣺�������ڹ���
 * ����ʽ�ŵ㣺 �ӳٶ���Ĵ���
 *       ȱ�㣺��ʱ�̲߳���ȫ--->���߳�ʱ���з�����Ϊ��ȫ��  
 */
public class SingletonTest1 {
	public static void main(String[] args) {

		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		
		//���Ϊtrue����˵����ֵַ��ͬ��ָ��Ψһ��Bankʵ������
		System.out.println(bank1 == bank2);  //true
	}

}

class Bank {
	// 1.��Ҫһ��˽�еĹ�������ʹ�ø��಻�ܱ�new����
	private Bank() {

	}

	//2.������ڲ�����һ����ǰ��Ķ��󣬲�ʵ����
	//4.��Ҫ����Ϊ��̬�ģ�����ֻ��������ʱ����һ��
	private static Bank instance = new Bank();
	
	//3.����һ�������ľ�̬����������Ψһ�����ʵ�����ⲿʹ��
	public static Bank getInstance(){
		return instance;
	}
}
