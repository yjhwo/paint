package com.estsoft.paint.app;

import com.estsoft.paint.i.Drawble;
import com.estsoft.paint.point.ColorPoint;
import com.estsoft.paint.point.Point;
import com.estsoft.paint.shape.Rectangle;
import com.estsoft.paint.shape.Shape;
import com.estsoft.paint.shape.Triangle;

public class MainApp {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setY(50);
		
		point.show();
		
		Point point2 = new Point(200, 200);
		point2.show();
		
		point.show(false);
		point2.show(false);
		point2.show(true);
		
		Point point3 = new ColorPoint();
		point3.setX(500);
		point3.setY(500);
		((ColorPoint)point3).setColor("red");
		
		point3.show();
		
		Point point4 = new ColorPoint(250, 250, "yellow");
		point4.show();
		
		// 삼각형 그리기
		Shape shape1 = new Triangle();
		draw(shape1);
		
		// 사각형 그리기
		draw(new Rectangle());
	}
	
	
	public static void draw(Drawble drawble){

		// 객체가 Drawable 인터페이스를 구현하였는가?
		System.out.println( drawble instanceof Drawble );

		// 객체가 Rectangle 클래스의 인스턴스 인가?
		System.out.println( drawble instanceof Rectangle );

		// 객체가 Shape 클래스의 인스턴스 인가?
		System.out.println( drawble instanceof Shape ); 

		
		drawble.draw();
	}
	
	
}
