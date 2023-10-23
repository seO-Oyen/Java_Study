package javaexp.a09_exception;

public class A06_Finally {
	
	public static void main(String[] args) {
		
		/*
		 * # finally
		 * 
		 * 1. 예외가 발생하건 발생하지 않건 상관없이 수행할 구문이 필요할때 사용
		 * 2. 명시적으로 특정ㅎ안 블럭 구문을 만들어 예외에 상관없이 처리할 내용을 나타낼 때 사용
		 * */
		
		try {
			String str = null;
			System.out.println(str.toLowerCase());
		} catch (NullPointerException e) {
			System.out.println("이 에러를 내네 ㅋㅋㅋ");
		} finally {
			System.out.println("예외 상광벗이 처리할 내용");
		}
		
		
	}

}
