package com.neuedu.part02;

import java.util.Scanner;

/**
 * java�����
 * �����������
 * 			+��-��*��/��%ȡ�ࣨ������Ϊ����Ϊ����
 * 			++������--�Լ�      ++���� �ȼӺ��ã�����++ ���ú��
 * �����������+=,-=
 * ��ϵ�������>,>=,<,<=,==,!=   ��ϵ�������ǲ�����
 * �߼��������������������͵������еĲ�������  
 * 			&& �߼��� ͬ�����棬�м����
 * 			|| �߼���  �������棬ͬ�����
 * 			�� �߼���  �Խ��ȡ��
 * 			�������ڶ�·���㣨&&�жϵ�һ�����ʽ��ֵ���Ϊfalse����ڶ�����ִ�У�||�жϵ�һ�����Ϊtrue���ڶ�����ִ�У�
 * 			&��|���ڷǶ�· ����������
 * ��Ŀ�������������Ԫ���ʽ��
 * ������ʽ1Ϊ�� ��������ʽ2��������������ʽ3
 * ���ʽ1�����ʽ2�����ʽ3
 * 
 */
public class TestPart202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(-5%-2);
		
		int i =0;
		//��չ��i++ �Ƿ����̰߳�ȫ�ģ�
		System.out.println(i++ + ++i);//���ʽ���������Ҳ����Ӱ��
		System.out.println("��������ѧϰ�ַ�������"+(i+ ++i));
		
		
		int x1 = 3, y1 = 5;
	    int x2 = 3, y2 = 5;
	    int r1, r2;
	    r1 = x1++ + x1*y1;
	    r2 = ++x2 + x2*y2;
	    System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
	    System.out.println("x2="+x2+" y2="+y2+" r2="+r2);
		
		System.out.println(5.0/2);
		
		x1 = x1 + 3;
		x1 +=3;
		System.out.println(x1);
		
		System.out.println(x1 != x2);
		
		
		int x=6,y=8; boolean b;

		System.out.println(x>y&&(++x==--y));
		System.out.println(x+" "+y);
		
		/*boolean flag = true,flag1 = false;
		
		System.out.println(flag & flag1);//false
		System.out.println(flag | flag1);//true
		System.out.println(flag ^ flag1);//true
		
		System.out.println(flag & flag1?3-1:4+1);*/
		Scanner sc = new Scanner(System.in);
		System.out.print("���������ݣ�");
		String nextLine = sc.nextLine();
		System.out.println("�ɿ���̨�������Ϊ��"+nextLine);
	
	}

}
