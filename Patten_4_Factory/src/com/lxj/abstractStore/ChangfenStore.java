package com.lxj.abstractStore;

import com.lxj.abstractChangfen.AbstractChangfen;

public abstract class ChangfenStore {
	public abstract AbstractChangfen createChangfen(String tag);
	public void orderChangfen(String tag){
		AbstractChangfen mChangfen = null;
		mChangfen = createChangfen(tag);
		mChangfen.prepare();
		mChangfen.bake();
		mChangfen.cut();
		System.out.println("------finish one-------");
	}
}
