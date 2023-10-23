package javaexp.a06_object;

import javaexp.a06_object.vo.Calculator;
import javaexp.a06_object.vo.Car;
import javaexp.a06_object.vo.Circle;
import javaexp.a06_object.vo.Person;
import javaexp.a06_object.vo.Product;
import javaexp.a06_object.vo.Rectangle;
import javaexp.a06_object.vo.Student;

public class A08_ObjectUsing {

	public static void main(String[] args) {
		
		// Rectangle 클래스의 생성자를 통해서 세로와 가로 할당
		/*Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("세로 : " + rectangle.getHeight());
		System.out.println("가로 : " + rectangle.getWidth());
		System.out.println("넓이 : " + rectangle.getArea());*/
		
		/*Circle circle = new Circle(10);
		System.out.println("반지름 : " + circle.getRadius());
		System.out.println("면적 : " + circle.getArea());
		circle.setRadius(15);
		System.out.println("면적 : " + circle.getArea());
		
		Circle circle2 = new Circle(20);
		System.out.println("반지름 : " + circle2.getRadius());
		System.out.println("면적 : " + circle2.getArea());
		circle2.setRadius(25);
		System.out.println("반지름 : " + circle2.getRadius());
		System.out.println("면적 : " + circle2.getArea());*/
		
		/*Person p01 = new Person("홍길동", 25);
		p01.showInf();
		p01.setName("마길동");
		p01.setAge(30);
		p01.showInf();*/
		
		// ex) Product 생성자로 물건명, 가격, 재고수량을 저장
		//		showInfo() 메서드를 통해서 출력 
		/*Product product = new Product("사과", 2000, 4);
		product.showInfo();
		product.setCount(3);
		product.showInfo();*/
		
		// ex) Student 생성자로 학생번호, 이름, 학년 할당
		//		studentInfo() 메서드로 출력
		/*Student student = new Student(5, "홍길동", 3);
		student.studentInfo();*/
		
		/*Calculator calculator = new Calculator(10, 5);
		
		System.out.println(calculator.plus());
		System.out.println(calculator.minus());
		System.out.println(calculator.multi());
		System.out.println(calculator.divide());*/
		
		// ex) Car 초기속도, 자동차종류
		//		speedUp() @@의 속도가 @@km/h 이다. 출력
		//		speedDown() @@의 속도가 내려 @@km/h 이다. 출력
		Car car = new Car(30, "벤츠");
		car.speedDown();
		car.speedDown();
		car.speedUp();
	}

}
