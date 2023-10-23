package javaexp.a04_process;

public class A10_Continue_Break {

	public static void main(String[] args) {

		/*int grade = (int)(Math.random() * 8 + 2);
		for (int i = 1; i <= 9; i++) {
			if (i == 4) continue;
			if (i == 8) break;
			System.out.println(grade + " X " + i + " = " + (grade * i));
		}*/
		
		// 1 ~ 10 까지 홀수만 출력
		/*for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue;
			System.out.print(i + "  ");
		}*/
		
		// 합계가 50 넘는 시점에 출력 및 중단 처리
		/*int sum = 0;
		int cnt = 0;
		while (true) {
			cnt++;
			sum += cnt;
			if (sum > 50) {
				System.out.println("합계가 50이 넘는 최초 : " + cnt);
				System.out.println("합계 : " + sum);
				break;
			}
		}*/
		
		// ex) 1 ~ 50 까지 출력하되 5의 배수는 제외하고 출력 
		/*for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}*/
		
		// ex) 구구단 5단을 출력하되 * 7일때 중단처리
		for (int i = 1; i <= 9; i++) {
			if (i == 7) {
				break;
			}
			System.out.println("5 X " + i + " = " + (5 * i));
		}
		
		
	}

}
