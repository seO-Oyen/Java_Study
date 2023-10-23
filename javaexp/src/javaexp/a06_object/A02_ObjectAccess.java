package javaexp.a06_object;

public class A02_ObjectAccess {

	public static void main(String[] args) {
		
		/*
		 * # 클래스를 통해서 만들어지는 객체의 접근제어
		 * 1. 클래스명은 일반 변수와 구문하기 위해서 class 선언시
		 * 		대문자로 시작한다.
		 * 		하나의 파일에 하나의 클래스로 선언하여 외부에서 호출하는 경우가 많다
		 * 2. package 개념
		 * 		1) 모든 클래스는 패키지 단위로 저장된다.
		 * 		2) 그래서 클래스 최상위에 package 패키지명을 
		 * 			선언 해놓는다. ex) package javaexp.a06_object;
		 * 			- 물리적으로는 folder로 선언되어 저장된다.
		 * 		3) 같은 패키지안에 있는 클래스는 따로 선언없이 호출이 가능하다.
		 * 			단, private 접근제어자가 아닐때
		 * 		4) 하지만 다른 패키지에 있는 클래스는 
		 * 			- 접근제어자 class 클래스명
		 * 			클래스명 선언 가장 압에있는 접근제어자가 반드시 public 이어야 하고
		 * 			- 사용하고자 하는/호출하는 클래스에서 import로 선언하여야한다.
		 * 			- 그리고, 해당 클래스에 구성요소도 public 이상의 접근제어자 일 때 
		 * 				객체 생성과 호출이 가능하다.
		 * */
		
		// 같은 패키지에 있을 때 객체 선언
		Puppy p01; // class 에 선언시 접근 제어자 확인
		p01 = new Puppy(); // class 에 포함된 생성자에 따라 확인
		
		// 필드 할당
		p01.kind = "포메리안";
		p01.name = "멍멍이1";
		
		// ex) a06 패키지 안에 Book 클래스를 선언하고 public으로 title, 접근제어자 붙지 않고 price를 설정하여
		// 		A02 의 main()에서 호출해서 필드를 사용해보고
		//   	inner 안에 callObject 에서 호출해서 사용
		
		Book b1 = new Book();
		b1.title = "자바";
		b1.price = 1000;
		
		Book b2 = new Book();
		b2.title = "기초";
		b2.price = 2000;
		
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b2.title);
		System.out.println(b2.price);
		
		// class 선언 접근 호출
		Baby baby;
		
		/*
		 * class 접근제어자
		 * 1단계 class 선언
		 * 2단계 각 구성요소별로 접근 제어자가 범위에 적절하게 있어야한다.
		 * 		생성자
		 * 		필드
		 * 		메서드
		 * */
		

	}

}
