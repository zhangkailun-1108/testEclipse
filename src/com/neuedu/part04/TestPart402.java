package com.neuedu.part04;

import java.util.Random;

public class TestPart402 {

	public static void main(String[] args) {
		//ÿ��ִ��һ�� ���߳�����1s��
		//��������
		String[] str = new String[70];
		//��ʼ������
		System.out.println("BANG!!!!(�飡)");
		System.out.println("AND THE��RE OFF�����������ǳ����ˣ�������");
		//��ʼ������
		for(int i=0;i<str.length;i++){
			if(i==0){
				str[i]="(T/H)";//������ͬһ���
			}else{
				str[i]="-";
			}
		}
		//����켣
		for(String item : str){
			System.out.print(item);
		}
		//��ʼ��ѡ��λ��
		int wgIndex = 0;//�ڹ��ʼ��λ��
		int tzIndex = 0;//���ӳ�ʼ��λ��
		//�������
		Random r = new Random();
		int count = 0;//ִ�д���
		while(true){
			System.out.println();
			//ÿ����������
			for(int i=0;i<str.length;i++){
					str[i]="-";
			}
			//��һ����ʱ  1S
			try {
				Thread.sleep(1000);//���뵥λ
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//�ڹ�
			int wg = r.nextInt(10);
			
			if(wg>=0 && wg<=4){//������
				wgIndex=wgIndex+3;
			}else if(wg>=5 && wg<=6){//����
				wgIndex=wgIndex-6;
				if(wgIndex<0){
					wgIndex=0;//��ʼ��
				}
			}else if(wg>=7 && wg<=9){//������
				wgIndex=wgIndex+1;
			}
			
			//����
			int tz = r.nextInt(10);
			if(tz>=0 && tz<=1){//ԭ�ز���
				
			}else if(tz>=2 && tz<=3){//����
				tzIndex=tzIndex+9;
			}else if(tz==4){//�󻬵�
				tzIndex=tzIndex-12;
				if(tzIndex<0){
					tzIndex=0;
				}
			}else if (tz>=5 && tz<=7){//С��
				tzIndex=tzIndex+1;
			}else if (tz>=8 && tz<=9){//С����
				tzIndex=tzIndex-2;
				if(tzIndex<0){
					tzIndex=0;
				}
			}
			
			if(tzIndex>=69 && wgIndex>=69){//�����ڹ�
				System.out.println("It��s a tie");
				break;
			}else if(wgIndex>=69){//�ڹ�Ӯ
				System.out.println("TORTOISE WINS������YAY������");
				break;
			}else if(tzIndex>=69){//����Ӯ
				System.out.println("Hare wins.Yuch");
				break;
			} 
			
			//û�н���ʱ������ÿ�غ��˶������Ĺ켣
			for(int i=0;i<str.length;i++){
				if(wgIndex == tzIndex){
					str[tzIndex]="O";
				}else if(i==wgIndex){
					str[i]="T";
				}else if(i==tzIndex){
					str[i]="H";
				}
			}
			count++;
			System.out.print("��"+count+"��:");
			//����켣
			for(String item : str){
				System.out.print(item);
			}
			System.out.println();
		}
		
		
	}

}
