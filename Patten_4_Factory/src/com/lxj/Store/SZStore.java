package com.lxj.Store;

import com.lxj.Changfen.Changfen;
import com.lxj.Changfen.MeatChangfen;
import com.lxj.Changfen.SZMeatChangfen;
import com.lxj.Changfen.SZVegetableChangfen;
import com.lxj.Changfen.VegetableChangfen;

public class SZStore extends ChangfenStore{

	@Override
	public Changfen createChangfen(String tag) {
		// TODO Auto-generated method stub
		Changfen changfen = null;
		if(tag.equals("vegetable")){
			changfen = new SZVegetableChangfen();
	}else if(tag.equals("meat")){
		changfen = new SZMeatChangfen();
		
	}
	return changfen;
	}
	
}
