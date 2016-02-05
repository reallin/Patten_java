package com.lxj.abstractChangfen;

import com.lxj.abstractFactory.AbstractChangfenFactory;

public class STAbstractMeatChangfen extends AbstractChangfen{

	private AbstractChangfenFactory mFactory = null;
	public  STAbstractMeatChangfen(AbstractChangfenFactory factory) {
		// TODO Auto-generated constructor stub
		this.mFactory = factory;
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		this.mSauce = this.mFactory.createSauce();
		this.mFlour = this.mFactory.createFlour();
		System.out.println("i am in ShanTou factory,i like meat,the sause is "+this.mSauce.print()+",the flour is "+this.mFlour.print());
				
	}

}
