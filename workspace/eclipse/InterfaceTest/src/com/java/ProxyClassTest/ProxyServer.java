package com.java.ProxyClassTest;

public class ProxyServer implements NetWork {

	private NetWork work;  //����һ�� NetWork �ĳ�Ա����
	
	public ProxyServer(NetWork work) {  //������Ĺ��캯������work���г�ʼ��
		this.work = work;
	}
	
	private void cheak() {              //�������⣬�ṩ�����Ĺ��ܷ���-->���
		System.out.println("�������");
	}
	@Override
	public void browse() {               //��д����������������� �������� �ġ����������
		cheak();
		work.browse();
	}
 
}
