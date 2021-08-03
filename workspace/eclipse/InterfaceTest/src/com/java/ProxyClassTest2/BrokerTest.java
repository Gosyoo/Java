package com.java.ProxyClassTest2;

/*
 * 
 * ����ģʽʾ��2��������ʾ��
 *    �ӿڣ�һЩ�ɱ��������Ϊ
 *    �������ࣺ����
 *    �����ࣺ������
 */
public class BrokerTest {
	// ����
	public static void main(String[] args) {
        IStar s1 = new Singer();
        Broker b1 = new Broker(s1);
        b1.confer();
        b1.signContract();
        b1.bookTicket();
        b1.ownWork();
        b1.collectMoney();
        IStar s2 = new Painter();
        b1 = new Broker(s2);
        b1.ownWork();
	}
}

//************************�ӿ�*******************
interface IStar {

	void confer();// ��̸

	void signContract(); // ǩ��ͬ

	void bookTicket(); // ��Ʊ

	void ownWork(); // ��ְ����

	void collectMoney();// ��Ǯ

}

//***********************���ǣ��������ࣩ*********

class Singer implements IStar {

	public void sing() {
		System.out.println("���֣�����~~~~");
	}

	@Override
	public void confer() {

	}

	@Override
	public void signContract() {

	}

	@Override
	public void bookTicket() {

	}

	@Override
	public void collectMoney() {

	}

	@Override
	public void ownWork() {
		sing();
	}

}

//************************���ң�������***********
class Painter implements IStar {

	public void painter() {
		System.out.println("���ң��滭~~~~");
	}

	@Override
	public void confer() {

	}

	@Override
	public void signContract() {

	}

	@Override
	public void bookTicket() {

	}

	@Override
	public void collectMoney() {

	}

	@Override
	public void ownWork() {
		painter();
	}

}

//*************************�����ˣ������ࣩ**********
class Broker implements IStar {

	private IStar star;

	public Broker(IStar star) {
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("�����˴�����̸");
	}

	@Override
	public void signContract() {
		System.out.println("�����˴���ǩ��ͬ");

	}

	@Override
	public void bookTicket() {
		System.out.println("�����˴���Ʊ");

	}

	@Override
	public void collectMoney() {
		System.out.println("�����˴�����Ǯ");

	}

	@Override
	public void ownWork() {
		star.ownWork();
	}

}
