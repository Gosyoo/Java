package com.java.CustomerList;

import com.java.Customer.Customer;

/**
 * 对Customer对象的管理模块
 * 包括增删改查
 * @author ayuan
 * @data 2020年11月3日12:51:02
 */
public class CustomerList {

	private Customer[] customers; //保存客户对象的数组
	private int total = 0; //记录已保存客户对象的数量
	
	// 构造体
	// 指定数组的最大空间
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	/**
	 * 添加元素
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
	  * 修改指定位置元素
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
	 * 删除指定位置元素
	 * @param index  位置
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
	 * 查找所有元素
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
	 * 查找指定位置的元素
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
	 * 获取元素的位置索引
	 * @return
	 */
	public int getTotal() {
	   return total;
	}
}
