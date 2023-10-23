package javaexp.a02_var;

public class A02_PrimitiveDataType {

	public static void main(String[] args) {

		/*
		 * # 자바의 stack 영역에서 사용되는 기본 데이터 유형 (p.30 ~ p.34)
			1. 숫자형
			   1) 정수형
			      - byte : 1byte(8bits) :  -128 ~ 127
			        ex) byte num01 = 25;
			      - short : 2byte(16bits)
			      - int : 4byte(32bits) : -2147483648 ~ 2147483647	** 정수형의 default
			      - long : 8byte(64bits)
			
			   2) 실수형 : 소숫점 이하 처리
			      - float : 4byte
			      - double : 8byte	**실수형의 default
			2. 문자형 (char)
			   - 문자형은 정수형에서 파생된 것으로 2byte로 정수형 0 ~ 65535범위의 코드값을 유니코드값으로 연결하여 처리한 것
			     보통 영문은 1byte로 표현을 할 수 있고, 한글이나 기타 언어는 2byte범위로 표현
			   - char ==> char[] ==> String
			    (문자)  (문자배열)  (문자배열의 type화하여 객체처리)
			     ex) char c01 = 'A';
			         int c01Va1 = (int)c01;
				 int c02Val = 66;
				 char c02 = (char)c02Val;
			3. 논리형
			   - boolean값을 true / false값을 할당할 수 있는 데이터 유형
		 * */

		/*byte byte01 = 25;
		//		byte byt02 = 225; // 범위를 벗어나고 기본 정수형 데이터는 default로 int형이기에 에러가 발생
		short short01 = 35;
		// 2byte 범위의 데이터를 할당할 때 사용된다
		// 주의 ) byte, short 범위라하더라도 +(연산자) 가 들어가는 순간 이것을 할당할 수 있는 범위는 int형 이상이어야한다
		byte byte03 = 30;
		//		byte sumByte = byt01 + byte03;
		int sumByte01 = byte01 + byte03;
		
		for (int i = 0; i <= 255; i++) {
			System.out.println(i + " : " + (char)i);
		}
		
		// 랜덤변수 : 특정한 숫자 범위를 지정해서 임의로 숫자 처리
		long maxNumOver = 21474836472L;
		System.out.println(maxNumOver);
		
		float num03 = 3.41f;
		System.out.println("실수1 (float) : " + num03);
		double num04 = 3.14;
		System.out.println("실수2 (doubel) : " + num04);
		
		// int ==> char ==> char[] ==> String
		// char 유형 선언
		char c01 = 'A';
		char c02 = '홍';
		int c01Val = c01; // 숫자형 코드값으로 변환
		int c02Val = c02;
		System.out.println(" # char 유형 데이터 확인 # ");
		System.out.println(c01);
		System.out.println(c02);
		System.out.println(c01Val);
		System.out.println(c02Val);*/

		/*
		 * # 다음의 데이터 유형을 사용하여 변수를 선언하고 초기화하세요.
		 * int 유형의 변수 largeNumber에 1000000을 할당하세요.
		 * long 유형의 변수 veryLargeNumber에 5000000000L을 할당하세요.
		 * float 유형의 변수 smallDecimal에 3.14f를 할당하세요
		 * double 유형의 변수 largeDecimal에 2.718281828459045를 할당하세요
		 * char 유형의 변수 letter를 선언하고, 'K'를 할당한 후 해당 문자의 유니코드 값을 출력하는 코드를 작성하세요
		 * */

		/*		int largeNumber = 1000000;
				long veryLargeNumber = 5000000000L;
				float smallDecimal = 3.14f;
				double largeDecimal = 2.718281828459045;
				char letter = 'K';
		
				System.out.println(largeNumber);
				System.out.println(veryLargeNumber);
				System.out.println(smallDecimal);
				System.out.println(largeDecimal);
				System.out.println((int) letter);*/

		// # boolean형 데이터 유형
		/*boolean isTrue = true;
		boolean isFalse = false;
		boolean isOver = 10000 >= 9000; // 비교연산자를 이용해서 true / false값을 가져올 수 있다.
		
		System.out.println(isTrue);
		System.out.println(isFalse);
		System.out.println(isOver);*/

		// ex) 정수형 데이터로 점수 80점을 point01 변수에 할당하고
		// boolean형 isPass로 70점 이상일 때 (>=)로 선언하여 합격여부를 출력하세요
		int point01 = 80;
		boolean isPass = point01 >= 70;

		System.out.println(isPass);	

	}

}
