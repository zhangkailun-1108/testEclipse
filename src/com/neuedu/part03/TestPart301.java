package com.neuedu.part03;



import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

/**
 * ���̿������
 * 1.������䣺�ڳ������й����У����������Ƿ���� ѡ��ִ�д���Ĺ��̡�
 * if��� if (���ʽ) {ִ������;} ���б��ʽ���ֻ��Ϊtrue/false��������ʽΪ��ʱ��������ִ��
 * if���Ķ�ѡһģʽ  if(){}else{}    if�����Բ�д�����ţ�ǰ����ֻ��һ�д�����Ҫִ��
 * if����ѡһģʽ if(){}else if(){}else if(){}else{}
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
		
		//�ӿ���̨����һ�������ж������Ϊ��������ż��
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int nextInt = scanner.nextInt();
		
		if(nextInt%2==0){
			System.out.println(nextInt+"��ż��");
		}else{
			System.out.println(nextInt+"������");
		}
		int type = 1;	
		//men1 women2 child3 
		if(type == 1){
			System.out.println("������Ь����");
		}else if(type == 2){
			System.out.println("����ŮЬ����");
		}else if(type == 3){
			System.out.println("���Ƕ�ͯЬ����");
		}else{
			System.out.println("�������");
		}
		
		//����̨����һ���ɼ�������óɼ��ĵȼ���90-100 ���ţ�80-89 ����  70-79 ���е�   60-69�Ǽ���  60�����ǲ�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ɼ�");
		int score = sc.nextInt();
		//�ж���������Ƿ�Ϸ�
		if(score<0 || score>100){
			System.out.println("����������������루ʣ�����0��");
			score = sc.nextInt();
			if(score<0 || score>100){
				System.out.println("Ƶ�������������");
				//return ������ǰ��������
				return;
			}
		}
		if(score>=90){
			System.out.println("��");
		}else if(score>=80 && score<=89){
			System.out.println("��");
		}else if(score>=70 && score<=79){
			System.out.println("�е�");
		}else if(score>=60 && score<=69){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
		
		
	}

}
