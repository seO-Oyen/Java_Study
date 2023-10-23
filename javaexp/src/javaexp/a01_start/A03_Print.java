package javaexp.a01_start;

public class A03_Print {

	public static void main(String[] args) {
		
		// ctrl + alt + 화살표 아래 : 해당 커서의 라인 복사
		
		System.out.println("안녕1");
		System.out.println("안녕2");
		System.out.println("안녕3");
		// println() : 라인 단위로 명령을 출력

		System.out.print("사과 ");
		System.out.print("바나나 ");
		System.out.print("딸기 \n\n");
		// print() : 줄바꿈 없이 명령을 출력
		
		// ex 1) 친구 3명의 이름을 줄바꾸기로 출력하고,
		// ex 2) 좋아하는 음식 3가지를 , (콤마) 단위로 줄바꾸지 않고 출력해보세요.
		
		System.out.println("자야스 아키라");
		System.out.println("김채현");
		System.out.println("김설\n");
		
		System.out.print("치킨, ");
		System.out.print("고기, ");
		System.out.print("규카츠\n\n");
		
		/*
		 * # 줄바꿈과 탭 간격 특수문자 처리
		 * 1. 문자열출력 명령문 안에서 바로 줄바꿈 처리를 할려면 '\n' 을 포함하여야 한다.
		 * 2. 문자열 출력 명령문에서 탭 간격으로 데이터를 출력 처리하려면 '\t' 를 포함하여 처리한다.
		 * */
		
		System.out.println("사과\n바나나\n딸기\n오렌지");
		System.out.println("no\t물건명\t가격");
		System.out.println("1.\t사과\t3000");
		System.out.println("2.\t바나나\t4000");
		System.out.println("3.\t딸기\t12000");

		// ex 3) println 으로 학생 3명의 국어점수를 줄바꾸어 출력하세요
		// ex 4) 학생의 번호, 이름, 영어점수를 탭 간격으로 처리하여 출력하세요
		System.out.println("홍길동 : 100\n김길동 : 90\n이길동 : 80");
		System.out.println("번호\t이름\t점수");
		System.out.println("1\t홍길동\t100");
		System.out.println("2\t김길동\t90");
		System.out.println("3\t이길동\t80");
		
		
		/*
		 * # printf("출력 format만들기", 매핑할 변수)
		 *   - 형식을 선언 후해당 형식안에 들어갈 데이터를 처리하는 방식 
		 * */
		
		String name = "홍길동";
		int age = 25;
		double salary = 5000.51234;
		
		System.out.printf("이름 : %s%n", name);
		System.out.printf("나이 : %d%n", age);
		System.out.printf("연봉 : %.2f%n", salary);
		
		// %s : 문자열 데이터 처리
		// %d : 정수형 데이터 처리
		// %f : 실수형 데이터 처리
		// %자리수s : 자리수와 문자열 데이터 유형 처리 
		// %자리수d : 자리수와 정수형 데이터 유형 처리 
		// %소숫점이상.소숫점이하s : 자리수와 실수형데이터 유형 처리 
		
		
		
	}

}

