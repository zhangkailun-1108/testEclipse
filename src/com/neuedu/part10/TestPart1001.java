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
 * 集合
 * 集合是变长的，只能放引用数据类型的 数据集(可以放不同类型)
 * List集合
 * ArrayList:线性结构，底层是个数组，默认长度是10
 * 注意：集合不能指定超过当前size-1的位置进行赋值
 * 获取长度 调用size()方法
 * 添加数据add()
 * 获取数据get(index)
 * addAll 将另一个集合的所有元素添加进来
 * clear 清空集合数据
 * remove 指定位置删除
 * isEmpty 判断集合是否有元素
 * 
 * 迭代器
 * 继承了collection 接口的集合类都存在的方法
 * 通过对应集合引用调用iterator()方法 返回一个迭代器对象，
 * 迭代器对象的方法
 * hasNext() 判断有没有下一个元素
 * next() 返回下一个元素，并移动元素判断位置
 * 
 * LinkedList 内部数据存储结构和ArrayList
 * 是一个链表可以针对首尾数据进行处理
 * addFirst（）在首部插入数据
 * addLast（）在尾部插入数据
 * 
 * ArrayList和LinkedList的区别？
 * 结构不同
 * 频繁操作集合数据时，有查询操作较多时，建议使用ArryList
 * 对数据插入或者删除操作较多时，建议使用LinkedList
 * 
 * List集合特点  有序 可以重复
 * 
 * Set集合 特点 无序 不可重复
 * HashSet 可以去除重复
 * 所谓的无序是和插入数据顺序无关
 * 
 * TreeSet(有排序的特性)
 * 内部是排序树
 * 
 */
public class TestPart1001 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();//底层就是个数组
		//赋值
		arrayList.add(new Integer(1));
		arrayList.add(5);
		arrayList.add(2);//集合支持自动装箱和拆箱
		arrayList.add(4);
		arrayList.add(3);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		ArrayList arrayList2 = new ArrayList();
		
		arrayList2.add(10);
		
		arrayList2.addAll(arrayList);
		
		arrayList2.clear();//清空数据
		
		//arrayList2.remove(0);
		System.out.println(arrayList2.isEmpty());
		
		//集合长度
		int size = arrayList.size();
		System.out.println(arrayList.toString());
		System.out.println(arrayList2);
		
		//集合的遍历
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		
		Iterator iterator = arrayList.iterator();//获取一个当前集合的迭代器对象
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//输入学生信息 name，score，age  输入exit退出，存放在集合中，获取平均分
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
		
		//遍历
		Iterator iterator2 = hashSet.iterator();
		
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		
		Object[] array = hashSet.toArray();
		for(int i=0;i<hashSet.size();i++){
			System.out.println(array[i]);
		}
		
		//做一个抽奖，35个数 随机抽取7个放入集合中（不能重复）
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
		System.out.println("最小元素"+arrayList3.get(0));
		System.out.println("最大元素"+arrayList3.get(arrayList3.size()-1));
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
			System.out.println("请输入学生姓名");
			String name = scanner.nextLine();
			student.setName(name);
			System.out.println("请输入学生分数");
			int score = scanner.nextInt();
			student.setScore(score);
			System.out.println("请输入学生年龄");
			int age = scanner.nextInt();
			student.setAge(age);
			stu.add(student);
			System.out.println("是否继续录入学生信息，如结束请输入exit");
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

