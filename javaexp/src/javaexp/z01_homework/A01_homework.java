package javaexp.z01_homework;

import java.util.Scanner;

public class A01_homework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 1번 
		int a = 20;
		int b = 23;
		double avg = (a + b) / 2.0;
		
		System.out.println(avg);
		System.out.println("\n------------------------\n");
		
		// 2번
		System.out.print("첫번째 숫자 : ");
		int num01 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num02 = scan.nextInt();
		System.out.print("세번째 숫자 : ");
		int num03 = scan.nextInt();
		System.out.print("네번째 숫자 : ");
		int num04 = scan.nextInt();
		System.out.print("다섯번째 숫자 : ");
		int num05 = scan.nextInt();
		
		// 다른 방법
		/*System.out.println("5개의 숫자를 입력하세요");
		int num01 = scan.nextInt();
		int num02 = scan.nextInt();
		int num03 = scan.nextInt();
		int num04 = scan.nextInt();
		int num05 = scan.nextInt();*/
		
		double avg2 = (num01 + num02 + num03 + num04 + num05) / 5.0;
		
		System.out.println("평균 : " + avg2);
		System.out.println("\n------------------------\n");
		
		// 3번
		System.out.print("달러 : ");
		int money = scan.nextInt();
		
		System.out.println("원화(환율 1100원) : " + (money * 1100) + "원");
		System.out.println("\n------------------------\n");
		
		// 4번
		
		/*
		 * 우선 연산자
		 * 1. ()
		 * 2. *, /
		 * 3. +, -
		 * */
		
		System.out.print("사각형의 가로 : ");
		int width = scan.nextInt();
		System.out.print("사각형의 세로 : ");
		int height = scan.nextInt();
		
		System.out.println("사각형의 둘레 : " + ((width + height) * 2));
		System.out.println("사각형의 면적 : " + (width * height));
		System.out.println("\n------------------------\n");
		
		// 5번
		byte byteValue = 42;
		double doubleValue = byteValue; // 자동형변환
		
		System.out.println(doubleValue);
		System.out.println("\n------------------------\n");
		
		// 6번
		float floatValue = 123.456f;
		int intValue = (int)floatValue; // 강제형변환
		
		System.out.println(intValue);
		System.out.println("\n------------------------\n");
		
		// 7번
		int intValue2 = 100;
		double doubleValue2 = 150.5;
		int total = intValue2 + (int)doubleValue2;
		
		System.out.println(total);
		System.out.println("\n------------------------\n");
		
		// 8번
		String num06 = "5667";
		int num07 = Integer.parseInt(num06);
		
		System.out.println(num07);
		System.out.println("\n------------------------\n");
		
		// 9번
		String num08 = "-456.789";
		double num09 = Double.parseDouble(num08);
		
		System.out.println(num09);
		System.out.println("\n------------------------\n");
		
		// 10번
		int num10 = 1;
		System.out.println("   " + num10++);
		System.out.print("  " + num10++);
		System.out.println(" " + num10++);
		System.out.print(" " + num10++);
		System.out.print(" " + num10++);
		System.out.println(" " + num10++);
		System.out.print("" + num10++);
		System.out.print(" " + num10++);
		System.out.print(" " + num10++);
		System.out.print(" " + num10);

	}

}
