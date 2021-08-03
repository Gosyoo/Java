package com.java.CustomerList;

import com.java.Customer.Customer;

/**
 * ��Customer����Ĺ���ģ��
 * ������ɾ�Ĳ�
 * @author ayuan
 * @data 2020��11��3��12:51:02
 */
public class CustomerList {

	private Customer[] customers; //����ͻ����������
	private int total = 0; //��¼�ѱ���ͻ����������
	
	// ������
	// ָ����������ռ�
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	/**
	 * ���Ԫ��
	 * 
	 * @param customer
	 * @return
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length || total < 0 ) {
			return false;
		}else {
			customers[total] = customer;
			total++;			
			return true;
		}
	}
	 /**
	  * �޸�ָ��λ��Ԫ��
	  * @param index
	  * @param cust
	  * @return
	  */
	public boolean replaceCustomer(int index,Customer cust) {
		if(index < total && index >= 0) {
			customers[index] = cust;
			return true;
		}
		else {
			return false; 			
		}
	}
	
	/**
	 * ɾ��ָ��λ��Ԫ��
	 * @param index  λ��
 	 * @return
	 */
	public boolean deleteCustomer(int index) {
		if(index < total && index >= 0) {
			for(int i = index;i < total;i++) {
				customers[i] = customers[i+1];
			}
			customers[total - 1] = null;
			total--;
		    return true;
		}else {
			return false;			
		}
	}
	
	/**
	 * ��������Ԫ��
	 * @return
	 */
	public Customer[] getAllCustomer() {
		Customer[] cust = new Customer[total];
		for(int i = 0; i < total;i++) {
			cust[i] = customers[i];
		}
		return cust;
	}
	
	/**
	 * ����ָ��λ�õ�Ԫ��
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index) {
		if(index < total && index >= 0) {
			return customers[index];
		}else {
			return null;
		}
	}
	
	/**
	 * ��ȡԪ�ص�λ������
	 * @return
	 */
	public int getTotal() {
	   return total;
	}
}
