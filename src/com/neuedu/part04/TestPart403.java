package com.neuedu.part04;

import java.util.Scanner;

public class TestPart403 {

	public static void main(String[] args) {
		//�û�����༶������,Ȼ����������ÿ��ͬѧ�ĳɼ����������֮��,���������û�дﵽ60%��
		//��Ϊÿ1��û�м���ĳɼ���2��,ֱ�������ʴﵽ60%Ϊֹ�������������ʡ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������༶����");
		int length=sc.nextInt();
		//����һ���༶
		int[] classes = new int[length];
		int count = 0;//��������
		//¼��ɼ�
		for(int i=0;i<classes.length;i++){
			System.out.println("��¼���"+(i+1)+"��ͬѧ�ĳɼ�");
			classes[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<classes.length;i++){
			//ͳ�Ƽ��������
			if(classes[i]>=60){
				count++;
			}
		}
		//���㼰����
		while(true){
			double rate = ((double)count/length);
			if(rate<0.6){
				for(int i=0;i<classes.length;i++){
					//ͳ�Ƽ��������
					if(classes[i]<60){
						//��2֮��ı��Ӧ��ֵ
						classes[i] = classes[i]+2;
						if(classes[i]>=60){
							count++;
						}
					}
				}
			}else{
				System.out.println("��������"+(rate*100)+"%");
				break;
			}
		}
		
		
	}
}
