package com.baidu.jyp.s0524.adapter.objectadapter;

import com.baidu.jyp.s0524.adapter.objectadapter.adapter;
import com.baidu.jyp.s0524.adapter.objectadapter.ps2;
import com.baidu.jyp.s0524.adapter.objectadapter.usber;

/**
*@author 作者 JiYanPing
*@version 创建时间 2018年5月24日下午8:48:04
*类说明
*/
public class clienter {

	public static void main(String[] args) {
		ps2 p = new adapter(new usber());
		p.isps2();
	}

}
