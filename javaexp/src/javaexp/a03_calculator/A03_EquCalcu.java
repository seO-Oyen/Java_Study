package javaexp.a03_calculator;

import java.util.Scanner;

public class A03_EquCalcu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*int age = 25;
		System.out.println("성년여부 : " + (age >= 20));
		age = 18;
		System.out.println("성년여부 : " + (age >= 20));
		
		int corNum = 3;
		int inputNum = 3; 
		boolean isHit = corNum == inputNum;
		
		System.out.println("정답여부 : " + isHit);*/
		
		/*System.out.println("# 놀이공원 입장 #");
		System.out.print("나이를 입력하세요 : ");
		
		int inAge = Integer.parseInt(scan.nextLine());
		//논리합으로 둘 중에 하나이상 true이면 true 처리
		boolean isFree = inAge >= 65 || inAge < 3;
		
		System.out.println("무료여부 : " + isFree);*/
		
		System.out.print("국어, 영어, 수학점수를 입력하세요 : ");
		
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		boolean isPrize = kor >= 80 || eng >= 80 || math >= 80;
		
		System.out.println("상금 여부 : " + isPrize);
		
	}

}
