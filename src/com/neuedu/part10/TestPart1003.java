package com.neuedu.part10;

import java.util.LinkedList;

public class TestPart1003 {

	public static void main(String[] args) {
		/*
		 * 
		 *  1、请使用LinkedList来模拟一个队列(先进先出的特性):

			1.1　拥有放入对象的方法void　put(Object　o)　
			
			1.2　取出对象的方法Object　get()　
			
			1.3　判断队列当中是否为空的方法boolean　isEmpty()；并且，编写测试代码，验证你的队列是否正确。
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
		
		System.out.println("yyyy年MM月dd日  HH:mm:ss".substring(0,11));
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