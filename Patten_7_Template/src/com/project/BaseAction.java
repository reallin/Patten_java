package com.project;

import javax.print.attribute.standard.Finishings;

public abstract class BaseAction {
	public abstract void aduitProject();
	public final void searchProject(){
		System.out.println("first,search the project what you want.");
	}
	public abstract void viewProject();
	public final void FinishProject(){
		searchProject();
		viewProject();
		aduitProject();
		System.out.println("------finish one--------");
	}
}
