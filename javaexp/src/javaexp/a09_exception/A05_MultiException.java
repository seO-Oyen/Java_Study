package javaexp.a09_exception;

public class A05_MultiException {
	
	public static void main(String[] args) {
		
		/*
		 * # 다중 예외 처리
		 * 
		 * 1. 최하위레벨의 예외부터 처리
		 * 2. 마지막에 최상위 예외 처리
		 * 
		 * # 상속의 메모리
		 * 
		 * 1. 상위는 다형성에서 하위의 모든 객체를 포함하여야 하기 때문에 메모리가 가장 크기
		 * 
		 * - 상속관계에서 최상위에 있는 것을 제일 마지막에 처리하여야 한다.
		 * 1. 상속관계에서 위 내용을 기준으로 메모리가 가장 작은 것ㅇ르 => 최하위 객체
		 * 2. 최하위에 있는 작은 메모리로 처리할 수 있는 것은 먼저 처리하고
		 * 3. 그 메모리로 안되는 예외는 점점 더 큰 메모리인 상위 계층의 메모릴 처리하여야
		 * */
		
		try {
			String str = args[0];
			int num01 = Integer.parseInt(str);
			System.out.println("입력한 수 : " + num01);
		} catch (NullPointerException e) {
			System.out.println("NPE : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("최상위 예외 : " + e);
		}
		
		
		
		try {
			String str01 = null;
			int num01 = Integer.parseInt(str01);
			System.out.println(num01 / 0 );
		} catch (NullPointerException e) {
			System.out.println("NPE : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("최상위 예외 : " + e);
		}
		
	}

}
