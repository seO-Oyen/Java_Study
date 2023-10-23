package javaexp.a10_api;

public class A02_String {

	public static void main(String[] args) {
		
		/*
		 * # String
		 * 
		 * 1. 문자열형 객체형 데이터
		 * 		char ==> char[] ==> String
		 * 2. 문자열의 비교
		 * 		1) 주소값 비교 원칙 (자바 원칙)
		 * 			stack / heap
		 * 			> 모든 객체들은 heap영역에 실제 객체를 두고, 그 heap영역의 위치(주소값/참조변수)를 stack에 할당하여 사용
		 * 			# 결론 : String은 문자열 비교할 때는 equals() 메서드를 이용해야한다.
		 * 3. String 기능 메서드
		 * 		1) 생성자 
		 * 			new String()
		 * 			new String(byte[])
		 * 			new String(char[])
		 * 			new String("문자열")
		 * 		
		 * */
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		// "홍길동" : 문자열 바로 대입한 것은 문자열이 같으면 모두가 주소가 같음
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str1 == str4 : " + (str1 == str4));
		
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println("str1.equals(str3) : " + (str1.equals(str3)));
		System.out.println("str1.equals(str4) : " + (str1.equals(str4)));
		
		for (int code = Byte.MIN_VALUE; code <= Byte.MAX_VALUE; code ++) {
			System.out.println(code + " : " + (char)code);
		}
		
		byte[] bytes = {72, 101, 108, 108, 111};
		String greet = new String(bytes);
		System.out.println(greet);
		
		char[] chars = {'G', 'o', 'o', 'd', ' ', 'd', 'a', 'y'};
		System.out.println(new String(chars));
		
		// ex) "Lunch"의 각 byte 코드값을 확인하여 위와같이 배열을 만들어서
		//		문자열을 생성자의 매개변수로 byte배열로 만들어 출력
		byte[] bytes2 = {76, 117, 110, 99, 104};
		System.out.println(new String(bytes2));

	}

}
