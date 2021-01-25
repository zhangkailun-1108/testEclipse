package com.neuedu.part09;

import java.util.UUID;

/**
 * 1.java ����API 
 * java.awt java����ͼ�ι���
 * java.io  java�������ļ�����
 * java.lang java������
 * java.net ����ͨ�ţ�����TCP/IPЭ��   ���ԣ�1.�˽�http/https����   2.TCP/IPЭ���ص�
 * java.sql ���ϵ�����ݿ⽻���Ĺ�����
 * java.util java���ù����࣬������������
 * 
 * 2.Object ������ĸ��� 
 * ���һ������ʱ��Ĭ�ϻ��������toString����
 * ���õ�3��  toString������equals������hashCode����
 * 
 * 3.��װ��
 * Ϊ���û����������ͣ�Ҳ�ܾ߱������������ԣ��ṩ�˰�װ��ĸ���
 * ��̳� Comparable �ӿڣ�ʵ�������compareTo���� ������Ϊ����ȽϹ��߷���ֵ��int
 * �������� �Ͱ�װ���ת��
 * ��Ӧ�Ĺ�ϵ�£�������������ת���ɰ�װ�࣬ͨ��new����
 *          ��װ��ת���ɻ����������ͣ�ͨ������.XXXValue();
 * ���л������Զ�װ��Ͳ���ĸ���
 * 
 * �ַ����Ͱ�װ���ת������ת�ַ��� ���ö�Ӧ��toString(), �ַ���ת��2�� 1.�����Ե��ð�װ��Ĺ�����ת�� 2.����ͨ����װ��.ValueOf(��Ҫת�����ַ���)
 * 
 * �ַ����ͻ����������͵�ת��:
 * �ַ���ת���� ͨ����Ӧ�İ�װ����ø��Ե�parseXXX(�����Ƕ�Ӧ�ַ���)����������ַ���������ת������ �ᱨNumberFormatException
 * 
 * 
 * 
 *
 */
public class TestPart901 {

	public static void main(String[] args) {
		// ����һ��ѧ�������
		Student student = new Student();
		student.setStuName("����");
		student.setStuAge(20);
		student.setScore(100);
		student.setStuNO(UUID.randomUUID().toString());
		System.out.println(student);
		Student student2 = new Student();
		student2.setStuName("������");
		student2.setStuAge(20);
		student2.setScore(100);
		student2.setStuNO(UUID.randomUUID().toString());
		
		String str = "111a";
		boolean equals = student.equals(str);
		System.out.println(equals);
		
		String string = new String("123123");
		System.out.println(student2);
		
		Integer integer = 10;
		
		String i = integer.toString();
		
		Long long1 = 100000000000L;
		long l = long1;
		
		Boolean boolean1 = true;
		
		boolean b = boolean1;
		
		Double double1 = 10.0;
		
		double d = double1;
		
        String strInt = boolean1.toString();
        System.out.println(strInt);
        
        Boolean valueOf = Boolean.valueOf(str);
        System.out.println(valueOf);
        try{
        	 int parseInt = Integer.parseInt(str);
        	 double parseDouble = Double.parseDouble(str);
        }catch (NumberFormatException e) {
			e.printStackTrace();
		}
        boolean parseBoolean = Boolean.parseBoolean(str);
        System.out.println(parseBoolean);
        
	}

}
