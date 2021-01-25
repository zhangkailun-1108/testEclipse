package com.neuedu.part03;

import java.util.Scanner;

/**
 * 循环 
 * 1.while(表达式){代码块} 如果表达式结果为真 就执行代码块,不满足表达式条件时 循环停止 
 * 2.do...while
 * do{代码块}while(表达式) 先执行一次代码块，然后计算表达式，如果表达式结果为真 就再次执行代码块,不满足表达式条件时 循环停止
 * 3.for(表达式1;表达式2;表达式3){代码块} 表达式1，初始化变量，只执行一次，表达式2，循环判断条件结果为布尔型 表达式3，变量变化
 * 表达式可以不写，分号必须写
 * 循环是可以嵌套的
 * 4.循环的中断
 * break关键字可以中断,中断当前循环
 * continue关键字 continue语句只跳出本次循环
 *
 * debug 先加断点， F6执行代码 F8结束当前断点
 * 选中需要格式化的代码，ctrl+shift+F
 */
public class TestPart303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		// 死循环 永远不会停止的循环
		while (a > b) {
			System.out.println("执行了循环");
		}
		// do...while 循环 会默认先执行一次 再去校验这个条件
		// 使用场景很少
		do {
			System.out.println("执行了循环");
		} while (a > b);

		// 输出1到100的和
		int i = 1;
		int sum = 0;
		while (i <= 100) {// 什么时候停止循环
			sum += i;// sum = sum+i
			i++;
		}
		System.out.println(sum);

		sum = 0;
		i = 1;
		do {
			sum += i;// sum = sum+i
			i++;
		} while (i <= 100);
		System.out.println(sum);

		// 输出1-1000的奇数和
		int j = 1;
		int sums = 0;

		while (j <= 1000) {
			// 判断 奇数
			if (j % 2 != 0) {
				sums += j;
			}
			j++;
		}
		System.out.println("1-1000的奇数和=" + sums);
		sums = 0;
		for (int k = 1; k < 1000; k++) {// 表达式可以省略
			if (k % 2 != 0) {
				sums += k;
			}
		}
		System.out.println("1-1000的奇数和=" + sums);
		
		//输出 5行7列 的 *号
		for(int o=1;o<=5;o++){
			System.out.println("*******");
		}
		//循环的中断
		//判断一个数 是否为质数（素数）
		int num = 102;
		for(int g=2;g<num;g++){
			if(num%g == 0){
				System.out.println("不是质数");
				break;
			}
		}
		System.out.println("是质数");
		
		//一百万 3年 每年的4%的利率（复利）  三年之后本息一共多少？
		double money = 100;
		for(int g=1;g<=3;g++){
			money *= (1+0.04);
		}
		System.out.println(money);
		//输出 5行7列 的 *号
		for(int h=1;h<=5;h++){
			for(int f=1;f<=7;f++){
				System.out.print("*");
			}
			System.out.print('\n');
		}
		double sumd=0;
		//输出 1+ 1/2 + 1/3 + 1/4  ... + 1/100 的和
		//5.187377517639621
		for(double g=1;g<=100;g++){
			sumd += (1/g);
		}
		System.out.println(sumd);
		
		//输出九九乘法表
		for(int h=1;h<=9;h++){
			for(int l=1;l<=h;l++){
				System.out.print(h+"*"+l+"="+(h*l)+'\t');
			}
			System.out.println();
		}
		//1+2+3+4+....判断累加多少次能超过666
		//循环的终止（中断）
		//break;
		sum=0;
		int count = 0;//次数
		i = 1;//数值
		while(true){
			count++;
			sum +=i;
			if(sum>666){
				break;
			}
			i++;
		}
		System.out.println(count);
		
		//编写一个程序，找出大于200的最小的质数。
		//标记法
		i = 200;
		boolean flag;
		while(true){
			flag = true;//标记初始化
			i++;
			for(int g=2;g<i;g++){
				if(i%g == 0){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println(i+"是质数");
				break;
			}
			
		}
		//continue 跳出本次循环
		for (int g = 1; g < 20; g++) {
	            if ((g % 2) == 0) {
	                continue;
	            }
	         System.out.print(g + " ");
	    }
		//指定循环位置跳出    在目标位置创建名称（lable）标识符加冒号,在跳出关键字后面加标识符名称
		inner:for (int g = 1; g < 20; g++) {
            if ((g % 2) == 0) {
                continue inner;
            }
          System.out.print(g + " ");
        }
		// break lable 是指定循环终止
	    // continue lable 是指定循环开始
	    outer: for (int g = 0; g < 10; g++) {
            System.out.println("外层循环");
            inner: while (true) {
                Scanner sc = new Scanner(System.in);
                String s = sc.next();
                System.out.println("内层循环:" + s);
                if (s.equals("hello"))
                    break inner;
                if (s.equals("kitty"))
                    continue outer;
            }
        }
		
		//扩展：常用设计模式中的  策略模式解决else if 过多问题
	}

}
