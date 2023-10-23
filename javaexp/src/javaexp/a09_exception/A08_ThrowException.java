package javaexp.a09_exception;

public class A08_ThrowException {

	public static void main(String[] args) {

		/*
		 * # throw : 특정한 조건이나 코드에서 강제 예외처리
		 * 
		 * 1. 기본코드
		 * 		throw new 강제 예외 exception(); 호출
		 * */

		System.out.println("# 강제 예외 처리 #");

		try {
			for (int i = 1; i <= 10; i++) {
				if (i == 5) {
					throw new Exception(i + " 강제 예외입니다.");
				}
			}

		} catch (Exception e) {
			System.out.println("강제 예외 처리 결과 : " + e.getMessage());
		}
		for (int i = 1; i <= 10; i++) {
			try {

				System.out.println(i + "번째 돌고있음");
				if (i % 2 == 0) {
					throw new NullPointerException(i + "는 짝수 NPE 직행");
				}
			} catch (NullPointerException e) {
				System.out.println("강제 예외 처리결과 : " + e.getMessage());
			}
		}

	}

}
