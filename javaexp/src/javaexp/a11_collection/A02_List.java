package javaexp.a11_collection;

import java.util.ArrayList;
import java.util.List;

public class A02_List {

	public static void main(String[] args) {
		
		/*
		 * # List 컬렉션
		 * 
		 * 1. 특징
		 * 		1) 인덱스로 관리
		 * 		2) 중복해서 객체 저장 가능
		 * 2. 구현 실제 클래스
		 * 		ArrayList
		 * 		Vector : 쓰레드 환경에서 동기화를 위하여 처리
		 * 		LinkedList
		 * 3. 공통 메서드
		 * 		1) boolean add(추가할 객체) : 제일 마지막에 추가
		 * 		=> 그 위치에 있는 객체/데이터는 index가 뒤로 밀린다.
		 * 		2) void add(int index, 추가할 객체) : 특정한 위치에 추가
		 * 		3) set(int index, 변경할 객체) : 특정한 위치에 데이터 변경
		 * 		4) boolean contains(요소객체) : 요소를 포함하는지 여부
		 * 		5) get(int index) : 특정 위치에 있는 요소 객체 가져오기
		 * 		6) boolean isEmpty : 컬렉션이 비어 있는지 확인
		 * 		7) int size() : 크기
		 * 		8) void clear() : 포함하는 모든 객체 삭제
		 * 		9) remove(int index) : 해당 위치의 객체 삭제
		 * 		10) boolean remove(Object o) : 주어진 객체 삭제
		 * */
		
		// 인터페이스 List = new ArrayList(상속받은 실제 객체);
		List<String> flist = new ArrayList<String>();
		flist.add("사과");
		flist.add("바나나");
		flist.add("딸기");

		flist.add(0, "오렌지");
		flist.set(1, "키위");
		
		System.out.println("있는지 여부 : " + flist.contains("키위"));
		if (!flist.isEmpty()) {
			System.out.println("크기 : " + flist.size());
		} else {
			System.out.println("없음");
		}
		
		flist.remove(1);
		for (int i = 0; i < flist.size(); i++) {
			System.out.print(i + 1 + "\t");
			System.out.println(flist.get(i));
		}
		flist.clear();
		System.out.println("비워 있는지 여부 : " + flist.isEmpty());

		
		List<String> memberList = new ArrayList<String>();
		memberList.add("홍길동");
		memberList.add("김길동");
		memberList.add("박길동");
		memberList.add(0, "이길동");
		memberList.set(1, "마길동");
		if (memberList.contains("himan")) {
			System.out.println("himan 포함 되어 있음");
		}
		memberList.remove(3);
		for (int i = 0; i < memberList.size(); i++) {
			System.out.print(memberList.get(i) + " / ");
		}
	
		
	}

}
