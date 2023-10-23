package javaexp.a04_process;

import java.util.Iterator;

public class A05_For {

	public static void main(String[] args) {
		
		for (int cnt = 1; cnt <= 10; cnt++) {
			System.out.println("카운트 업 : " + cnt);
		}
		
		for (int cnt = 10; cnt >= 0; cnt--) {
			System.out.println("카운트 다운 : " + cnt);
		}
		
		// 100 ~ 150
		for (int cnt = 100; cnt <= 150; cnt += 5) {
			System.out.println("카운트 +5씩 " + cnt);
		}
		
		// 50 ~ 30
		for (int cnt = 50; cnt >= 30; cnt -= 3) {
			System.out.println("카운트 -3씩 " + cnt);
		}
		
		// ex) 2부터 15까지 짝수로 증가
		for (int i = 2; i <= 15; i += 2) {
			System.out.println("짝수로 증가 : " + i);
		}
		
		// ex) 9부터 2까지 홀수로 감소
		for (int i = 9; i >= 2; i -= 2) {
			System.out.println("홀수로 감소 : " + i);
		}
		
		// ex) 구구단 3단에 1 ~ 9까지 곱셈결과 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("구구단 3 * " + i + " = " + (3 * i));
		}

	}

}
