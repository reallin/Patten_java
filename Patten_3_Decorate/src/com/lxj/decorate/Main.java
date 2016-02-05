package com.lxj.decorate;

import com.lxj.inteface.BufferInputSteam;
import com.lxj.inteface.DataInputStream;
import com.lxj.inteface.FileInputStream;

public class Main {
	public static void main(String[] args){
		BufferInputSteam bufferInputSteam = new BufferInputSteam(new DataInputStream(new FileInputStream("my.txt")));
		bufferInputSteam.print();
	}
}
