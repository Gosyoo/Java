package com.java.JUnitTest;

import org.junit.jupiter.api.Test;

/*
 * 1.����JUnit��
 * 2.����Java�࣬���е�Ԫ����
 *        ����Ҫ��: 1.����Ϊpublic   2.�����ṩ�������޲ι����� 
 * 3.�ڸ�����������Ԫ���Է���:����Ȩ��Ϊpublic�������޷���ֵ��û���β�
 * 4.�÷�������Ҫ����ע��:@Test���������
 * 5.�ڷ�������д����Ҫ���ԵĴ��룬˫�������������һ�ѡ��run as���ɲ��ԡ�
 * 
 * ˵��:���ִ�н��û���쳣:��ʾ����
 *      ���ִ�н�������쳣:��ʾ����
 * 
 */
public class JUnitTest {
	
	@Test
	public void testEquals() {
		String s1 = "Tom";
		String s2 = "Tom";
		System.out.println(s1.equals(s2));
	}

}
