package com.neuedu.part09;

import java.util.Calendar;

public class TestPart903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//输出当前月的月历
		Calendar instance = Calendar.getInstance();
		instance.set(Calendar.DATE, 1);
		int maximum = instance.getMaximum(Calendar.DATE);
		System.out.println("一     二     三     四     五      六      日");
		int start = instance.get(Calendar.DAY_OF_WEEK)-1;
		System.out.print("            ");
		for(int i=1;i<=maximum;i++){
			if(i<10){
				System.out.print(" "+i+" ");
			}else{
				System.out.print(i+" ");
			}
			if((start+i-1)%7==0){//每一行7个逢七换行
				System.out.println();
			}
		}
		
	}

}
