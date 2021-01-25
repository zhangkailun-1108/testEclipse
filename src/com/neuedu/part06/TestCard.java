package com.neuedu.part06;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntToDoubleFunction;

public class TestCard {

	public static void main(String[] args) {
		//��ҵ������һ���˿����ࣨ��ɫ��ֵ���������С��
		//1.��������52���� 
		//2.ϴ������
		//3.�ж�ϴ�ƺ��ǰ�����Ƿ���ͬ��˳
		//4.���һ�γ���ͬ��˳ʱ��һ��ϴ�˶��ٴ���
		
		//4���� ��Ƭ  ÷��  ���� ����
		//A---K   13
		Card[] cardarry = new Card[52];
		
		String[] colora = {"��Ƭ","÷��"," ����","����"}; 
		
		String[] numa = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//��������
		for(int i=0;i<colora.length;i++){
			for(int j=0;j<numa.length;j++){
				String nums = numa[j];
				int count = 0;
				if("A".equals(nums)){//�ַ����Ƚ���equals
					count = 1;
				}else if ("J".equals(nums)){
					count = 11;
				}else if ("Q".equals(nums)){
					count = 12;
				}else if ("K".equals(nums)){
					count = 13;
				}else{
					count = Integer.parseInt(nums);//�ַ���ת����int
				}
				cardarry[(i*13)+j] = new Card(colora[i], nums,count);
			}
		}
		for(Card item:cardarry){
			System.out.print(item.color+" "+item.num+"  ");
		}
		//ϴ��
		Random r = new Random();
		
		int count = 0;//���д���
		while(true){
			count++;
			
			for(int i=0;i<100;i++){//����ϴ��100��
				//�����м���󣬺����һ�Ž���
				int nextInt = r.nextInt(52);
				Card tempCard = cardarry[nextInt];
				cardarry[nextInt] = cardarry[cardarry.length-1];
				cardarry[cardarry.length-1] = tempCard;
			}
			System.out.println();
			for(Card item:cardarry){
				System.out.print(item.color+" "+item.num+"  ");
			}
			System.out.println();
			//�ж�ǰ���� �ǲ���ͬ��˳  
			//2�ְ취 �ж� Ԥ��ֵ�Ƿ����δ�һ
			if(cardarry[0].color.equals(cardarry[1].color) && cardarry[0].color.equals(cardarry[2].color)){
				//ͬ��
				//1.�ȴ�С
				//2.�����˼·
				int[] iarry = {cardarry[0].count,cardarry[1].count,cardarry[2].count};
				Arrays.sort(iarry);//Ĭ�ϴ�С����
				if(iarry[2]-iarry[1]==1  && iarry[1]-iarry[0]==1){//��ͬ��˳
					System.out.print(cardarry[0].color+" "+cardarry[0].num+"  ");
					System.out.print(cardarry[1].color+" "+cardarry[1].num+"  ");
					System.out.print(cardarry[2].color+" "+cardarry[2].num+"  ");
					System.out.println("��ͬ��˳");
					break;
				}else if(iarry[2]==13 && iarry[1]==12 && iarry[0]==1){//��ͬ��˳
					System.out.print(cardarry[0].color+" "+cardarry[0].num+"  ");
					System.out.print(cardarry[1].color+" "+cardarry[1].num+"  ");
					System.out.print(cardarry[2].color+" "+cardarry[2].num+"  ");
					System.out.println("��ͬ��˳");
					break;
				}else{
					System.out.print(cardarry[0].color+" "+cardarry[0].num+"  ");
					System.out.print(cardarry[1].color+" "+cardarry[1].num+"  ");
					System.out.print(cardarry[2].color+" "+cardarry[2].num+"  ");
					System.out.println("����ͬ��˳");
				}
				
				
			}else{
				System.out.print(cardarry[0].color+" "+cardarry[0].num+"  ");
				System.out.print(cardarry[1].color+" "+cardarry[1].num+"  ");
				System.out.print(cardarry[2].color+" "+cardarry[2].num+"  ");
				System.out.println("����ͬ��˳");
			}
			
			
		}
		
		System.out.println("ִ����"+count+"��");
		
		
	}

}
