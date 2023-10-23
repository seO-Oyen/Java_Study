package javaexp.a09_exception;

public class A10_UserException {

	public static void main(String[] args) {
		
		/*
		 * # 처리 순서 
		 * 
		 * 1. 사용자 정의 예외 처리 클래스 선언
		 * 		class XXX extends Exception {}
		 * 2. main() 에서 호출 하는 처리
		 * */
		
		// ex) 사용자 정의 예외 클래스 UserExpt 선언하고 기능메서드로 void call() 사용자 정의 예외 출력
		// 		추가 메서드 정의. 반복문에서 3의 배수일때 호출되게
		
		for (int i = 1; i <= 10; i++) {
			try {
				if (i % 3 == 0) {
					System.out.println(i + " : 3의 배수");
					throw new UserExpt("3의 배수");
				}
			} catch (UserExpt e) {
				e.call();
				System.out.println(e.getMessage());
			}
		}

	}

}

class UserExpt extends Exception {
	public UserExpt(String message) {
		super("사용자 정의 예외 : " + message);
	}

	@Override
	public String getMessage() {
		return super.getMessage() + "(사용자 정의)";
	}
	
	public void call() {
		System.out.println(super.getMessage());
	}
	
	
}