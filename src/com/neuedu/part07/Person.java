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
		System.out.println("��ɷ�");
		
	}

	@Override
	public void speak() {
		System.out.println("��˵��");
		
	}

	@Override
	public void live() {
		System.out.println("������");
		
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
