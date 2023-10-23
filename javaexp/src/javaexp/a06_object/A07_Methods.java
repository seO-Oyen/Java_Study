package javaexp.a06_object;

import java.util.Iterator;
import java.util.Scanner;

// 0921 # 객체의 기능메서드의 각 기능별로 복합처리
public class A07_Methods {

	public static void main(String[] args) {
		
		
		/*MethodsExp01 exp01 = new MethodsExp01();
		int plusTotal = exp01.plus(10, 20);
		System.out.println("결과값 1 : " + plusTotal);
		System.out.println("결과값 2 : " + exp01.minus(20, 5));*/
		
		MethodsExp02 exp02 = new MethodsExp02();
		System.out.println(exp02.total(2000, 4));
		System.out.println(exp02.hit(5, 3));
		System.out.println(exp02.avg(5, 4));
		System.out.println(exp02.bigNum(3, 4));
		System.out.println(exp02.size(3));
		exp02.getGugu(3);
		exp02.getTriangle(3, 5);
		
		System.out.println("임의의 점수 (1 ~ 100) : " + exp02.getRandomPoint());
		
		if (exp02.isScoreOver()) {
			System.out.println("A학점");
		} else {
			System.out.println("A학점이 아님");
		}

	}

}

// 매개변수 입력 + 프로세스(X) + 리턴처리
class MethodsExp01 {
	int plus (int num01, int num02) {
		System.out.println("덧셈 처리 메서드");
		return num01 + num02;
	}
	int minus (int num01, int num02) {
		System.out.println("뺄셈 처리 메서드");
		return num01 - num02;
	}
}

// ex) class MethodsExp02 선언하고 
class MethodsExp02 {
	
	// ex) Scanner로 점수를 입력받아서 A학점여부(90점 이상)를
	//	 	boolean으로 리턴되게하세요
	boolean isScoreOver () {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		return scan.nextInt() >= 90;
	}
	
	// 매개변수 입력 + 프로세스(저장/로직처리) + 리턴값(X)
	public int getRandomPoint() {
		int point = (int)(Math.random() * 101);
		return point;
	}
	
	// 입력받은 값을 기준으로 출력 처리하고 리턴값이 없는 경우
	void getGugu(int grade) {
		System.out.println("# " + grade + "단 #");
		for (int i = 1; i <= 9; i++) {
			System.out.println(grade + " X " + i + " = " + (grade * i));
		}
	}
	
	// ex) 삼각형의 밑변과 높이를 입력받아 입력된 정보와 넓이를 출력하는 메서드를 선언하고
	//	   호출하세요 (리턴값 없음
	void getTriangle (int weidth, int height) {
		System.out.println("입력 된 정보");
		System.out.println("밑변 : " + weidth);
		System.out.println("높이 : " + height);
		System.out.println("넓이 : " + weidth * height / 2.0);
	}
	
	
	// 물건 가격과 물건갯수를 입력받아서 총계를 처리하는 메서드
	int total (int price, int count) {
		return price * count;
	}
	
	// 타율을 리턴
	double hit (int ballCount, int hit) {
		
		return (double)hit / ballCount;
	}
	
	// 두수의 평균 계산
	double avg (int num01, int num02) {
		return (num01 + num02) / 2.0;
	}
	
	// 두수 중 큰 수 반환 but 동일하면 0
	int bigNum (int num01, int num02) {
		if (num01 > num02) {
			return num01;
		} else if (num02 > num01){
			return num02;
		} else {
			return 0;
		}
	}
	
	// 원 면적 계산
	double size (int r) {
		return r * r * 3.14;
	}
}