package javaexp.a04_process;

// 0918
public class A06_UsingFor {

	public static void main(String[] args) {
		
		/*int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i + " + ");
		}
		System.out.println("합계 : " + sum);
		
		System.out.println();
		
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + "! ");
		}
		
		System.out.println();
		
		for (int cnt = 1; cnt <= 10; cnt++) {
			System.out.print(cnt + "\t");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.print("짝,  ");
			} else {
				System.out.print(i + ", ");
			}
		}*/
		
	
		// ex) 100 부터 120까지 아래와 같이 출력
		//     100 102 104  106 .....
		
		for (int i = 100; i <= 120; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		// ex) 50 부터 카운트 다운 10까지 50#45#40#...10
	
		for (int i = 50; i >= 10; i -= 5) {
			System.out.print(i + "#");
		}
		
		System.out.println("\n");
		
		// ex) 과일의 단가 입력 개당 @@@원 1개 @@@원 2개 @@@원... 10개 @@@원
		
		int price = 1230;
		for (int i = 1; i <= 10; i++) {
			System.out.println("과일 " + i + "개 " + (price * i));
		}
		
		System.out.println();
		
		// ex) 200 + 199 + 198 + ...150  합산
		
		int sum = 0;
		for (int i = 200; i >= 150; i--) {
			sum += i;
			if (i == 150) {
				System.out.print(i + " = ");
				break;
			}
			System.out.print(i + " + ");
		}
		System.out.println(sum);
		
		System.out.println("");
		
		// ex) 1 ~ 10까지 홀수의 합산 / 짝수의 합산
		
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("홀수 합계 : " + oddSum + ", 짝수 합계 : " + evenSum);
		
		System.out.println("");
		
		// ex) 1 ~ 10번의 학생의 임의 점수
		//     번호     점수
		//      1        70
		//      2        80
		//    ...
		//      총점    @@@
		//      평균     @@
		
		int total = 0;
		double avg = 0;
		
		System.out.println("번호\t점수");
		for (int i = 1; i <= 10; i++) {
			int score = (int)(Math.random() * 101);
			System.out.println(i + "\t" + score);
			total += score;
		}
		avg = total / 10.0;
		System.out.println("총점\t" + total);
		System.out.println("평균\t" + avg);
		
		System.out.println("\n");
		

	}

}
