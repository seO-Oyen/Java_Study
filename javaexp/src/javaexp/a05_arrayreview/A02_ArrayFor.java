package javaexp.a05_arrayreview;

import java.util.Scanner;

public class A02_ArrayFor {

	public static void main(String[] args) {

		/*
		 * # 배열과 반복문 처리
		 * 1. 배열 반복문을 통해 보다 효과적으로 사용할 수 있다.
		 * 		1) 배열의 길이 : 반복문의 한계치/반복조건
		 * 		2) 배열의 index : 반복문에서 사용할 변수
		 * 2. 기본 형식1
		 * 		for (int i = 0; i < 배열.length; i++) {
		 * 			배열[i];
		 * 		}
		 * 		int i = 0 : 배열은 0부터 처리한다
		 * 		i < 배열.length : 배열의 index는 배열의 크기보다 1작다.
		 * 		i++ : 배열의 index는 증가한다
		 * 		배열[i] : 배열은 index로 가져온다
		 * 3 . 기본형식 2
		 * 		foreach 구문
		 * 		배열안에 있는 구성요소를 첫번째보터1씩 가져와서 단위데이터에 할당 후
		 * 		다시 반복문을 돌면서 하나씩 가져와서 배열의 마지막 데이터까지 할당한 후
		 * 		반복문이 중단되는 형태를 말한다.
		 * */
		
		/*String[] fruits = new String[3];
		// Scanner를 통해서 과일 3개 정보를 입력하고, 출력하는 처리
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(i + 1 + "번째 과일 정보를 입력 : ");
			fruits[i] = scan.nextLine();
		}
		System.out.println("배열에 등록된 과일");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(i + 1 + ") " + fruits[i]);
		}*/
		
		/*String games[] = {"가위", "바위", "보"};
		System.out.println("foreach 구문을 통한 처리");
		for (String game : games) {
			System.out.println(game);
		}*/
		
		// ex) 학생 5명의 점수를 선언하고, 출력하되 종점과 평균을 for each 구문을 통해 처리하세요
		//		int total = 0;
		int scores[] = {20, 30, 41, 50, 60};
		int total = 0;
		for (int score : scores) {
			total += score;
			System.out.println(score);
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + total / 5.0);
	}

}
