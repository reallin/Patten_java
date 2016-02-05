package com.lxj.simpleFactory;

import com.lxj.Changfen.Changfen;
import com.lxj.Changfen.MeatChangfen;
import com.lxj.Changfen.VegetableChangfen;

public class SimpleFactory {
	public Changfen createChangfen(String tag){ 
		Changfen changfen = null;
		if(tag.equals("vegetable")){
			changfen = new VegetableChangfen();
	}else if(tag.equals("meat")){
		changfen = new MeatChangfen();
	}
	return changfen;
	}
}
