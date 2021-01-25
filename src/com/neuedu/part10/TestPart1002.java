package com.neuedu.part10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ����
 * ��ʹ�ü��϶���ʱ���������͵ĳ����������÷��Ͷ���
 * ʹ�ü���ʱ�����������������ʲô���Ͷ����Էţ�ȡ����ʹ�ò���������Ҫʹ�÷���
 * ���ƴ�ŵ����ͣ�����Ҫǿ��ת��
 * ע�⣺���弯��ʱ���������ķ��ͣ���1.7�汾 ����ʡ�ԣ�<>��ʯ������������Ȼ��Ҫ��ǰ�������ķ��ͱ���һ��
 * 
 * �Զ��巺����
 * ����ʵ�ֶ�����͵Ķ���
 * ע�⣺��һ���� �̳д��з��͵���ʱ����������ϱ����˷��ͱ�ʶ����ô�������ʵ�ַ��͹��ܣ�������꣬�������ʵ�ֿ��Բ�ʵ��
 * 
 * Map�ӿ�
 * map���Լ�/ֵ�Դ�ųɶ����ݵ������飬K����key����V����valueֵ
 * put(key,value)���� ��ֵ
 * size()ȡ��С
 * get��key������key��ȡvalue
 * HashMap����
 * �����ķ�ʽ��keySet()   entrySet()
 * 
 * ���м��϶��е�foreach����
 * list.foreach(item -> {});
 * set.foreach(item -> {});
 * map.foreach((k,v) -> {});
 */
public class TestPart1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(10);
		Generic<Integer> g = new Generic<>();
		g.setT(10);
		System.out.println(g.getT());
		Result<Integer,Integer,Integer> result = new Result<Integer, Integer, Integer>(10, 20, 30);
		result.showAll();
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(1, 11);
		hashMap.put(2, 22);
		hashMap.put(3, 33);
		hashMap.put(4, 44);
		hashMap.put(4, 45);
		System.out.println(hashMap.size());
		Integer integer = hashMap.get(4);
		System.out.println(integer);
		//����
		//1.����key��value
		Set<Integer> keySet = hashMap.keySet();//�����е�key�ļ���
		
		Iterator<Integer> iterator = keySet.iterator();
		
		while(iterator.hasNext()){
			Integer key = iterator.next();//�õ�ÿһ��key
			
			Integer value = hashMap.get(key);//�õ�ÿһ��value
			
			System.out.println("key:"+key+",value:"+value);
		}
		
		//2.ͨ��entry���ϱ���
		
		Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
		
		Iterator<Entry<Integer, Integer>> iterator2 = entrySet.iterator();
		
		while(iterator2.hasNext()){
			Entry<Integer, Integer> entry = iterator2.next();//ÿһ��key-value
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}
		//��չ����β�����keyȥ��value��
		
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}
		
		//lamdba���ʽ
		a.forEach(item ->{//list
			System.out.println(item);
		});
		hashMap.keySet().forEach(item ->{//set
			System.out.println(item+","+hashMap.get(item));
		});
		hashMap.forEach((k,v)->{//map
			System.out.println(k+","+v);
		});
		
		//��дһ�����򣬴���һ����HashMap�������ڴ洢���д�������Ϣ(���д�������Ҫ��Ϣ�д�����ID�����������)ֱ�Ӷ���3��
		//������д����ĵ�ǰ��
		//testBank();
		//��֤�̰߳�ȫ��ͬ����
		Hashtable<Object, Object> hashtable = new Hashtable<>();
		//��֤�̰߳�ȫ��ͬ����
		new ConcurrentHashMap<>();//1.7���÷ֶ��������̰߳�ȫ����1.8��ʼʹ��CAS��
	}

	private static void testBank() {
		HashMap<Integer, BankerInfo> map = new HashMap<>();
		map.put(1, new BankerInfo(1, "Tom", 100.00));
		map.put(2, new BankerInfo(2, "Mark", 200.00));
		map.put(3, new BankerInfo(3, "Smith", 300.00));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭʹ�ø�ϵͳ��ѯ��Ϣ��1 ��ѯ��������Ϣ   2 ��ѯ����   3 �˳�");
		
		while(true){
			String type = sc.next();
			if("1".equals(type)){
				Iterator<Entry<Integer, BankerInfo>> iterator3 = map.entrySet().iterator();
				while (iterator3.hasNext()) {
					Entry<Integer, BankerInfo> next = iterator3.next();
					System.out.println("�û���ţ�"+next.getKey()+" ������"+next.getValue().getName()+" ����ǣ�"+next.getValue().getBalance());
				}
			}else if("2".equals(type)){
				System.out.println("������Ҫ��ѯ�˵ı��");
				String no = sc.next();
				BankerInfo bankerInfo = map.get(Integer.parseInt(no));
				if(bankerInfo != null){
					System.out.println("�û���ţ�"+bankerInfo.getNo()+" ������"+bankerInfo.getName()+" ����ǣ�"+bankerInfo.getBalance());
				}else{
					System.out.println("�Բ��𣬲��޴���");
				}
			}else if("3".equals(type)){
				System.out.println("�����˳���ѯϵͳ");
				break;
			}else{
				System.out.println("û�д�ѡ�����������");
			}
		}
		
		
	}

}

class BankerInfo{
	
	private int no;
	
	private String name;
	
	private double balance;
	
	public BankerInfo(int no,String name,double balance){
		this.balance = balance;
		this.name = name;
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}






class Generic<T> {
	
	private T t;

	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}

class Result<E,T,U> extends Generic<T>{

	private E e;
	
	private U u;
	
	
	
	public E getE() {
		return e;
	}



	public void setE(E e) {
		this.e = e;
	}



	public U getU() {
		return u;
	}



	public void setU(U u) {
		this.u = u;
	}



	public Result(T t,U u,E e) {
		setT(t);
		this.e = e;
		this.u = u;
	}

	public void showAll(){
		System.out.println(u+" "+e+" "+getT());
	}
	
}
