package javaexp.a06_object.vo;

public class Rectangle {
	// 필드 접근 제어 private
	private double width;
	private double height;
	
	// 생성자를 통해서 초기화처리
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
	// 필드에 입력된 width와 height를 기준으로 면적을 가져오는 메서드
	public double getArea() {
		return width * height;
	}

}
