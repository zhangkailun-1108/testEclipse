package com.neuedu.part07;

import java.util.Scanner;

public class TestFruit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ҫ��ˮ����apple��banana");
		String nextLine ;
		
		while(true){
			nextLine = scanner.nextLine();
			Fruit growFruit = growFruit(nextLine);
			if(growFruit !=null){
				growFruit.eat();
				break;
			}else{
				System.out.println("û������ˮ��,����������");
			}
		}
		
		//���ֿ�ָ���쳣�������һ����������ǰ��Ķ�����null	
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
