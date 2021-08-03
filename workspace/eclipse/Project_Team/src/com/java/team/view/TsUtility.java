package com.java.team.view;

import java.util.*;

import jdk.dynalink.beans.StaticClass;

/**
 * �����̨�����Ĺ�����
 */
public class TsUtility {
	public static Scanner scanner = new Scanner(System.in);

	/**
	 * ��ȡ�û�����Ĳ˵�ѡ��
	 * 
	 * @return
	 */
	public static char readMenuSelection() {
		// ��������Ƿ�Ϊ1~4�е�һ��
		// ���� :������ѡ��
		// �� :�ͷ��ظ����������
		char c;
		for( ; ; ) {
			String str = readKeyBoard(1,false);
			c = str.charAt(0);
			if(c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.println("����������������룡");
			}else break;		
		}
		return c;	
	}

	/**
	 * �ȴ�
	 */
	public static void readReturn() {
		System.out.println("���س�������...");
		readKeyBoard(100, true);
	}
	


	public static int readInt() {
		int n;
		for( ; ; ) {
			String str = readKeyBoard(2, false);
			try {
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e) {
				System.out.println("���������������������...");
			}
		}
		return n;
	}
	
	
	public static char readConfirmSelection() {
		// ��������Ƿ�Ϊ1~4�е�һ��
		// ���� :������ѡ��
		// �� :�ͷ��ظ����������
		char c;
		for( ; ; ) {
			String str = readKeyBoard(1 , false);
			c = str.charAt(0);
			if(c == 'Y' && c == 'N') {
				break;
			}else {
				System.out.println("����������������룡");
			}	
		}
		return c;	
	}

	
	private static String readKeyBoard(int limit, boolean blankReturn) {
		String line = "";
		//ѭ��
		while(scanner.hasNext()) {
			line = scanner.nextLine();
			//��⵱����Ϊ��ʱ��������������ʱ��������
			if(line.length()==0){
				if(blankReturn) {
					return line;
				}else continue;
			}
			//������볤�ȴ�������������������continue��ȥ��������
			if(line.length() < 1 || line.length() > limit) {
				System.out.println("���볤�ȣ�������"+ limit + ")�������������������");
				continue;
			}
			//�����û�д��󣬽���ѭ��������line
			break;
		}
		return line;		
	}
	
	
	}
