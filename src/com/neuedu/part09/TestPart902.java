package com.neuedu.part09;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序默认的字符编码GBK中文，gb2312
 * 4.字符串类
 * 字符串内部使用不可变的char型数组存放内容
 * 字符串的比较方法：
 * 				boolean equals() 判断是否相等 
 * 			    boolean equalsIgnoreCase() 忽略大小写进行的比较
 *				boolean startsWith() 判断字符串是否以此开始
 *				boolean endsWith() 判断字符串是否以此结束
 * 字符串跟char数组的转换
 * 可以通过toCharArray()的方法转换成char型数组
 * 可以通过字符串的构造器将字符数组转换成字符串，还可以通过String.valueOf方法
 * 
 * 字符串跟byte数组的转换
 * 可以通过getBytes()的方法获得byte数组，可以获得字符串所占用的字节数
 * 
 * 字符串的常用方法
 * split(指定分隔符) 通过指定的字符串，进行拆分原字符串为一个字符串数组
 * replace（旧字符，新字符）将旧字符全部替换成新字符，返回一个新字符串
 * toUpperCase() 将字符串转换成大写
 * toLowerCase() 将字符串转换成小写
 * charAt(index) 返回index下标对应的字符
 * substring(b,e) 从b位置开始，到e-1位置结束，返回一个新字符串
 * indexOf(字符/字符串) 返回字符或者字符串所在的位置，如果没有返回-1
 * trim() 去掉字符串首尾空格
 * matches(正则表达式)	字符串格式如果符合正则，返回true，不符合 返回false	
 * 
 * 如果一个字符串频繁的变化，不推荐使用String
 * 
 * 可变的字符串
 * StringBuffer和StringBuilder
 * append(xxx)将xxx拼接到字符串后面
 * insert(指定位置,xxx内容)字符串在指定位置插入xxx
 * deleteCharAt(指定位置)删除指定位置字符串
 * 面试：StringBuffer和StringBuilder区别？
 * StringBuffer 线程安全同步，速度较慢synchronized，
 * StringBuilder 线程不安全，速度较快
 * 
 * 5.Date类
 * after 判断日期是否在指定日期之后
 * before 判断是否之前
 * 
 * 6.日历类
 * Calendar instance = Calendar.getInstance() 获取对象
 * getTime 获取当前系统时间
 * 
 * 7.SimpleDateFormat 自定义日期格式
 * 构造器中定义指定的格式
 * y代表年，M月，d日，H小时，m分钟，s秒
 * format(Date d) 日期型转换成字符串型
 * parse(String s) 字符串转换成日期型，注意字符串要和SimpleDateFormat里定义的格式一致才可以转换
 * 
 * math 工具类
 * Math.floor只保留小数点前面整数部分
 * Math.ceil 凑整
 * Math.rint 四舍五入取整
 * 
 */
public class TestPart902 {

	public static void main(String[] args) {
		String str = new String("aaaaaa");
		String str2 = "中";
		
		boolean b = str.equalsIgnoreCase(str2);
		
		System.out.println(b);
		
		System.out.println(str.startsWith("aaaa"));
		System.out.println(str.endsWith("a"));
		char[] charArray = str2.toCharArray();
		for(char item: charArray){
			System.out.println(item);
		}
		str = new String(charArray);
		String.valueOf(charArray);
		
		byte[] bytes = null;
		bytes = str2.getBytes();
		
		for(byte item: bytes){
			System.out.println(item);
		}
		str2 = new String(bytes);
		System.out.println(str2);
		
		String str3 = "   a,eqwe,   ,dasdsad,    asdasd    ";
		
		String[] splitA = str3.split(",");
		
		for(String item: splitA){
			System.out.println(item);
		}
		
		String replace = str3.replace(',', '#');
		System.out.println(replace);
		
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		
		System.out.println(str3.charAt(str3.length()-1));
		System.out.println(str3.substring(0, 3));
		
		System.out.println(str3.indexOf("eqw"));
		
		System.out.println(str3.trim());
		String s = "abecedkjkacedjkdseddklj";
		//统计一个字符串中字符e出现的次数
		System.out.println(s.length()-s.replace("e", "").length());
		//System.out.println("计算第一个字符串在第二个字符串中出现的次数");
		Scanner sc = new Scanner(System.in);
		
		/*String first = sc.nextLine();
		String second = sc.nextLine();
		
		System.out.println((second.length()-second.replace(first, "").length())/first.length());
		*/
		//输入一个邮箱 判断邮箱的格式是否正确111@qq.com
		while (true) {
			System.out.println("请输入一个邮箱");
			String mail = "123123@123.eqw";
			
			boolean matches = mail.matches("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			
			if(matches){
				System.out.println("邮箱合法");
				break;
			}else{
				System.out.println("邮箱不合法");
				continue;
			}
			
			//checkMail(mail);
		}
		
		StringBuffer stringBuffer = new StringBuffer("aaaa");
		//拼接
		stringBuffer.append("1111");
		stringBuffer.append("2111");
		stringBuffer.insert(1, b);
		stringBuffer.deleteCharAt(1);
		stringBuffer.replace(1, 2, "00");
		System.out.println(stringBuffer);
		
		StringBuilder stringBuilder = new StringBuilder("bbbb");
		
		System.out.println(stringBuilder);
		
		
		//控制台输入10次字符串，输出连接之后的
		StringBuffer stringBuffer2 = new  StringBuffer();
		for(int i=0;i<10;i++){
			String input ="";
			stringBuffer2.append(input);
		}
		System.out.println(stringBuffer2);
		
		Date date = new Date();
		Date date2 = new Date(2000);
		
		System.out.println(date.before(date2));
		//日历类
	    Calendar instance = Calendar.getInstance();
	    
	    System.out.println(instance.getTime());
		
	    
	    int type = instance.get(9);//0是上午，1是下午
	    if(type==0){
	    	str="上午";
	    }else{
	    	str="下午";
	    }
	    int year = instance.get(Calendar.YEAR);//1是年
	    int month  = instance.get(Calendar.MONTH);//2是月
	    int day = instance.get(Calendar.DATE);//5是日
	    int hour = instance.get(Calendar.HOUR);
	    int min  = instance.get(Calendar.MINUTE);
	    int se = instance.get(Calendar.SECOND);
	    
	    
	    System.out.println(year+"年"+(month+1)+"月"+day+"日"+" "+hour+":"+min+":"+se+" "+str);
	    
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    
	    String format = sdf.format(new Date());
	    System.out.println(format);
	    format = "2021-01-20";
	    try {
			Date parse = sdf.parse(format);
			System.out.println(parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    double ceil = Math.floor(10.000000001);
	    System.out.println(ceil);
	}
	
	public static void checkMail(String mail){
		int length = mail.length();
		int indexOf = mail.indexOf("@");
		int indexOf2 = mail.indexOf(".");
		if(length>20){
			System.out.println("邮箱不合法");
		}else if(indexOf == -1 || indexOf ==0 || indexOf == length-1){
			System.out.println("邮箱不合法");
		}else if(indexOf2 == -1 || indexOf2 ==0 || indexOf2 == length-1){
			System.out.println("邮箱不合法");
		}else if(indexOf2<indexOf || indexOf2-indexOf==1){//点在@符前面,或者它们挨着
			System.out.println("邮箱不合法");
		}else if(indexOf != mail.lastIndexOf("@") || indexOf2 != mail.lastIndexOf(".")){
			System.out.println("邮箱不合法");
		}else{
			String string = mail.substring(indexOf2+1);
			if(string.equals("com") || string.equals("cn") ){
				System.out.println("邮箱合法");
			}else{
				System.out.println("邮箱不合法");
			}
		}
	}

}
