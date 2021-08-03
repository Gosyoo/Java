package com.java.View;

import java.util.Scanner;

import com.java.Customer.Customer;
import com.java.CustomerList.CustomerList;

/*
 * 关于Scanner的使用：
 * 
 *     1) 对于字符串，==比较的是两个字符串所指地址是否相等；而要比较字符串的内容，用equals
 *	
 *     2) 使用多次Scanner get=new Scanner(System.in); 但是只在最后使用 iter.close() 函数；
 *        或者将Scanner get=new Scanner(System.in); 放在所有函数外层，同时在前面加上static修饰符,
 *        并且只在最后使用 iter.close() 函数！
 *      
 *     3) sc=scanner.nextLine();不能放在其他scanner.nextInt()后面，因为会导致读取/n，导致后面的读取错误
 *        正确姿势：
 *        sc=scanner.nextLine();
 *        sc=scanner.nextLine();
 * 
 * 
 * 
 * 
 */

public class View {
	private CustomerList customerList = new CustomerList(10);
	private boolean isFlag = true;

	/**
	 * 主菜单界面
	 */
	public void enterMainMenu() {
		isFlag = true;
		while (isFlag) {

			System.out.println("\n*************客户信息管理软件************");
			System.out.println("                  1.添加客户");
			System.out.println("                  2.修改客户");
			System.out.println("                  3.删除客户");
			System.out.println("                  4.客户列表");
			System.out.println("                  5.退    出");
			System.out.println("                  请选择（1-5）");
//			isFlag = false;

			String sc = Scanfnum();
			switch (sc) {
			case "1": // 添加
				addNewCustomer();
				break;
			case "2": // 修改
				modifCustomer();
				break;
			case "3": // 删除
				deleteCustomer();
				break;
			case "4": // 查看
				listAllCustomers();
				break;
			case "5": // 退出
				Exit();
				break;
			default:
				break;
			}
		}
	}

	private String Scan() {
		Scanner sc = new Scanner(System.in);
		String keys = sc.next();

		return keys;
	}

	private int scanInt() {
		Scanner sci = new Scanner(System.in);
		int keys = sci.nextInt();
		
		return keys;
	}

	private void Exit() {
		System.out.println("是否退出？（yes/no）");
		Scanner sc = new Scanner(System.in);
		String keys = sc.next();
		if (keys.equals("yes")) {
			
			isFlag = false;
		} else {
			
			return;
		}
	}

	private String Scanfnum() {
		Scanner sc = new Scanner(System.in);
		String keys = sc.next();
		// 对于字符串，==比较的是两个字符串所指地址是否相等；而要比较字符串的内容，用equals
		/*
		 * 使用多次Scanner get=new Scanner(System.in); 但是只在最后使用 iter.close() 函数；
           或者将Scanner get=new Scanner(System.in); 放在所有函数外层，同时在前面加上static修饰符,
           并且只在最后使用 iter.close() 函数！
		 * 
		 * 
*/
		if (keys.equals("1") || keys.equals("2") || keys.equals("3") || keys.equals("4") || keys.equals("5")) {
			
			return keys;
		} else {
			System.out.println("输入错误，请重新输入！");
			
			return "777";
		}
	}

	/**
	 * 添加新的客户信息
	 */
	public void addNewCustomer() {
		Customer customer = new Customer();
		System.out.println("--请输入用户姓名：");
		customer.setName(Scan());
		System.out.println("--请输入用户性别：");
		customer.setGender(Scan());
		System.out.println("--请输入用户邮箱：");
		customer.setEmail(Scan());
		System.out.println("--请输入用户年龄：");
		customer.setAge(scanInt());
		System.out.println("--请输入用户电话：");
		customer.setPhone(scanInt());
		customerList.addCustomer(customer);
	}

	/**
	 * 修改用户信息
	 */
	public void modifCustomer() {

	}

	/**
	 * 删除客户信息
	 */
	public void deleteCustomer() {

	}

	/**
	 * 显示所有客户信息
	 */
	public void listAllCustomers() {
		System.out.println("**************用户信息***************");
		if (customerList.getTotal() == 0) {
			return;
		} else {
			System.out.println("编号\t姓名\t年龄\t性别\t电话\t\t邮箱");
			Customer cust[] = customerList.getAllCustomer();
			for (int i = 0; i < customerList.getTotal(); i++) {
				System.out.println((i + 1) +"\t"+ cust[i].getName() + "\t" + cust[i].getAge() + "\t" +cust[i].getGender()+"\t" +cust[i].getPhone()
						+ "\t"+ cust[i].getEmail());
			}
		}
		System.out.println("**************打印结束***************");

	}

	public static void main(String[] args) {
		View view = new View();
		view.enterMainMenu();

	}

}
