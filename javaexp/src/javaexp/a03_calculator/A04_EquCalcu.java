package javaexp.a03_calculator;

import java.util.Scanner;

public class A04_EquCalcu {

	public static void main(String[] args) {

		/* 두개이상의 조건이 모두 다 true 일 때 
		* 1) 숫자인 경우 연속된 범위에 있을 때
		*    청소년 요금제 범위 (나이가 14 ~ 19) 
		*    점수의 유효 범위 (0 ~ 100)
		* 2) 입력된 id와 pass가 다 맞을 때 인증여부가 true 처리
		*    String 객체 api에서 한번 더 언급 (java)
		* */

		Scanner scan = new Scanner(System.in);

		/*int inputAge = 18;
		boolean isAdolPay = inputAge >= 14 && inputAge <= 19;
		
		System.out.println("입력한 나이 : " + inputAge);
		System.out.println("청소년 요금제 여부 : " + isAdolPay);*/
		
		// ------------------------------------------------------------

		/*System.out.println("# 로그인 #");
		System.out.print("아이디 입력 : ");
		String id = scan.nextLine();
		
		// == : stack 영역의 데이터 비교
		// equals() : 문자열을 비교할 때는 해당 메서드 사용
		System.out.println("himan 여부 : " + (id == "himan"));
		System.out.println("himan 여부 : " + (id.equals("himan")));
		
		System.out.print("패스워드 입력 : ");
		String pass = scan.nextLine();
		
		System.out.println("입력한 아이디 : " + id);
		System.out.println("입력한 패스워드 : " + pass);
		
		// himan과 7777입력시 로그인이 성공
		boolean isValid = id.equals("himan") && pass.equals("7777");
		
		System.out.println("로그인 성공 여부 : " + isValid);*/
		
		// --------------------------------------------------------------
		
		// ex1) 점수를 입력해서 입력된 점수가 유효한지 여부를 출력하세요. 유효범위 (0 ~ 100)
		
		/*System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		boolean isScore = 0 <= score && score <= 100;
		
		System.out.println("점수 유효 여부 : " + isScore);*/
		
		// --------------------------------------------------------------
		
		/*
		 * # !(not) : 부정연산자
		 * 1. 논리식을 처리할 때 true이면 false, false이면 true를 처리해야 하는 경우 
		 * 2. 기본적인 비교연산식을 true <=> false 로 처리할 뿐 아니라
		 *    and, or 가 포함된 논리 연산자는 !을 통해서 드모르강 법칙이 적용된 내용을 처리해준다.
		 *    조건1 && 조건2 ==> 조건1이 true이고 조건2가 true일 때
		 *    !(조건1 && 조건2) ==> 드모르강법칙에 의해
		 *    !조건1 || !조건2 ==> 처리
		 *    ex) himan / 7777 이 인증조건이라면 로그인 되지 않을 조건은 himan이지 않거나
		 *        7777이 아닌경우를 말한다.
		 * */
		
		/*int pt = 70;
		boolean isPass = pt >= 70;
		
		System.out.println("합격 여부 : " + isPass);
		System.out.println("불합격여부 : " + !isPass);
		
		int age = 20;
		boolean isFree = age >= 65 || age < 3;
		
		System.out.println("무료여부 : " + isFree);
		System.out.println("유료여부 : " + !isFree);*/
		
		// 1 ~ 10 까지 임의의 수를출력하고 
		// 1. 홀수이면서 3의 배수인 경우와
		// 2. 짝수이거나 3의 배수가 아닌 경우를 위 !(not)연산자를 이용해서 출력
		
		int num = (int)(Math.random() * 10 + 1);
		
		boolean isOdd = num % 2 == 1 && num % 3 == 0;
		boolean isEven = !(num % 2 == 1 && num % 3 == 0);
		
		System.out.println("나온 수 : " + num);
		System.out.println("홀수 & 3의 배수 여부 : " + isOdd);
		System.out.println("짝수 | 3의 배수X 여부 : " + isEven);
		

	}

}
