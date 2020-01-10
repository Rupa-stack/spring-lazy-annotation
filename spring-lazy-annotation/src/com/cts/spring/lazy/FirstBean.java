package com.cts.spring.lazy;

public class FirstBean {
	private int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	FirstBean(){
		x=90;
		System.out.println("FirstBean constructor invoked");
	}
	
	public void test()
	{
		System.out.println("Method of FirstBean class");
	}

}
