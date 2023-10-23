package javaexp.a09_exception;

public class A01_Basic {

	public static void main(String[] args) {
		/*
		 * # 프로그램 처리
		 * 1. 위에서 아래로
		 * 2. 왼쪽에서 오른쪽으로
		 * 3. 대입연산자는 오른족에서 왼쪽으로 대입처리
		 * 
		 * 프로그램 에러 발생 : 일단 프로세스를 중단하고 더 이상 진행하지 않는다.
		 * 에러가 발생하더라도 처리하는 방법이 있는데 그것이 바로 예외 처리이다
		 * 
		 * */
		
		try {
			System.out.println("라인1");
			System.out.println("라인2");
			System.out.println("라인3");
			System.out.println("라인4");
			System.out.println("라인5" + 1 / 0); // 에러발생으로 중단
			System.out.println("라인6");			
		} catch (Exception e) {
			/*
			 * 상위 (Exception e) = 하위 (Exception 상위받은 하위)
			 * 예외에 대한 코드 처리
			 * 1. 화면 : 에러 발생에 대한 메시지 처리 / 기타 정보
			 * 2. 로그파일 저장(log) ==> 에러 관리 효율
			 * 3. 에러에 대한 시간별 DB 저장 ==> 에러 관리 효율
			 * */
			System.out.println("에러 발생");
			 System.out.println("에러 발생 내용 : " + e.getMessage());
		}
		
		// ex) cnt 1~100까지 출력하는 과정을 코딩하되 cnt가 50일때 1/0을 위와같이 하여
		//	예외를 발생시켜 처리하는 코드를 작성해보세요
		//	A02_ExceptionBasic

	}

}
