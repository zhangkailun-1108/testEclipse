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
		 * 打卡系统：给公司员工提供的一个打卡系统
		 * 员工的信息是系统的基础数据，员工的信息包括：ID 姓名 
		 * 提供的功能点：
		 * 1-------------签到
		 * 2-------------签退
		 * 3-------------查询打卡信息  （记录打卡时间 可以查询近7天 ，1次签到签退为一天）
		 * 4-------------退出
		 * 签到：打卡的员工必须是公司已有员工
		 * 签退：打卡的员工必须是公司已有员工，只有当天签到的员工才可以签退
		 * 同一天不能重复签到，签退
		 * 
		 */
		 //0.需要初始化一个存放公司现有员工的集合
		 //1.应该有个确认员工信息登录环节
		 //2.打卡记录存在另一个集合中
		 //3.打卡之后退出登录界面
		 HashMap<String,Employee> employees =  getAllEmplouee();//初始化公司员工
		 outer:while(true){
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("请输入您的员工编号：");
			 String checkId = scanner.nextLine();
			 //员工校验
			 Employee employee = employees.get(checkId);
			 if(employee == null){
				 System.out.println("无此员工，不能登入");
				 continue outer;
			 }else{
				 //进行功能处理
				 String msg = operationSystem(employee);
				 System.out.println(msg);
				 if(msg.contains("已经签到")){
					 continue outer;
				 }else if(msg.contains("已经签退")){
					 continue outer;
				 }else if(msg.equals("该员工还未签到，不能签退")){
					 String msg2 = operationSystem(employee);
					 System.out.println(msg2);
					 if(msg2.equals("该员工还未签到，不能签退")){
						 System.out.println("异常操作登出");
						 continue outer;
					 }else{
						 if(msg2.contains("已经签到")){
							 continue outer;
						 }else if(msg2.contains("已经签退")){
							 continue outer;
						 }else if (msg2.equals("退出登录")){
							 continue outer;
						 }else if(msg2.contains("退出系统")){
							 break outer;
						 }
					 }
				 }else if (msg.equals("退出登录")){
					 continue outer;
				 }else if(msg.contains("您已退出系统")){
					 break outer;
				 }
				 
			 }
		 }

	}

	private static String operationSystem(Employee employee) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("1-------------签到");
		 System.out.println("2-------------签退");
		 System.out.println("3-------------查询打卡信息");
		 System.out.println("4-------------退出");
		 String type = sc.nextLine();
		String msg = "";
		ArrayList<CheckInRecord> arrayList = employee.getArrayList();
		int size = arrayList.size();
		if("1".equals(type)){//签到
			//取最新一条的记录，判断是否签到
			if(size == 0){//没有记录
					arrayList.add(new CheckInRecord("签到",getNowTime(),null));
					msg = "该员工已经签到";
					return msg;
			}else{ //有记录
				   //如果有7条记录了
				   if(size==7){
					   //System.arraycopy(src, 1, dest, 0, 6);
					   //去掉第一条数据
					   arrayList.remove(0);
				   }
				   
				   CheckInRecord checkInRecord = arrayList.get(arrayList.size()-1);//获取最新一条记录处理
				   String checkFlag = checkInRecord.getCheckFlag();
				   
				   if("签到".equals(checkFlag)){//已经签好到 不能再签到
					   msg = "该员工已经签到，不能再次签到";
					   return msg;
				   }else if("未签到".equals(checkFlag)){
					   //新建一条签到记录
					   arrayList.add(new CheckInRecord("签到",getNowTime(),null));
					   msg = "该员工已经签到";
					   return msg;
				   }
			}
		}else if("2".equals(type)){//签退
			if(size == 0){//没有记录时候
				 msg = "该员工还未签到，不能签退";
				 return msg;
			}else{//有记录的时候
				   CheckInRecord checkInRecord = arrayList.get(size-1);//获取最新一条记录处理
				   String checkFlag = checkInRecord.getCheckFlag();
				   
				   if("签到".equals(checkFlag)){//已经签好到 可以签退
					   msg = "该员工已经签退";
					   checkInRecord.setCheckOutTime(getNowTime());
					   checkInRecord.setCheckFlag("未签到");
					   return msg;
				   }else if("未签到".equals(checkFlag)){
					   //已经签完退
					   msg = "该员工已经签退，不能再次签退";
					   return msg;
				   }
			}
		}else if("3".equals(type)){
			System.out.println("员工信息： 姓名："+employee.getName()+" 编号： "+employee.getID()+"  打卡记录：");
			System.out.println();
			if(arrayList.size()==0){
				System.out.println("空");
			}else{
				arrayList.forEach(item ->{
					String checkOut = "";
					if(item.getCheckOutTime() == null){
						checkOut = "暂无签退记录";
					}else{
						checkOut = item.getCheckOutTime();
					}
					System.out.println(item.getCheckInTime().substring(0, 11)+"   签到时间："+item.getCheckInTime()+"   签退时间："+checkOut);
				});
				
				
			}
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("返回上一层输入1，退出到登录界面输入2");
			 String operation = scanner.nextLine();
			 
			 if("1".equals(operation)){
				 msg = operationSystem(employee);
			 }else if("2".equals(operation)){
				 return "退出登录";
			 }else{
				 System.out.println("无此功能");
			 }
		}else if("4".equals(type)){
			msg = "您已退出系统";
		}else{
			System.out.println("无此功能");
			operationSystem(employee);
		}
		return msg;
	}

	public static String getNowTime() {//获取日期的工具方法
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
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
	
    //存放员工打卡记录的属性 
	//最多存 7条，超过7条，时间依次顶掉
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
	
	private String checkFlag;//默认是未签到状态，员工签到时，判断状态为签到，即可签到，签到之后只能签退，签退之后改为未签到
	
	private String checkInTime;
	
	private String checkOutTime;
	
	public CheckInRecord(String checkFlag,String checkInTime,String checkOutTime){
		  this.checkFlag = checkFlag;
		  this.checkInTime = checkInTime;
		  this.checkOutTime = checkOutTime;
	}
	
	public CheckInRecord(String checkInTime,String checkOutTime){
		  this.checkFlag = "未签到";
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

