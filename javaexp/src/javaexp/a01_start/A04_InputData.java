package javaexp.a01_start;

public class A04_InputData {

	public static void main(String[] args) {

		/*
		 * # 자바의 데이터 입력 처리
		 * 1. String[] args 을 활용하는 방법
		 * 		1) java를 컴파일 하는 과정을 거치면 @@@.class 파일이 생성된다.
		 * 			ex) javac @@@.java
		 * 				==> @@@.class
		 * 			ex) java @@@ main() 가 있으면 실행이 된다.
		 * 
		 * 		2) 이 컴파일과정을 거친 @@@.class는 java @@@로 실행된다.
		 * 
		 * 		3) 이때 java @@@ 사과 바나나 딸기 형식으로 실행하면 String[] args 안에
		 * 		   {"사과", "바나나", "딸기"} 로 할당되어
		 * 		   args[0] : 배열명[index 번호] 형태로 사용할 수 있게 된다.
		 * 
		 * 		4) eclipse 에서는 이런 내용을 처리하기 위해서 실행 옵션에 arugument 가 있고,
		 * 		   그 옵션에 사과 바나나 딸기 입력하면 위와 같이 데이터 처리가 가능하다.
		 * 
		 * 2. Scanner scan = new Scanner(System.in)을 활용하여 Console에 입력된 데이터를 처리하는 방법
		 * */
		
		// 1번 방법
//		System.out.println("입력데이터 : ");
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
		// ex 1) 짜장면 / 짬뽕을 입력받아서 출력하세요.
		System.out.println(args[0]);
		System.out.println(args[1]);
	
		
	}

}
