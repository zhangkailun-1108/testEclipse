package com.neuedu.part05;


/**
 * �����Ķ���͵���
 * �����Ƕ���õģ����ж������ܣ����ظ����õģ�Ϊ�˼򻯴�����ڣ�����������������У�����һ��������������Ķ�����Ϊ
 * ���������
 * ����ͷ  ������
 * [����Ȩ�޿��Ʒ�] [���η�] ����ֵ����  ������(�������� ���������������� ��������...)
 * { ������   }
 * ����Ȩ�޿��Ʒ� ����д public ��Χ���
 * ���η�    ����дstatic
 * ����ֵ���� ���û�з���ֵ дvoid  
 * ���� �����ǻ����������ͣ�Ҳ������������������
 * ���������ô��ݲ���Ϊ������������ʱ���Ǵ�ֵ��������
 * ���������ô��ݲ���Ϊ������������ʱ�����������ã�String����,�ַ��������ǲ��ɱ�ģ�
 * ����������
 * ����ͷ�ж������������  ��ʽ����   ����β�
 * ����ʱ ʵ�ʴ���ֵ�����ֲ��� ����ʵ�ʲ���   ��� ʵ��
 * 
 * 
 * ������������
 * ��ͬһ������ ����ͬʱ���ڶ����ͬ��������� ��������������
 * �������صĹ���
 * ��������ͬ
 * �����Ĳ�����ͬ�������ĸ�����ͬ�����߲��������Ͳ�ͬ
 * �����ķ���ֵ����ν��������ͬ��Ҳ���Բ���ͬ��
 * 
 * 
 * �ݹ�
 * �����Լ����Լ�
 * 
 */
public class TestPart501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ӡһ�� 5��6�е��Ǻ�
		outPrint(5,6);//ʵ��
		//��ӡһ��7��8�е��Ǻ�
		outPrint(7,8);
		
		//����2������ ���ֵ
		//���� ����ݲ����Ĳ�ͬ��̬ѡ���Ӧ�ķ�����������
		System.out.print(compare(1.0, 2));
		
		int i = 2;
		
		int j = 3;
		
		String str ="asdasdasdsad";//��һ�������������������
		str.intern();
		str = "ssssss";
		str ="asdasdasdsad";
		System.out.println(str);
		
		//����һ�η�����������Ӧ��ֵ��2
		int add2 = add2(j);
		System.out.println(add2);
		System.out.println(j);
		System.out.println(add2==j);
		
		//����һ�������������鸳ֵ
		int[] arr = new int[5];
		
		input(arr);
		
		for(int item:arr){
			System.out.println(item);
		}
		
		//����ͼ�����
		//Բ
		System.out.println(getArea(1,20));
		//�����ε����
		//�����ε����
		
		
	}
	
	
	public static double getArea(double radius){
		//����Բ�����
		
		return radius*radius*3.14;
		
	}
	
	public static double getArea(int height,int width){
		//���㳤���ε����
		
		return height*width;
		
	}
	
	public static int getArea(int sideLength){
		//���������ε����
		
		return sideLength*sideLength;
		
	}
	
	public static void input(int[] arr){
		System.out.println(arr);
		int count =1;
		for(int i=0;i<arr.length;i++){
			arr[i]=count++;
		}
	}
	
	
	
	public static int add2(int j){
		j = j+2;
		return j;
	}
	
	
	//û�з���ֵ��д��   void
	//�ھ�̬������ ���õķ��� ����Ҳ�Ǿ�̬��
	//��չ��synchronized �����߳�ͬ��������
	public static void outPrint(int row,int col){//�β�
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//��2���������ֵ
	public static int compare(int num1,int num2){
		return num1>num2?num1:num2;
	}

	public static double compare(double num1,double num2){
		return num1>num2?num1:num2;
	}
	
}
