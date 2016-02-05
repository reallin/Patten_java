package com.lxj.state;

import com.lxj.Game.GameMachine;

public class HasQuartsState implements State{
GameMachine mGameMachine = null;
	
	public  HasQuartsState(GameMachine game) {
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
		System.out.println("you get the money back");
		this.mGameMachine.setState(this.mGameMachine.noneState);
	}

	@Override
	public void trunkCrack() {
		// TODO Auto-generated method stub
		System.out.println("ready to buy the quarts");
		this.mGameMachine.setState(this.mGameMachine.soldState);
	}

}
