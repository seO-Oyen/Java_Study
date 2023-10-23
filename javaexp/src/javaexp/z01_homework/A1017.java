package javaexp.z01_homework;

import java.util.Scanner;

public class A1017 {

	public static void main(String[] args) {

//		[1단계:개념]  1. 사용자 정의 예외 클래스 생성과 main()에서 호출 규칙을 기술하세요
		/*
		 * Exception을 extends 해야한다.
		 * throw new ~~ 해서 호출하여야한다.
		 * */

//		[1단계:개념]  2. 사용자 정의 예외 클래스의 생성자 호출과 getMessage()와의 관계를 설명하세요.
		/*
		 * 예외 클래스의 생성자는 보통 2개를 만들며, 하나는 매개변수 없이, 하나는 매개변수(String) 있게 만든다.
		 * 매개변수를 받는 이유는 예외 발생 원인을 전달해주기 위해 매개변수를 갖는다. 
		 * String 매개변수를 이용해 메세지를 갖는 생성자를 사용하여 예외객체를 생성하면 메세지는 자동적으로 객체 내부에 저장된다.
		 * 
		 * */

//		[1단계:확인]  3. 사용자 정의 예외 클래스를 필드, 생성자, 재정의, 추가 정의 메서드를 포함해서 정의하고 호출해 보세요.
		/*
		 * class A extends Exception {
		 * 		public A () {}
		 * 		public A (String msg) {
		 * 			super(msg);
		 * 		}
		 * 		@Override
		 * 		public String getMessage() {
		 * 			return super.getMessage() + "(사용자 정의)";
		 * 		}
		 * }
		 * class B {
		 * 		public static void main(String[] args) {
		 * 			try {
		 * 				throw new A("메세지");
		 * 			} catch (A a) {
		 * 				System.out.println(a.getMessage());
		 * 			}
		 * 		}
		 * }
		 * 
		 * */

//		[1단계:개념]  4. "안녕"과 new String("안녕")의 heap메모리상의 차이점으로 이야기하세요.
		/*
		 * 문자열 바로 대입한 것은 문자열이 같으면 모두가 주소가 같음
		 * 모든 객체들은 heap영역에 실제 객체를 두고, 그 heap영역의 위치(주소값/참조변수)를 stack에 할당하여 사용
		 * */

//		[1단계:확인]  5. new String(byte[])을 이용하여, 영문 소문자을 임의로 비번호를 만들어 출력하세요.
		/*for (int i = 0; i < 125; i++) {
			System.out.println(i + " : " + (char)i);
		}*/
		/*byte[] bytes = new byte[6];
		for (int i = 0; i < 6; i++) {
			bytes[i] = (byte)(Math.random() * 26 + 97);
		}
		System.out.println(new String(bytes));*/

//		[1단계:개념]  6. 자바의 최상위 클래스는 무엇이고 사용되는 메서드 toString() 어떤 역할을 하는가?
		/*
		 * 최상위 클래스 : Object
		 * toString 은 문자열을 리턴해준다.
		 * */

//		[1단계:확인]  7. String civil="021214-2801512";에서 charAt()를 이용해서  @@@년 @@월 @@일생 남/여  출력
		/*String civil = "021214-2801512";
		String year = "";
		String month = "";
		String day = "";
		year += civil.charAt(0);
		year += civil.charAt(1);
		month += civil.charAt(2);
		month += civil.charAt(3);
		day += civil.charAt(4);
		day += civil.charAt(5);
		if (civil.charAt(7) == '1' || civil.charAt(7) == '3') {
			System.out.println(year + "년 " + month + "월 " + day + "일생 남자");
		} else {
			System.out.println(year + "년 " + month + "월 " + day + "일생 여자");
		}*/

//		[1단계:확인]  8. String cartList로 장바구니 담긴 물건을 할당하고, Scanner를 입력하여 장바구니 담긴 여부를 처리하세요..
		/*Scanner scan = new Scanner(System.in);
		String basket = "사과, 바나나, 딸기, 멜론, 컴퓨터";
		System.out.print("물건 입력 : ");
		String item = scan.nextLine();
		
		if (basket.indexOf(item) != -1) {
			System.out.println(item + " 장바구니에 들어있습니다.");
		} else {
			System.out.println(item + " 장바구니에 없습니다.");
		}*/

//		[1단계:확인]  9. 문자열 데이터 :홍길동&70&80-김길동&90&85-신길동&95&75
//				for문을 2중으로 사용 처리..
//				      홍길동 70	80 
//				      김길동 90	85 
//				      신길동 95	75 
		/*String[] spString = "홍길동&70&80-김길동&90&85-신길동&95&75".split("&");
		
		for (int i = 0; i < spString.length; i++) {
			if (spString[i].indexOf("-") != -1) {
				for (int j = 0; j < spString[i].length(); j++) {
					if (spString[i].charAt(j) == '-') {
						System.out.println();
						continue;
					}
					System.out.print(spString[i].charAt(j));
					
				}
				System.out.print(" ");
				continue;
			}
			System.out.print(spString[i] + " ");
		}*/

//		[1단계:개념]  10. StringBuffer와 String의 차이점을 기본 예제를 통해서 설명하세요.
		/*
		 * StrngBuffer는 값을 추가해도 주소값이 안변함
		 * String은 += 을 통해 값을 추가하면 주소값이 변경됨
		 * 
		 * String name1 = "김길동";
		 * name1 += "!";
		 * System.out.println(System.identityHashCode(name1));
		 * 
		 * StringBuffer sb = new StringBuffer("반갑습니다.");
		 * System.out.println("초기 주소값 : " + System.identityHashCode(sb));
		 * sb.append("홍");
		 * System.out.println("추가 후 주소값 : " + System.identityHashCode(sb));
		 * */

	}

}
