package com.neuedu.part07;

import java.util.Scanner;

public class TestAnimal {

	public static void main(String[] args) {
	
		Animal animal = new Dog();
		//animal.Calls();
		Scanner sc = new Scanner(System.in);
		
		int nextInt = sc.nextInt();
		
		Animal buyAnimal = buyAnimal(nextInt);
		if(buyAnimal != null){
			if(buyAnimal instanceof Cat){
				System.out.println("��ϲ ����è");
				Cat c = (Cat) buyAnimal;
				c.catCalls();
			}else if (buyAnimal instanceof Dog){
				System.out.println("��ϲ ���˹�");
				Dog dog = (Dog) buyAnimal;
				dog.dogCalls();
			}
		}else{
			System.out.println("û�� ");
		}
		
		
	}

	//��С����
	public static Animal buyAnimal(int type){
		if(type ==1){
			return  new Cat();
		}else if (type==2){
			return  new Dog();
		}else{
			return  null;
		}
	}
	
	
}
