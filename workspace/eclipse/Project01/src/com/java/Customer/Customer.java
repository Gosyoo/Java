package com.java.Customer;


/**
 * 客户的信息
 * @author ayuan
 *
 */
public class Customer {
		
		private String name; //姓名
		private int age;   //年龄
		private String gender;  //性别
		private int phone;  // 电话号码
		private String email; //电子邮箱
		
		public Customer(){
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}
		
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
}
