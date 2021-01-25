package com.neuedu.part08;

import java.util.InputMismatchException;

/**
 * �쳣����
 * ʲô���쳣��
 * �������й����з������������󣨴���
 * �쳣�ķ�֧���ࣺ
 * Throwable �� Error ���� �� ջ�������������⣬�������ⲻ�����쳣����Χ�ڵ�
 * ��
 * �� Exception �� IOException ����ʱ�쳣  Ҳ�м�����쳣 ���ڳ������� ֮ǰ�����������Ҫ������쳣��
 *       ��
 *   runtimeException ����ʱ�쳣  Ҳ�� �Ǽ�����쳣
 *       ��
 * NullPointerException ��ָ���쳣
 * ArrayIndexOutofBoundsException ����Խ���쳣
 * ArithmeticException �����쳣
 * 
 * �쳣���жϳ��򷽷������У�������Ҫ��������֮�� ��Ӱ���������ִ��
 *
 * �쳣�Ĵ���
 * 1.ʹ�� try/catch  ���д��� 
 * try{��Ҫ�쳣����Ĵ���}catch(��Ҫ������쳣����){ д��������˶�Ӧ�쳣�����ߵĴ����߼� }
 * ������뷢���쳣�����ж� �쳣�����ĸ��쳣���ͣ�ִ�ж�Ӧ�Ĵ���
 * ע�⣺try/catch ��һ�����壬���ܵ���д��catch����д���
 *     try�ж��д���ʱ�������ദ�쳣����ʱ��һ���쳣�����ұ�����Ĵ����Ҳ����ٻ�try
 *     catch�е��쳣�����ж������|�����ֻ����һ��������
 *     ���catch���и����쳣���ͣ�������������쳣���ͺ���
 *     try/catch�ǿ���Ƕ�׵�
 * finally{}�Ӿ�  ��try/catch�����쳣����ʱ����һ��Ҫִ�еĴ������finally�Ӿ��н���ִ�У��������
 * һ�������ر���
 * ע�⣺try/finally ����ʡ��catch
 * 2.throws�ؼ��� �쳣�����ף�����ô����쳣�ķ����ĵط���    
 * �ڷ���ͷ���� ������ǰ��  д throws�ؼ��� �� �쳣����
 * ע�⣺ 
 *    �׳�����쳣���쳣����֮���ö������
 *    �׳����쳣��Ҫ���õĵط���������������׳�
 *    
 * 3. throw�ؼ��� �����쳣
 * �Լ���������쳣����Ҫ������
 * ע�⣺
 *    throw�Ӿ�����û����ִ��
 *    
 * ��Ҫʹ��try/catch��֧ ����������ҵ�񳡾�����
 */
public class TestPart801 {

	public static void main(String[] args){
		int i=1;
		int f=9;
		String string = null;
		int[] arr = new int[4];
		try{
			
			//throw new Exception();
			doException(1);
		}catch (ArithmeticException | NullPointerException e) {
			try {
				arr[4]=0;
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("����Խ���쳣");
				throw e1;
			}
			e.printStackTrace();
			System.out.println("ɱ������Ա����");
		}catch (InputMismatchException e){
			e.printStackTrace();
			System.out.println("����ת���쳣������һ����");
		}catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("����������֮����쳣");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("������Exception���쳣");
		}finally {
			System.out.println("1111111111111");
		}
		
		
	  /*  System.out.println("Hello World");
	    System.out.println(i);*/
		
		try {
			doException(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void doException(int i) throws Exception{
		doException2 (i);
	}
	
	public static void doException2 (int i ){
			System.out.println(i/0);
		
	}

}
