package javaexp.a10_api;

public class A05_StringBuffer {
	public static void main(String[] args) {
		
		/*
		 * # String 메모리 += 의 위험성 
		 * 
		 * 1. String은 문자열 데이터인데 += 을 통해서 문자열 출가할 수 있지만 기존에
		 * 		특정한 위치에서 메모리가 확대되는 것이 아니라 새로운 주소값을 가지고 다시 메모리를 할당 하는 특징이 있다.
		 * 2. 반복문안에 +=을 사용해서 문자열을 추가하는 것은 메모리의 효율에 문제가 발생한다. 
		 * 
		 * - 문자열을 선언하고, +=을 활용하여 누적/대입 연산자를 통하여 데이터가 누적되면
		 * 		heap영역을 계속 만들어 메모리의 overflow가 발생할 수 있다.
		 * - 문자열 데이터를 처리할때 문자열이 늘어나더라도 동일한 heap주소 안에서 데이터를 처리할 수 있게 처리하는 것이
		 * 		StringBuffer() 객체이다
		 * 
		 * # StringBuffer 의 활용
		 * 1. 객체 생성
		 * 		StringBuffer sbf = new StringBuffer();
		 * 		StringBuffer sbf2 = new StringBuffer("초기문자열");
		 * 2. 문자열 추가
		 * 		sbf.append("추가 문자열");
		 * 3. 추가된 문자열 확인
		 * 		sbf : 모든 객체의 참조변만으로 호출되는 default메서드가 toString()에 선언된 내용이기에 생략 가능하다
		 * 		sbf.toString();
		 * 4. 기타 기능 메서드
		 * 		- insert(int offset, "문자열") : 특정한 위치에 문자열 삽입
		 * 		- delete(int start, int end) : 특정 범위에 문자열 삭제
		 * 		- deleteCharAt(int index) : 특정 위치의 문자 삭제
		 * 		- replace(int start, int end, String str) : 특정위치에 문자를 대체 변경 처리(여러 문자열)
		 * 		- reverse() : 문자열 뒤집기 처리
		 * 		- setCharAt(int index, char ch) : 특정 위치의 문자를 대체처리 (문자 한자)
		 * */
		
		String name1 = "김길동";
		String name2 = "김길동";
		String name3 = new String("김길동");
		String name4 = new String("김길동");
		
		// System.identityHashCode() 실제 주소값을 구분하여 표현
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		System.out.println(System.identityHashCode(name3));
		System.out.println(System.identityHashCode(name4));
		
		System.out.println("# 문자열 누적시 새로운 주소 할당 #");
		name1 += "!";
		System.out.println(System.identityHashCode(name1));
		name1 += "!";
		System.out.println(System.identityHashCode(name1));
		name1 += "!";
		System.out.println(System.identityHashCode(name1));
		
		
		System.out.println("# StringBuffer 객체 주소 비교 #");
		StringBuffer sb = new StringBuffer("반갑습니다.");
		System.out.println("초기 주소값 : " + System.identityHashCode(sb));
		sb.append("홍");
		System.out.println("추가 후 주소값 : " + System.identityHashCode(sb));
		sb.append("길");
		System.out.println("추가 후 주소값 : " + System.identityHashCode(sb));
		sb.append("동");
		System.out.println("추가 후 주소값 : " + System.identityHashCode(sb));
		sb.append("~");
		System.out.println("추가 후 주소값 : " + System.identityHashCode(sb));
		
		System.out.println("최종 데이터 : " + sb);
		
		// ex) StringBuffer 로 학생의 번호를 1번을 초기에 넣고 반복문과 append()를 통해서 2~100까지 추가한 후
		//		초기주소값과 마지막데이터가 다 할당된 후 주소값을 확인하세요
		StringBuffer studentNum = new StringBuffer("1");
		System.out.println("초기 주소값 : " + System.identityHashCode(studentNum));
		
		for (int i = 2; i <= 100; i++) {
			studentNum.append( ", " + i);
		}
		System.out.println("할당 후 주소값 : " + System.identityHashCode(studentNum));
		System.out.println(studentNum);
		
		
	}

}
