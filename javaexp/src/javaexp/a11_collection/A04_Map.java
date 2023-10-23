package javaexp.a11_collection;

import java.util.HashMap;
import java.util.Map;

import javaexp.a11_collection.vo.Student;

public class A04_Map {

	public static void main(String[] args) {
		
		/*
		 * # Map 컬렉션의 특징 및 주요 메서드
		 * 
		 * 1. 특징 
		 * 		- 키와 값을 구성된 Map.Entry 객체를 저장하는 구조
		 * 		- 키와 값은 모두 객체
		 * 		- 키는 중복될 수 없지만, 값은 중복 저장 가능
		 * 		ex) 학번, 이름 / 주민번호, 이름
		 * 		==> 이름은 중복될 수 있지만 학번과 주민번호는 중복 X
		 * 2. 구현 클래스
		 * 		HashMap, Hashtable, LinkedHashMap, Properties, TreeMap
		 * 3. 주요 메서드
		 * 		put(key, value) : 주어진 키와 값을 추가, 저장이 되는 값
		 * 		containsKey(Object key) : 주어진 키가 있는지 여부
		 * 		containsValue(Object val) : 주어진 값이 있는지 여부
		 * 		Set<Map.Entry<K, V>> entrySet()
		 * 			키와 값의 쌍으로 구성된 모든 Map.Entry 객체를 Set에 담아서 리턴
		 * 		V get(Object key) : 컬렉션에 있는 데이터를 가져온다.
		 * 		keySet() : 모든 키를 Set 객체에 담아서 리턴
		 * 		size() : 저장된 크기
		 * 		clear() : 전체 삭제
		 * 		remove(Object key) : 키로 해당 구성 데이터 삭제
		 * */
		
		Map<String, String> map01 = new HashMap<String, String>();
		map01.put("1000", "홍길동");
		map01.put("1001", "김길동");
		map01.put("1000", "오길동");
		map01.put("1002", "오길동");
		
		// map-1.keySet() : 중복없는 Key를 Set으로 가져온다
		for(String key : map01.keySet()) {
			System.out.println(key + "\t" + map01.get(key) + "\n");
		}
		
		// ex) 물건의 serial 번호와 물건명을 Map을 할당하여 넣어보세요 Map<Integer, String>
		Map<Integer, String> map02 = new HashMap<Integer, String>();
		map02.put(1, "딸기");
		map02.put(2, "바나나");
		map02.put(3, "사과");
		map02.put(1, "옥수수");
		
		for(int key : map02.keySet()) {
			System.out.println(key + "\t" + map02.get(key) + "\n");
		}
		
		// 실무적으로는 key/value를 저장하고 있다가 특정한 key에 해당하는 값을 가져오는
		// .get(serNum) 형식을 처리할 때 많이 사용된다.
		
		System.out.println("# 단일 객체");
		Student student1 = new Student();
		System.out.println(student1);
		
		/*
		 * 참조변수를 호출했을 때 특정하게 원하는 형식으로 데이터를 가져오고 싶으면 overriding
		 * */

	}

}
