package com.lxj.strategy;

public class BlackDuck extends Duck{

	public BlackDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new CanFly();//Ĭ�ϲ����
		
	}
	@Override
	public void disply() {
		// TODO Auto-generated method stub
		System.out.println("the color is black");
	}
}
