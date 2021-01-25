package com.neuedu.part07;

import java.util.Scanner;

public class TestFruit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入需要的水果，apple，banana");
		String nextLine ;
		
		while(true){
			nextLine = scanner.nextLine();
			Fruit growFruit = growFruit(nextLine);
			if(growFruit !=null){
				growFruit.eat();
				break;
			}else{
				System.out.println("没有这种水果,请重新输入");
			}
		}
		
		//出现空指针异常的最常见的一个场景，点前面的东西是null	
	}
	
	public static Fruit growFruit(String type){
		
		if("banana".equals(type)){
			return  new Banana();
		}else if("apple".equals(type)){
			return  new Apple();
		}
		
		return null;
		
	}
	
	

}
