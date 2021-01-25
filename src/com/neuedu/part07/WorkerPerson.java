package com.neuedu.part07;

public abstract class WorkerPerson {

	private String  name;
	
    public abstract void eat();
	
	public abstract void speak();
	
	public abstract void live();
	
	
	public static void main(String[] args) {
		WorkerPerson consumer = new CollegeStudent();
		consumer.speak();
	}
}

interface Consumer{
	
	public void userCredit();
	
}

class CollegeStudent extends WorkerPerson implements Consumer{

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
	public void userCredit() {
		System.out.println("可以刷卡");
		
	}
	
}