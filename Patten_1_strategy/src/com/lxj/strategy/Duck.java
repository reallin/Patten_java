package com.lxj.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;

	public abstract void disply();
	
	public  void performFly(){
		flyBehavior.fly();
	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
}
