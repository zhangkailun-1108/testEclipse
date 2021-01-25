package com.neuedu.part03;

import java.util.Scanner;

/**
 * switch 流程判断
 * 语句结构    switch(表达式){表达式结果为预期值
 * 					case 值: 
 * 						代码块;
 * 						[break;]可写可不写  作用是执行到这停止
 * 				    case 值: 
 * 						代码块;
 * 						[break;]可写可不写  作用是执行到这停止
 *                  case 值: 
 * 						代码块;
 * 						[break;]可写可不写  作用是执行到这停止
 *                   ...
 *                  default:
 *                      代码块; 
 *  				}
 *注意事项 : 1.表达式的值必须为 byte，short，char，int和String
 *        2.case 后面的值必须为常量，定值,且不能重复
 *        3.功能代码块部分可以为多行
 *        4.default 相当于 if else 中的 else
 *常量:不可变的量，固定值    在定义变量时前面加上final
 */
public class TestPart302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int i = 2;
		switch(1){
		  case 1:
			  System.out.println(1);
		  case 2:
			  //走完2的逻辑后停下来
			  System.out.println(2);
			  break;
		  default:
			  System.out.println("这是默认值");
			  break;
		}
		
		//控制台输入一个成绩，输出该成绩的等级，90-100 是优，80-89 是良  70-79 是中等   60-69是及格  60以下是不及格
		//用switch写
		int score = 91;
		switch(score/10){
		  case 10:
		  case 9:
			  System.out.println("优");
			  break;
		  case 8:
			  System.out.println(2);
			  break;
		  case 7:
			  System.out.println(2);
			  break;
		  case 6:
			  System.out.println(2);
			  break;
		  case 5:
		  case 4:
		  case 3:
		  case 2:
		  case 1:
		  case 0:
			  System.out.println("不及格");
			  break;
		}
		
		// 给定一个年份，判断是否是闰年（4 400）
		//1.能被4整除,但不能被100整除;
		//2.能被400整除;
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year%4==0 && year%100 != 0){
			System.out.println("是29天");
		}else if(year%400==0){
			System.out.println("是29天");
		}else{
			System.out.println("是28天");
		}
		
		//输入一个月份，输出于此月份天数相同的月份（用switch写）
		//1，3，5，7，8，10，12    这是31天
		//4，6，9，11 这是 30天
		//2 这是29天
		System.out.println("请输入月份");
		int month = scanner.nextInt();
		switch(month){
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	System.out.println("1，3，5，7，8，10，12 是31天");
		    	break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	System.out.println("4，6，9，11 这是 30天");
		    	break;
		    case 2:
		    	if(year%4==0 && year%100 != 0){
					System.out.println("是29天");
				}else if(year%400==0){
					System.out.println("是29天");
				}else{
					System.out.println("是28天");
				}
		    	break;
		}

	}

}
