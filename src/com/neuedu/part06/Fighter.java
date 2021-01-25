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
		System.out.println(this.name+"���ˣ�����"+hurt+"��Ѫ,ʣ��Ѫ��Ϊ��"+this.hp);
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
			int f2hp = f2.beaten(random.nextInt(11));//f1����
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int f1hp = f1.beaten(random.nextInt(11));//f2����
			
			if(f1hp == f2hp && f1hp==0){
				System.out.println("ͬ���ھ�");
				break;
			}else if(f2hp == 0){
				System.out.println(f1.name+"��ʤ");
				break;
			}else if (f1hp == 0){
				System.out.println(f2.name+"��ʤ");
				break;
			}
		}
		
	}

}
