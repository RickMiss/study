package com.baidu.jyp.s0524.adapter.objectadapter;
/**
*@author 作者 JiYanPing
*@version 创建时间 2018年5月24日下午8:45:00
*类说明
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
