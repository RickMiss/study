package com.baidu.jyp.s0524.adapter.objectadapter;
/**
*@author ���� JiYanPing
*@version ����ʱ�� 2018��5��24������8:45:00
*��˵��
*/
public class adapter implements ps2 {

	private usb us ;
	
	public adapter (usb us) {
		this.us = us;
	}
	@Override
	public void isps2() {
		us.isusb();
		
	}

}
