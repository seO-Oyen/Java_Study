package javaexp.a04_process;

import java.util.Scanner;

// 0919 do while
public class A09_Do_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 비밀번호 확인 올바른 비밀번호 입력까지 계속 비번 물어보는 내용
		/*String corPass = "java123";
		String inPass;
		
		do {
			System.out.print("비밀번호를 입력 : ");
			inPass = scan.nextLine();
		} while (!inPass.equals(corPass)); // 비밀번호와 입력내용 같지 않을 때 계속 반복
		
		System.out.println("비밀번호 일치! 인증처리");*/
		
		// ex) 점수를 입력받아서 누적합을 출력하되 종료시 0을 입력처리
		
		/*int total = 0;
		int score;
		
		do {
			System.out.print("점수를 입력하세요 (종료시 0) : ");
			score = scan.nextInt();
			
			total += score;
			
		} while(score != 0);
		
		System.out.println("점수 총점 : " + total);*/
		
		// ex) 컴퓨터와 숫자맞추기 게임, 컴퓨터의 임의의 숫자를 맞출때까지 반복하는데 중간에 보다큰지 보다 작은지를 힌트로 준다
		
		/*int comNum = (int)(Math.random() * 100 + 1 );
		int userNum;
		int count = 0;
		
		System.out.println("# 컴퓨터 숫자맞추기 게임 #");
		do {
			System.out.print("숫자를 입력하세요 (1 ~ 100) : ");
			userNum = scan.nextInt();
			
			if (userNum > comNum) {
				System.out.println(userNum + "보다 작습니다.");
				count++;
			} else if (userNum < comNum){
				System.out.println(userNum + "보다 큽니다.");
				count++;
			}
		} while (userNum != comNum);
		System.out.println("정답입니다!\n컴퓨터의 숫자는 " + comNum + ", " + ++count + "번만에 맞추셨습니다!");*/
		
		
		int comNum = (int)(Math.random() * 100 + 1 );
		int userNum;
		int count = 0;
		int gamecount = 0;
		int totalcount = 0;
		
		System.out.println("# 컴퓨터 숫자맞추기 게임 #");
		do {
			System.out.print("숫자를 입력하세요 (1 ~ 100) : ");
			userNum = scan.nextInt();
			
			if (userNum > comNum) {
				System.out.println(userNum + "보다 작습니다.");
				count++;
			} else if (userNum < comNum){
				System.out.println(userNum + "보다 큽니다.");
				count++;
			} else if (userNum == comNum) {
				System.out.println("정답입니다!\n컴퓨터의 숫자는 " + comNum + ", " + ++count + "번만에 맞추셨습니다!");
				gamecount++;
				System.out.println("계속 하시겠습니까? 예 : 1, 아니오 : 0");
				userNum = scan.nextInt();
				
				comNum = (int)(Math.random() * 100 + 1 );
				totalcount += count;
				count = 0;
			}
		} while (userNum != 0);
		
		System.out.println("\n총 " + gamecount + "번 게임하셨고, 총 " + totalcount + "번 도전하셨습니다! 평균 " + (totalcount / gamecount)
				+ "번 만에 맞추셨습니다.");
		

	}

}
