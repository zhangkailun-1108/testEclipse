package com.neuedu.part07;

public abstract class BankCard {

	private  double money;
	
	public BankCard(double money){
		this.money = money;
	}
	
	
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}



	public abstract void  shuaka(double money);//���������ѵ�Ǯ
		
}

abstract class  Debit extends BankCard{

	public Debit(double money) {
		super(money);
	}

	@Override
	public void shuaka(double money) {
		if(getMoney()-money<0){
			System.out.println("����");
		}else{
			setMoney(getMoney()-money);
			System.out.println("���ѳɹ�����ǿ����Ϊ"+getMoney());
		}
		
	}
	
}

class Credit extends BankCard{

	public Credit(double money) {
		super(money);
	}

	@Override
	public void shuaka(double money) {
		if(getMoney()-money<0){
			setMoney(getMoney()-money);
			System.out.println("����͸֧���ѣ���ǰǷ��Ϊ��"+getMoney());
		}else{
			setMoney(getMoney()-money);
			System.out.println("���ѳɹ������ÿ����Ϊ"+getMoney());
		}
		
	}
	
	
}