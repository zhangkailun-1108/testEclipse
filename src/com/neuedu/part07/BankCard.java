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



	public abstract void  shuaka(double money);//参数是消费的钱
		
}

abstract class  Debit extends BankCard{

	public Debit(double money) {
		super(money);
	}

	@Override
	public void shuaka(double money) {
		if(getMoney()-money<0){
			System.out.println("余额不足");
		}else{
			setMoney(getMoney()-money);
			System.out.println("消费成功，借记卡余额为"+getMoney());
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
			System.out.println("您已透支消费，当前欠款为："+getMoney());
		}else{
			setMoney(getMoney()-money);
			System.out.println("消费成功，信用卡余额为"+getMoney());
		}
		
	}
	
	
}