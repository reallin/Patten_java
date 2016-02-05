package com.project;


public class Main {
	public static void main(String[] args){
		BaseAction generalAction = new GeneralProject();
		generalAction.FinishProject();
		BaseAction instAction = new InstProject();
		instAction.FinishProject();
		BaseAction commitAction = new CommitProject();
		commitAction.FinishProject();
	}
}
