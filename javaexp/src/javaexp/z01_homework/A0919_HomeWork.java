package javaexp.z01_homework;

import java.util.Scanner;

public class A0919_HomeWork {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 아래 내용을 2중 for문을 활용하여
		// 	1) 2X2(행X열)로 ♥를 표시 2) 3X2(행X열)로 ★표시 3) 입력한 행/열로 입력한 기호표시
		/*for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("♥");
			}
			System.out.println();
		}*/
		
		/*for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("★");
			}
			System.out.println();
		}*/
		
		/*System.out.print("행 입력 : ");
		int height = scan.nextInt();
		System.out.print("열 입력 : ");
		int width = scan.nextInt();
		System.out.print("도형 입력 : ");
		String shapes = scan.next();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(shapes);
			}
			System.out.println();
		}*/
		
		// 2. while문을 이용하여 100~90까지 출력하고, 합산결과를 출력하세요.
		/*int num = 100;
		int total = 0;
		
		while (num >= 90) {
			total += num;
			System.out.print(num-- + " ");
		}
		System.out.println("\n총 합계 : " + total);*/
		
		// 3. while문을 이용해서 학생의 점수를 등록하고 총점과 평균을 출력하되, 등록을 종료시 -1를 입력해서 처리하세요.
		/*int score;
		int total = 0;
		int no = 1;
		
		while (true) {
			System.out.print(no + "번 학생의 점수를 입력하세요 (종료 : -1) : ");
			score = scan.nextInt();
			
			if (score == -1) {
				break;
			}
			
			total += score;
			no++;
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double)total / --no);*/
		
		// 4. 배열로 점수를 3개를 초기화하여, 반복문과 Scanner를 통해서 데이터를 입력되게 하고, 총계과 평균을 출력하세요.
		/*int scores[] = new int[3];
		int total = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("점수를 입력하세요 : ");
			scores[i] = scan.nextInt();
			total += scores[i];
		}
		
		System.out.println("# 점수");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println("\n총점 : " + total);
		System.out.println("평균 : " + (double)total / scores.length);*/
		
		// 5. 배열 3개에 각각 학생명, 국어, 영어를 할당하여, 반복문을 통해서 출력하세요. 
		/*String students[] = {"홍길동", "김길동", "이길동"};
		int kors[] = {40, 78, 34};
		int engs[] = {60, 29, 78};
		
		System.out.println("이름\t국어\t영어");
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i] + "\t" + kors[i] + "\t" + engs[i]);
		}*/
		
		// 6. **구구단 출력기**
		//   구구단 중 원하는 단을 시작 단과 끝 단으로 지정(입력)하여 출력하게 만드세요.
		/*System.out.println("# 구구단 출력기");
		System.out.print("시작 단 입력 : ");
		int start = scan.nextInt();
		System.out.print("끝 단 입력 : ");
		int end = scan.nextInt();
		
		for (int i = start; i <= end; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}*/
		
		// 7. **자동비밀번호 생성기**
		//   사용자로부터 비밀번호 길이를 입력 받아, 해당 길이만큼의 비밀번호를 생성하세요.
		//   비밀번호는 숫자와 알파벳으로 구성됩니다.
		
		// 48 ~ 57, 65 ~ 90, 97 ~ 122
		/*for (int i = 33; i <= 125; i++) {
			System.out.println(i + " : " + (char)i);
		}*/
		
		/*System.out.print("비밀번호 길이를 입력하세요 : ");
		int length = scan.nextInt();
		String pass = "";
		
		for (int i = 0; i < length; i++) {
			int random = (int)(Math.random() * 75 + 48);
			if ((random >= 48 && random <= 57) || (random >= 65 && random <= 90) 
					|| (random >= 97 && random <= 122)) {
				pass += (char)random;
			} else {
				i--;
			}
			 
		}
		
		System.out.println(pass);*/
		
		// 8. 사용자로부터 두 개의 정수 A와 B를 입력받아, A부터 B까지의 합을 출력하세요.
		// 		단, A가 B보다 클 경우에는 순서를 바꿔서 계산하세요.
		
		/*System.out.print("A 값 입력 : ");
		int a = scan.nextInt();
		System.out.print("B 값 입력 : ");
		int b = scan.nextInt();
		int total = 0;
		
		int temp;
		
		if (a > b) {
			temp = b; 
			b = a;
			a = temp;
		}
		
		for (int i = a; i <= b; i++) {
			total += i;
		}
		System.out.println(a + "부터 " + b + "까지의 합 : " + total);*/
		
		// 9. 사용자로부터 숫자 N을 입력받아, 마름모 모양으로 숫자를 출력하세요. (별찍기와 비슷하지만, 별 대신 숫자를 사용합니다.)
		/*System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i) - 1; k++) {
				System.out.print(num);
			}
			System.out.println();
		}
		
		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i) - 1; k++) {
				System.out.print(num);
			}
			System.out.println();
		}*/

		// 10. 사용자로부터 영문자 하나를 입력받아, 해당 문자가 소문자인 경우 대문자로, 
	    //		대문자인 경우 소문자로 변환하여 출력하세요
		
		// 65 ~ 90 - 97 ~ 122 : 32
		/*for (int i = 33; i <= 125; i++) {
			System.out.println(i + " : " + (char)i);
		}*/
		
		/*System.out.print("영문자 하나 입력하세요 : ");
		char c = scan.nextLine().charAt(0);
		
		if ((int)c >= 65 && (int)c <= 90) {
			c = (char)((int)c + 32);
		} else {
			c = (char)((int)c - 32);
		}
		
		System.out.println(c);*/
		
		// 11. 사용자로부터 두 개의 숫자를 입력받아, 사이에 '+', '-', '*', '/' 중 하나를 넣어 계산 
		//		결과가 제일 큰 연산을 찾아 출력하세요.
		/*System.out.print("수 1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("수 2 입력 : ");
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		int high = 0;
		
		if (sum >= min && sum >= mul && sum >= div) {
			high = sum;
		} else if (min >= sum && min >= mul && min >= div) {
			high = min;
		} else if (mul >= sum && mul >= min && mul >= div) {
			high = mul;
		} else if (div >= sum && div >= min && div >= mul) {
			high = div;
		}
		System.out.println(sum + ", " + min + ", " + mul + ", " + div);
		System.out.println(high);*/

		// 12. 컴퓨터의 두 플레이어가 각각 1~10 사이의 카드를 무작위로 받고,
		//  	높은 카드를 가진 플레이어가 승리합니다. 게임은 총 5라운드로 진행되며, 
		// 		승리한 라운드 횟수에 따라 최종 승자를 결정합니다.
		/*int com1;
		int com2;
		int com1Count = 0;
		int com2Count = 0;
		
		for (int i = 1; i <= 5; i++) {
			com1 = (int)(Math.random() * 10 + 1);
			com2 = (int)(Math.random() * 10 + 1);
			
			if (com1 > com2) {
				com1Count++;
				System.out.println("com1이 이겼습니다. com1 : " + com1 + ", com2 : " + com2);
			} else if (com1 < com2) {
				com2Count++;
				System.out.println("com2이 이겼습니다. com1 : " + com1 + ", com2 : " + com2);
			} else {
				System.out.println("무승부 입니다.");
			}
		}
		
		if (com1Count > com2Count) {
			System.out.println("com1이 " + com1Count + "번 승리. 우승입니다.");
		} else if (com1Count < com2Count) {
			System.out.println("com2이 " + com2Count + "번 승리. 우승입니다.");
		} else {
			System.out.println("서로 " + com1Count + "번 승리했습니다. 무승부 입니다.");
		}*/
		
		// 13. 사용자로부터 특정 금액을 입력받아, 최소한의 동전 수로 교환하는 방법을 출력합니다. 
		//		예를 들어 560원을 입력하면, 500원짜리 1개, 50원짜리 1개, 10원짜리 1개로 출력합니다.
		/*System.out.print("금액을 입력하세요 : ");
		int money = scan.nextInt();
		int money2 = money;
		
		int a500 = 0;
		int b100 = 0;
		int c50 = 0;
		int d10 = 0;
		while (true) {
			if (money >= 500) {
				a500++;
				money -= 500;
			} else if (money >= 100) {
				b100++;
				money -= 100;
			} else if (money >= 50) {
				c50++;
				money -= 50;
			} else if (money >= 10) {
				d10++;
				money -= 10;
			} else {
				break;
			}
		}
		System.out.println(money2 + " / 500원 : " + a500 + "개, 100원 : " + b100 + "개, 50원 : " + c50 + "개, 10원 : " + d10);*/
		
		
		// 14. 사용자로부터 상품의 원가와 판매가를 입력받아, 할인율을 계산하고 출력합니다.
		/*System.out.print("상품의 원가를 입력하세요 : ");
		int price = scan.nextInt();
		System.out.print("판매가를 입력하세요 : ");
		int sPrice = scan.nextInt();*/
		

	}

}
