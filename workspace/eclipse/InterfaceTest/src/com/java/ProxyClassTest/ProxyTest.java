package com.java.ProxyClassTest;

import javax.print.attribute.standard.Severity;

/*
 * �ӿڵ�Ӧ��:����ģʽ
 * 
 *  �����������һ�������̣�
 *    �ӿڣ����ӷ��������ܵĽӿ�
 *    �������ࣺһ����ʵ�ķ�����
 *    �����ࣺ�ṩ�����������һЩ��������
 */
public class ProxyTest {
	// ����
	public static void main(String[] args) {
		
		NetWork work = new Server(); //���������������
		ProxyServer proxyServer = new ProxyServer(work);  //����Ҫ��������������У��������
		proxyServer.browse();  //���á����������
		
	}

}
