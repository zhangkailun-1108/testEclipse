package com.neuedu.part07;

public class TestBus {

	public static void main(String[] args) {
		
			
		payParkingFee(new MiniBus(3));
		
	}
	
	//������̬
	public static void payParkingFee(Bus bus){
		
		int parkingFee = bus.parkingFee();
		
		System.out.println("ͣ���շ�"+parkingFee);
	}

}
