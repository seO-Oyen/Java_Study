package javaexp.a04_process;

import java.util.Iterator;

public class A01_If {

	public static void main(String[] args) {
		
		/*int no = 0;
		System.out.println("순차 구조 처리 : " + ++no);
		if (no % 2 == 0) System.out.println("짝수 수행");
		System.out.println("순차 구조 처리 : " + ++no);
		if (no % 2 == 0) System.out.println("짝수 수행");
		System.out.println("순차 구조 처리 : " + ++no);
		if (no % 2 == 0) System.out.println("짝수 수행");
		System.out.println("순차 구조 처리 : " + ++no);
		if (no % 2 == 0) System.out.println("짝수 수행");
		System.out.println("순차 구조 처리 : " + ++no);
		if (no % 2 == 0) System.out.println("짝수 수행");
		System.out.println("순차 구조 처리 : " + ++no);
		if (no % 2 == 0) System.out.println("짝수 수행");*/
		
		// ex) int cnt = 1; @@번째 안녕하세요를 출력하되, 3의 배수인 경우에 짝!! 3의 배수입니다 라고 출력되게 조건문 처리하세요
		
		/*for (int i = 1; i < 100; i++) {
			System.out.println(i + "번째 안녕하세요");
			if (i % 3 == 0) System.out.println("짝!!! 3의 배수입니다. : " +i);
		}*/
		
		
		/*int cnt = 0;
		
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");
		System.out.println(++cnt + "번째 안녕하세요");
		if (cnt % 3 == 0) System.out.println("짝!!! 3의 배수입니다.");*/
		
		
		// 여러 라인에 걸쳐 조건문 처리
		
		int cnt = 6;
		
		if (cnt > 5) {
			System.out.println("# 현재 데이터가 5초과할 때 #");
			System.out.println("현재 번호 : " + cnt);
			System.out.println("해당 조건 구문이 여러라인에 걸쳐 수행");
			System.out.println("{} : 중괄호 범위에 있을 때");
		}
		
		
		
	}

}
