package com.neuedu.part06;

import java.util.Random;

public class Fighter {

	int hp;
	String name;
	
	public Fighter(String name){
		this.name = name;
		this.hp = 100;
	}
	
	public int beaten(int hurt){
		this.hp -= hurt;
		if(this.hp<0){
			this.hp = 0;
		}
		System.out.println(this.name+"受伤，掉了"+hurt+"滴血,剩余血量为："+this.hp);
		return this.hp;
	}
	
	public static void main(String[] args) {
		Fighter f1 = new Fighter("mark");
		Fighter f2 = new Fighter("smith");
		
		Random random = new Random();
		
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int f2hp = f2.beaten(random.nextInt(11));//f1先手
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int f1hp = f1.beaten(random.nextInt(11));//f2动手
			
			if(f1hp == f2hp && f1hp==0){
				System.out.println("同归于尽");
				break;
			}else if(f2hp == 0){
				System.out.println(f1.name+"获胜");
				break;
			}else if (f1hp == 0){
				System.out.println(f2.name+"获胜");
				break;
			}
		}
		
	}

}
