package javaexp.a02_var;

// class 클래스명 : 영어 대문자로 시작 **규칙**
public class A01_DeclareVar {

	public static void main(String[] args) {

		/*
		 * # 변수의 선언
			1. 기본 형식
			   1) 선언 (데이터유형 변수명;)
			   	ex) int num01;
			   2) 할당 (변수명 = 데이터;)
			   	ex) num01 = 25;
			   3) 활용
			        출력 System.out.println(변수명);
				데이터 변수에 할당 및 연산 : 다른변수명 = 변수명 + 25;
				ex) int num02 = num01 + 25;
			2. 응용 (복합)
			   1) 선언 + 할당
				데이터유형 변수명 = 데이터;
				ex) int num02 = 30;
			   2) 선언 + 할당 + 대입
				데이터유형 변수명 = 변수명 + 데이터;
			
			3. 주의 (에러발생)
			   1) 변수는 기본적으로 초기화하지 않으면 사용(활용) 할 수 없다.
			      즉, 최소한 데이터를 할당한 후에 사용해야지 선언으로 사용할 수 없다.
			      ex) int num01;
			          System.out.println(num01); (X)
			          int num02 = num01 + 25; (X)
		 * */

		// 숫자형 데이터의 기본 데이터인 정수형 데이터 선언
		/*int num01;	// 선언
		num01 = 25; // 할당
		System.out.println(num01);	// 출력
		int num02 = num01 + 25;		// 다른 변수에 재할당
		System.out.println(num02);
		
		// 출력시 +(연결) 을 통해서 문자열과 함께 출력 가능
		System.out.println("첫번째 정수 : " + num01);
		System.out.println("두번째 정수 : " + num02);*/

		/* ex) 물건의 가격을 선언 / 할당 분리하고, 물건의 갯수는 선언 + 할당 동시에 하여
		       물건의 가격 : @@
		       물건의 갯수 : @@
		       형식으로 출력되게 하세요 */

		/*int price;
		price = 2000;
		int count = 3;
		int total = price * count;
		
		System.out.println("\n물건의 가격 : " + price);
		System.out.println("물건의 갯수 : " + count);
		System.out.println("총 예산 : " + total);*/

		/*
		 * ex) 국어, 영어, 수학 점수를 선언과 할당하고
		 * 	   총점(+), 평균(/) 연산자를 활용해서 총점과 평균을 출력하세요.
		 * */

		/*int kor = 50;
		int eng = 62;
		int math = 74;
		int total2 = kor + eng + math;
		int avg = total2 / 3;
		
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("총점 : " + total2);
		System.out.println("평균 : " + avg);*/
//		System.out.println("평균 : " + total2 / 3);

		// 자바 10 이후에는 var 변수로 데이터가 할당된 후 데이터 유형이 정해지게 처리하였다.
		/*var num01 = 25;
		var str01 = "안녕";
		System.out.println("num01 : " + num01);
		System.out.println("str01 : " + str01);*/

		/*
		 * # 문자열의 데이터 처리
		   1. 문자열(문자의 배열) 데이터는 일반적으로 많이 사용하는 문자데이터 처리를 위한 것이다.
		      배열이기에 객체 개념이 포함해서 기본 데이터 유형에는 포함되지 않는다.
		   2. 아래와 같이 선언하여 사용하는 것을 확인해보자
		   ex) String str01 = "문자열1";
		       String str02 = "홍길동";
		       var name01 = "사과";
		 * */

		/*String str02 = "홍길동";
		var name01 = "사과";
		System.out.println("이름 : " + str02);
		System.out.println("과일명 : " + name01);*/
		
		/*
		 * ex1) 다음의 변수를 선언하고 초기화 처리
		 *      1) 정수형 변수 age에 25를 할당하세요.
		 *      2) 문자열 변수 name에 "John"을 할당하세요.
		 *      3) 문자열 변수 greeting에 "Hello, "를 할당하고,
		 *         문자열 변수 person에 "Alice"를 할당하세요.
		 *         두 변수를 사용하여 "Hello, Alice"라는 메시지를 출력하는 코드를 작성하세요 ((+) 활용)
		 * */
		
		int age = 25;
		String name = "John";
		String greeting = "Hello, ";
		String person = "Alice";
		
		System.out.println("age : " + age);
		System.out.println("name : " + name);
		System.out.println(greeting + person);

	}

}
