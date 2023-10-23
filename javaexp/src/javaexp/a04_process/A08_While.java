package javaexp.a04_process;

import java.util.Scanner;

// 0919 # while문
public class A08_While {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*int cnt = 1;
		while (cnt <= 10) {
			System.out.println((cnt++) + "번째 반복");
		}*/
		
		
		// ex) while문을 이용해서 10 ~ 20 까지 출력
		
		/*int count = 10;
		while (count <= 20) {
			System.out.print((count++) + " ");
		}*/
		
		// ex) Scanner를 이용해서 회원명을 등록하고 종료시 ! 로 처리하세요
		/*String memberList = "";
		String data = "";
		while (!data.equals("!")) {
			System.out.print("회원명을 입력하세요(종료시 !) : ");
			data = scan.nextLine();
			
			if (!data.equals("!")) {
				memberList += data + "\t";
				System.out.print("포인트를 입력하세요 : ");
				data = scan.nextLine();
				memberList += data + "\n";
			}
		}
		System.out.println("\n# 회원 리스트 #");
		System.out.println(memberList);*/
		
		
		// 구매할 과일명을 입력 받아 리스트 하고, 종료할때 Q 를 입력처리
		/*String fruitList = "";
		String inData = "";
		
		while (!inData.equals("Q")) {
			System.out.print("구매할 과일명을 입력 (종료시 Q) : ");
			inData = scan.nextLine();
			if (!inData.equals("Q")) {
				fruitList += inData + " ";
			}
		}
		System.out.println("# 구매할 과일 리스트 #");
		System.out.println(fruitList);*/
		
		// while (true) {} : 무한 반복
		// if (조건) break; : 반복문을 중단 처리할 때
		
		/*String stList = "";
		
		while (true) {
			System.out.print("학생명 등록 (종료시 Q) : ");
			String stName = scan.nextLine();
			
			if (stName.equals("Q")) {
				break; // Q입력시 break -> 반복 종료
			} else {
				System.out.println("등록 학생명 : " + stName);
				stList += stName + ", ";
			}
		}
		
		System.out.println("등록된 학생\n" + stList);*/
		
		// 번호별로 학생의 점수를 입력 받아서 총점과 평균 처리
		/*int no = 0;
		int total = 0;
		
		while (true) {
			System.out.print(++no + "번째 학생의 점수 입력 (종료시 -1) : ");
			int point = scan.nextInt();
			
			if (point == -1) {
				--no;
				break;
			} else {
				total += point;
			}
		}
		
		System.out.println(no + "명의 학생의 점수");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (total / no));*/

		// ex) while / break 를 이용해서 좋아하는 점심 메뉴를 입력받아서 최종적으로 출력하세요. 종료시(!)로 처리
		
		String menuList = "";
		int no = 0;
		
		while (true) {
			System.out.print("좋아하는 점심 메뉴를 입력하세요 (종료시 !) : ");
			String data = scan.nextLine();
			
			if (data.equals("!")) {
				break;
			} else {
				menuList += ++no + "\t"+ data + "\n";
			}
		}
		System.out.println("# 점심 메뉴 리스트 #");
		System.out.println(menuList);
		
		
	}

}
