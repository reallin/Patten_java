package com.lxj.mainTest;

import com.lxj.abstractStore.ChangfenStore;
import com.lxj.abstractStore.STStore;
import com.lxj.abstractStore.SZStore;

public class AbstractMain {
	public static void main(String[] args){
		ChangfenStore STstore = new STStore();
		STstore.orderChangfen("meat");
		STstore.orderChangfen("vegetable");
		
		ChangfenStore SZstore = new SZStore();
		SZstore.orderChangfen("meat");
		SZstore.orderChangfen("vegetable");
	}
}
