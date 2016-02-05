package com.lxj.inteface;

import com.lxj.decorate.FilteInputStream;

public class BufferInputSteam extends FilteInputStream{

private MyInputStream inputStream;
	
	public BufferInputSteam(MyInputStream input) {
		// TODO Auto-generated constructor stub
		this.inputStream = input;
	}
	
	@Override
	public String read() {
		// TODO Auto-generated method stub
		return "BufferInputStream";
	}

	@Override
	public String write() {
		// TODO Auto-generated method stub
		return (read()+" and "+this.inputStream.write()+" ");
	}
	
	

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(write());
	}

}
