package com.neuedu.part10;

import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class TestPart1004 {

	public static void main(String[] args) {
		/*
		 * ��ϵͳ������˾Ա���ṩ��һ����ϵͳ
		 * Ա������Ϣ��ϵͳ�Ļ������ݣ�Ա������Ϣ������ID ���� 
		 * �ṩ�Ĺ��ܵ㣺
		 * 1-------------ǩ��
		 * 2-------------ǩ��
		 * 3-------------��ѯ����Ϣ  ����¼��ʱ�� ���Բ�ѯ��7�� ��1��ǩ��ǩ��Ϊһ�죩
		 * 4-------------�˳�
		 * ǩ�����򿨵�Ա�������ǹ�˾����Ա��
		 * ǩ�ˣ��򿨵�Ա�������ǹ�˾����Ա����ֻ�е���ǩ����Ա���ſ���ǩ��
		 * ͬһ�첻���ظ�ǩ����ǩ��
		 * 
		 */
		 //0.��Ҫ��ʼ��һ����Ź�˾����Ա���ļ���
		 //1.Ӧ���и�ȷ��Ա����Ϣ��¼����
		 //2.�򿨼�¼������һ��������
		 //3.��֮���˳���¼����
		 HashMap<String,Employee> employees =  getAllEmplouee();//��ʼ����˾Ա��
		 outer:while(true){
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("����������Ա����ţ�");
			 String checkId = scanner.nextLine();
			 //Ա��У��
			 Employee employee = employees.get(checkId);
			 if(employee == null){
				 System.out.println("�޴�Ա�������ܵ���");
				 continue outer;
			 }else{
				 //���й��ܴ���
				 String msg = operationSystem(employee);
				 System.out.println(msg);
				 if(msg.contains("�Ѿ�ǩ��")){
					 continue outer;
				 }else if(msg.contains("�Ѿ�ǩ��")){
					 continue outer;
				 }else if(msg.equals("��Ա����δǩ��������ǩ��")){
					 String msg2 = operationSystem(employee);
					 System.out.println(msg2);
					 if(msg2.equals("��Ա����δǩ��������ǩ��")){
						 System.out.println("�쳣�����ǳ�");
						 continue outer;
					 }else{
						 if(msg2.contains("�Ѿ�ǩ��")){
							 continue outer;
						 }else if(msg2.contains("�Ѿ�ǩ��")){
							 continue outer;
						 }else if (msg2.equals("�˳���¼")){
							 continue outer;
						 }else if(msg2.contains("�˳�ϵͳ")){
							 break outer;
						 }
					 }
				 }else if (msg.equals("�˳���¼")){
					 continue outer;
				 }else if(msg.contains("�����˳�ϵͳ")){
					 break outer;
				 }
				 
			 }
		 }

	}

	private static String operationSystem(Employee employee) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("1-------------ǩ��");
		 System.out.println("2-------------ǩ��");
		 System.out.println("3-------------��ѯ����Ϣ");
		 System.out.println("4-------------�˳�");
		 String type = sc.nextLine();
		String msg = "";
		ArrayList<CheckInRecord> arrayList = employee.getArrayList();
		int size = arrayList.size();
		if("1".equals(type)){//ǩ��
			//ȡ����һ���ļ�¼���ж��Ƿ�ǩ��
			if(size == 0){//û�м�¼
					arrayList.add(new CheckInRecord("ǩ��",getNowTime(),null));
					msg = "��Ա���Ѿ�ǩ��";
					return msg;
			}else{ //�м�¼
				   //�����7����¼��
				   if(size==7){
					   //System.arraycopy(src, 1, dest, 0, 6);
					   //ȥ����һ������
					   arrayList.remove(0);
				   }
				   
				   CheckInRecord checkInRecord = arrayList.get(arrayList.size()-1);//��ȡ����һ����¼����
				   String checkFlag = checkInRecord.getCheckFlag();
				   
				   if("ǩ��".equals(checkFlag)){//�Ѿ�ǩ�õ� ������ǩ��
					   msg = "��Ա���Ѿ�ǩ���������ٴ�ǩ��";
					   return msg;
				   }else if("δǩ��".equals(checkFlag)){
					   //�½�һ��ǩ����¼
					   arrayList.add(new CheckInRecord("ǩ��",getNowTime(),null));
					   msg = "��Ա���Ѿ�ǩ��";
					   return msg;
				   }
			}
		}else if("2".equals(type)){//ǩ��
			if(size == 0){//û�м�¼ʱ��
				 msg = "��Ա����δǩ��������ǩ��";
				 return msg;
			}else{//�м�¼��ʱ��
				   CheckInRecord checkInRecord = arrayList.get(size-1);//��ȡ����һ����¼����
				   String checkFlag = checkInRecord.getCheckFlag();
				   
				   if("ǩ��".equals(checkFlag)){//�Ѿ�ǩ�õ� ����ǩ��
					   msg = "��Ա���Ѿ�ǩ��";
					   checkInRecord.setCheckOutTime(getNowTime());
					   checkInRecord.setCheckFlag("δǩ��");
					   return msg;
				   }else if("δǩ��".equals(checkFlag)){
					   //�Ѿ�ǩ����
					   msg = "��Ա���Ѿ�ǩ�ˣ������ٴ�ǩ��";
					   return msg;
				   }
			}
		}else if("3".equals(type)){
			System.out.println("Ա����Ϣ�� ������"+employee.getName()+" ��ţ� "+employee.getID()+"  �򿨼�¼��");
			System.out.println();
			if(arrayList.size()==0){
				System.out.println("��");
			}else{
				arrayList.forEach(item ->{
					String checkOut = "";
					if(item.getCheckOutTime() == null){
						checkOut = "����ǩ�˼�¼";
					}else{
						checkOut = item.getCheckOutTime();
					}
					System.out.println(item.getCheckInTime().substring(0, 11)+"   ǩ��ʱ�䣺"+item.getCheckInTime()+"   ǩ��ʱ�䣺"+checkOut);
				});
				
				
			}
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("������һ������1���˳�����¼��������2");
			 String operation = scanner.nextLine();
			 
			 if("1".equals(operation)){
				 msg = operationSystem(employee);
			 }else if("2".equals(operation)){
				 return "�˳���¼";
			 }else{
				 System.out.println("�޴˹���");
			 }
		}else if("4".equals(type)){
			msg = "�����˳�ϵͳ";
		}else{
			System.out.println("�޴˹���");
			operationSystem(employee);
		}
		return msg;
	}

	public static String getNowTime() {//��ȡ���ڵĹ��߷���
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		String parse = simpleDateFormat.format(new Date());
		return parse;
	}
	

	private static HashMap<String,Employee> getAllEmplouee() {
		HashMap<String,Employee> map = new HashMap<>();
		
		map.put("1001",new Employee(1001, "Tom"));
		map.put("1002",new Employee(1002, "Smith"));
		map.put("1003",new Employee(1003, "Mark"));
		map.put("1004",new Employee(1004, "Jerry"));
		map.put("1005",new Employee(1005, "bob"));
		return map;
	}

}


class Employee {
	
	private int ID;
	
	private String name;
	
    //���Ա���򿨼�¼������ 
	//���� 7��������7����ʱ�����ζ���
	private ArrayList<CheckInRecord> arrayList;
	
	
	public Employee(int ID, String name){
		this.ID = ID;
		this.name = name;
		arrayList = new ArrayList<>();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<CheckInRecord> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<CheckInRecord> arrayList) {
		this.arrayList = arrayList;
	}
	
	
	
	
}

class CheckInRecord {
	
	private String checkFlag;//Ĭ����δǩ��״̬��Ա��ǩ��ʱ���ж�״̬Ϊǩ��������ǩ����ǩ��֮��ֻ��ǩ�ˣ�ǩ��֮���Ϊδǩ��
	
	private String checkInTime;
	
	private String checkOutTime;
	
	public CheckInRecord(String checkFlag,String checkInTime,String checkOutTime){
		  this.checkFlag = checkFlag;
		  this.checkInTime = checkInTime;
		  this.checkOutTime = checkOutTime;
	}
	
	public CheckInRecord(String checkInTime,String checkOutTime){
		  this.checkFlag = "δǩ��";
		  this.checkInTime = checkInTime;
		  this.checkOutTime = checkOutTime;
	}
	
	public String getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	
	
	
}

