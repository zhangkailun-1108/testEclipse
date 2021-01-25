package com.neuedu.part09;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ����Ĭ�ϵ��ַ�����GBK���ģ�gb2312
 * 4.�ַ�����
 * �ַ����ڲ�ʹ�ò��ɱ��char������������
 * �ַ����ıȽϷ�����
 * 				boolean equals() �ж��Ƿ���� 
 * 			    boolean equalsIgnoreCase() ���Դ�Сд���еıȽ�
 *				boolean startsWith() �ж��ַ����Ƿ��Դ˿�ʼ
 *				boolean endsWith() �ж��ַ����Ƿ��Դ˽���
 * �ַ�����char�����ת��
 * ����ͨ��toCharArray()�ķ���ת����char������
 * ����ͨ���ַ����Ĺ��������ַ�����ת�����ַ�����������ͨ��String.valueOf����
 * 
 * �ַ�����byte�����ת��
 * ����ͨ��getBytes()�ķ������byte���飬���Ի���ַ�����ռ�õ��ֽ���
 * 
 * �ַ����ĳ��÷���
 * split(ָ���ָ���) ͨ��ָ�����ַ��������в��ԭ�ַ���Ϊһ���ַ�������
 * replace�����ַ������ַ��������ַ�ȫ���滻�����ַ�������һ�����ַ���
 * toUpperCase() ���ַ���ת���ɴ�д
 * toLowerCase() ���ַ���ת����Сд
 * charAt(index) ����index�±��Ӧ���ַ�
 * substring(b,e) ��bλ�ÿ�ʼ����e-1λ�ý���������һ�����ַ���
 * indexOf(�ַ�/�ַ���) �����ַ������ַ������ڵ�λ�ã����û�з���-1
 * trim() ȥ���ַ�����β�ո�
 * matches(������ʽ)	�ַ�����ʽ����������򣬷���true�������� ����false	
 * 
 * ���һ���ַ���Ƶ���ı仯�����Ƽ�ʹ��String
 * 
 * �ɱ���ַ���
 * StringBuffer��StringBuilder
 * append(xxx)��xxxƴ�ӵ��ַ�������
 * insert(ָ��λ��,xxx����)�ַ�����ָ��λ�ò���xxx
 * deleteCharAt(ָ��λ��)ɾ��ָ��λ���ַ���
 * ���ԣ�StringBuffer��StringBuilder����
 * StringBuffer �̰߳�ȫͬ�����ٶȽ���synchronized��
 * StringBuilder �̲߳���ȫ���ٶȽϿ�
 * 
 * 5.Date��
 * after �ж������Ƿ���ָ������֮��
 * before �ж��Ƿ�֮ǰ
 * 
 * 6.������
 * Calendar instance = Calendar.getInstance() ��ȡ����
 * getTime ��ȡ��ǰϵͳʱ��
 * 
 * 7.SimpleDateFormat �Զ������ڸ�ʽ
 * �������ж���ָ���ĸ�ʽ
 * y�����꣬M�£�d�գ�HСʱ��m���ӣ�s��
 * format(Date d) ������ת�����ַ�����
 * parse(String s) �ַ���ת���������ͣ�ע���ַ���Ҫ��SimpleDateFormat�ﶨ��ĸ�ʽһ�²ſ���ת��
 * 
 * math ������
 * Math.floorֻ����С����ǰ����������
 * Math.ceil ����
 * Math.rint ��������ȡ��
 * 
 */
public class TestPart902 {

	public static void main(String[] args) {
		String str = new String("aaaaaa");
		String str2 = "��";
		
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
		//ͳ��һ���ַ������ַ�e���ֵĴ���
		System.out.println(s.length()-s.replace("e", "").length());
		//System.out.println("�����һ���ַ����ڵڶ����ַ����г��ֵĴ���");
		Scanner sc = new Scanner(System.in);
		
		/*String first = sc.nextLine();
		String second = sc.nextLine();
		
		System.out.println((second.length()-second.replace(first, "").length())/first.length());
		*/
		//����һ������ �ж�����ĸ�ʽ�Ƿ���ȷ111@qq.com
		while (true) {
			System.out.println("������һ������");
			String mail = "123123@123.eqw";
			
			boolean matches = mail.matches("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			
			if(matches){
				System.out.println("����Ϸ�");
				break;
			}else{
				System.out.println("���䲻�Ϸ�");
				continue;
			}
			
			//checkMail(mail);
		}
		
		StringBuffer stringBuffer = new StringBuffer("aaaa");
		//ƴ��
		stringBuffer.append("1111");
		stringBuffer.append("2111");
		stringBuffer.insert(1, b);
		stringBuffer.deleteCharAt(1);
		stringBuffer.replace(1, 2, "00");
		System.out.println(stringBuffer);
		
		StringBuilder stringBuilder = new StringBuilder("bbbb");
		
		System.out.println(stringBuilder);
		
		
		//����̨����10���ַ������������֮���
		StringBuffer stringBuffer2 = new  StringBuffer();
		for(int i=0;i<10;i++){
			String input ="";
			stringBuffer2.append(input);
		}
		System.out.println(stringBuffer2);
		
		Date date = new Date();
		Date date2 = new Date(2000);
		
		System.out.println(date.before(date2));
		//������
	    Calendar instance = Calendar.getInstance();
	    
	    System.out.println(instance.getTime());
		
	    
	    int type = instance.get(9);//0�����磬1������
	    if(type==0){
	    	str="����";
	    }else{
	    	str="����";
	    }
	    int year = instance.get(Calendar.YEAR);//1����
	    int month  = instance.get(Calendar.MONTH);//2����
	    int day = instance.get(Calendar.DATE);//5����
	    int hour = instance.get(Calendar.HOUR);
	    int min  = instance.get(Calendar.MINUTE);
	    int se = instance.get(Calendar.SECOND);
	    
	    
	    System.out.println(year+"��"+(month+1)+"��"+day+"��"+" "+hour+":"+min+":"+se+" "+str);
	    
	    
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
			System.out.println("���䲻�Ϸ�");
		}else if(indexOf == -1 || indexOf ==0 || indexOf == length-1){
			System.out.println("���䲻�Ϸ�");
		}else if(indexOf2 == -1 || indexOf2 ==0 || indexOf2 == length-1){
			System.out.println("���䲻�Ϸ�");
		}else if(indexOf2<indexOf || indexOf2-indexOf==1){//����@��ǰ��,�������ǰ���
			System.out.println("���䲻�Ϸ�");
		}else if(indexOf != mail.lastIndexOf("@") || indexOf2 != mail.lastIndexOf(".")){
			System.out.println("���䲻�Ϸ�");
		}else{
			String string = mail.substring(indexOf2+1);
			if(string.equals("com") || string.equals("cn") ){
				System.out.println("����Ϸ�");
			}else{
				System.out.println("���䲻�Ϸ�");
			}
		}
	}

}
