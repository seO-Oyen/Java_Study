package javaexp.a06_object;

public class A04_Constructor {

	public static void main(String[] args) {
		
		/*
		 * # 생성자
		 * 1. 객체를 생성할 때, 클래스명과 동일한 함수명으로 선언하는 것을 생성자라고 함
		 * 2. 주요기능
		 * 		1) 객체를 생성할 때 사용
		 * 		2) 일반적으로 필드를 초기화할 때 사용
		 * 			클래스에서 선언된 필드값에 데이터를 할당하여, 초기값을 설정할 필요가 있을 때 사용
		 * 			ex) public Baby (String name) {
		 * 					this.name = name;
		 * 				}
		 * 				Baby b1 = new Baby("귀염아기");
		 * 3. 형태
		 * 		1) 기본 생성자
		 * 			클래스를 선언할 때, 생성자를 선언하지 않으면 컴파일시 자동으로 public 클래스명(){} 생성자가
		 * 			생성되어 사용할 수 있다. 
		 * 		2) 기본 생성자는 사용자 정의 생성자를 선언하는 순간 사라져서 컴파일시도 자동으로 추가되지 않는다.
		 * 		3) 주가 선언하는 생성자 
		 * 			생성자는 기본 생성자와 같이 매개변수가 없는 생성자를 비롯하여 매개변수 오버로딩 규칙으로
		 * 			여러 생성자를 선언할 수 있다.
		 * 		4) 생성자의 매개변수는 일반적으로 필드를 초기화하는 경우가 많아서 동일한 경우가 많다.
		 * 			이때 매개변수와 필드를 구분하기 위하여 this.필드명 = 매개변수명; 으로 
		 * 			this를 이용한다.
		 * */
		
		// 1. 객체생성
		/*Mouse m01 = new Mouse();
		Mouse m02 = new Mouse("로지텍", 20000);
		
		// 필드 초기화 객체 생성
		System.out.println(m02.company);
		System.out.println(m02.price);*/
		
		// ex) Product 물건 / 가격 / 갯수를 필드로 선언하고, 생성자를 통해서 할당하게끔 처리하고
		//		객체를 생성(초기화)하고 필드를 출력하세요
		/*Product product = new Product("사과", 2000, 3);
		
		System.out.println("물건명 : " + product.name);
		System.out.println("가격 : " + product.price);
		System.out.println("갯수 : " + product.count);
		
		Product product1 = new Product("바나나", 4000, 5);
		
		System.out.println("물건명 : " + product1.name);
		System.out.println("가격 : " + product1.price);
		System.out.println("갯수 : " + product1.count);*/
		
		// 생성자가 선언하지 않을 때는 default 생성자가 컴파일 시 자동 생성되어 사용할 수 있다.
		/*Dog d1 = new Dog();
		
		// default 생성자는 선언된 생성자가 있으면 사라진다.
		//		Room r1 = new Room();
		Room r2 = new Room("우리방");*/

	}

}

class Phone {
	String company;
	int price;
	
	// 생성자 오버로딩 규칙
	// 1. 매개변수의 갯수가 다르면 선언이 가능하다.
	// 2. 매개변수의 갯수가 같더라도 타입이 다르면 가능하다.
	// 3. 매개변수의 갯수가 같고, 타입도 같더라도 타입의 순서를 다르게 하면 선언 가능하다.
	Phone() {
		
	}
	
	Phone(String company) {
		this.company = company;
	}
	
	Phone(String company, int price) {
		this.company = company;
		this.price = price;
	}
	
	Phone(int price, String company) {
		this.company = company;
		this.price = price;
	}
}

/*class Mouse {
	String company;
	int price;
	Mouse() {}
	Mouse (String company, int price) {
		this.company = company;
		this.price = price;
	}
}*/

/*class Product {
	String name;
	int price;
	int count;
	
	Product(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
}*/

/*class Dog {
	// public Dog() {}
}

class Room {
	public Room(String name) {
		
	}
}*/





