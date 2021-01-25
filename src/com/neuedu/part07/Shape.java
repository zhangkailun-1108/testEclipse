package com.neuedu.part07;

public abstract class Shape {

	
	private int area;
	private int per;
	private String color;
	
	public Shape(){
		
	}
	
	public Shape(String color){
		this.color = color;
	}

	public abstract int getArea();

	public abstract int getPer();

	public String getColor() {
		return color;
	}
	
	public void showAll(){
		System.out.println("面积是："+area);
		System.out.println("周长是："+per);
		System.out.println("颜色是："+color);
	}
	
	
	
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10,10,"红色");
		Circle circle = new Circle(10,"绿色");
		rectangle.showAll();
		circle.showAll();
	}
	
}

 class   Rectangle extends Shape{
	
	private int weight;
	private int height;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int weight,int height,String color){
		super(color);
		this.weight = weight;
		this.height = height;
	}

	public void getColor(int i) {
		
	}
	
	@Override
	public int getArea() {
		return weight*height;
	}

	@Override
	public int getPer() {
		return (weight+height)*2;
	}

	@Override
	public void showAll() {
		System.out.println("面积是："+getArea());
		System.out.println("周长是："+getPer());
		System.out.println("颜色是："+getColor());
		System.out.println("长度是："+this.height);
		System.out.println("宽度是："+this.weight);
	}
	
}

class Circle extends Shape{
	
	private int radius;
	
	public Circle(){
		
	}
	
	public Circle(int radius,String color){
		super(color);
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return 3*radius*radius;
	}

	@Override
	public int getPer() {
		return 2*3*radius;
	}

	@Override
	public void showAll() {
		System.out.println("面积是："+getArea());
		System.out.println("周长是："+getPer());
		System.out.println("颜色是："+getColor());
		System.out.println("半径是："+this.radius);
	}
	
	
	
}
 
abstract class sanjiaoxing extends Shape {
	@Override
	public int getPer() {
		// TODO Auto-generated method stub
		return 0;
	}
}

interface test {

}




