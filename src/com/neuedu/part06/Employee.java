package com.neuedu.part06;

/**
 * 
 * 打工人类
 *
 */
public class Employee {
		
	//先写属性
	//属性默认值
	static String name;
	int age;
	double sal;
	
	public Employee(){
		this("张三", 20);
		System.out.println("这是Employee的无参构造方法");
		System.out.println(this);
	}
	
	public Employee(String name,int age,double sal){
		//必须要放在第一行
		System.out.println("这是Employee的有3参构造方法");
		System.out.println(this);
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	public Employee(String _name,int _age){
		System.out.println("这是Employee的有2参构造方法");
		System.out.println(this);
		name = _name;
		age = _age;
		sal = 500;
	}
	
	//写行为（方法）
	//获取名字
	public String showName(){
		System.out.println("员工姓名为："+name);
		return this.name;
	}
	
	/**
	 * 获取年纪
	 * @param 为空
	 * @return age 年纪
	 * @author 张楷仑
	 */
	public int showAge(){
		System.out.println("员工年纪为："+this.age);
		return this.age;
	}
	
	/**
	 * 修改名字
	 * @param _name 预期修改的名字
	 */
	public void updateName(String _name){
		name = _name;
	}
	
	/**
	 * 领取工资
	 * @return sal
	 */
	public double getSal(){
		System.out.println("The sal of this month is "+sal);
		return sal;
	}
	
}
