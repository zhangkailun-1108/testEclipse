package com.neuedu.part03;



import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

/**
 * 流程控制语句
 * 1.条件语句：在程序运行过程中，根据条件是否成立 选择执行代码的过程。
 * if语句 if (表达式) {执行语句块;} 其中表达式结果只能为true/false，如果表达式为真时进入语句块执行
 * if语句的二选一模式  if(){}else{}    if语句可以不写大括号，前提是只有一行代码需要执行
 * if语句多选一模式 if(){}else if(){}else if(){}else{}
 * 
 *
 */
public class TestPart301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true){
			System.out.println(1);
		}
		boolean b = true;
		if(b){
			System.out.println(2);
		}else{
			System.out.println(3);
		}
		
		//从控制台输入一个数，判断这个数为奇数还是偶数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int nextInt = scanner.nextInt();
		
		if(nextInt%2==0){
			System.out.println(nextInt+"是偶数");
		}else{
			System.out.println(nextInt+"是奇数");
		}
		int type = 1;	
		//men1 women2 child3 
		if(type == 1){
			System.out.println("这是男鞋界面");
		}else if(type == 2){
			System.out.println("这是女鞋界面");
		}else if(type == 3){
			System.out.println("这是儿童鞋界面");
		}else{
			System.out.println("输入错误");
		}
		
		//控制台输入一个成绩，输出该成绩的等级，90-100 是优，80-89 是良  70-79 是中等   60-69是及格  60以下是不及格
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个成绩");
		int score = sc.nextInt();
		//判断输入的数是否合法
		if(score<0 || score>100){
			System.out.println("输入错误，请重新输入（剩余次数0）");
			score = sc.nextInt();
			if(score<0 || score>100){
				System.out.println("频繁错误，输入结束");
				//return 结束当前方法运行
				return;
			}
		}
		if(score>=90){
			System.out.println("优");
		}else if(score>=80 && score<=89){
			System.out.println("良");
		}else if(score>=70 && score<=79){
			System.out.println("中等");
		}else if(score>=60 && score<=69){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		
		
	}

}
