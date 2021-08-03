package com.java.equalsTest;

public class Student {
	private String name;
	private int age;

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if(obj == null)  return false;  //����Ϊ��
		if (obj instanceof Student) {
			Student other = (Student) obj;
			if(other.name != null ) //�Ƚϵ��ַ�����Ϊ��
			return other.name.equals(this.name) && other.age == this.age; //���������䶼���
		}
		return false;
	}

}
