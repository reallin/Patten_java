package com.lxj.abstractFactory;

import com.lxj.Source.Flour;
import com.lxj.Source.STFlour;
import com.lxj.Source.STSauce;
import com.lxj.Source.STSessioning;
import com.lxj.Source.Sauce;
import com.lxj.Source.Seasoning;

public class STChangfenFactory extends AbstractChangfenFactory{

	@Override
	public Flour createFlour() {
		// TODO Auto-generated method stub
		return new STFlour();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return  new STSauce();
	}

	@Override
	public Seasoning createseasoning() {
		// TODO Auto-generated method stub
		return new STSessioning();
	}
	
}
