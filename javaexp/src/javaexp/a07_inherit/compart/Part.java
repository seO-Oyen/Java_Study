package javaexp.a07_inherit.compart;

public class Part {
	// 공통으로 `컴퓨터 부품입니다.` 출력
	// 하위에 재정의할 기능 처리 `@@ 기능을 가지고 있습니다.`
	// Cpu, Ram, Ssd 클래스 생성 재정의 메서드 처리

	public void showInfo() {
		System.out.println("컴퓨터 부품입니다.");
	}
	
	// 재정의한 기능 : 
	// ex) 추상메서드 정의 ==> 추상클래스 선언
	// 메인에서 에러나지 않게 처리
	public void showFunc() {
		System.out.println("기능을 가지고 있습니다.");
	}
	
}
