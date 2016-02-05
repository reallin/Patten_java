package com.lxj.Movie;

public class SingFacade {
	CDPlayer mCdPlayer;
	Light mLight;
	Screen mScreen;
	public SingFacade(CDPlayer cdPlayer,Light light,Screen screen){
		this.mCdPlayer = cdPlayer;
		this.mLight = light;
		this.mScreen = screen;
	
	}
	public void beginSing(){
		this.mLight.On();
		this.mCdPlayer.On();
		this.mScreen.On();
	}public void endSing(){
		this.mLight.Off();
		this.mCdPlayer.Off();
		this.mScreen.Off();
	}
}
