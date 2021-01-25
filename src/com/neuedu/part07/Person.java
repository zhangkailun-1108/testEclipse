package com.neuedu.part07;

public interface Person {

	public void eat();
	
	public void speak();
	
	public void live();
	
}

interface Salesman extends Person{
	
	
	
}


class Worker extends Shape implements Salesman{

	@Override
	public void eat() {
		System.out.println("会干饭");
		
	}

	@Override
	public void speak() {
		System.out.println("会说话");
		
	}

	@Override
	public void live() {
		System.out.println("还活着");
		
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPer() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
