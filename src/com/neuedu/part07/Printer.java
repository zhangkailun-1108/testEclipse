package com.neuedu.part07;

public class Printer {
	
	/**
	 * 打印
	 */
	public void doPrint(){
		
	}
	
	
	public static void main(String[] args) {
		Printer printer = new colorPrinter();
		
		printer.doPrint();
		
	}
	
}

class blackPrinter extends Printer{
	
	
	@Override
	public void doPrint(){
		System.out.println("黑白打印机");
	}
	
}

class colorPrinter extends Printer{

	@Override
	public void doPrint() {
		System.out.println("彩色打印机");
	}
	
}