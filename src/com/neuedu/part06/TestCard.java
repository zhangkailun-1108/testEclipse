package com.neuedu.part06;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntToDoubleFunction;

public class TestCard {

	public static void main(String[] args) {
		//作业：创建一个扑克牌类（花色和值），不算大小王
		//1.放数组中52张牌 
		//2.洗牌乱序
		//3.判断洗牌后的前三张是否是同花顺
		//4.求第一次出现同花顺时，一共洗了多少次牌
		
		//4大类 方片  梅花  黑桃 红桃
		//A---K   13
		Card[] cardarry = new Card[52];
		
		String[] colora = {"方片","梅花"," 黑桃","红桃"}; 
		
		String[] numa = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//创建对象
		for(int i=0;i<colora.length;i++){
			for(int j=0;j<numa.length;j++){
				String nums = numa[j];
				int count = 0;
				if("A".equals(nums)){//字符串比较用equals
					count = 1;
				}else if ("J".equals(nums)){
					count = 11;
				}else if ("Q".equals(nums)){
					count = 12;
				}else if ("K".equals(nums)){
					count = 13;
				}else{
					count = Integer.parseInt(nums);//字符串转换成int
				}
				cardarry[(i*13)+j] = new Card(colora[i], nums,count);
			}
		}
		for(Card item:cardarry){
			System.out.print(item.color+" "+item.num+"  ");
		}
		//洗牌
		Random r = new Random();
		
		int count = 0;//运行次数
		while(true){
			count++;
			
			for(int i=0;i<100;i++){//控制洗牌100次
				//定义中间对象，和最后一张交换
				int nextInt = r.nextInt(52);
				Card tempCard = cardarry[nextInt];
				cardarry[nextInt] = cardarry[cardarry.length-1];
				cardarry[cardarry.length-1] = tempCard;
			}
			System.out.println();
			for(Card item:cardarry){
				System.out.print(item.color+" "+item.num+"  ");
			}
			System.out.println();
			//判断前三张 是不是同花顺  
			//2种办法 判断 预期值是否依次大一
			if(cardarry[0].color.equals(cardarry[1].color) && cardarry[0].color.equals(cardarry[2].color)){
				//同花
				//1.比大小
				//2.排序的思路
				int[] iarry = {cardarry[0].count,cardarry[1].count,cardarry[2].count};
				Arrays.sort(iarry);//默认从小到大
				if(iarry[2]-iarry[1]==1  && iarry[1]-iarry[0]==1){//是同花顺
					System.out.print(cardarry[0].color+" "+cardarry[0].num+"  ");
					System.out.print(cardarry[1].color+" "+cardarry[1].num+"  ");
					System.out.print(cardarry[2].color+" "+cardarry[2].num+"  ");
					System.out.println("是同花顺");
					break;
				}else if(iarry[2]==13 && iarry[1]==12 && iarry[0]==1){//是同花顺
					System.out.print(cardarry[0].color+" "+cardarry[0].num+"  ");
					System.out.print(cardarry[1].color+" "+cardarry[1].num+"  ");
					System.out.print(cardarry[2].color+" "+cardarry[2].num+"  ");
					System.out.println("是同花顺");
					break;
				}else{
					System.out.print(cardarry[0].color+" "+cardarry[0].num+"  ");
					System.out.print(cardarry[1].color+" "+cardarry[1].num+"  ");
					System.out.print(cardarry[2].color+" "+cardarry[2].num+"  ");
					System.out.println("不是同花顺");
				}
				
				
			}else{
				System.out.print(cardarry[0].color+" "+cardarry[0].num+"  ");
				System.out.print(cardarry[1].color+" "+cardarry[1].num+"  ");
				System.out.print(cardarry[2].color+" "+cardarry[2].num+"  ");
				System.out.println("不是同花顺");
			}
			
			
		}
		
		System.out.println("执行了"+count+"次");
		
		
	}

}
