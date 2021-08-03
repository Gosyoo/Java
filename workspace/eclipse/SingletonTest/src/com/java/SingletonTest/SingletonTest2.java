package com.java.SingletonTest;
/*
 * 2.Singleton �������ģʽ2
 * 
 * �ڶ��֣�����ʽ
 *         ��Ҫʱ�Ŵ���
 */
public class SingletonTest2 {
	public static void main(String[] args) {
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		
		//���Ϊtrue����˵����ֵַ��ͬ��ָ��Ψһ��Bankʵ������
		System.out.println(order1 == order2);  //true  
	}

}

class Order{
	
	//1.��Ҫһ��˽�еĹ�������ʹ�ø��಻�ܱ�new����
	private Order() {
		
	}
	
	//2.����һ��˽�еĵ�ǰ������ԣ�û�г�ʼ��
	//4.�˶���Ҳ��������Ϊ��̬��
	private static Order instance = null;
	
	//3.�ṩһ�������ľ�̬�������ⲿ����
	public  static Order getInstance() {
		if(instance == null) {  //�ж��Ƿ����һ��instance�����û�У��򴴽�һ���µ�
			instance = new Order();			
		}
		return instance;   //����Ѿ����ڣ��Ͱ�ö��󷵻س�ȥ
	} 
}
