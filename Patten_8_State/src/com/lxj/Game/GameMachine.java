package com.lxj.Game;

import java.net.Socket;

import com.lxj.state.HasQuartsState;
import com.lxj.state.NoQuartsState;
import com.lxj.state.SoldQuartsState;
import com.lxj.state.State;

public class GameMachine {
	public State noneState;
	public State hasState;
	public State soldState;
	public State state = new NoQuartsState(this);
	public GameMachine(){
		noneState = new NoQuartsState(this);
		hasState = new HasQuartsState(this);
		soldState = new SoldQuartsState(this);
	}
	public void insert(){
		state.insert();
	}
	public void eject(){
		state.eject();
	}
	public void trunkCrack(){
		state.trunkCrack();
	}
	public void setState(State state){
		this.state = state;
	}
}
