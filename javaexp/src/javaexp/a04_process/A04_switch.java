package javaexp.a04_process;

import java.util.Scanner;

public class A04_switch {

	public static void main(String[] args) {
		
		// 커피 종류에 따른 내용
		/*String chCoffee = "카푸치노";
		
		switch (chCoffee) {
			case "아메리카노" :
				System.out.println("시원하고 깔끔한 선택");
				break;	
			case "카푸치노" : 
				System.out.println("풍성한 거품이 좋으신가보군요");
				break;
			case "라떼" :
				System.out.println("부드러운 우유를 좋아하는 당신!");
				break;
			default :
				System.out.println("그런 메뉴는 판매하지 않습니다");
		}*/
		
		// 월별로 날수 처리
		/*int month = (int)(Math.random() * 12 + 1);
		
		System.out.print(month + "월은 ");
		switch (month) {
			case 4 :
			case 6 :
			case 9 :
			case 11 : 
				System.out.println("30일까지 있는 달입니다.");
				break;
			case 2 : 
				System.out.println("28일, 29일까지 있는 달입니다.");
				break;
			default : 
				System.out.println("31일까지 있는 달입니다.");
		}*/
		
		// ex) 이번주 날짜를 기준으로 해서 날짜를 입력받아 요일을 출력하세요
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.print("날짜를 입력하세요. (18 ~ 24) : ");
		int day = scan.nextInt();
		
		switch (day) {
			case 18:
				System.out.println("월요일 입니다.");
				break;
			case 19:
				System.out.println("화요일 입니다.");
				break;
			case 20:
				System.out.println("수요일 입니다.");
				break;
			case 21:
				System.out.println("목요일 입니다.");
				break;
			case 22:
				System.out.println("금요일 입니다.");
				break;
			case 23:
				System.out.println("토요일 입니다.");
				break;
			case 24:
				System.out.println("일요일 입니다.");
				break;
			default:
				System.out.println("날짜는 이번주 (18 ~ 24일) 까지만 입력 가능합니다.");
		}*/		
		
		System.out.print("정답을 입력하세요 : ");
		int num = scan.nextInt();
		
		switch (num) {
			case 1, 3:
				System.out.println("정답입니다.");
				break;
			case 2, 4:
				System.out.println("오답입니다.");
				break;
			default:
				System.out.println("1 ~ 4까지 입력 가능합니다.");
			
		}
		

	}

}
