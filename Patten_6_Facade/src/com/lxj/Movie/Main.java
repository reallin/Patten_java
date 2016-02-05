package com.lxj.Movie;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

public class Main {
	public static void main(String[] args){
		CDPlayer cdPlayer = new CDPlayer();
		Light light = new Light();
		Screen screen = new Screen();
		SingFacade facade = new SingFacade(cdPlayer, light, screen);
		facade.beginSing();
		facade.endSing();
	}
}
