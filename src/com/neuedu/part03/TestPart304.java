package com.neuedu.part03;

import java.util.Scanner;

public class TestPart304 {

	public static void main(String[] args) {
		
		//������������������ǵ����Լ��
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("�����һ����");
		int first = scanner.nextInt();
		System.out.println("����ڶ�����");
		int second = scanner.nextInt();
		System.out.println("�����������");
		int third = scanner.nextInt();
		
		int result =0;
		int min = first>second?second>third?third:second:first;
		for(int i=1;i<=min;i++){
			if(first%i==0  && second%i==0  && third%i==0){
				result=i;
			}
		}
		System.out.println(result);*/
		
		//���1000��������ˮ�ɻ�����ָһ���������λ�������ĸ�λ���ֵ�����������������ȡ�

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
		 * ���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ����
		 * �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
		 * ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�
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
