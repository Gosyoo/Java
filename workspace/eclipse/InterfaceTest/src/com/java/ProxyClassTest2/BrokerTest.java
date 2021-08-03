package com.java.ProxyClassTest2;

/*
 * 
 * 代理模式示例2：经纪人示例
 *    接口：一些可被代理的行为
 *    被代理类：明星
 *    代理类：经纪人
 */
public class BrokerTest {
	// 测试
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

//************************接口*******************
interface IStar {

	void confer();// 面谈

	void signContract(); // 签合同

	void bookTicket(); // 订票

	void ownWork(); // 本职工作

	void collectMoney();// 收钱

}

//***********************明星（被代理类）*********

class Singer implements IStar {

	public void sing() {
		System.out.println("歌手：唱歌~~~~");
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

//************************画家（被代理）***********
class Painter implements IStar {

	public void painter() {
		System.out.println("画家：绘画~~~~");
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

//*************************经纪人（代理类）**********
class Broker implements IStar {

	private IStar star;

	public Broker(IStar star) {
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("经纪人代理面谈");
	}

	@Override
	public void signContract() {
		System.out.println("经纪人代理签合同");

	}

	@Override
	public void bookTicket() {
		System.out.println("经纪人代理订票");

	}

	@Override
	public void collectMoney() {
		System.out.println("经纪人代理收钱");

	}

	@Override
	public void ownWork() {
		star.ownWork();
	}

}
