package com.lxj.abstractChangfen;

import com.lxj.Source.Flour;
import com.lxj.Source.Sauce;
import com.lxj.Source.Seasoning;

public abstract class AbstractChangfen{
	protected Sauce mSauce = null;
	protected Flour mFlour = null;
	protected Seasoning mSeasioning = null;
	
	public abstract void prepare();
	public void bake(){
		System.out.println("after prepare,the Changfen should be bake");
	}
	public void cut(){
		System.out.println("after bake,the Changfen should be cut");
	}
}
