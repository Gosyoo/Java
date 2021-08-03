package com.java.equalsTest;

public class equalsTest {
	
	public static void main(String[] args) {
		Person p1 = new Person("Tom", 22);
		Person p2 = new Person("Tom", 22);
		
		// == ���Ƚϻ����������͵�ֵ�Ƿ���ȣ��Ƚ��������͵ĵ�ֵַ�Ƿ����
		System.out.println(p1 == p2);  //false
		//Object���equals�����͡�==����һ����
		System.out.println(p1.equals(p2));  //false
		/*Object���Դ�룺
		 *   public boolean equals(Object obj) {
         *         return (this == obj);
         *   }
		 */
		
		Student s1 = new Student("Tom" , 22);
		Student s2 = new Student("Tom" , 22);
		
		System.out.println("********  ��equals������д  ********");
		System.out.println("********  ���ʱ  ********");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("********  ����ʱ  ********");
		Student s3 = new Student("Tom" , 22);
		Student s4 = new Student("Tom" , 21);
		System.out.println(s3 == s2);
		System.out.println(s4.equals(s2));
	}

}
