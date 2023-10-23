package javaexp.a05_array;

import java.util.ArrayList;
import java.util.List;

// # 0920 # 동적배열
public class A04_ActiveArray {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		System.out.println("현재 배열의 크기 : " + list.size());
		
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		System.out.println("현재 배열의 크기 : " + list.size());
		System.out.println("첫번째 데이터 : " + list.get(0));
		System.out.println("두번째 데이터 : " + list.get(1));
		System.out.println("세번째 데이터 : " + list.get(2));
		
	}

}
