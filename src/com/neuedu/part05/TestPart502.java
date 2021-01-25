package com.neuedu.part05;

public class TestPart502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = factorial(5);
		System.out.println(factorial);
		
		//用递归方法算阶乘
		
		//计算斐波那契数列的 第16位
		//1，1，2，3，5，8，13，21。。。。。。。。。
		System.out.println(feibonaqi(16));
		
	}
	
	//斐波那契数列
	public static int feibonaqi(int n){//第几个数
		if(n == 1 || n == 2){
			return 1;//本身值
		}else{
			return feibonaqi(n-1)+feibonaqi(n-2);
		}
	}
	
	//算阶乘
	public static int factorial(int n){
		if(n==2){
			return 1*2;
		}else{
			return n * factorial(n-1);
		}
	}
	

}
