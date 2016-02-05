package com.lxj.Game;


public class Main {
	public static void main(String[] args){
		GameMachine machine = new GameMachine();
		machine.eject();
		machine.trunkCrack();
		
		machine.insert();
		machine.eject();
		
		machine.insert();
		machine.trunkCrack();
		machine.trunkCrack();
	}
}
