package com.lxj.mainTest;

import com.lxj.SimpleStore.SimpleChangfenStore;
import com.lxj.Store.ChangfenStore;
import com.lxj.Store.STStore;
import com.lxj.Store.SZStore;
import com.lxj.simpleFactory.SimpleFactory;

public class Main {
	public static void main(String[] args){
		ChangfenStore SZstore = new SZStore();
		SZstore.orderChangfen("meat");
		SZstore.orderChangfen("vegetable");
		
		ChangfenStore STstore = new STStore();
		STstore.orderChangfen("meat");
		STstore.orderChangfen("vegetable");
	}
}
