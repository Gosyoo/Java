package com.java.ProxyClassTest;

public class Server implements NetWork {

	@Override
	public void browse() {
		System.out.println("真实的服务器");
	}

}
