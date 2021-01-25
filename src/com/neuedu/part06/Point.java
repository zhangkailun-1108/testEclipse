package com.neuedu.part06;

public class Point {

	int x;
	int y;
	
	public Point(){
		
	}
	
	public Point(int x0,int y0){
		this.x = x0;
		this.y = y0;
	}
	
	
	public void movePoint(int dx,int dy){
		x = x+dx;
		y = y+dy;
		System.out.println("移动后的坐标为："+this.x+","+this.y);
	}
}
