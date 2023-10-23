package javaexp.a07_inherit;

public class A02_Super {

	public static void main(String[] args) {
		
		/*
		 * # 상속관계에 있어서 super
		 * 
		 * 1. 필드
		 * 		상위에서 선언된 필드를 그대로 사용할 수 있지만 재정의했을 때 상위에 선언된 필드와 하위에 선언된 필드를 구분할 때
		 * 		super를 이용
		 * 		this.필드 : 현재필드
		 * 		super.필드 : 상위 필드
		 * 2. 생성자
		 * 		상속을 하는 순간, 반드시 상위에 선언된 생성자를 호출한다
		 * 		1) default 생성자
		 * 		2) 사용자 정의 생성자
		 * 			- 매개변수가 있는 경우
		 * 			- 매개변수가 없는 경우
		 * 3. 메서드
		 * 		상위에 선언된 메서드와 구분을 위해서 사용
		 * 
		 * */
		/*ElectronCar car = new ElectronCar();
		car.show();*/
		
		EleProduct ep = new EleProduct();
		System.out.println(ep.kind);

		EleProduct2 ep2 = new EleProduct2();
		System.out.println(ep2.kind);
		
		// EleProduct2 ep3 = new EleProduct2("호출"); => 매개변수가 맞는 생성자가 선언되어 있지 않기 때문에 에러 발생
		
		EleProduct4 ep4 = new EleProduct4();
		
		Fruit01 f = new Fruit01();
		
		
	}

}

class Product {
	String kind = "기본 물건";
}

class EleProduct extends Product {
	
}

class Product2 {
	String kind = "기본 물건";
}

class EleProduct2 extends Product2 {
	public EleProduct2() {
		System.out.println("선언된 생성자 내용 호출");
	}
}

class EleProduct3 extends Product2 {
	public EleProduct3() {
		// super() : default 상위클래스 생성자 호출
		System.out.println("선언된 생성자 내용 호출 (default 생성자)");
	}
}

class Product4 {
	Product4() {
		System.out.println("상위 클래스 생성자 호출");
	}
}

class EleProduct4 extends Product4 {
	public EleProduct4() {
		// # 반드시 상위 생성자에 있는 생성자를 호출하여야 한다
		// super() : default 상위클래스 생성자 호출
		System.out.println("선언된 생성자 내용 호출 (default 생성자)");
	}
}

class Product5 {
	Product5(String name) {
		System.out.println("상위 클래스 생성자 호출" + name);
	}
}

class EleProduct5 extends Product5 {
	public EleProduct5() {
		// # 반드시 상위 생성자에 있는 생성자를 호출하여야 한다
		// super() : default 상위클래스 생성자 호출
		super("홍길동");
		System.out.println("선언된 생성자 내용 호출 (default 생성자)");
	}
}

class Vehicle {
	String kind;
	
	public Vehicle(String kind) {
		this.kind = kind;
		
	}
}
class Car extends Vehicle {
	Car () {
		super("자동차");
	}
}

// ex) Product01 클래스에 name으로 필드를 선언하고 초기화하는 생성자 선언하고 Fruit01 클래스로 과일이라는 문자열로 상위 생성자를 호출하여 처리
class Product01 {
	String name;
	
	public Product01(String name) {
		this.name = name;
	}
}
class Fruit01 extends Product01{
	
	public Fruit01() {
		super("과일");
		System.out.println(super.name);
	}
}


// ex) Car (kind, startEngine()), ElectronCar 위 Car상속
//		super키를 활용해서 필드와 메서드를 상위/현재 클래스 호출해서 출력

class Parent {
	String name = "부모님";
	void show() {
		System.out.println("부모클래스의 메서드");
	}
}

class Child extends Parent {
	String name = "자식"; // 상위클래스의 필드 재정의
	void show() {
		super.show();
		System.out.println("자식 클래스의 메서드");
		System.out.println("# 필드 #");
		System.out.println("현재 객체의 필드 : " + this.name);
		System.out.println("부모 객체의 필드 : " + super.name);
	}
}

class Car2 {
	String kind = "벤츠";
	void startEngine() {
		System.out.println(kind + " 엔진 시동 걸었음");
	}
	void show() {
		System.out.println(kind);
	}
}

class ElectronCar extends Car2 {
	String kind = "테슬라";
	
	// 클래스 하위에서 선언해서 호출하여야한다
	// 현재 클래스에 있는 멤버 (구성요소)와 상위 클래스에 있는 내용을 구분하기 위하여 super, this를 사용한다
	void show() {
		super.show();
		super.startEngine();
		System.out.println(kind);
	}
}