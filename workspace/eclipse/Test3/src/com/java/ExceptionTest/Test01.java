package com.java.ExceptionTest;

/*对异常处理的练习 测试
 * 
 * 异常抛出的两种方式
 *   	1.系统自动抛出的异常
 *      
 *      2.手动抛出异常  （throw），手动生成一个异常对象
 * 
 * 异常处理的两种方式： 
 *  	1. try-catch-finally
 *     			对异常进行处理
 *     
 *     			格式：
 *     			try{
 *         				可能出现异常的代码
 *     				}catch(异常类型1 变量名1){
 *        			 	处理异常的代码
 *     				}catch(异常类型2 变量名2){
 *       			  	处理异常的代码
 *     				}catch(异常类型3 变量名3){
 *         				处理异常的代码
 *    				}
 *    				finally{
 *         				一定会执行的代码（例如对于流的关闭） 
 *         				原因：因为出异常时，程序就不会往下执行了，但是对于有些必须要有的操作，可以写在finally里。
 *     				}
 *     
 *  	2. throws 
 *     			将异常抛出，由调用该方法的结构处理异常 
 *       		该方法并不能将异常处理掉，只是将异常的处理交给调用者去处理
 * 
 * 
 */
public class Test01 {
	public static void main(String[] args) {
       
		//对throws抛出的异常进行出处理
		try {
			methon01();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("处理数组越界异常");
		}
		
		//使用try-catch-finally处理过的方法
		methon02();

	}

	/**
	 * throw的方式处理异常
	 * 
	 * @throws Exception
	 */
	public static void methon01() throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[3];
		System.out.println(arr[3]);
	}

	/**
	 * try-catch-finally 的方式处理异常
	 */
	public static void methon02() {
		try {
			System.out.println("进入方法02");
			throw new Exception("手动抛出的异常");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("一定执行的代码02");
		}
	}
}
