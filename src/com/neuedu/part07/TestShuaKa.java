package com.neuedu.part07;

public class TestShuaKa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		pay(new Credit(1000),1500);
	}
	
	
	public static void pay(BankCard bankCard,double payMoney){
		
		bankCard.shuaka(payMoney);
	}

}
