package javaexp.a10_api;

public class A04_StringMethod2 {

	public static void main(String[] args) {
		
		/*
		 * # 문자열을 찾아서 변경할 때 사용하는 replace
		 * 
		 * 1. 기본형식
		 * 		문자열.replace("찾을 문자열", "변경할 문자열")
		 * 
		 * # 코드성 문자열을 추출하여 원하는 데이터를 처리한 substring
		 * 1. 특정 범위의 문자열을 추출하여 처리한다.
		 * 		문자열.substring(추출할 시작위치(0~), 추출할 마지막위치(1~)
		 * 
		 * # 특정한 구분자를 통해서 데이터를 구분하여 추출하는 형식 split
		 * - 특정한 구분자를 기준해서 문자열 데이터를 만드는 메서드
		 * 		String[] arry = 문자열.split("구분자");
		 * 		
		 * */
		
		String target = "자바는 객체지향 프로그램입니다. 자바는 풍부한 api지원";
		String newStr = target.replace("자바", "JAVA");
		System.out.println("수정 후 결과 : " + newStr);
		
		String data = "홍길동 70, 80, 90";
		String name = data.substring(0, 3);
		String kor = data.substring(4, 6);
		String eng = data.substring(8, 10);
		String math = data.substring(11, 14);
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		// ex) 본인의 주민번호를 선언하고, 생년 월 일을 위 substring을 이용해서 추출하세요
		
		String civilCode = "040618-1234567";
		String year = civilCode.substring(0, 2);
		String month = civilCode.substring(2, 4);
		String day = civilCode.substring(4, 6);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		
		// ex) 서울-대전-대구-광주-제주 라는 문자열 데이터를 구분자로 배열로 만들어서 출력
		String[] locs = "서울-대전-대구-광주-제주".split("-");
		
		for (int i = 0; i < locs.length; i++) {
			System.out.println(locs[i]);
		}

	}

}
