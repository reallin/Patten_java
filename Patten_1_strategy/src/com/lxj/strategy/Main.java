package com.lxj.strategy;

import org.omg.CORBA.NO_IMPLEMENT;

public class Main {
	public static void main(String[] args){
		Duck duck = new RedDuck();
		duck.performFly();
		duck.disply();
		duck.setFlyBehavior(new CanFly());
		duck.performFly();
		System.out.println("-----------------");
		Duck duck2 = new BlackDuck();
		duck2.performFly();
		duck2.disply();
		duck2.setFlyBehavior(new NoFly());
		duck2.performFly();
	}
}
