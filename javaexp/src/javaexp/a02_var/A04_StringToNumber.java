package javaexp.a02_var;

import java.util.Scanner;

public class A04_StringToNumber {

	public static void main(String[] args) {

		System.out.println(" # 숫자형 문자열 숫자로 변환 # ");
		
		String kor = args[0];
		String eng = args[1];
		String math = args[2];
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		int korInt = Integer. parseInt(kor);
		int engInt = Integer.parseInt(eng);
		int mathInt = Integer.parseInt(math);
		int total = korInt + engInt + mathInt;
		
		System.out.println("총계 : " + total);
		System.out.println("평균 : " + (total / 3));
		
		// Scanner를통해서 원하를 달러화로 변환하는 프로그램 처리
		// 1.Scanner 객체 생성
		// 2. 현재 1달러당 1131.50원 변수 선언
		// 3. 입력된 데이터를 문자열로 받아서 형변환 처리 
		// 4. 계산식 달러 = 원 / 환율
		// 5. 최종 입력된 원화와 달러 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원화 : ");
		String won = scan.next();
		int wonInt = Integer.parseInt(won);
		double changeRatio = 1131.5;
		
		double dollar = wonInt / changeRatio;
		// 입력한 결과를 실수 형으로 하고 싶다면  => casting
		// int dollar = (int)(wonInt / changeRatio);
		
		System.out.println("입력된 원화(￦) : " + won + "원, 달러($) : " + dollar + "달러");
		// 소수점 자르기
		System.out.println("입력된 원화(￦) : " + won + "원, 달러($) : " + String.format("%.3f", dollar) + "달러");
		
		
	}

}
