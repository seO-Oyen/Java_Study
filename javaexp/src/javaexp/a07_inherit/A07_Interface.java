package javaexp.a07_inherit;

public class A07_Interface {

	public static void main(String[] args) {
		
		/*
		 * # 인터페이스
		 * 
		 * - 인터페이스란?
		 * 		1) 개발 코드와 객체가 서로 
		 * 
		 * - 인터페이스의 활용
		 * 		1) 인터페이스의 이름  - 자바 식별자 작성 규칙에 의해 대문자 시작으로 작성
		 * 		2) 소스 파일 또는 클래스 하위에서 생성
		 * 		3) 선언 : 접근제어자 interface 인터페이스명 {}
		 * 		4) 구성요소
		 * 			- 상수 : 인터페이스에 선언된 모든 변수는 기본적으로 상수ㄴ이다.
		 * 			- 메서드 : 인터페이스는 재정의 메서드가 기본적으로 추상메서드로 붙는다
		 * 			- 기타 : default 메서드, 정적메소드 지원
		 * - 인터페이스의 특징
		 * 		- 인터페이스는 extends 를 통해 부모를 여러개 상속받아서 사용할 수 있다.
		 * 		- 인터페이스를 상속받은 실제클래스는 여러개의 인터페이스를 선언하여 사용할 수 있다.
		 * 		
		 * */
		FlyWay f01 = new Wing01();
//		f01.flyway();

		RuberDuckSwim ruber= new RuberDuckSwim();
//		ruber.swim();
		
		Mz m1 = new Mz();
		m1.attack();
		m1.flying();
		m1.setFlyWay(new Wing01());
		m1.flying();
		m1.setFlyWay(new Wing03());
		m1.flying();
		
		Duck duck = new Duck();
		duck.addSwimFun(new NormalDuck());
		duck.showSwimming();
		duck.addSwimFun(new RuberDuckSwim());
		duck.showSwimming();
		
	}

}

class Mz {
	private FlyWay flyWay;
	private String name;
	public Mz() {
		name = "MZ로봇";
	}
	
	public void attack() {
		System.out.println(name + "가 공격을 하며 지구를 지킵니다.");
	}
	
	// 날개를 장착하는 메서드
	public void setFlyWay(FlyWay flyWay) {
		this.flyWay = flyWay;
		System.out.println(name + "가 날개를 장착함");
	}
	
	public void flying() {
		System.out.println(name + "은 ");
		if (flyWay != null) {
			flyWay.fly();
		} else {
			System.out.println("날개가 없어서 뛰어다님");
		}
	}
}

interface FlyWay {
	String NAME = "날개 인터페이스";
	void fly();
	
}

class Wing01 implements FlyWay {
	@Override
	public void fly() {
		System.out.println("날개 1호로 우리 동네를 날다");
	}
	
}
class Wing02 implements FlyWay {
	@Override
	public void fly() {
		System.out.println(NAME + "날개 2호로 우리 나라 창공를 날다");
	}
}

class Wing03 implements FlyWay {

	@Override
	public void fly() {
		System.out.println("날개 3호로 세계를 날다");
		
	}
	
}

interface SwimmingWay{
	void swim();
}
class RuberDuckSwim implements SwimmingWay {

	@Override
	public void swim() {

		System.out.println("고무장난감 요리가 목욕탕에서 수영을 하다");
	}

}
class NormalDuck implements SwimmingWay {
	String NAME = "[수영인터페이스]";

	@Override
	public void swim() {

		System.out.println("일반 오리가 호주에서 수영을 하다");
	}

}
class Duck {
	private SwimmingWay swimmingWay;
	
	public void addSwimFun(SwimmingWay swimmingWay) {
		this.swimmingWay = swimmingWay;
	}
	public void showSwimming() {
		swimmingWay.swim();
	}
	
}