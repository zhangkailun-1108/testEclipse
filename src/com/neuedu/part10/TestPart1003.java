package com.neuedu.part10;

import java.util.LinkedList;

public class TestPart1003 {

	public static void main(String[] args) {
		/*
		 * 
		 *  1����ʹ��LinkedList��ģ��һ������(�Ƚ��ȳ�������):

			1.1��ӵ�з������ķ���void��put(Object��o)��
			
			1.2��ȡ������ķ���Object��get()��
			
			1.3���ж϶��е����Ƿ�Ϊ�յķ���boolean��isEmpty()�����ң���д���Դ��룬��֤��Ķ����Ƿ���ȷ��
		 */

		MyQueue<String> myQueue = new MyQueue<>();
		
		myQueue.put("1");
		myQueue.put("2");
		myQueue.put("3");
		myQueue.put("4");

//		for(int i=0;i<myQueue.size();i++){
//			System.out.println(myQueue.get());
//		}
//		
//		System.out.println(myQueue.isEmpty());
		
		while(!myQueue.isEmpty()){
			System.out.println(myQueue.get());
		}
		
		System.out.println("yyyy��MM��dd��  HH:mm:ss".substring(0,11));
	}

}

class MyQueue<T> {
	
	LinkedList<T> list;
	
	private int size;
	
	public MyQueue(){
		list = new LinkedList<>();
	}
	
	public void put(T t){
		size++;
		list.addLast(t);
	}
	
	public T get(){
		T first = list.getFirst();
		list.removeFirst();
		return first;
	}
	
	public boolean isEmpty(){
		
		return list.isEmpty();
	}
	
	public int size(){
		return size;
	}
	
}