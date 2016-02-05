package com.lxj.strategy;

public class NoFly implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("this duck can not fly");
	}


}
