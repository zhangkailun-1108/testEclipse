package com.neuedu.part04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * ����
 * ��������ͬ���͵����ݰ���һ����˳�������һ���������������
 * �����������ͣ� �Ե�ַ��ʽ���
 * ��ζ��壿
 * ��һ�ֶ��巽ʽ  ���徲̬����  ��������[] �� = {��ŵ���ͬ���͵�ֵ�����ֵ֮���ö��Ÿ���}
 * �ڶ��ֶ��巽ʽ  ���嶯̬����  ��������[] �� = new ��������[�����С]   �����С����ʡ
 * 
 * �����⣺�ٳ��㳣����5���쳣���ͣ�
 * 
 * ��������� 
 * ��1.ð������
 * 2.java�ײ�������ṩ����������ʽ Arrays������� sort() Ĭ������
 * 
 * ����Ĳ���
 */
public class TestPart401 {

	public static void main(String[] args) {
		
		
		char c='3';
		
		//��������
		int[] arr = {14,12,3,45,5,17,29,100,0};//�ǰ�new������
		System.out.println(arr);
		//�����ȡֵ��ʽ
		//ͨ��ֵ��λ�ã��±꣩��ȡֵindex,��0��ʼ��
		System.out.println(arr[4]);
		
		//��������2
		//����������Ժ󣬻���ݶ�������͸���Ĭ��ֵ  intĬ��0   charĬ�Ͽ��ַ�
		int[] arr2 = new int[60];
		System.out.println(arr2);
		System.out.println((int)arr2[59]);
		//��ֵ
		arr2[0]='A';
		arr2[1]='B';
		
		int a = 0X6d06d69c;
		System.out.println(a);
		
		int[] arr3 = null;
		
		//System.out.println(arr3[0]);
		//���鸳ֵ 60������1--60
		int j=1;
		//ͨ�������i����������±�
		for(int i=0;i<60;i++){
			arr2[i]=j;
			j++;
		}
		//�������ݲ鿴  ѭ����� ��Ϊ����ı���
		//��������� length
		System.out.println(arr2.length);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		//����arr2��ƽ��ֵ
		int sum = 0;
		for(int i=0;i<arr2.length;i++){
			sum +=arr2[i];
		}
		
		System.out.println(sum/arr2.length);
		//����arr�����ֵ����Сֵ
		//��Ҫһ��������
		int min =arr[0];
		int max =arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		System.out.println("���ֵ��"+max+",��Сֵ��"+min);
		//int[] arr = {12,3,14,5,17,29,45,0,100}
		//���������
		//1.ð������   ����
		for(int i=0;i<arr.length-1;i++){//���������
			for(int k=0;k<arr.length-i-1;k++){//ÿһ�˱ȽϵĴ���
				if(arr[k+1]<arr[k]){//�Ƚ� �ж�
					int temp;//����λ��
					temp = arr[k+1];
					arr[k+1] =arr[k];
					arr[k] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		// ����һά����{ -10��2��3��246��-100��0��5} ������������е�ƽ��ֵ�����ֵ����Сֵ�����Ұ��ս�������
		int[] arrtest = {-10,2,3,246,-100,0,5};
		sum=arrtest[0];
		max=arrtest[0];
		min=arrtest[0];
		for(int i=1;i<arrtest.length;i++){
			sum +=arrtest[i];
			if(arrtest[i]>max)
			{
				max = arrtest[i];
			}
			if(arrtest[i]<min)
			{
				min = arrtest[i];
			}
		}
		System.out.println("���ֵ��"+max+",��Сֵ��"+min+"��ƽ��ֵ��"+(sum/arrtest.length));
		//����
		/*for(int i=0;i<arrtest.length-1;i++){
			for(int k=0;k<arrtest.length-i-1;k++){
				if(arrtest[k+1]>arrtest[k]){
					int temp;
					temp = arrtest[k+1];
					arrtest[k+1] = arrtest[k];
					arrtest[k] = temp;
				}
			}
		}*/
		//����   ��ǿfor(���� ����������Ҫ������Ŀ��)������������ÿ�α�����ֵ
		//�ص� ��û�����±�
		Arrays.sort(arrtest);//Ĭ������
		for(int item:arrtest){
			System.out.print(item+" ");
		}
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==100){
				System.out.println(i);
				break;
			}
		}
		
		//���ַ�����
		//ǰ����Ҫ����
		//0 3 5 12 14 17 29 45 100  arr
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��Ԥ��ֵ");
		int expect = scanner.nextInt();
		min = 0;//��������±�
		max = arr.length-1;//��������±�
		
		while (max>=min) {//����
			//ѭ����
			int mid = (min+max)/2;
			if(expect >arr[mid]){
				//Ԥ��ֵ����arr[mid] ���Ҳ�
				min = mid+1;
			}else if(expect < arr[mid]){
				//Ԥ��ֵ С��midֵ  �����
				max = mid-1;
			}else{
				//�ҵ���
				System.out.println("Ԥ��ֵ"+expect+"����������±�Ϊ"+mid);
				break;
			}
		}
		if(max<min){
			System.out.println("Ԥ��ֵû���ҵ�");
		}
		
		
		//java�Դ��Ķ��ֲ��ҵķ���
		int binarySearch = Arrays.binarySearch(arr, -4);
		System.out.println(binarySearch);
		
		//����ĸ���
		int[] arrCopy = new int[arr.length];
		for(int i = 0;i<arr.length;i++){
			arrCopy[i] = arr[i];
		}
		
		//java�Դ��ĸ��Ʒ�ʽ
		System.arraycopy(arr, 0, arrCopy, 0, arr.length);
		
		//���������
		Random random = new Random();
		for(int i = 0;i<100;i++){
			System.out.println(random.nextInt(100));//���������  100����Χ0-99
		}
		
		
		//��ά���� ���� ����������
		int[] s[] = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		
		char[] arrc = {'a','b'};
		System.out.print(arrc);
	}

}
