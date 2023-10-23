package javaexp.a09_exception;

public class A09_UserDefineException {

	public static void main(String[] args) {
		/*
		 * # 사용자 정의 예외 처리
		 * 
		 * 1. 기본에 있는 Exception의 구성요소를 사용하면서 추가적인 필드나 메서드를 만들어서
		 * 		사용자 정의 예외 클래스를 선언
		 * 2. 이렇게 선언된 클래스를 객체로 사용할 수 있다.
		 * 3. 사용자 정의 예외 처리 순서
		 * 		1) 사용자 정의 클래스 선언 (extends Exception)
		 * 			> 기본 예외 클래스를 상속하여 처리한다
		 * 			class userException extends Exception {
		 * 			}
		 * 		2) 기본 생성자에서 추가할 내용이 필요하면 super()를 활용하여 상위 생성자의 내용을 호출하면서 처리할 수 있다.
		 * 			UserException (String msg) {
		 * 				super("[사용자 정의 예외]" + msg);
		 * 			}
		 * 		3) 클래스를 정의할 때, 필요로 하는 필드와 메서드들을 추가하거나 재정의해서 사용할 수 있다.
		 * 		4) main() 이나 다른 클래스의 메서드에서 호출
		 * 			try {
		 * 				if(조건) { 
		 * 					throw new UserException();
		 * 				}
		 * 			} catch (UserException e) {
		 * 				System.out.println(e.getMessage());
		 * 			}
		 * 
		 * # 반복문에서 짝수번째 사용자 예외 처리
		 * 1. 사용자 정의 클래스 정의
		 * 2.
		 * 		try {
		 * 			특정 조건 / 특정 라인
		 * 			throw new 사용자정의예외객체(매개 데이터);
		 * 		} catch (사용자정의예외객체 참조변수) {
		 * 			참조변수.getMessage() // => 생성자에 의해 던지 매개 데이터 처리
		 * 		}
		 * */
		
		// 반복문에서 짝수번째 사용자 예외처리
		for (int i = 1; i <= 10; i++) {
			System.out.println("번호 : " + i);
			if (i % 2 == 0) {
				try {
					throw new User01Exception("짝수 " + i + ", 에러발생");
				} catch (User01Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		}

	}

}

/*
 * 사용자 정의 예외
 * 
 * 1. extends Exception 상속
 * 2. 추가 멤버(필드, 생성자(super()), 메서드), 메서드 재정의
 * */
class User01Exception extends Exception {
	
	private String serialNum;
	
	public User01Exception(String message) {
		super("[사용자 정의 예외]" + message);
	}

	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	@Override
	public String getMessage() {
		return super.getMessage() + " : 메서드 처리(재정의)";
	}
	
	
}
