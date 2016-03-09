package com.estsoft.paint.shape;

import com.estsoft.paint.i.Drawble;

public class Rectangle extends Shape implements Drawble{

	@Override
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}

	
	
}
