package javaexp.z01_homework;

import java.util.Scanner;

public class A0915_HomeWork {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		// 1번
		/*System.out.print("두 수 입력 : ");
		int num01 = scan.nextInt();
		int num02 = scan.nextInt();
		
		if (num01 >= num02) {
			System.out.println(num01);
		} else {
			System.out.println(num02);
		}*/
		
		// 2번
		/*int num03 = (int)(Math.random() * 10 + 1);
		int num04 = (int)(Math.random() * 10 + 1);
		int num05 = (int)(Math.random() * 10 + 1);
		
		System.out.println("세 수 : " + num03 + ", " + num04 + ", " +num05);
		
		if (num03 >= num04 && num03 >= num05) {
			System.out.println("제일 큰 수는 : " + num03);
		} else if (num04 >= num03 && num04 >= num05) {
			System.out.println("제일 큰 수는 : " + num04);
		} else {
			System.out.println("제일 큰 수는 : " + num05);
		}*/
		
		// 3번
		/*System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if (score >= 90) {
			System.out.println(score + "점은 A등급");
		} else if (score >= 80) {
			System.out.println(score + "점은 B등급");
		} else if (score >= 70) {
			System.out.println(score + "점은 C등급");
		} else if (score >= 60) {
			System.out.println(score + "점은 D등급");
		} else {
			System.out.println(score + "점은 F등급");
		}*/
		
		// 4번
		/*int temperature = 19;
		
		System.out.println(temperature >= 20 ? "아이스크림을 먹을거야" : "핫초코를 먹을거야");*/
		
		// 5번
		/*int mathScore = 85;
		int scienceScore = 90;
		
		if (mathScore >= 80 && scienceScore >= 85) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}*/
		
		// 6번
		/*int a = 40;
		int b = 59;
		double avg = (a + b) / 2.0;
		
		System.out.println(avg >= 50.0 ? "평균이상" : "평균 미만");*/
		
		// 7번
		/*int hoursWorked = 41;
		
		System.out.println(hoursWorked > 40 ? "과로" : "정상근무시간");*/
		
		// 8번
		/*String day = "목요일";
		
		switch (day) {
			case "일요일" :
			case "토요일" :
				System.out.println("주말입니다.");
				break;
			default :
				System.out.println("평일입니다.");
		}*/
		
		// 9번
		/*System.out.println("키를 입력하세요");
		int height = scan.nextInt();
		
		if (height < 150) {
			System.out.println("놀이기구를 이용할 수 없습니다.");
		} else {
			System.out.println("놀이기구를 이용하세요.");
		}*/
		
		// 10번
		
		/*System.out.println("요일을 입력하세요");
		String dayOfWeek = scan.next();
		int fare;
		
		switch (dayOfWeek) {
			case "토요일" :
			case "일요일" :
				fare = 800;
				System.out.println("요금은 " + fare + "원 입니다.");
				break;
			default : 
				fare = 1200;
				System.out.println("요금은 " + fare + "원 입니다.");
		}*/
		
		// 11번
		
		/*System.out.print("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		String movieRecommendation;
		
		if (age < 13) {
			movieRecommendation = "애니메이션";
		} else if (age <= 19) {
			movieRecommendation = "로맨틱 코미디";
		} else {
			movieRecommendation = "액션";
		}
		
		System.out.println("당신의 나이는 " + age + "세 " + movieRecommendation + " 장르를 추천합니다.");*/
		
		// 12번
		
		int month;
		String season;
		
		while (true) {
		
			System.out.print("달을 입력하세요 : ");
			month = scan.nextInt();
			
			if (month > 12 || month <= 0) {
				System.err.println("없는 달 입니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		
		switch (month) {
			case 3, 4, 5 :
				season = "봄";
				break;
			case 6, 7, 8 : 
				season = "여름";
				break;
			case 9, 10, 11 : 
				season = "가을";
				break;
			default :
				season = "겨울";
		}
		
		System.out.println(month + "월은 " + season + "입니다.");
		
	}

}
