package com.estsoft.paint.shape;

import com.estsoft.paint.i.Drawble;

public abstract class Shape implements Drawble{
	private String fillColor;
	private String lineColor;
	
	public Shape(){ }

	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
//	public abstract double calcArea();
}
