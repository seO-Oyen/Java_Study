package javaexp.a11_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A03_Set {

	public static void main(String[] args) {
		
		/*
		 * # Set 컬렉션
		 * 
		 * 1. 특징 
		 * 		1) 집합에 비유
		 * 		2) 저장 순서가 유지되지 않음
		 * 		3) 객체 중복 저장 불가능
		 * 		4) 하나의 null만 저장가능 (null도 식별)
		 * 2. 상속받는 구현 클래스
		 * 		1) HashSet
		 * 		2) LinkedHashSet
		 * 		3) TreeSet
		 * 3. 주요 메서드
		 * 		1) add()
		 * 		2) contains()
		 * 		3) isEmpty()
		 * 		4) Iterator<E> iterator()
		 * 			=> 저장된 객체를 한번 씩 가져오는 반복자 리턴
		 * 		5) size()
		 * 		6) clear()
		 * 		7) remove(Object)
		 * */
		
		Set<String> setOb = new HashSet<String>();
		setOb.add("오렌지");
		setOb.add("오렌지");
		setOb.add("수박");
		setOb.add("수박");
		setOb.add("딸기");
		setOb.add("키위");
		
		// setOb.iterator() : Set 데이터를 Iterator 형식으로 가져온다
		Iterator<String> iterator = setOb.iterator();
		// hasNext() : 포함된 객체를 다음으로 넘어가게 처리
		// next() : hasNext() 가 boolean으로 다음으로 넘어가게 하면 데이터를 가져오게 처리하는 부분
		
		// 중복되지 않고 순서도 확보가 안됨
		for (String fruit : setOb) {
			System.out.println(fruit);
		}
		
		Set<String> poket = new HashSet<String>();
		poket.add("빨강 구슬");
		poket.add("빨강 구슬");
		poket.add("파랑 구슬");
		poket.add("파랑 구슬");
		poket.add("파랑 구슬");
		poket.add("노랑 구슬");
		poket.add("노랑 구슬");
		
		for (String s : poket) {
			System.out.println(s);
		}

	}

}
