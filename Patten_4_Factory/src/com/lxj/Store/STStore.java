package com.lxj.Store;

import com.lxj.Changfen.Changfen;
import com.lxj.Changfen.STMeatChangfen;
import com.lxj.Changfen.STVegetableChangfen;

public class STStore extends ChangfenStore{

	@Override
	public Changfen createChangfen(String tag) {
		Changfen changfen = null;
		if(tag.equals("vegetable")){
			changfen = new STVegetableChangfen();
	}else if(tag.equals("meat")){
		changfen = new STMeatChangfen();
		
	}
	return changfen;
	}

}
