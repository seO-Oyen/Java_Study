package javaexp.a08_access.triworld;

import javaexp.a08_access.shapeworld.Shape;

public class Triangle extends Shape {

	@Override
	protected void drawing() {
		super.drawing();
		
		System.out.println("삼각형 도형 완성");
	}
	
	

}
