package com.neuedu.part07;

public class Bus {

	
	public int parkingFee(){
		return 0;
	}
	
	
}


class MiniBus extends Bus{

	private int hour;
	
	
	public MiniBus(int hour){
		this.hour = hour;
	}
	
	
	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	@Override
	public int parkingFee() {
		return 3*hour;
	}
	
}

class BigBus extends Bus{
	
	private int hour;
	
	public BigBus(int hour){
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	@Override
	public int parkingFee() {
		return 5*hour;
	}
	
}


