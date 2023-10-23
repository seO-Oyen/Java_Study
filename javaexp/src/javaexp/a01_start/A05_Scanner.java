package javaexp.a01_start;

import java.util.*; // 외부 객체를 사용할 때 선언

public class A05_Scanner {

	public static void main(String[] args) {

		/*System.out.println("이름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		// 입력한 데이터를 String 으로 하는 name 에 할당해서 하단에 출력한다.
		String name = scan.nextLine();
		
		System.out.print("입력한 이름 : ");
		System.out.println(name);*/

		// ex) 좋아하는 과일명을 입력 후, 출력하세요
		// String fruit 로 문자열에 할당 처리

		Scanner scan = new Scanner(System.in);
		String fruit = scan.nextLine();
		
		System.out.println(fruit);

	}

}
