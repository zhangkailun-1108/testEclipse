package demo;


public class Test {
		public static void main(String[] args) {
			
			//��ҵ������һ���˿����ࣨ��ɫ��ֵ���������С��
			//1.��������52���� 
			//2.ϴ������
			//3.�ж�ϴ�ƺ��ǰ�����Ƿ���ͬ��˳
			//4.���һ�γ���ͬ��˳ʱ��һ��ϴ�˶��ٴ���
			
		
			Generic<Integer> generic = new Generic<Integer>();
			
			System.exit(0);
		}
	}

class Generic<T>{
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
	
}