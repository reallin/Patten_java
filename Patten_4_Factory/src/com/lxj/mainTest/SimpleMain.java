package com.lxj.mainTest;

import com.lxj.SimpleStore.SimpleChangfenStore;
import com.lxj.simpleFactory.SimpleFactory;

public class SimpleMain {
	public static void main(String[] args){
		SimpleFactory factory = new SimpleFactory();
		SimpleChangfenStore store = new SimpleChangfenStore(factory);
		store.orderChangfen("meat");
		store.orderChangfen("vegetable");
	}
}
