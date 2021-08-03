package com.java.TemplateTest;

/*
 * 抽象类的应用：模板方法的设计模式
 * 
 * 模拟银行挂号系统
 * 流程：
 *       1.取号
 *       2.办理相关业务
 *       3.评分
 */

//******************************测试**************************
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

//*******************************模板*************************
abstract class BankTemplate {

	public final void process() {
		takeNumber();
		business();
		evaluate();
	}

	private void takeNumber() {
		System.out.println("先去取一个号");
	}

	protected abstract void business();

	private void evaluate() {
		System.out.println("给一个好评\n");
	}
}


//****************************子类******************************
//取钱业务
class TakeMoney extends BankTemplate {

	@Override
	public void business() {
		System.out.println("办理的是取钱业务");
	}
}

//存钱业务
class SaveMoney extends BankTemplate {

		@Override
		public void business() {
			System.out.println("办理的是存钱业务");
		}
}

//贷款业务
class Loans extends BankTemplate {

	@Override
	public void business() {
		System.out.println("办理的是贷款业务");
	}
}



