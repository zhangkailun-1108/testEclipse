package com.neuedu.part06;

/**
 * 
 * ������
 *
 */
public class Employee {
		
	//��д����
	//����Ĭ��ֵ
	static String name;
	int age;
	double sal;
	
	public Employee(){
		this("����", 20);
		System.out.println("����Employee���޲ι��췽��");
		System.out.println(this);
	}
	
	public Employee(String name,int age,double sal){
		//����Ҫ���ڵ�һ��
		System.out.println("����Employee����3�ι��췽��");
		System.out.println(this);
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	public Employee(String _name,int _age){
		System.out.println("����Employee����2�ι��췽��");
		System.out.println(this);
		name = _name;
		age = _age;
		sal = 500;
	}
	
	//д��Ϊ��������
	//��ȡ����
	public String showName(){
		System.out.println("Ա������Ϊ��"+name);
		return this.name;
	}
	
	/**
	 * ��ȡ���
	 * @param Ϊ��
	 * @return age ���
	 * @author �ſ���
	 */
	public int showAge(){
		System.out.println("Ա�����Ϊ��"+this.age);
		return this.age;
	}
	
	/**
	 * �޸�����
	 * @param _name Ԥ���޸ĵ�����
	 */
	public void updateName(String _name){
		name = _name;
	}
	
	/**
	 * ��ȡ����
	 * @return sal
	 */
	public double getSal(){
		System.out.println("The sal of this month is "+sal);
		return sal;
	}
	
}
