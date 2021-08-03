package com.java.ExceptionTest;

/*���쳣�������ϰ ����
 * 
 * �쳣�׳������ַ�ʽ
 *   	1.ϵͳ�Զ��׳����쳣
 *      
 *      2.�ֶ��׳��쳣  ��throw�����ֶ�����һ���쳣����
 * 
 * �쳣��������ַ�ʽ�� 
 *  	1. try-catch-finally
 *     			���쳣���д���
 *     
 *     			��ʽ��
 *     			try{
 *         				���ܳ����쳣�Ĵ���
 *     				}catch(�쳣����1 ������1){
 *        			 	�����쳣�Ĵ���
 *     				}catch(�쳣����2 ������2){
 *       			  	�����쳣�Ĵ���
 *     				}catch(�쳣����3 ������3){
 *         				�����쳣�Ĵ���
 *    				}
 *    				finally{
 *         				һ����ִ�еĴ��루����������Ĺرգ� 
 *         				ԭ����Ϊ���쳣ʱ������Ͳ�������ִ���ˣ����Ƕ�����Щ����Ҫ�еĲ���������д��finally�
 *     				}
 *     
 *  	2. throws 
 *     			���쳣�׳����ɵ��ø÷����Ľṹ�����쳣 
 *       		�÷��������ܽ��쳣�������ֻ�ǽ��쳣�Ĵ�����������ȥ����
 * 
 * 
 */
public class Test01 {
	public static void main(String[] args) {
       
		//��throws�׳����쳣���г�����
		try {
			methon01();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("��������Խ���쳣");
		}
		
		//ʹ��try-catch-finally������ķ���
		methon02();

	}

	/**
	 * throw�ķ�ʽ�����쳣
	 * 
	 * @throws Exception
	 */
	public static void methon01() throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[3];
		System.out.println(arr[3]);
	}

	/**
	 * try-catch-finally �ķ�ʽ�����쳣
	 */
	public static void methon02() {
		try {
			System.out.println("���뷽��02");
			throw new Exception("�ֶ��׳����쳣");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("һ��ִ�еĴ���02");
		}
	}
}
