package javaexp.a04_process;

import java.util.Scanner;

public class A02_If_Else {

	public static void main(String[] args) {

		/*int iNum = 3;
		if (iNum == 3) {
			System.out.println("3일때, 정답");
		} else {
			System.out.println("오답");
		}*/

		// ex) 컴퓨터가 1~5까지 임의로 저장할 때 입력 데이터가 컴ㅍ터의 수를 맞추면 정답 그 외에는 오답을 출력

		Scanner scan = new Scanner(System.in);

		int comNum = (int) (Math.random() * 5 + 1);
		
		System.out.println("# 컴퓨터와 함께하는 숫자 맞추기 게임 #");

		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		System.out.println("컴퓨터의 숫자는 \'" + comNum + "\', 당신의 숫자는 \'" + num + "\'");
		if (comNum == num) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("오답입니다!");
		}

		/*while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			if (comNum == num) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("오답입니다!");
				if (comNum > num) {
					System.out.println(num + "보다 위\n");
				} else {
					System.out.println(num + "보다 아래\n");
				}
			}
		}*/

	}

}
