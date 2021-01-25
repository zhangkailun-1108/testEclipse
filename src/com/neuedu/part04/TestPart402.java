package com.neuedu.part04;

import java.util.Random;

public class TestPart402 {

	public static void main(String[] args) {
		//每秒执行一次 （线程休眠1s）
		//定义赛道
		String[] str = new String[70];
		//初始化场景
		System.out.println("BANG!!!!(砰！)");
		System.out.println("AND THE’RE OFF！！！（他们出发了！！！）");
		//初始化赛道
		for(int i=0;i<str.length;i++){
			if(i==0){
				str[i]="(T/H)";//代表着同一起点
			}else{
				str[i]="-";
			}
		}
		//输出轨迹
		for(String item : str){
			System.out.print(item);
		}
		//初始化选手位置
		int wgIndex = 0;//乌龟初始化位置
		int tzIndex = 0;//兔子初始化位置
		//做随机数
		Random r = new Random();
		int count = 0;//执行次数
		while(true){
			System.out.println();
			//每次重置赛道
			for(int i=0;i<str.length;i++){
					str[i]="-";
			}
			//做一个定时  1S
			try {
				Thread.sleep(1000);//毫秒单位
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//乌龟
			int wg = r.nextInt(10);
			
			if(wg>=0 && wg<=4){//快速走
				wgIndex=wgIndex+3;
			}else if(wg>=5 && wg<=6){//滑到
				wgIndex=wgIndex-6;
				if(wgIndex<0){
					wgIndex=0;//初始化
				}
			}else if(wg>=7 && wg<=9){//慢速走
				wgIndex=wgIndex+1;
			}
			
			//兔子
			int tz = r.nextInt(10);
			if(tz>=0 && tz<=1){//原地不动
				
			}else if(tz>=2 && tz<=3){//大跳
				tzIndex=tzIndex+9;
			}else if(tz==4){//大滑到
				tzIndex=tzIndex-12;
				if(tzIndex<0){
					tzIndex=0;
				}
			}else if (tz>=5 && tz<=7){//小跳
				tzIndex=tzIndex+1;
			}else if (tz>=8 && tz<=9){//小滑到
				tzIndex=tzIndex-2;
				if(tzIndex<0){
					tzIndex=0;
				}
			}
			
			if(tzIndex>=69 && wgIndex>=69){//表样乌龟
				System.out.println("It’s a tie");
				break;
			}else if(wgIndex>=69){//乌龟赢
				System.out.println("TORTOISE WINS！！！YAY！！！");
				break;
			}else if(tzIndex>=69){//兔子赢
				System.out.println("Hare wins.Yuch");
				break;
			} 
			
			//没有结束时，输入每回合运动结束的轨迹
			for(int i=0;i<str.length;i++){
				if(wgIndex == tzIndex){
					str[tzIndex]="O";
				}else if(i==wgIndex){
					str[i]="T";
				}else if(i==tzIndex){
					str[i]="H";
				}
			}
			count++;
			System.out.print("第"+count+"轮:");
			//输出轨迹
			for(String item : str){
				System.out.print(item);
			}
			System.out.println();
		}
		
		
	}

}
