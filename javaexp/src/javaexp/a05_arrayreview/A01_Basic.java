package javaexp.a05_arrayreview;

public class A01_Basic {

	public static void main(String[] args) {
		/*
		 * # 배열 객체
		 * 1. 같은 유형의 데이터 여러개를 하나의 메모리에 할당하여 처리
		 * 		ex) 기차의 호차
		 * 2. 메모리 입장
		 * 		1) stack : heap 영역의 주소값 할당
		 * 		2) heap : 실제 배열 객체 저장
		 * */
		
		// 배열의 선언 (heap 영역할당 X, 선언)
		int[] intArray; // 정수형 배열 선언
		double[] doubleArray; // 실수형 배열 선언
		String[] strArr; // 문자열 배열 선언
		// 배열의 할당 (heap 영역에 메모리 할당
		// 1) 크기지정 : 각 구성요소 (index)에 초기값을 할당 \
		intArray = new int[5];
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		// ex) 정수형 pts 3개짜리 배열 선언하고, 초기값을 확인하세요
		int[] pts = new int[3];
		System.out.println(pts[0]);
		System.out.println(pts[1]);
		System.out.println(pts[2]);
		// 각 배열의 구성요소에서 할당 처리
		pts[0] = 70;
		pts[1] = 80;
		pts[2] = 90;
		
		strArr = new String[3];
		System.out.println(strArr[0]);
		strArr[0] = "오렌지";
		strArr[1] = "사과";
		strArr[2] = "바나나";
		
		/*
		 * 1. 어떤 데이터를 배열 처리할것인가?
		 * 		기본 데이터 유형 ==> 배열 ==> 객체
		 * 		String ==> 배열 ==> 객체
		 * 		Person ==> 배열 ==> 객체
		 * 2. 초기 크기를 통해서 선언하는 방법
		 * 		new 데이터유형[크기];
		 * 		참조변수.length
		 * 3. 초기값에 할당 된 내용
		 * 4. index란 무엇인가? index를 통해서 할당 및 호출
		 * 		배열명[0] : 저장/호출
		 * */
		System.out.println("배열의 크기 : " + intArray.length);
		// 자바에서 배열의 선언과 바로 데이터 할당 (java차이가 있다)
		int pts2[] = {70, 80, 90}; // [70, 80, 90] => 대부분의 프로그램
		int pts3[];
		pts3 = new int[] {80, 90, 100};
		// 선언후 할다시는 new 데이터 유형[] 으로 하여야 한다.
		// pts3 = {90, 100, 70}; // 에러발생
		System.out.println(pts3[0]);
		System.out.println(pts3[1]);
		System.out.println(pts3[2]);
		
		// ex1) double 형으로 선언과 초기화를 바로 처리하는 배열 3개
		double[] doubleArray2 = {10.2, 30.5, 34.6};
		System.out.println(doubleArray2[0]);
		System.out.println(doubleArray2[1]);
		System.out.println(doubleArray2[2]);
		
		// ex2) boolean형으로 선언후 초기값 설정 처리하는 배열 5개 처리
		boolean[] booleanArray = {true, false, true, true, false};
		System.out.println(booleanArray[0]);
		System.out.println(booleanArray[1]);
		System.out.println(booleanArray[2]);
		System.out.println(booleanArray[3]);
		System.out.println(booleanArray[4]);

	}

}
