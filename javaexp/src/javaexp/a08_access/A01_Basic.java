package javaexp.a08_access;

import java.util.ArrayList;
import java.util.List;

public class A01_Basic {
	public static void main(String[] args) {

		/*
		 * # 접근제어자
		 * 
		 * 1. 클래스명과 해당 클래스의 구성요소에 맨 앞에 붙여서
		 *		외부에서 해당 클래스를 호출할 때 접근의 범위를 설정하는 제어자를 말한다
		 * 2. 접근제어와 범위
		 * 		1) private : 필드, 생성자, 메서드
		 * 			모든 외부 클래스에서 접근 할 수없다. 내부 클래스에서만 사용 가능
		 * 		2) default : 클래스, 필드, 생성자, 메서드
		 * 			다른 패키지에 소속된 클래스에서는 호출할 수 없다
		 * 			같은 패키지에 있는 클래스들까지 호출
		 * 		3) protected : 필드, 생성자, 메서드
		 * 			자식 클래스가 아닌 다른 패키지에 소속된 클래스는 접근 불가
		 * 			외부패키지라도 상속관계가 있으면 접근 가능하다
		 * 		4) public : 클래스, 필드, 생성자, 메서드
		 * 			외부 패키지라도 import만 하면 접근하여 사용할 수 있다
		 * 
		 * 
		 * # 이야기 1
		 * 	선녀와 나무꾼
		 * 		1) 노루 나무꾼
		 * 			friendship 노루 나무꾼 (노루가 숨어있는 정보)
		 * 			friendship이라는 패키지에 있는 클래스 / 객체들만 접근할 수 있게 처리
		 * */

		String[] wallpaper = {".#...", "..#..", "...#."};
//		String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
//		String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
//		String[] wallpaper = {"..", "#."};
		
		List<Integer> cList = new ArrayList<Integer>();
		List<Integer> rList = new ArrayList<Integer>();

		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				char a = wallpaper[i].charAt(j);
				
//				System.out.println(a);
				if (a == '#') {
					cList.add(i);
					rList.add(j);
					System.out.println(i + ", " + j);
					
				}
			}
//			System.out.println(wallpaper[i]);
		}
		
		int startC = cList.get(0);
		int startR = rList.get(0);
		int endC = cList.get(0);
		int endR = rList.get(0);
		for (int i = 0; i < cList.size(); i++) {
			System.out.print(cList.get(i) + " ");
			System.out.print(rList.get(i) + " ");
			System.out.println();
			
			if (startC > cList.get(i)) {
				startC = cList.get(i);
//				System.out.println(startC);
			}
			if (endC <= cList.get(i)) {
				endC = cList.get(i) + 1;
//				System.out.println(endC);
			}
			if (startR > rList.get(i)) {
				startR = rList.get(i);
			}
			if (endR <= rList.get(i)) {
				endR = rList.get(i) + 1;
			}
			
		}
		System.out.println("startC : " + startC);
		System.out.println("endC : " + endC);
		System.out.println("startR : " + startR);
		System.out.println("endR : " + endR);
		int[] answer = {startC, startR, endC, endR};

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
