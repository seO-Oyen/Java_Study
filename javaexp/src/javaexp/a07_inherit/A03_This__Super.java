package javaexp.a07_inherit;

public class A03_This__Super {

	public static void main(String[] args) {
		
		/*
		 * # this() 생성자
		 * 
		 * 1. 현재 클래스에서 정의된 생성자 호출
		 * 2. 현재 재정의된 생성자를 호출할 때 사용
		 * 3. 현재 클래스와 상위 클래스의 생성자와 구분할 때도 사용
		 * */
		
		Fruit fruit = new Fruit(1000);
		

	}

}

class Person {
	String name;
	int age;
	String loc;
	
	Person() {
		name = "이름없음";
		loc = "지역없음";
	}
	
	Person(String name) {
		this(); // 현재 정의된 생성자 중에 매개변수가 없는 생성자 호출
		this.name = name;
	}
	
	Person(String name, int age) {
		this(name);
		this.age = age;
	}
	
	Person(String name, int age, String loc) {
		this(name, age);
		this.loc = loc;
	}
} 

class Man extends Person {
	
	public Man (String name) {
		// 상위의 여러개의 생성자 중에 추가하여 선택적으로 호출할 수 있다
		// 매개변수가 있는 생성자를 명시적으로 호출하여 사용한다.
		super(name);
	}
	
	public Man (String name, int age) {
		//this(name);
		super(name, age); // => 에러
		// super, this 생성자 호출 첫라인에서만 사용해야한다
	}
}

class Product3 {
	String name;
	int price;
	int cnt;
	
	public Product3() {
		name = "없음";
		cnt = 1;
	}
	
	public Product3(String name) {
		this();
		this.name = name;
	}
	
	public Product3(String name, int price) {
		this(name);
		price = price;
		cnt = 1;
	}
	
	public Product3(String name, int price, int cnt) {
		this(name, price);
		this.cnt = cnt;
	}
}

class Fruit extends Product3 {
	Fruit(int price) {
		super("과일", price);
	}
	
	Fruit(String name, int price, int cnt) {
		super(name, price, cnt);
	}
}