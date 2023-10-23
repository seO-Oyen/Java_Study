package javaexp.z01_homework;

import java.util.Scanner;

public class A0918_HomeWork {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// ex) 커피의 종류를 입력하면 해당 커피의 가격을 출력하는 프로그램을 작성해보세요.
		/*		System.out.println("# 커피 종류 #");
				System.out.println("에스프레소, 아메리카노, 카페라테, 카푸치노, 카페모카");
				System.out.print("메뉴를 입력하세요 : ");
				String coffeMenu = scan.nextLine();
				int price = 0;
				
				switch (coffeMenu) {
					case "에스프레소":
						price = 2500;
						break;
					case "아메리카노":
						price = 3000;
						break;
					case "카페라테":
						price = 3500;
						break;
					case "카푸치노":
						price = 4000;
						break;
					case "카페모카":
						price = 5000;
						break;
					default:
						System.out.println("해당 메뉴는 없는 메뉴입니다.");
				}
				System.out.println(coffeMenu + "는 " + price + "원 입니다.");
				
		// ex) 월(1-12)을 입력받아 해당 월의 계절을 출력하세요.
		/*System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		
		switch (month) {
			case 3, 4, 5: 
				System.out.println(month + "월은 봄입니다.");
				break;
			case 6, 7, 8: 
				System.out.println(month + "월은 여름입니다.");
				break;
			case 9, 10, 11: 
				System.out.println(month + "월은 가을입니다.");
				break;
			case 12, 1, 2: 
				System.out.println(month + "월은 겨울입니다.");
				break;
		}
		
		System.out.println("\n----------------------------------------------\n");*/
		
		// ex) 도형 이름(직사각형, 원, 삼각형)을 입력 받아, 해당하는 도형의 넓이를 계산하여 출력하세요. 
		/*System.out.print("도형을 입력하세요 : ");
		String shapes = scan.next();
		
		switch (shapes) {
			case "직사각형" :
				System.out.print("가로길이를 입력하세요 : ");
				int width = scan.nextInt();
				System.out.print("세로길이를 입력하세요 : ");
				int height = scan.nextInt();
				
				System.out.println("직사각형의 넓이는 " + (width * height) + "입니다.");
				break;
				
			case "원" :
				System.out.print("반지름 길이를 입력하세요 : ");
				int radius = scan.nextInt();
				
				System.out.println("원의 넓이는 " + (radius * radius * Math.PI) + "입니다.");
				
				break;
				
			case "삼각형" :
				System.out.print("밑변길이를 입력하세요 : ");
				int tWidth = scan.nextInt();
				System.out.print("높이길이를 입력하세요 : ");
				int tHeight = scan.nextInt();
				
				System.out.println("삼각형의 넓이는 " + (tWidth * tHeight * 0.5));
				
				break;
			default : 
				System.out.println("직사각형, 원, 삼각형만 입력해주세요.");
		}*/
		
		// ex) 200~300 10단위 출력
		/*for (int i = 200; i <= 300; i += 10) {
			System.out.print(i + " ");
		}*/
		
		// ex) 1000~950 3단위 감소
		/*for (int i = 1000; i >= 950; i -= 3) {
			System.out.print(i + " ");
		}*/
		
		// ex) 100~0까지 2로 나눈값
		/*for (int i = 100; i >= 0; i--) {
			System.out.print((i / 2) + " ");
		}*/
		
		// ex) 김밥의 단가를 입력받아서 1~20개의 갯수별 총가격을 출력하세요.
		/*System.out.print("김밥의 단가를 입력하세요 : ");
		int price = scan.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("김밥 " + i + "개의 총 가격 : " + (i * price));
		}*/
		
		// ex) 입력할 과일의 3개의 과일명과 과일가격을 입력받아, 아래 형식으로 출력하되 총비용을 출력 하세요
		// no 과일명 가격
        // 1 사과 3000            
        // 2 바나나 4000           
        // 3 딸기 12000
        //   총계 19000  
		
		// 방법 1
		/*int total = 0;
		
		String[] name = new String[3];
		int[] price = new int[3];
		
		
		for (int i = 0; i < 3; i++) {
			System.out.print("과일명을 입력해주세요 : ");
			name[i] = scan.next();
			System.out.print("가격을 입력해주세요 : ");
			price[i] = scan.nextInt();
			total += price[i];
			
			
			if (i == 2) {
				System.out.println("No.\t과일명\t가격");
				System.out.println("1" + "\t" + name[0] + "\t" + price[0]);
				System.out.println("2" + "\t" + name[1] + "\t" + price[1]);
				System.out.println("3" + "\t" + name[2] + "\t" + price[2]);
			}
			
		}
		System.out.println("\t총계\t" + total);*/
		
		// 방법 2
		/*System.out.print("과일명을 입력해주세요 : ");
		String name1 = scan.next();
		String name2 = scan.next();
		String name3 = scan.next();
		
		System.out.print("가격을 입력해주세요 : ");
		int price1 = scan.nextInt();
		int price2 = scan.nextInt();
		int price3 = scan.nextInt();
		
		System.out.println("No.\t과일명\t가격");
		System.out.println("1" + "\t" + name1 + "\t" + price1);
		System.out.println("2" + "\t" + name2 + "\t" + price2);
		System.out.println("3" + "\t" + name3 + "\t" + price3);
		System.out.println("\t총계\t" + (price1 + price2 + price3));*/

		// 방법 3
		/*int totlal = 0;
		String prn = "no\t과일명\t가격\n";
		
		for (int i = 1; i <= 3; i++) {
			System.out.print(i + "번째 과일명 입력 : ");
			String fruitName = scan.nextLine();
			System.out.println(fruitName + "의 가격 : ");
			int price = scan.nextInt();
		}
		*/
		
		// ex) 곰돌이가 하루 빵을 2개씩 증가해서 먹어(첫째날 2개, 둘째날 4개, 셋째날 6개 ...) 
		//     총 10일 동안 먹은 빵의 갯수를 누적하여 아래와 같이 출력하세요
		
		/*int bread = 0;
		int total = 0;
		
		System.out.println("날짜\t갯수\t누적");
		
		for (int i = 1; i <= 10; i++) {
			bread += 2;
			total += bread;
			
			System.out.println(i + "일차\t" + bread + "개\t" + total + "개");
			
		}*/
		
		// ex) 100까지 4의 배수만 # 표시 및 합산,그 외는 숫자 표시, 하단에 4의 배수 합산표시.
		
		/*int total = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.print("# ");
				total += i;
			} else {
				System.out.print(i + " ");
			}
			
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println("4의 배수 합계 : " + total);*/
		
		// ex) 3,6,9게임을 출력하세요(20까지)- 마지막에 3이 포함될 때 처리
		
		/*for (int i = 1; i <= 20; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");
			}
		}*/
		
		for (int i = 1; i <= 20; i++) {
			if (i % 10 != 0  && i % 10 % 3 == 0) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");
			}
		}

	}

}
