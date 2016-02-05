package com.lxj.abstractStore;

import com.lxj.abstractChangfen.AbstractChangfen;
import com.lxj.abstractChangfen.SZAbstractMeatChangfen;
import com.lxj.abstractChangfen.SZAbstractVegetablehangfen;
import com.lxj.abstractFactory.AbstractChangfenFactory;
import com.lxj.abstractFactory.SZChangfenFactory;

public class SZStore extends ChangfenStore{

	@Override
	public AbstractChangfen createChangfen(String tag) {
		// TODO Auto-generated method stub
		AbstractChangfen changfen = null;
		AbstractChangfenFactory factory;
		factory = new SZChangfenFactory();
		if(tag.equals("vegetable")){
			changfen = new SZAbstractVegetablehangfen(factory);
	}else if(tag.equals("meat")){
		changfen = new SZAbstractMeatChangfen(factory);
		
	}
	return changfen;
	}
	
}
