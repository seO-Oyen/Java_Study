package javaexp.a10_api;

import java.util.Random;

public class A07_MathClass {

	public static void main(String[] args) {
		
		/*
		 * # Math 클래스
		 * 
		 * 1. 자바에서 연산이나 기본적인 데이터를 처리할 때 복잡한 로직으로 처리해야하는 경우가 있다.
		 * 		(최대값, 최소값, 올림/반올림 등) 수학적인 계산과 형변환
		 * 2. 이러한 부분을 보다 간단하게 메서드를 통해서 지원하는 것이 Math 클래스이다
		 * 3. Math 클래스의 기능 메서드는 static 이라서 객체 생성없이 Math.XXX() 형식으로 바로 사용할 수 있다.
		 * */
		
		/*System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.abs(-5) : " + Math.abs(-5));
		System.out.println("Math.abs(5) : " + Math.abs(5));
		System.out.println("Math.ceil(5.2) : " + Math.ceil(5.2));
		System.out.println("Math.round(5.25) : " + Math.round(5.25));
		System.out.println("Math.floor(5.9) : " + Math.floor(5.9));
		System.out.println("Math.max(3, 2) : " + Math.max(3, 2));
		System.out.println("Math.min(4, 7) : " + Math.min(4, 7));
		
		Random r = new Random();
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt(5));
		System.out.println(r.nextDouble(10));*/
		int a1 = (int)(Math.random() * 10 + 1);
		int a2 = (int)(Math.random() * 10 + 1);
		System.out.println("a1 : " + a1 + ", a2 : " + a2);
		System.out.println(Math.max(a1, a2));

	}

}
