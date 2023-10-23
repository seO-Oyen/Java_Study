package javaexp.y01_util;

public class A03_RandomCode {

	public static void main(String[] args) {
		
		/*for (int num = 33; num <= 126; num++) {
			System.out.println(num + " : " + (char)num);
		}*/
		
		// 영문 대문자 중에서 4개를 추출해서 임의의 비번 설정
		// 65 ~ 90
		
		int code1 = (int)(Math.random() * 26 + 65);
		int code2 = (int)(Math.random() * 26 + 65);
		int code3 = (int)(Math.random() * 26 + 65);
		int code4 = (int)(Math.random() * 26 + 65);
		
		System.out.print((char)code1);
		System.out.print((char)code2);
		System.out.print((char)code3);
		System.out.println((char)code4);
		
		System.out.println("\n8개 임시 비번");
		
		for (int cnt = 1; cnt <= 8; cnt++) {
			int code = (int)(Math.random() * 26 + 65);
			
			System.out.print((char)code);
		}
		
		System.out.println("\n");
		
		// ex) 소문자 8자를 임의로 출력처리
		
		for (int i = 0; i < 8; i++) {
			int code = (int)(Math.random() * 26 + 97);
			
			System.out.print((char)code);
		}
		
		System.out.println("\n");
		
		// ex) 숫자 4자를 임의로 출력처리
		
		for (int i = 0; i < 4; i++) {
			int numCode = (int)(Math.random() * 10 + 48);
			
			System.out.print((char)numCode);
		}
		
		System.out.println("\n");
		
		// ex) 대문자 + 소문자 + 특수문자 포함한 16자 임시비번 생성
		for (int i = 0; i < 16; i++) {
			int allCode = (int)(Math.random() * 94 + 33);
			
			System.out.print((char)allCode);
		}

	}

}
