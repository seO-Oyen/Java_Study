package javaexp.a04_process;

public class A12_DoubleFor {

	public static void main(String[] args) {
		
		/*
		 * # 중첩 for문
		 * 1. for문 안에 for문 처리하는 내용
		 * */
		
		// 구구단
		/*for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}*/
		
		// 직사각형 모양 별찍기
		/*for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// ex) 하루의 시 : 분 표시
		//     0시 0분 / 0시 1분 / 1시 0분 / 23시 59분 ...
		/*for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				System.out.println(i + "시 " + j + "분");
			}
			System.out.println();
		}*/
		
		// ex) 2중 for문 활용 행 / 열 테이블 표시
		/*for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("(" + i + "행" + j + "열)\t");
			}
			System.out.println();
		}*/
		
		// 별찍기
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
