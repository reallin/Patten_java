package com.lxj.abstractStore;

import com.lxj.abstractChangfen.AbstractChangfen;
import com.lxj.abstractChangfen.STAbstractMeatChangfen;
import com.lxj.abstractChangfen.STAbstractVegetableChangfen;
import com.lxj.abstractFactory.AbstractChangfenFactory;
import com.lxj.abstractFactory.STChangfenFactory;

public class STStore extends ChangfenStore{

	@Override
	public AbstractChangfen createChangfen(String tag) {
		AbstractChangfen changfen = null;
		AbstractChangfenFactory factory;
		factory = new STChangfenFactory();
		if(tag.equals("vegetable")){
			changfen = new STAbstractVegetableChangfen(factory);
	}else if(tag.equals("meat")){
		changfen = new STAbstractMeatChangfen(factory);
		
	}
	return changfen;
	}

}
