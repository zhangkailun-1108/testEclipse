package com.neuedu.part03;

import java.util.Scanner;

public class TestPart304 {

	public static void main(String[] args) {
		
		//输入两个数，输出它们的最大公约数
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("输入第一个数");
		int first = scanner.nextInt();
		System.out.println("输入第二个数");
		int second = scanner.nextInt();
		System.out.println("输入第三个数");
		int third = scanner.nextInt();
		
		int result =0;
		int min = first>second?second>third?third:second:first;
		for(int i=1;i<=min;i++){
			if(first%i==0  && second%i==0  && third%i==0){
				result=i;
			}
		}
		System.out.println(result);*/
		
		//输出1000以内所有水仙花数，指一个特殊的三位数，它的各位数字的立方和与其自身相等。

		int a,b,c;
		for (int s = 100; s < 1000; s++) {
			a=s/100;
			b=(s%100)/10;
			c=(s%100)%10;
			if (a*a*a+b*b*b+c*c*c ==s) {
				System.out.println(s);
			}
		}
		
		for (int s = 100; s < 1000; s++) {
			a=s/100%10;
			b=s/10%10;
			c=s/1%10;
			if (a*a*a+b*b*b+c*c*c ==s) {
				System.out.println(s);
			}
		}
		
		/*
		 * 猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，
		 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
		 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
		 */
		int sum = 1;
		for(int i=9;i>=1;i--){
			  sum = 2*(sum+1);
		}
		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
	       int x = sc.nextInt();
	       if(x>999 && x<=9999){
	    	   int gewei = x%10;
	    	   int shiwei = x % 100 / 10;
	    	   int baiwei = x%1000/100;
	    	   int qianwei = x/1000;
	    	   int sum1 = qianwei + baiwei*10 +shiwei*100 +gewei*1000;
	    	   
	    	   
	    	   System.out.println(sum1);
	    	   
	    	   System.out.print(qianwei+""+baiwei+""+shiwei+""+gewei);
	       }
	       else{
	    	   System.out.println("error");
	       }
	
		
		
		
		
	}

}
