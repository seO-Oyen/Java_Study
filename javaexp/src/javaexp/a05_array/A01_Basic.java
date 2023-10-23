package javaexp.a05_array;

// 0919 # 객체형태의 메모리 구조
public class A01_Basic {
	
	public static void main(String[] args) {
		
		
		/*int intArry[]; // 배열 선언
		intArry = new int[5]; // 배열의 초기값 할당 된 heap영역 선언
		System.out.println("int형 배열의 참조변수 : " + intArry);
		
		System.out.println(intArry[0]);
		System.out.println(intArry[1]);
		System.out.println(intArry[2]);
		System.out.println(intArry[3]);
		System.out.println(intArry[4]);*/
		
		// ex) long형 3개짜리 배열을 선언, 첫번째 데이터 출력
		long longArray[] = new long[3];
		System.out.println(longArray[0]);
		
		// ex) double 형 5개짜리 배열 선언/ 생성 참조변수 호출 두번째 데이터 출력
		double doubleArray[] = new double[5];
		System.out.println(doubleArray + " " + doubleArray[1]);
		
		// ex) String형 3개짜기 배열 선언 / 생성 1번째 데이터 출력
		String stringArray[] = new String[3];
		System.out.println(stringArray[0]);
		
	}
	

}
