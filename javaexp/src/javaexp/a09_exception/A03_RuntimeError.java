package javaexp.a09_exception;

public class A03_RuntimeError {

	public static void main(String[] args) {
		/*
		 * # 예외와 예외 클래스
		 * 
		 * 1. 프로그래밍을 하면, 에러나 여러가지 오류로 인하여 처리 문제가 발생하는 경우가 있다.
		 * 		이러한 문제는 프로그램에 대한 신뢰성에 치명적으로 영향을 미치기에 보다 효과적인 대응하는 것이 필요하다.
		 * 2. 자바는 이러한 프로그래밍의 에러나 예외적인 상황에 대응하기 위하여 예외처리 코드를 api로 지원하고 있다.
		 * 		Exception(내장된 내용) : 만들어진 것을 활용
		 * 		try {
		 * 			// 예외가 나올만한 코드
		 * 		} catch(예외처리 클래스) {
		 * 		}
		 * 3. 오류의 종류 
		 * 		1) 에러를 처리하려면 우선 자바에서 발생하는 오류의 종류를 알고, 해당 사항에 대한 적절한 오류 처리 방법을 
		 * 			코드로 구현하여야 한다.
		 * 		2) 오류는 크게 2가지로 나뉜다.
		 * 			- 에러
		 * 				> 하드웨어의 잘못된 동작 또는 고장으로 인한 오류 에러가 발생되면 프로그램 종료
		 * 					정상 실행상태로 돌아갈 수 없음
		 * 			- 예외
		 * 				> 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류
		 * 					예외가 발생되면 프로그램 종ㄹ요된다.
		 * 					예외처리를 추가하면 정상 실행 상태로 돌아갈 수 없음
		 * 		3) 프로그래밍 처리 방법으로 인한 구분
		 * 			- 일반 (컴파일 체크 예외)
		 * 				> 예외 처리 코드 없으면 컴파일 오류 발생하는 것으로 보통 컴파일도 안되기에 툴에서는 왼쪽에 빨간색으로 표기
		 * 				> 필수 예외처리가 필요한 것으로 IO 처리되는 것과 메모리가 로딩되는 것등이 주로 이 예외처리 에러이다.
		 * 			- 실행 (런타임 에러) 예외
		 * 				> 예외 처리 코드를 생략하더라도 컴파일이 되는 예외로 경험에 따라 예외처리 코드 작성이 필요하다
		 * 				> 실행 후, 실행되어 처리되는 데이터에 대한 예외를 발생하는 경우 heap메모리 호출에러, 배열에러, 0 나누기등
		 * 					프로그램에서 흔하게 발생하는 에러처리이다.
		 * 4. 단계별 예외처리 형식
		 * 		1) 기본형식
		 * 			try {
		 * 				예외가 나올만한 코드
		 * 			} catch (Exception e) {
		 * 				Exception 상속관계의 상위이기에 하위 모든 예외를 받음
		 * 			}
		 * 		2) 계층적 처리
		 * 			try {
		 * 			} catch (최하위 예외 클래스) {
		 * 				메모리가 가장작고 좁은 범위의 최하위 예외에 대한 처리를 먼저
		 * 			} catch (차상위 예외 클래스) {
		 * 			} catch (상위 예외클래스) {
		 * 			} finally {} 예외 상관없이 처리
		 * */
		
		// 실행예외 처리 순서
		// 1. 실행예외 나올 코드 내용 수행
		// 2. 해당 에러 코드를 복사 catch문에 예외 처리
		/*
		 * # 반복문의 경우
		 * 
		 * 1. try 문을 반복문 안에 넣는 경우
		 * 		- 해당 step 에서 예외처리를 하고 다음 step으로 넘어갈 수 있다.
		 * 2. try문을 반복문으로 밖으로 감싸는 경우
		 * 		- 해당 sep에서 전체 반복문이 중단된다.
		 * */
		
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			System.out.println("실행 예외 발생 : " + e.getMessage());
		}
		System.out.println("종료");
		
		// ex) 실행 예외 연습1
		try {
			String s = null;
			s.toString();
		} catch (NullPointerException e) {
			System.out.println("NPE : " + e.getMessage());
		}
		
		// ex) 실행 예외연습2
		try {
			args[1].toString();			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Arr : " + e.getMessage());
		}
		
		// ex) 실행 예외연습3
		try {
			Integer.parseInt("하나");
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
