package com.java.JUnitTest;

import org.junit.jupiter.api.Test;

/*
 * 1.导入JUnit库
 * 2.创建Java类，进行单元测试
 *        此类要求: 1.此类为public   2.此类提供公共的无参构造器 
 * 3.在该类中声明单元测试方法:方法权限为public，方法无返回值，没有形参
 * 4.该方法上需要声明注解:@Test，并导入包
 * 5.在方法体内写入需要测试的代码，双击方法名，再右击选择run as即可测试。
 * 
 * 说明:如果执行结果没有异常:显示绿条
 *      如果执行结果出现异常:显示红条
 * 
 */
public class JUnitTest {
	
	@Test
	public void testEquals() {
		String s1 = "Tom";
		String s2 = "Tom";
		System.out.println(s1.equals(s2));
	}

}
