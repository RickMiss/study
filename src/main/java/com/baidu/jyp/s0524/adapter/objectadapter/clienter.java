package com.baidu.jyp.s0524.adapter.objectadapter;

import com.baidu.jyp.s0524.adapter.objectadapter.adapter;
import com.baidu.jyp.s0524.adapter.objectadapter.ps2;
import com.baidu.jyp.s0524.adapter.objectadapter.usber;

/**
*@author ���� JiYanPing
*@version ����ʱ�� 2018��5��24������8:48:04
*��˵��
*/
public class clienter {

	public static void main(String[] args) {
		ps2 p = new adapter(new usber());
		p.isps2();
	}

}
