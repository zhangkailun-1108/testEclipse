package com.neuedu.part09;

import java.util.Calendar;

public class TestPart903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����ǰ�µ�����
		Calendar instance = Calendar.getInstance();
		instance.set(Calendar.DATE, 1);
		int maximum = instance.getMaximum(Calendar.DATE);
		System.out.println("һ     ��     ��     ��     ��      ��      ��");
		int start = instance.get(Calendar.DAY_OF_WEEK)-1;
		System.out.print("            ");
		for(int i=1;i<=maximum;i++){
			if(i<10){
				System.out.print(" "+i+" ");
			}else{
				System.out.print(i+" ");
			}
			if((start+i-1)%7==0){//ÿһ��7�����߻���
				System.out.println();
			}
		}
		
	}

}
