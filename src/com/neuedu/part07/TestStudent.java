package com.neuedu.part07;

import java.util.Random;

public class TestStudent {

	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		
		Random random = new Random();
		
		for(int i=0;i<students.length;i++){
			//根据随机数 动态获取各系学生对象
			students[i] = getStudentInfo(random.nextInt(3));
		}
		
		for(Student item:students){
			
			System.out.println("学号："+item.getStuNo()+"姓名："+item.getName()+"性别："+item.getSex()+"年龄："+item.getAge()+"综合成绩："+item.allScore());
		}

	}
	
	public static  Student getStudentInfo(int type){
		if(type ==0){
			return new English(100, 80, 90, 1001, "XXX", '男', 18);
		}else if(type == 1){
			return new Computer(100, 90, 100, 90, 1002, "XXX", '男', 18);
		}else {
			return new Chinese(100, 90, 100, 90, 1003, "XXX", '男', 18);
		}
	}
	
	

}
