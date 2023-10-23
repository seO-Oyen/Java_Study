package javaexp.a11_collection;

public class A01_Basic {

	public static void main(String[] args) {
		
		/*
		 * # 컬렉션 프레임워크
		 * 
		 * 1. 컬렉션 : 사전적 의미로 요소(객체)를 수집해 저장하는 것을 말한다.
		 * 2. 배열의 문제점
		 * 		1) 저장할 수 있는 객체 수가 배열을 생성할 때 결정
		 * 			==> 불특정 다수의 객체를 저장하는 문제
		 * 		2) 객체 삭제했을 때, 객체를 저장하는 문제 발생
		 * 			==> 삭제하면 해당 내용만 null로 처리
		 * 			==> 크기가 커지거나 작아지지는 못하는 단점
		 * 3. 동적 배열의 필요
		 * 		1) 객체들을 효율적으로 추가, 삭제, 검색 할 수 있음
		 * 		2) 인터페이스를 통해 정형화된 방법으로 다양한 컬렉션 클래스를 사용 및 확장성 있게 활용 가능
		 * 			ex)	List<Person> plist = new ArrayList<Person>();
		 * 				List<Person> plist2 = new LinkedList<Person>();
		 * 				List<Person> plist3 = new Vector<Person>();
		 * 
		 * # 컬렉션 프레임워크의 주요 인터페이스
		 * 
		 * 1. 인터페이스와 실제 객체들
		 * 		1) List 인터페이스 : 순서를 유지하고 저장, 중복 저장가능
		 * 			- ArrayList, Vector, LinkedList
		 * 			- 인터페이스를 상속받아서 사용자 정의 실제 클래스를 정의 가능
		 * 		2) Set 인터페이스 : 순서를 유지하지 않고 저장, 중복 저장 불가능
		 * 			- HashSet, TreeSet
		 * 		3) Map 인터페이스 : 키와 값이 쌍으로 저장, 키는 중복 저장 불가능
		 * 			- HashMap, HashTable, TreeMap, Properties
		 * 
		 * 			Database
		 * 			- primary key : 키로 설정한 컬럼은 row 단위 해당컬럼이 동일한 경우에 입력자체가 되지 않기에 중복을 막아준다.
		 * */

	}

}
