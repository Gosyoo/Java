package com.java.team.view;

import java.util.*;

import jdk.dynalink.beans.StaticClass;

/**
 * 与控制台交互的工具类
 */
public class TsUtility {
	public static Scanner scanner = new Scanner(System.in);

	/**
	 * 读取用户输入的菜单选项
	 * 
	 * @return
	 */
	public static char readMenuSelection() {
		// 检测输入是否为1~4中的一个
		// 不是 :则重新选择
		// 是 :就返回该输入的数据
		char c;
		for( ; ; ) {
			String str = readKeyBoard(1,false);
			c = str.charAt(0);
			if(c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.println("输入错误，请重新输入！");
			}else break;		
		}
		return c;	
	}

	/**
	 * 等待
	 */
	public static void readReturn() {
		System.out.println("按回车键继续...");
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
				System.out.println("数字输入错误，请重新输入...");
			}
		}
		return n;
	}
	
	
	public static char readConfirmSelection() {
		// 检测输入是否为1~4中的一个
		// 不是 :则重新选择
		// 是 :就返回该输入的数据
		char c;
		for( ; ; ) {
			String str = readKeyBoard(1 , false);
			c = str.charAt(0);
			if(c == 'Y' && c == 'N') {
				break;
			}else {
				System.out.println("输入错误，请重新输入！");
			}	
		}
		return c;	
	}

	
	private static String readKeyBoard(int limit, boolean blankReturn) {
		String line = "";
		//循环
		while(scanner.hasNext()) {
			line = scanner.nextLine();
			//检测当输入为空时的情况，输入错误时重新输入
			if(line.length()==0){
				if(blankReturn) {
					return line;
				}else continue;
			}
			//检测输入长度错误的情况，如果输入错误，continue回去重新输入
			if(line.length() < 1 || line.length() > limit) {
				System.out.println("输入长度（不大于"+ limit + ")，输入错误，请重新输入");
				continue;
			}
			//如果都没有错误，结束循环，返回line
			break;
		}
		return line;		
	}
	
	
	}
