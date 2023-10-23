package javaexp.a04_process;

// 0919 #중첩 if문, 중첩 for문
public class A11_DoubleFor_If {

	public static void main(String[] args) {
		
		// 나이와 성별을 입력받아서 4가지 조건으로 중첩문을 사용하자
		/*int age = 15;
		String gender = "남";
		// if (age >= 18 && gander.equals("남")) 방식으로도 처리 가능
		if (age >= 18) {
			System.out.println("성인입니다.");
			
			if (gender.equals("남")) {
				System.out.println("신사입니다.");
			} else {
				System.out.println("숙녀입니다.");
			}
		} else {
			System.out.println("미성년입니다.");
			
			if (gender.equals("남")) {
				System.out.println("소년입니다.");
			} else {
				System.out.println("소녀입니다.");
			}
		}*/
		
		// ex) 주말여부를 선언, 공휴일 여부를 선언
		//     주말이면서 공휴일이 아닌경우 ==> 휴일
		//     주말이면서 공휴일인경우 ==> 대체휴일
		//	   그외는 평일
		
		/*boolean isWeekend = false;
		boolean isHoliday = true;
		
		if (isWeekend) {
			if (isHoliday) {
				System.out.println("대체휴일");
			} else {
				System.out.println("휴일");
			}
		} else {
			System.out.println("평일");
		}*/
		
		// ex) 영화 입장료가 15000원일때 성별과 나이를 입력받아
		//	   남성과 25세 미만일경우 5% 할인
		//     여성과 25세 이상일 경우 10%할인
		
		int moviePrice = 15000;
		String gender = "남";
		int age = 24;
		
		if (gender.equals("남")) {
			if (age < 25) {
				moviePrice -= moviePrice * 0.05;
			}
		} else {
			if (age >= 25) {
				moviePrice -= moviePrice * 0.1;
			}
		}
		
		System.out.println("총 금액 : " + moviePrice + "원");

	}

}
