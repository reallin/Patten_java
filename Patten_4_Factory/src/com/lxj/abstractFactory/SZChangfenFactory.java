package com.lxj.abstractFactory;

import com.lxj.Source.Flour;
import com.lxj.Source.SZFlour;
import com.lxj.Source.SZSauce;
import com.lxj.Source.SZSessioning;
import com.lxj.Source.Sauce;
import com.lxj.Source.Seasoning;

public class SZChangfenFactory extends AbstractChangfenFactory{
	@Override
	public Flour createFlour() {
		// TODO Auto-generated method stub
		return new SZFlour();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return  new SZSauce();
	}

	@Override
	public Seasoning createseasoning() {
		// TODO Auto-generated method stub
		return new SZSessioning();
	}
}
