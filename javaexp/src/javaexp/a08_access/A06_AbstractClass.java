package javaexp.a08_access;

import java.util.ArrayList;

public class A06_AbstractClass {

	public static void main(String[] args) {
		
		/*
		 * # 추상 클래스 (Abstract Class)
		 * 
		 * 1. 추상 : 실체들 간에 공통되는 특성을 추출한 것을 말한다.
		 * 		삼성, 현대, LG ==> 회사
		 * 		새, 곤충, 물고기 ==> 동물
		 * 2. 추상클래스 
		 * 		실체 클래스들의 공통되는 필드와 공통 메서드 정의한 클래스
		 * 		추상적인 메서드를 선언하고 하위 클래스에서 이 메서드를 반드시 재정의하게 한 것을 말한다.
		 * 		==> 추상 메서드가 하나라도 있으면 추상 클래스가 된다.
		 * 		공통내용(공통기능 메서드) + 개별적으로 다른 기능 처리 (추상 메서드)
		 * 3. 특징
		 * 		1) 일반 클래스와 거의 유사하고, 추상 메서드 있다.
		 * 		2) 추상 메서드는 하위에서 반드시 재정의해야하는 부분 (다형성처리 필요)
		 * 			- 하위 클래스에서 추상메서드 강제화 (컴파일 에러 발생)
		 * 		3) 추상 클래스는 단독으로 객체 생성을 하지 못한다. 
		 * 			추상클래스 = new 상속받은 실제객체(); 로만 객체 생성
		 * 4. 단계별 진행 내용
		 * 		1) 1단계
		 * 			1) 추상클래스 선언 : 재정의할 추상 메서드 선언
		 * 			2) 위 추상클래스를 통해 상속받을 하위 실제 클래스
		 * 			3) 추상 클래스 = 하위 클래스(다형성)
		 * 			   참조변수.재정의메서드();
		 * */
		
		// 상위 = 하위
		Polygon p01 = new Triangle();
		p01.drawing();
		Polygon p02 = new Quadrangle();
		p02.drawing();
		
		// ex) Computer usingApp(); 추상메서드 선언
		//		상속받은 Mac, SamsungPc, LgPc
		Computer c01 = new Mac();
		Computer c02 = new SamsungPc();
		Computer c03 = new LgPc();
		
		c01.usingApp();
		c02.usingApp();
		c03.usingApp();
		
		ArrayList<Computer> comList = new ArrayList<Computer>();
		comList.add(new Mac());
		comList.add(new SamsungPc());
		comList.add(new LgPc());

		comList.get(0).usingApp();
		comList.get(1).usingApp();
		comList.get(2).usingApp();

	}

}

abstract class Computer {
	abstract void usingApp();
}

class Mac extends Computer {
	@Override
	void usingApp() {
		System.out.println("맥을 사용");
	}
}

class SamsungPc extends Computer {
	@Override
	void usingApp() {
		System.out.println("삼성 노트북을 사용");
	}
}

class LgPc extends Computer {
	@Override
	void usingApp() {
		System.out.println("LG 노트북을 사용");
	}
}

abstract class Polygon {
	// 추상 메서드
	abstract void drawing();
	
	// 실제 메서드(공통된 메서드)
	void painting() {
		System.out.println("색칠하다");
	}
}

class Triangle extends Polygon {
	@Override
	void drawing() {
		System.out.println("삼각형을 그리다");
	}
}

class Quadrangle extends Polygon {
	@Override
	void drawing() {
		System.out.println("사각형을 그리다");
	}
}