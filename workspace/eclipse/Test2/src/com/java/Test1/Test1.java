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
 * �������Ʒ���
 * @param arr ����Ҫ�ƶ�������
 * @param n ������λ��
 * @return ����
 */
	public int[] Exchange(int[] arr, int n) {
		// ��λ        2λ                     123456
		int temp = 0;
		int cha = arr.length - n;
		// �� cha-n Ϊ�Ǳ�Ϊ�磬�ұߵ�ת        4321 56 
		for (int i = 0; i < cha/2; i++) {
			temp = arr[i];
			arr[i] = arr[cha - 1 - i];
			arr[cha - 1 - i] = temp;
		}
		// �� cha-n Ϊ�Ǳ�Ϊ�磬��ߵ�ת        4321 65
		for (int i = cha,j = 0; j < (arr.length - cha)/2; i++,j++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - j];
			arr[arr.length - 1 - j] = temp;
		}
		// ���嵹ת                            26 1234
		for (int i = 0; i < arr.length/2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}
	
	
	/**
	 * �������
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
