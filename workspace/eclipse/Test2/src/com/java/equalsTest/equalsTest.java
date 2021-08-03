package com.java.equalsTest;

public class equalsTest {
	
	public static void main(String[] args) {
		Person p1 = new Person("Tom", 22);
		Person p2 = new Person("Tom", 22);
		
		// == ：比较基本数据类型的值是否相等，比较引用类型的地址值是否相等
		System.out.println(p1 == p2);  //false
		//Object类的equals方法和“==”是一样的
		System.out.println(p1.equals(p2));  //false
		/*Object类的源码：
		 *   public boolean equals(Object obj) {
         *         return (this == obj);
         *   }
		 */
		
		Student s1 = new Student("Tom" , 22);
		Student s2 = new Student("Tom" , 22);
		
		System.out.println("********  对equals进行重写  ********");
		System.out.println("********  相等时  ********");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("********  不等时  ********");
		Student s3 = new Student("Tom" , 22);
		Student s4 = new Student("Tom" , 21);
		System.out.println(s3 == s2);
		System.out.println(s4.equals(s2));
	}

}
