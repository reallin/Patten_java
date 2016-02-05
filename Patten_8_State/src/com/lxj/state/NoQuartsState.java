package com.lxj.state;
import com.lxj.Game.GameMachine;

public class NoQuartsState implements State{
	GameMachine mGameMachine = null;
	
	public  NoQuartsState(GameMachine game) {
		// TODO Auto-generated constructor stub
		this.mGameMachine = game;
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("you insert the money");
		this.mGameMachine.setState(this.mGameMachine.hasState);
		
	}

	@Override
	public void eject() {
		// TODO Auto-generated method stub
		System.out.println("you never insert money");
	}

	@Override
	public void trunkCrack() {
		// TODO Auto-generated method stub
		System.out.println("you never insert money");
	}


}
