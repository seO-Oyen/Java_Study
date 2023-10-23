package javaexp.a04_process;

// 0918 # for문에서 if문 활용
public class A07_For_If {

	public static void main(String[] args) {
		
		// 1 ~ 100까지 출력하되 각 단위별로 기본 탭간격, 5단위 마다 줄바꿈 처리
		
		/*for (int i = 1; i <= 100; i++) {
			System.out.print(i + "\t");
			
			if (i % 5 == 0) {
				System.out.println();
			}
		}*/
		
		// 1 ~ 10까지 홀 / 짝 표시
		/*for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			
			if (i % 2 == 0) {
				System.out.print("(짝)\t");
			} else {
				System.out.print("(홀)\t");
			}
		}*/
		
		// ex) 0 ~ 100 까지 짝수만 출력하기  2, 4, ...
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i != 0) {
				if (i % 10 == 0) {
					System.out.println(i);
					continue;
				}
				System.out.print(i + ", ");
			}
		}
		
		System.out.println("");
		
		// ex) 1 ~ 100 중 3과 5의 공배수 출력하기
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n");
		
		// ex) 1 ~ 100 까지 합계 중 1000을 초과하는 최초의 숫자 출력
		
		int sum = 0;
		boolean isOver = false;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			
			if (sum >= 1000 && !isOver) {
				System.out.println("최초의 숫자 : " + i + ", 합계 : " + sum);
				isOver = true;
			}
		}
		
		System.out.println();
		
		// ex) 1 ~ 100 까지 숫자 중에 7로 나누었을 때 4인 숫자 출력
		
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 4) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n");
		
		// ex) 10 부터 50까지 숫자중에 13으로 나누었을때 떨어지는 첫번째 숫자 출력
		
		for (int i = 10; i <= 50; i++) {
			if (i % 13 == 0) {
				System.out.println(i);
				break;
			}
		}
		
		// 두번째 방법
		int chFirst = 0;
		boolean isFirst = false;
		for (int i = 10; i <= 50; i++) {
			if (i % 13 == 0) {
				if (!isFirst) {
					chFirst = i;
					isFirst = true;
				}
			}
		}
		
		System.out.println(chFirst);

	}

}
