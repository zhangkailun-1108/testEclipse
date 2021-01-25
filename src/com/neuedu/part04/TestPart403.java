package com.neuedu.part04;

import java.util.Scanner;

public class TestPart403 {

	public static void main(String[] args) {
		//用户输入班级的人数,然后依次输入每个同学的成绩。输入完毕之后,如果及格率没有达到60%，
		//就为每1个没有及格的成绩加2分,直到及格率达到60%为止。最后输出及格率。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入班级人数");
		int length=sc.nextInt();
		//定义一个班级
		int[] classes = new int[length];
		int count = 0;//及格人数
		//录入成绩
		for(int i=0;i<classes.length;i++){
			System.out.println("请录入第"+(i+1)+"个同学的成绩");
			classes[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<classes.length;i++){
			//统计及格的人数
			if(classes[i]>=60){
				count++;
			}
		}
		//计算及格率
		while(true){
			double rate = ((double)count/length);
			if(rate<0.6){
				for(int i=0;i<classes.length;i++){
					//统计及格的人数
					if(classes[i]<60){
						//加2之后改变对应的值
						classes[i] = classes[i]+2;
						if(classes[i]>=60){
							count++;
						}
					}
				}
			}else{
				System.out.println("及格率是"+(rate*100)+"%");
				break;
			}
		}
		
		
	}
}
