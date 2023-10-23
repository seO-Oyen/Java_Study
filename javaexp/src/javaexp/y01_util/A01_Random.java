package javaexp.y01_util;

public class A01_Random {

	public static void main(String[] args) {
		
		/*
		 * # 여러가지 임의의 수를 처리하는 Math.random()
		 * 1. Math는 기본 내장 패키지 java.util 하위에 있는 클래스로 여러가지 수학적인처리를 한다.
		 * 2. 이 클래스 하위에는 객체생성없이 바로 사용할 수 있는 메서드들이 있다.
		 * 3. Math.floor() : 내림, Math.round() : 반올림, Math ceil() : 올림
		 *    으로 원하는 결과값을 처리할 수 있다. 
		 * 4. 이 중에서 Math.random() 메서드가 있는데 이것은 실수 범위로 0.0 < = Math.random() < 1.0 사이로 임의의 수를
		 *    실행 시 마다 가져오게 처리한다.
		 * 5. 이것을 type casting 과 함께 이용하면 여러가지 임의의 숫자 처리를 할 수 있다.
		 * 
		 * (* 10) : 경우의 수
		 * (+ 1) : 시작 수
		 * 
		 * (int)(Math.random() * `경우의 수` + `시작 수`)
		 * ex ) 1 ~ 6
		 * (int)(Math.random() * 6 + 1)
		 * */
		
		/*double r = Math.random();
		System.out.println("기본 범위 : " + r);
		System.out.println("*10 범위 : " + r * 10);
		System.out.println("정수형으로 절삭 : " + (int)(r * 10));
		
		int dice = (int)(Math.random() * 6 + 1);
		System.out.println(dice);*/
		
		// ex) 1 / 2 임의로 나오게 하기
		// ex) 0 ~ 100 사이로 임의로 나오게 하기
		// ex) 1 ~ 3 (가위 / 바위 / 보) 임의로 나오게 하기
		
		int num01 = (int)(Math.random() * 2 + 1);
		int num02 = (int)(Math.random() * 101);
		int num03 = (int)(Math.random() * 3 + 1);
		
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);

	}

}
