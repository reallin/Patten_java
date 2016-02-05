package com.lxj.abstractChangfen;

import javax.xml.parsers.FactoryConfigurationError;

import com.lxj.abstractFactory.AbstractChangfenFactory;

public class SZAbstractMeatChangfen extends AbstractChangfen{
	private AbstractChangfenFactory mFactory = null;
	public  SZAbstractMeatChangfen(AbstractChangfenFactory factory) {
		// TODO Auto-generated constructor stub
		this.mFactory = factory;
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		this.mSauce = this.mFactory.createSauce();
		this.mFlour = this.mFactory.createFlour();
		System.out.println("i am in shenzhen factory,the sause is "+this.mSauce.print()+",the flour is "+this.mFlour.print());
				
	}

}
