package com.neuedu.part07;

public interface Fruit {
	public void eat();
}

class Apple implements Fruit{
	
	@Override
	public void eat(){
		System.out.println("´à");
	}
}

class Banana implements Fruit{
	
	@Override
	public void eat(){
		System.out.println("Ìð");
	}
}

