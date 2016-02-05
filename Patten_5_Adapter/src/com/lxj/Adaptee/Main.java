package com.lxj.Adaptee;

import com.lxj.Bird.Bird;
import com.lxj.Bird.Parrot;

public class Main {
	public static void main(String[] args){
		Bird bird = new Parrot();
		bird.print();
		Bird bird2 = new Adapter(new Chicken());
		bird2.print();
	}
}
