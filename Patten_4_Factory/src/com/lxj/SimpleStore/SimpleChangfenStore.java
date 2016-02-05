package com.lxj.SimpleStore;

import com.lxj.Changfen.Changfen;
import com.lxj.simpleFactory.SimpleFactory;

public class SimpleChangfenStore {
	SimpleFactory mFactory = null;
	public SimpleChangfenStore(SimpleFactory factory){
		this.mFactory = factory;
	}
	public void orderChangfen(String tag){
		Changfen mChangfen = null;
		mChangfen = mFactory.createChangfen(tag);
		mChangfen.prepare();
		mChangfen.bake();
		mChangfen.cut();
		System.out.println("------finish one-------");
	}
}
