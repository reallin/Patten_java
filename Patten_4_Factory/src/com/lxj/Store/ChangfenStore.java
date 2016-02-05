package com.lxj.Store;

import com.lxj.Changfen.Changfen;
import com.lxj.simpleFactory.SimpleFactory;

public abstract class ChangfenStore {
	public abstract Changfen createChangfen(String tag);
	public void orderChangfen(String tag){
		Changfen mChangfen = null;
		mChangfen = createChangfen(tag);
		mChangfen.prepare();
		mChangfen.bake();
		mChangfen.cut();
		System.out.println("------finish one-------");
	}
}
