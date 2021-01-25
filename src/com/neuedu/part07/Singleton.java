package com.neuedu.part07;

import java.util.Date;

public class Singleton {
	
	
	//1.���췽��˽�л�
	private Singleton(){
		
	}
	
	private static Singleton instance = null;//����ʽ
	
	public static Singleton getInstance(){
			if(instance ==null){//����ʽ
				instance = new Singleton();
			}
		return instance;
	}
	
	public Date getDate(){
		return new Date();
	}
	

}
