package demo;


public class Test {
		public static void main(String[] args) {
			
			//作业：创建一个扑克牌类（花色和值），不算大小王
			//1.放数组中52张牌 
			//2.洗牌乱序
			//3.判断洗牌后的前三张是否是同花顺
			//4.求第一次出现同花顺时，一共洗了多少次牌
			
		
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