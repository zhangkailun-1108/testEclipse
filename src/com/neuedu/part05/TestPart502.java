package com.neuedu.part05;

public class TestPart502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = factorial(5);
		System.out.println(factorial);
		
		//�õݹ鷽����׳�
		
		//����쳲��������е� ��16λ
		//1��1��2��3��5��8��13��21������������������
		System.out.println(feibonaqi(16));
		
	}
	
	//쳲���������
	public static int feibonaqi(int n){//�ڼ�����
		if(n == 1 || n == 2){
			return 1;//����ֵ
		}else{
			return feibonaqi(n-1)+feibonaqi(n-2);
		}
	}
	
	//��׳�
	public static int factorial(int n){
		if(n==2){
			return 1*2;
		}else{
			return n * factorial(n-1);
		}
	}
	

}
