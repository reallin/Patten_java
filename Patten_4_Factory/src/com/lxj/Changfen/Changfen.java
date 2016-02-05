package com.lxj.Changfen;

public abstract class Changfen {
	public abstract void prepare();
	public void bake(){
		System.out.println("after prepare,the Changfen should be bake");
	}
	public void cut(){
		System.out.println("after bake,the Changfen should be cut");
	}
	

}
