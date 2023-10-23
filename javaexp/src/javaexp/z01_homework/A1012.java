package javaexp.z01_homework;

public class A1012 {

	public static void main(String[] args) {
		
//		[1단계:개념] 1. 추상클래스와 일반클래스의 재정의 차이점을 예제를 통해 기술하세요
		/*
		 * 추상클래스 : 추상메서드가 있는 클래스
		 * 				추상 메서드는 기능을 하지 않는다.
		 * 일반클래스 : 일반적인 클래스
		 * 
		 * 추상클래스
		 * abstract class A {
		 * 		abstract void ex();
		 * }
		 * 
		 * 일반 메서드
		 * class A {
		 * 		void ex() {
		 * 			System.out.println("일반클래스는 로직이 필요");
		 * 		}
		 * }
		 * 
		 * */
//		[1단계:개념] 2. Food를 추상클래스로 선언하고, name(음식종류), eat()공통메서드 @@을 먹다, taste()추상메서드로 다양한 맛을 출력
//				좋아하는음식 3가지를 실제클래스를 선언하여 출력하세요.
		/*Apple apple = new Apple();
		apple.eat();
		apple.taste();
		
		Banana banana = new Banana();
		banana.eat();
		banana.taste();
		
		Strawberry strawberry = new Strawberry();
		strawberry.eat();
		strawberry.taste();*/
//		[1단계:개념] 3. 인터페이스의 구성요소의 특징을 예제와 함께 선언하세요
		/*
		 * 인터페이스는 오직 추상 메소드와 상수만 포함할 수 있다.
		 * 인터페이스를 통해 다중상속을 지원한다
		 * - 구성요소
		 * 		1. 상수 필드
		 * 		2. 추상메서드 
		 * 		3. 일반 메서드
		 * 		4. 정적 메서드
		 * 		5. private 메서드
		 * => abstract 를 붙이지 않더라도 컴파일시 자동으로 생성
		 * 
		 * interface A {
		 * 		void test();
		 * }
		 * */
//		[1단계:확인] 4. FishingWay goFishing() 인터페이스를 선언하여, 상속받은 실제클래스를 2개를 선언하고, 
//				실제클래스 Fisher에 이름과 인터페이스 FishingWay를 선언하고
//				addFishingSkill() 할당하게 하면  해당 어부가 낙시하는 goFishing()메서드를 호출하여 처리하세요.
		/*Fisher fisher = new Fisher();
		fisher.addFishingSkill(new Salmon());
		fisher.goFishing();*/
//				# 조별로 파악사항(아래사항 조별로 취합 전달 17:20까지 전달)
//				1. 오늘 가장 어려웠던 부분 best3 및 내일 자세한 설명 필요한 부분
//				2. 오늘 지각(9:00기준)/수업시간 엄수(매시간:00) 인원과 사유
//				3. 수업 시간 집중하였는가?
//		        4. 내일 프로젝트 주제(사이트 확인)/코드연습병행여부 전달.

	}

}

interface FishingWay {
	void goFishing();
}

class Salmon implements FishingWay {
	@Override
	public void goFishing() {
		System.out.println("연어를 잡으러 갑니다");
	}
}

class Fisher {
	FishingWay fishingWay;
	void addFishingSkill(FishingWay fishingWay) {
		this.fishingWay = fishingWay;
	}
	void goFishing() {
		fishingWay.goFishing();
	}
}

abstract class Food1 {
	abstract void eat();
	abstract void taste();
}
class Apple extends Food1 {
	private String name;

	public Apple() {
		this.name = "사과";
	}

	@Override
	void eat() {
		System.out.println(name + "를 먹습니다.");
	}

	@Override
	void taste() {
		System.out.println(name + "는 달고 맛있습니다.");
	}
	
}
class Banana extends Food1 {
	private String name;

	public Banana() {
		name = "바나나";
	}

	@Override
	void eat() {
		System.out.println(name + "를 먹습니다.");
	}

	@Override
	void taste() {
		System.out.println(name + "는 달고 맛있습니다.");
	}
	
}
class Strawberry extends Food1 {
	private String name;

	public Strawberry() {
		name = "딸기";
	}

	@Override
	void eat() {
		System.out.println(name + "를 먹습니다.");
	}

	@Override
	void taste() {
		System.out.println(name + "는 살짝 시큼하지만 맛있습니다.");
	}
	
}
