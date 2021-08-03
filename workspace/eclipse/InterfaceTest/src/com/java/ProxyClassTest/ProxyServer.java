package com.java.ProxyClassTest;

public class ProxyServer implements NetWork {

	private NetWork work;  //声明一个 NetWork 的成员变量
	
	public ProxyServer(NetWork work) {  //代理类的构造函数，对work进行初始化
		this.work = work;
	}
	
	private void cheak() {              //除代理外，提供其他的功能方法-->检查
		System.out.println("检查连接");
	}
	@Override
	public void browse() {               //重写“浏览”方法，调用 被代理类 的“浏览”方法
		cheak();
		work.browse();
	}
 
}
