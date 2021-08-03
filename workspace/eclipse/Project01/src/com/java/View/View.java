package com.java.View;

import java.util.Scanner;

import com.java.Customer.Customer;
import com.java.CustomerList.CustomerList;

/*
 * ����Scanner��ʹ�ã�
 * 
 *     1) �����ַ�����==�Ƚϵ��������ַ�����ָ��ַ�Ƿ���ȣ���Ҫ�Ƚ��ַ��������ݣ���equals
 *	
 *     2) ʹ�ö��Scanner get=new Scanner(System.in); ����ֻ�����ʹ�� iter.close() ������
 *        ���߽�Scanner get=new Scanner(System.in); �������к�����㣬ͬʱ��ǰ�����static���η�,
 *        ����ֻ�����ʹ�� iter.close() ������
 *      
 *     3) sc=scanner.nextLine();���ܷ�������scanner.nextInt()���棬��Ϊ�ᵼ�¶�ȡ/n�����º���Ķ�ȡ����
 *        ��ȷ���ƣ�
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
	 * ���˵�����
	 */
	public void enterMainMenu() {
		isFlag = true;
		while (isFlag) {

			System.out.println("\n*************�ͻ���Ϣ�������************");
			System.out.println("                  1.��ӿͻ�");
			System.out.println("                  2.�޸Ŀͻ�");
			System.out.println("                  3.ɾ���ͻ�");
			System.out.println("                  4.�ͻ��б�");
			System.out.println("                  5.��    ��");
			System.out.println("                  ��ѡ��1-5��");
//			isFlag = false;

			String sc = Scanfnum();
			switch (sc) {
			case "1": // ���
				addNewCustomer();
				break;
			case "2": // �޸�
				modifCustomer();
				break;
			case "3": // ɾ��
				deleteCustomer();
				break;
			case "4": // �鿴
				listAllCustomers();
				break;
			case "5": // �˳�
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
		System.out.println("�Ƿ��˳�����yes/no��");
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
		// �����ַ�����==�Ƚϵ��������ַ�����ָ��ַ�Ƿ���ȣ���Ҫ�Ƚ��ַ��������ݣ���equals
		/*
		 * ʹ�ö��Scanner get=new Scanner(System.in); ����ֻ�����ʹ�� iter.close() ������
           ���߽�Scanner get=new Scanner(System.in); �������к�����㣬ͬʱ��ǰ�����static���η�,
           ����ֻ�����ʹ�� iter.close() ������
		 * 
		 * 
*/
		if (keys.equals("1") || keys.equals("2") || keys.equals("3") || keys.equals("4") || keys.equals("5")) {
			
			return keys;
		} else {
			System.out.println("����������������룡");
			
			return "777";
		}
	}

	/**
	 * ����µĿͻ���Ϣ
	 */
	public void addNewCustomer() {
		Customer customer = new Customer();
		System.out.println("--�������û�������");
		customer.setName(Scan());
		System.out.println("--�������û��Ա�");
		customer.setGender(Scan());
		System.out.println("--�������û����䣺");
		customer.setEmail(Scan());
		System.out.println("--�������û����䣺");
		customer.setAge(scanInt());
		System.out.println("--�������û��绰��");
		customer.setPhone(scanInt());
		customerList.addCustomer(customer);
	}

	/**
	 * �޸��û���Ϣ
	 */
	public void modifCustomer() {

	}

	/**
	 * ɾ���ͻ���Ϣ
	 */
	public void deleteCustomer() {

	}

	/**
	 * ��ʾ���пͻ���Ϣ
	 */
	public void listAllCustomers() {
		System.out.println("**************�û���Ϣ***************");
		if (customerList.getTotal() == 0) {
			return;
		} else {
			System.out.println("���\t����\t����\t�Ա�\t�绰\t\t����");
			Customer cust[] = customerList.getAllCustomer();
			for (int i = 0; i < customerList.getTotal(); i++) {
				System.out.println((i + 1) +"\t"+ cust[i].getName() + "\t" + cust[i].getAge() + "\t" +cust[i].getGender()+"\t" +cust[i].getPhone()
						+ "\t"+ cust[i].getEmail());
			}
		}
		System.out.println("**************��ӡ����***************");

	}

	public static void main(String[] args) {
		View view = new View();
		view.enterMainMenu();

	}

}
