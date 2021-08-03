package com.java.TemplateTest;

/*
 * �������Ӧ�ã�ģ�巽�������ģʽ
 * 
 * ģ�����йҺ�ϵͳ
 * ���̣�
 *       1.ȡ��
 *       2.�������ҵ��
 *       3.����
 */

//******************************����**************************
public class TemplateTest {

	public static void main(String[] args) {
		
		BankTemplate b1 = new TakeMoney();
		b1.process();
		
		BankTemplate b2 = new SaveMoney();
		b2.process();

		BankTemplate b3 = new Loans();
		b3.process();
		

	}
	
}

//*******************************ģ��*************************
abstract class BankTemplate {

	public final void process() {
		takeNumber();
		business();
		evaluate();
	}

	private void takeNumber() {
		System.out.println("��ȥȡһ����");
	}

	protected abstract void business();

	private void evaluate() {
		System.out.println("��һ������\n");
	}
}


//****************************����******************************
//ȡǮҵ��
class TakeMoney extends BankTemplate {

	@Override
	public void business() {
		System.out.println("�������ȡǮҵ��");
	}
}

//��Ǯҵ��
class SaveMoney extends BankTemplate {

		@Override
		public void business() {
			System.out.println("������Ǵ�Ǯҵ��");
		}
}

//����ҵ��
class Loans extends BankTemplate {

	@Override
	public void business() {
		System.out.println("������Ǵ���ҵ��");
	}
}



