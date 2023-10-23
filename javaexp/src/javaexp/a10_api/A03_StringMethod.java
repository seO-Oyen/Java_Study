package javaexp.a10_api;

import java.util.Scanner;

public class A03_StringMethod {

	public static void main(String[] args) {
		
		/*
		 * # 문자열을 처리한 String 객체의 주요 기능 메서드
		 * 
		 * 1. charAt(int index) : 해당 문자열의 0부터 시작한 특정한 문자(char) 리턴
		 * 2. getBytes() : 문자열을 byte 배열로 가져온다
		 * 3. 특정 문자열을 찾을 때, 활용되는 indexOf()
		 * 		1) 기본형식
		 * 		> 문자열.indexOf("찾을 문자열")
		 * 			찾을 문자열의 시작 위치를 index로 리턴 -> 해당 문자열이 포함하지 않으면 -1 리턴
		 * 		ex) 키워드 검색시 주로 활용.
		 * */
		
		String greet = "안녕하세요";
		// .length() : 문자열 길이 리턴
		for(int i = 0; i < greet.length(); i++) {
			System.out.println(i + ")" + greet.charAt(i));
		}
		
		// ex) 이 데이터는 생년월일을 가져온다. charAt을 이용해서 문자를 추출하여
		//		@@@@년 @@월 @@일 생으로 바꾸어 출력하세요
		String date = "1993/3/12";
		String year = "";
		String month = "";
		String day = "";
		
		for(int i = 0; i < date.length(); i++) {
			if(date.charAt(i) == '/') {
				continue;
			} else if(i < 4) {
				year += date.charAt(i);
			} else if (i < 7) {
				month += date.charAt(i);
			} else {
				day += date.charAt(i);
			}
		}
		System.out.println(year + "년 " + month + "월 " + day + "일 생");
	
		
		String str1 = "Hello";
		byte[] bytes1 = str1.getBytes();
		for (byte b : bytes1) {
			System.out.println(b + "(" + (char)b + ")");
		}
		
		
		String msg = "식사 맛있게 하셨나요?";
		String searchW = "식사";
		int search1 = msg.indexOf(searchW);
		int search2 = msg.indexOf("점심");
		
		System.out.println("데이터가 있을 때 : " + search1);
		System.out.println("데이터가 없을 때 : " + search2);
		
		if (search1 != -1) {
			System.out.println("있음");
		} else {
			System.out.println("없음");
		}
		
		// ex) String menu = "사과, 바나나, 딸기"; 를 선언하고 구매할 물건을 Scanner 를 통해 입력받고 구매 가능여부
		
		Scanner scan = new Scanner(System.in);
		String menu = "사과, 바나나, 딸기";
		System.out.print("구매할 물건을 입력 : ");
		String item = scan.nextLine();
		
		if (menu.indexOf(item) != -1) {
			System.out.println(item + " 구매 가능합니다.");
		} else {
			System.out.println(item + " 구매 불가능합니다.");
		}

	}

}
