package com.java.ProxyClassTest;

import javax.print.attribute.standard.Severity;

/*
 * 接口的应用:代理模式
 * 
 *  服务器代理的一个简单流程：
 *    接口：连接服务器功能的接口
 *    被代理类：一个真实的服务器
 *    代理类：提供代理服务器和一些其他功能
 */
public class ProxyTest {
	// 测试
	public static void main(String[] args) {
		
		NetWork work = new Server(); //创建被代理类对象
		ProxyServer proxyServer = new ProxyServer(work);  //将需要代理的类放入参数中，代理该类
		proxyServer.browse();  //调用“浏览”方法
		
	}

}
