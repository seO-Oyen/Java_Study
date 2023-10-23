package javaexp.a06_object;

import java.util.Scanner;

// 0921 # 메서드
public class A06_Method {

	public static void main(String[] args) {
		
		/*ReturnExp re = new ReturnExp();
		re.call(); // 출력이나 외부에 입력만 할 때 사용
		
		int reNum = re.call01();
		System.out.println("리턴된 값을 변수에 할당 : " + reNum);
		System.out.println(re.call01() + 25);
		
		String reStr = re.call02();
		System.out.println("리턴된 문자열 : " + reStr);
		System.out.println(re.call02() + " 문자열 추가");*/
		
		// ex) class ReturnExp02로 선언하여 정수, 실수, 문자열, boolean 리턴값을 메서드로 선언
		//		main()에서 호출하여 출력하세요
		ReturnExp02 returnExp02 = new ReturnExp02();
		System.out.println("정수 리턴 : " + returnExp02.returnInt());
		System.out.println("실수 리턴 : " + returnExp02.returnDouble());
		System.out.println("문자열 리턴 : " + returnExp02.returnString());
		System.out.println("boolean 리턴 : " + returnExp02.returnBoolean());
	}

}

class ReturnExp {
	void call () {
		System.out.println("리턴값이 없음");
	}
	
	// int num01 = 5;
	int call01() {
		return 5;
	}
	
	// String st = "안녕하세요";
	String call02() {
		return "안녕하세요";
	}
}

class ReturnExp02 {
	int returnInt() {
		return 10;
	}
	
	double returnDouble() {
		double num01 = 3.15;
		return num01;
	}
	
	String returnString() {
		Scanner scan = new Scanner(System.in);
		System.out.print("리턴할 문자열 입력 : ");
		return scan.nextLine();
	}
	
	boolean returnBoolean() {
		int num = (int)(Math.random() * 101);
		System.out.println("점수 : " + num);
		
		return num >= 60;
	}
}
