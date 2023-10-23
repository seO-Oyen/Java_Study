package javaexp.a04_process;

public class A03_If_ElseIf_If {

	public static void main(String[] args) {

		// 1 ~ 10 까지 기분의 수치 (10이 가장 좋은 기분)
		/*int moodValue = (int)(Math.random() * 10 + 1);
		System.out.println("기분 점수 : " + moodValue);
		
		if ( moodValue >= 9 ) {
			System.out.println("기분이 아주 좋아요!");
		} else if ( moodValue >= 7) { // 9 이상은 제외
			System.out.println("기분이 좋아요!");
		} else if ( moodValue >= 5 ) {
			System.out.println("기분이 보통이예요.");
		} else if ( moodValue >= 3 ) {
			System.out.println("조금 우울해요.");
		} else {
			System.out.println("많이 우울해요.");
		}*/
		
		/*String animal = "닭";
		
		if (animal.equals("강아지")) {
			System.out.println("멍멍!");
		} else if (animal.equals("고양이")) {
			System.out.println("야옹~");
		} else if (animal.equals("소")) {
			System.out.println("음메~");
		} else if (animal.equals("닭")) {
			System.out.println("꼬끼오!!");
		} else {
			System.out.println("알 수 없는 소리입니다.");
		}*/
		
		// ex) 보유한 연료량 500L ~ 10000L 임의 연료량
		// 6000L 이상 : 태양까지 여행 가능
		// 5000L 이상 : 화성
		// 2000L 이상 : 금성
		// 1000L 이상 : 달
		
		int oil = (int)(Math.random() * 9501 + 500);
		 
		System.out.println("연료량 : " + oil);
		
		if (oil >= 6000) {
			System.out.println("태양까지 여행 가능");
		} else if (oil >= 5000) {
			System.out.println("화성까지 여행 가능");
		} else if (oil >= 2000) {
			System.out.println("금성까지 여행 가능");
		} else if (oil >= 1000) {
			System.out.println("달까지 여행 가능");
		} else {
			System.out.println("우주여행 불가");
		}
		
	}

}
