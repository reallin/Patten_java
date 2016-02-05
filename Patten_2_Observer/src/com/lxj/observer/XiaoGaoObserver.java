package com.lxj.observer;

import com.lxj.Subject.Subject;

public  class XiaoGaoObserver implements Observer {
	String bookName;
	private Subject subject;
	public XiaoGaoObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.registerObserver(this);
	}
	@Override
	public void update(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("i am xiaoGao,the new book is "+name);
	}
	@Override
	public void disConnect() {
		// TODO Auto-generated method stub
		this.subject.removeObserver(this);
	}


}
