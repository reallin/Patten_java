package com.lxj.inteface;

public class FileInputStream extends MyInputStream{
	public FileInputStream(String path){
		
	}

	

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return "FileInputStream";
	}



	@Override
	public String write() {
		// TODO Auto-generated method stub
		return this.read();
	}

}
