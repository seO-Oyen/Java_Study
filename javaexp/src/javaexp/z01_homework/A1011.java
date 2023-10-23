package javaexp.z01_homework;

public class A1011 {

	public static void main(String[] args) {
		
//		[1단계:개념] 1. this, super 생성자를 구분해서 사용하는 이유를 간단한 예시를 통해서 설명해보자.
		/*
		 * this -> 현재 클래스
		 * super -> 상속받은 상위 클래스
		 * 를 서로 구분하기 위해 사용
		 * 
		 * class A {
		 * 	A (int a) {
		 * 	}
		 * }
		 * class B extends A {
		 * 	B (int a, int b) {
		 * 		super(a);
		 * 		this.b = b;
		 * 	}
		 * }
		 * */
//		[1단계:개념] 2. 오버라이딩이란 무엇인가? 개념을 기본예제와 함께 설명하세요
		/*
		 * 상위 클래스의 메서드를 재정의 하는 것
		 * 
		 * class A {
		 * 		void show() {
		 * 			~~
		 * 		}
		 * }
		 * 
		 * class B extends A {
		 * 		void show() {
		 * 			super.show();
		 * 			~~
		 * 		}
		 * */
//		[1단계:개념] 3. 오버라이딩과 오버로딩의 차이점을 기술하세요.
		/*
		 * 오버로딩 : 같은 이름의 메서드들을 매개변수로 구별하는 것
		 * 오버라이딩 : 상위 클래스의 메서드를 재정의 하는 것
		 * */
//		[1단계:확인] 4. 아래 오버라이딩 연습예제를 만드세요
//			1) 동물의 소리 내기:Animal 클래스에는 sound()라는 메서드가 있어 동물의 소리를 출력합니다. Dog와 Cat 클래스는 Animal을 상속받습니다. 두 하위 클래스에서 sound() 메서드를 오버라이드하여 각 동물의 소리를 출력하세요.
		/*Dog1 animal1 = new Dog1();
		Cat1 animal2 = new Cat1();
		
		animal1.sound();
		animal2.sound();*/
		
//			2) 도형의 면적 계산: Shape 클래스는 area() 메서드를 가지며, 이는 면적을 출력합니다. 
//				Circle과 Rectangle 클래스는 Shape을 상속받습니다. 두 하위 클래스에서 area() 메서드를 오버라이드하여 각 도형의 면적을 계산하세요.
		/*Circle s1 = new Circle(3);
		Rectangle s2 = new Rectangle(3, 4);
		
		s1.area();
		s2.area();*/
//			3) Calculator 클래스에는 operation() 메서드가 있어 연산 결과를 출력합니다. 
//				Adder와 Subtractor 클래스는 Calculator를 상속받습니다. 두 하위 클래스에서 operation() 메서드를 오버라이드하여 각 연산의 결과를 출력하세요.
		/*Adder c1 = new Adder(5, 2);
		Subtractor c2 = new Subtractor(7, 2);
		
		c1.operation();
		c2.operation();*/
		
//		[1단계:확인] 5. 접근제어자에 대하여 기본 예제와 함께 접근 범위를 기술하세요.
//			1) 아래 구조에 의해 접근제어자에 따른 호출 내용을 처리해 보자.
//		         패키지1 : 참외, 사과, 멜론(참외상속), 바나나, 딸기
//		         패키지2 : 당근, 양파
//		         패키지3 : 수박(참외상속)
//		         패키지1의 참외에 접근제어자 4가지와 호출하는 메서드를 정의하고 각 클래스에서 호출해보세요.
//		[1단계:개념] 6. 다형성이란 무엇인가? 간단한 기본예제를 통해서 설명하세요.
		/*
		 * 1. 공통 멤버를 가진 상위클래스를 상속받은 하위 클래스에서 기능적 분리를 하는
		 * 		메서드를 상위 클래스의 이름 (매개변수)와 동일하게 정의하여 다양한 기능을 처리하는 것
		 * 2. 상위 ==> 여러가지 하위 객체를 통해 다양한 기능을 처리하는 것을 말한다
		 * 
		 *  class Part {
		 * 		void showInf() {
		 * 			System.out.println("컴퓨터의 부품");
		 * 		}
		 * 	}
		 *  class Cpu extends Part {
		 * 		void showInf() {
		 * 			super.showInf();
		 * 			System.out.println("중앙처리장치);
		 * 		}
		 * 	}
		 * 
		 * Part p01 = new Cpu();
		 * p01.showInf();
		 * */
//		[1단계:확인] 7. 아래와 같은 추상 클래스를 만드세요.
//				음식 추상 클래스:
//				Food라는 추상 클래스를 생성하세요.
//				consume라는 추상 메소드를 추가하세요. 이 메소드는 음식을 먹는 행동을 나타내며, "음식이름이 소비되었습니다."와 같은 메시지를 출력하도록 합니다.
//				이 추상 클래스를 상속받아 Pizza, Salad, Burger 클래스를 구현하세요. 각 클래스는 필요한 필드와 생성자, 그리고 consume 메소드를 오버라이드하여 구현하세요.
		/*Food f1 = new Burger(5);
		Food f2 = new Pizza(3);
		Food f3 = new Salad(4);
		
		f1.consume();
		f1.consume();
		f2.consume();
		f3.consume();
		f3.consume();
		f3.consume();*/
		
	}
	
}

abstract class Food {
	abstract void consume();
}
class Pizza extends Food {
	int count;
	
	public Pizza(int count) {
		this.count = count;
	}

	@Override
	void consume() {
		System.out.println("피자가 소비되었습니다");
		count--;
		System.out.println(count + "개 남았습니다");
	}
}
class Salad extends Food {
	int count;
	
	public Salad(int count) {
		this.count = count;
		
	}

	@Override
	void consume() {
		System.out.println("샐러드가 소비되었습니다");
		count--;
		System.out.println(count + "개 남았습니다");
	}
}
class Burger extends Food {
	int count;
	
	public Burger(int count) {
		this.count = count;
	}

	@Override
	void consume() {
		System.out.println("햄버거가 소비되었습니다");
		count--;
		System.out.println(count + "개 남았습니다");
	}
}

class Animal1 {
	void sound() {
		System.out.println("동물이 소리를 냅니다");
	}
}
class Dog1 extends Animal1 {
	@Override
	void sound() {
		super.sound();
		System.out.println("멍멍");
	}
	
}
class Cat1 extends Animal1 {
	@Override
	void sound() {
		super.sound();
		System.out.println("야옹");
	}
	
}

class Shape {
	void area() {
		System.out.println("면적 출력");
	}
}
class Circle extends Shape {
	int a;
	public Circle(int a) {
		this.a = a;
	}
	@Override
	void area() {
		super.area();
		System.out.println("원 면적 : " + a * a * 3.14);
	}
}
class Rectangle extends Shape {
	int a;
	int b;
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	void area() {
		super.area();
		System.out.println("사각형 면적 : " + a * b);
	}
}

class Calculator {
	void operation() {
		System.out.println("연산 결과 출력");
	}
}
class Adder extends Calculator {
	int a;
	int b;
	
	public Adder(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	void operation() {
		super.operation();
		System.out.println(a + b);
	}
}

class Subtractor extends Calculator {
	int a;
	int b;
	
	public Subtractor(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	void operation() {
		super.operation();
		System.out.println(a - b);
	}
}