package com.lxj.inteface;


import com.lxj.decorate.FilteInputStream;

public class DataInputStream extends FilteInputStream {
	private MyInputStream inputStream;
	
	public DataInputStream(MyInputStream input) {
		// TODO Auto-generated constructor stub
		this.inputStream = input;
	}
	
	@Override
	public String read() {
		// TODO Auto-generated method stub
		return "DataInputStream";
	}

	@Override
	public String write() {
		// TODO Auto-generated method stub
		return (read()+" and " +this.inputStream.write()+" ");
	}


	

}
