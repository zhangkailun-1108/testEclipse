package com.neuedu.part06;

public class Rectangle {

	int width;
	int height;
	
	
	public Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	
	public int getArea(){
		return width*height;
	}
	
	public int getPer(){
		return (width+height)*2;
	}
	
	public void showAll(){
		System.out.println("����"+height);
		System.out.println("��"+width);
		System.out.println("�ܳ���"+ this.getPer());
		System.out.println("�����"+ this.getArea());
	}
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2, 3);
		rec.showAll();
	}
	
	
}
