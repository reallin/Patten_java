package com.lxj.strategy;

public class RedDuck extends Duck{
	
	public RedDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new NoFly();//Ĭ�ϲ����
		
	}
	@Override
	public void disply() {
		// TODO Auto-generated method stub
		System.out.println("the color is red");
	}

}
