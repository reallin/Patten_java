package com.lxj.abstractFactory;

import com.lxj.Source.Flour;
import com.lxj.Source.Sauce;
import com.lxj.Source.Seasoning;

public abstract class AbstractChangfenFactory {
	public abstract Flour createFlour();
	public abstract Sauce createSauce();
	public abstract Seasoning createseasoning();
	
}
