package javaexp.a09_exception;

import java.io.IOException;

public class A07_throws {
	
	static void call01() throws ClassNotFoundException {
		System.out.println("메서드 1");
		System.out.println("aaa.bbb.ccc");
	}
	
	static void call03() throws IOException{
		System.out.println(System.in.read());
	}

	public static void main(String[] args) {
		
		/*
		 * # 예외 위임
		 * 
		 * 1. 메서드 별로 예외를 위임해서 한꺼번에 호출하는 곳에서 처리하는 것을 말한다.
		 * 2. 기본형식
		 * 		void 메서드명() throws 위임할 클래스 {
		 * 			예외가 나올만한 코드
		 * 		}
		 * 	
		 * 		호출하는 곳
		 * 		try {
		 * 			메서드명();
		 * 		} catch (위임할 클래스 e)
		 * 		}
		 * */

		try {
			call01();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			call03();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
