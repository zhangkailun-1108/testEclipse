package com.neuedu.part07;

public class Printer {
	
	/**
	 * ��ӡ
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
		System.out.println("�ڰ״�ӡ��");
	}
	
}

class colorPrinter extends Printer{

	@Override
	public void doPrint() {
		System.out.println("��ɫ��ӡ��");
	}
	
}