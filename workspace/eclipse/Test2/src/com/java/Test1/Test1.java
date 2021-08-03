package com.java.Test1;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		Test1 test1 = new Test1();
		for( int element :test1.Exchange(arr, 4)){
			System.out.print(element);
		}
		
	}
	
/**
 * 数组右移方法
 * @param arr ：所要移动的数组
 * @param n ：右移位数
 * @return 数组
 */
	public int[] Exchange(int[] arr, int n) {
		// 移位        2位                     123456
		int temp = 0;
		int cha = arr.length - n;
		// 以 cha-n 为角标为界，右边倒转        4321 56 
		for (int i = 0; i < cha/2; i++) {
			temp = arr[i];
			arr[i] = arr[cha - 1 - i];
			arr[cha - 1 - i] = temp;
		}
		// 以 cha-n 为角标为界，左边倒转        4321 65
		for (int i = cha,j = 0; j < (arr.length - cha)/2; i++,j++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - j];
			arr[arr.length - 1 - j] = temp;
		}
		// 整体倒转                            26 1234
		for (int i = 0; i < arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}
	
	
	/**
	 * 倒序输出
	 * @param arr
	 * @return
	 */
	public int[] Chang(int[] arr) {
		int temp = 0;
		for(int i  = 0 ; i < arr.length/2 ; i++) {
			temp= arr[i];
			arr[i] = arr[arr.length - 1- i];
			arr[arr.length -1-i] = temp;
		}
		return arr;
	}
}
