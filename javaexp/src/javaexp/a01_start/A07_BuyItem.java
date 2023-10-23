package javaexp.a01_start;

import java.util.Scanner;

public class A07_BuyItem {

	public static void main(String[] args) {
		/*
		 * java의 입력처리형식 args, scanner 을 통해서 구매할 물건 정보 (물건명, 가격, 갯수) 출력해보기
		 * 1) 만들어진 클래스는 main() 메서드가 있을 때, 아래와 같이 
		 *    1단계로 컴파일을 하면 class 파일이 생성된다.
		 *    ==> javac A07_BuyItem.class (기계어 즉 , 컴퓨터가 인식할 수 있는 binary 파일이 생성)
		 *    2단계로 실행 명령어를 수행하면 main() 가 있는 클래스인 경우 수행하여 처리된다.
		 * 2) 이렇게 수행할 때, 데이터를 이 수행내용에 전달할 때, 다음과 같은 코드로 처리된다.
		 *    java A07_BuyItem 사과 바나나 딸기
		 * 3) A07_BuyItem (클래스파일) 뒤에 있는 사과 바나나 딸기는 
		 * 	  위 main(String[] args = {"사과", "바나나", "딸기"}
		 *    형태로 배열에 할당이 되며,
		 *    이 배열은
		 *    args[0] : "사과"
		 *    args[1] : "바나나"
		 *    args[2] : "딸기" 에 할당이 되어
		 *    사용할 수 있게 된다.
		 * */
		
		// args
		/*System.out.println("물건명\t가격\t갯수");
		System.out.println(args[0] + "\t" + args[1] + "\t" + args[2]);*/
		
		// Scanner
		System.out.println("# 물건 정보(물건명, 가격, 갯수) 입력 #");
		
		Scanner scan = new Scanner(System.in);
		
		/*String itemName = scan.next();
		int price = scan.nextInt();
		int count = scan.nextInt();
		
		System.out.println("물건명\t가격\t갯수");
		System.out.println(itemName + "\t" +price + "\t" + count);*/
		
		System.out.print("물건명 : ");
		String name = scan.nextLine();
		System.out.print("가격 : ");
		String price = scan.nextLine();
		System.out.print("갯수 : ");
		String cnt = scan.nextLine();
		
		System.out.println("# 입력된 물건 정보 #");
		System.out.println(name);
		System.out.println(price);
		System.out.println(cnt);
		
		
	}

}
