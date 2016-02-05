package com.lxj.Subject;

import java.util.ArrayList;

import com.lxj.observer.Observer;
import com.lxj.observer.XiaoGaoObserver;


public class BookSubject implements Subject {
	private String bookName;
	ArrayList<Observer> aList; 
	public BookSubject() {
		// TODO Auto-generated constructor stub
		aList = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
			aList.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		if(aList.contains(o)){
			aList.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer observer :aList){
			if(observer instanceof XiaoGaoObserver){
				bookName = "java���˼��";
			}else{
				bookName = "c++���˼��";
			}
			
			observer.update(bookName);
		
	}
	}
}