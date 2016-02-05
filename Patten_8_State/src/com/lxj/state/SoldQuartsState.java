package com.lxj.state;

import com.lxj.Game.GameMachine;

public class SoldQuartsState implements State{
	GameMachine mGameMachine = null;
	
	public  SoldQuartsState(GameMachine game) {
		// TODO Auto-generated constructor stub
		this.mGameMachine = game;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("couldn't insert the quarts twice");
	}

	@Override
	public void eject() {
		// TODO Auto-generated method stub
		System.out.println("couldn't eject the quarts");
	}

	@Override
	public void trunkCrack() {
		// TODO Auto-generated method stub
		System.out.println("get the quarts success");
		this.mGameMachine.setState(this.mGameMachine.noneState);
	}

}
