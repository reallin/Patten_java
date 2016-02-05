package com.lxj.abstractChangfen;

import com.lxj.abstractFactory.AbstractChangfenFactory;

public class SZAbstractVegetablehangfen extends AbstractChangfen{
	private AbstractChangfenFactory mFactory = null;
	public  SZAbstractVegetablehangfen(AbstractChangfenFactory factory) {
		// TODO Auto-generated constructor stub
		this.mFactory = factory;
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		this.mSeasioning = this.mFactory.createseasoning();
		System.out.println("i am in Shenzhen factory,i like vegetable,the mSeasioning is "+this.mSeasioning.print());
				
	}
}
