package com.estsoft.paint.shape;

import com.estsoft.paint.i.Drawble;

public class Circle extends Shape implements Drawble {

	@Override
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}

}
