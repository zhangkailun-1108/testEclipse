package com.neuedu.part10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

/**
 * ����
 * �����Ǳ䳤�ģ�ֻ�ܷ������������͵� ���ݼ�(���ԷŲ�ͬ����)
 * List����
 * ArrayList:���Խṹ���ײ��Ǹ����飬Ĭ�ϳ�����10
 * ע�⣺���ϲ���ָ��������ǰsize-1��λ�ý��и�ֵ
 * ��ȡ���� ����size()����
 * �������add()
 * ��ȡ����get(index)
 * addAll ����һ�����ϵ�����Ԫ����ӽ���
 * clear ��ռ�������
 * remove ָ��λ��ɾ��
 * isEmpty �жϼ����Ƿ���Ԫ��
 * 
 * ������
 * �̳���collection �ӿڵļ����඼���ڵķ���
 * ͨ����Ӧ�������õ���iterator()���� ����һ������������
 * ����������ķ���
 * hasNext() �ж���û����һ��Ԫ��
 * next() ������һ��Ԫ�أ����ƶ�Ԫ���ж�λ��
 * 
 * LinkedList �ڲ����ݴ洢�ṹ��ArrayList
 * ��һ��������������β���ݽ��д���
 * addFirst�������ײ���������
 * addLast������β����������
 * 
 * ArrayList��LinkedList������
 * �ṹ��ͬ
 * Ƶ��������������ʱ���в�ѯ�����϶�ʱ������ʹ��ArryList
 * �����ݲ������ɾ�������϶�ʱ������ʹ��LinkedList
 * 
 * List�����ص�  ���� �����ظ�
 * 
 * Set���� �ص� ���� �����ظ�
 * HashSet ����ȥ���ظ�
 * ��ν�������ǺͲ�������˳���޹�
 * 
 * TreeSet(�����������)
 * �ڲ���������
 * 
 */
public class TestPart1001 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();//�ײ���Ǹ�����
		//��ֵ
		arrayList.add(new Integer(1));
		arrayList.add(5);
		arrayList.add(2);//����֧���Զ�װ��Ͳ���
		arrayList.add(4);
		arrayList.add(3);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		ArrayList arrayList2 = new ArrayList();
		
		arrayList2.add(10);
		
		arrayList2.addAll(arrayList);
		
		arrayList2.clear();//�������
		
		//arrayList2.remove(0);
		System.out.println(arrayList2.isEmpty());
		
		//���ϳ���
		int size = arrayList.size();
		System.out.println(arrayList.toString());
		System.out.println(arrayList2);
		
		//���ϵı���
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		
		Iterator iterator = arrayList.iterator();//��ȡһ����ǰ���ϵĵ���������
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//����ѧ����Ϣ name��score��age  ����exit�˳�������ڼ����У���ȡƽ����
		//int score = avgScore();
		LinkedList linkedList = new LinkedList();
		
		linkedList.add(10);
		linkedList.get(0);
		
		linkedList.addFirst(10);
		linkedList.addLast(10);
		linkedList.removeFirst();
		linkedList.removeLast();
		
		Stack stack = new Stack();
		
	/*	stack.pop();
		
		stack.peek();*/
		
		HashSet hashSet = new HashSet();
		
		hashSet.add(10);
		hashSet.add("aa");
		hashSet.add("qqq");
		hashSet.add(-1);
		System.out.println(hashSet);
		
		//����
		Iterator iterator2 = hashSet.iterator();
		
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		
		Object[] array = hashSet.toArray();
		for(int i=0;i<hashSet.size();i++){
			System.out.println(array[i]);
		}
		
		//��һ���齱��35���� �����ȡ7�����뼯���У������ظ���
		TreeSet hashSet2 = new TreeSet<>();
		Random random = new Random();
		while(true){
			hashSet2.add(random.nextInt(35)+1);
			if(hashSet2.size()==7){
				break;
			}
		}
		System.out.println(hashSet2);
		
		//apple,grape,banana,pear
		ArrayList  arrayList3 = new ArrayList();
		arrayList3.add("apple");
		arrayList3.add("grape");
		arrayList3.add("banana");
		arrayList3.add("pear");
		
		Collections.sort(arrayList3);
		System.out.println("��СԪ��"+arrayList3.get(0));
		System.out.println("���Ԫ��"+arrayList3.get(arrayList3.size()-1));
		Iterator iterator3 = arrayList3.iterator();
		
		while(iterator3.hasNext()){
			System.out.println(iterator3.next());
		}
	}

	private static int avgScore() {
		ArrayList<Student>  stu = new ArrayList<>();
		while (true) {
			Student student = new  Student();
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ѧ������");
			String name = scanner.nextLine();
			student.setName(name);
			System.out.println("������ѧ������");
			int score = scanner.nextInt();
			student.setScore(score);
			System.out.println("������ѧ������");
			int age = scanner.nextInt();
			student.setAge(age);
			stu.add(student);
			System.out.println("�Ƿ����¼��ѧ����Ϣ�������������exit");
			Scanner sc = new Scanner(System.in);
			String info = sc.nextLine();
			if("exit".equals(info)){
				break;
			}
		}
		int sum=0;
		Iterator<Student> iterator2 = stu.iterator();
		while (iterator2.hasNext()) {
			Student next = iterator2.next();
			sum+=next.getScore();
		}
		return sum/stu.size();
	}
	

}

class Student{
	
	private String name;
	
	private int score;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

