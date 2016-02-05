package com.lxj.Adaptee;

import com.lxj.Bird.Bird;

public class Adapter implements Bird{
	Chicken chicken = null;
	
	public Adapter(Chicken chicken) {
		// TODO Auto-generated constructor stub
		this.chicken = chicken;
	}
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return this.chicken.run();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ÄÜÒÆ¶¯"+fly()+"Ã×");
	}

}
