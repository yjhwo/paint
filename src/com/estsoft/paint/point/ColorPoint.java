package com.estsoft.paint.point;

import com.estsoft.paint.i.Drawble;

public class ColorPoint extends Point implements Drawble{
	private String color;
	
	public ColorPoint(){	
	}
	
	public ColorPoint(String color){
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);	//부모 생성자 호출
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		show();
	}
	
	
}
