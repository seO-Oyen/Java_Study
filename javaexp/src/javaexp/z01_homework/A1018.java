package javaexp.z01_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import javaexp.z01_homework.vo1018.Member;

public class A1018 {
	public static void main(String[] args) {
		
//		[1단계:개념] 1. Wrapper클래스를 사용하는 이유와 기본 선언 형식을 기술하세요
		/*
		 * 기본데이터 유형을 사용하다 보면 여러형태로 변환이 필요하거나 기능적으로 처리해야하는 경우가 많다.
		 * type이 기본 유형으로 되다보니 형변환이 일어나지 않으면 이러한 기능에 대한 한계가 발생한다.
		 * 
		 * byte => Byte
		 * char => Character
		 * int => Integer
		 * double => Double
		 * boolean => Boolean
		 * 
		 * */
//		[1단계:개념] 2. 기본적인 Boxing/UnBoxing과 AutoBoxing/AutoUnBoxing을 기본 예제를 통해 설명하세요.
		/*
		 * 기본 데이터 유형을 보다 간편하게 객체형 또는 다시 객체를 기본 데이터 유형으로 변경하는 처리가 필요로 하는데
		 * 이것을 Auto라고 붙여서 사용한다.
		 * 
		 * - Auto Boxing
		 * Wrapper 클래스 = 기본 데이터;
		 * 이렇게 기본데이터를 기능 메서드 사용 없이 바로 객체에 바로 할당하는 것을 AutoBoxing이라고 한다
		 * 
		 * 기본 데이터유형에서 기능 메서드를 이용하기 위해 객체로 변환하는 것을 Boxing 이라고 한다.
		 * 객체를 이용해서 여러가지 기능 처리를 하다가 최종적인 데이터를 다시 기본 유형에 할당하여 처리하는 것을 UnBoxing이라고 한다.
		 * */
//		[1단계:확인] 3. Math클래스를 이용해서, 학생 3명의 점수(0~100)사이 로딩하고, 최고점, 최저점, 평균점(반올림) 출력을 하세요
		/*int score1 = (int)(Math.random() * 101);
		int score2 = (int)(Math.random() * 101);
		int score3 = (int)(Math.random() * 101);
		
		System.out.println("학생 1 : " + score1);
		System.out.println("학생 2 : " + score2);
		System.out.println("학생 3 : " + score3);
		
		
		int max = score1;
		int min = score1;
		double avg = (score1 + score2 + score3) / 3.0;
		
		if (max < Math.max(score2, score3)) {
			max = Math.max(score2, score3);
		}
		if (min > Math.min(score2, score3) ) {
			min = Math.min(score2, score3);
		}
		System.out.println();
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
		System.out.println("평균점(반올림) : " + Math.round(avg));*/
		
//		[1단계:개념] 4. Math.random()과 Random 클래스의 차이점을 기능 메서드 위주로 기술하세요.
		/*
		 * # Math.random
		 * - 따로 import안해주어도 된다.
		 * - 시드값으로 현재시간을 이용하기 때문에 실행시킬때마다 다른 숫자가 출력된다.
		 * 
		 * # Random
		 * - import 가 필요함
		 * */
//		[1단계:확인] 5. Random를 활용하여 컴퓨터와 가위/바위/보 게임 3회를 실시하여 @승 @무 @패 출력하세요
		/*
		 * # 컴퓨터와 하는 가위/바위/보 게임
		 * 1. 배열로 가위/바위/보 선언
		 * 2. 컴퓨터는 랜덤
		 * 3. 나는 Scanner에 의해 번호로 선택 (1. 가위, 2. 바위, 3. 보)
		 * 4. 두개의 내용을 비교하여 승/무/패 결정
		 * 5. 위 내용을 3회 반복처리하여 승/무/패 누적
		 * */
		
		int win = 0;
		int eq = 0;
		int def = 0;
		
		String[] games = {"가위", "바위", "보"};
		Scanner scan = new Scanner(System.in);
		System.out.print("가위바위보 게임 (1. 가위, 2. 바위, 3.보) : ");
		int chNum = scan.nextInt() - 1;
		String mychoice = games[chNum];
		
		
		Random r = new Random();
		
		int rIdx = r.nextInt(3); // 0~2임의로 나온다
		String comResult = games[rIdx];
		System.out.println("임의의 가위/바위/보(컴퓨터) : " + comResult);
		System.out.println("당신의 선택 : " + mychoice);
		
		if (chNum == rIdx) {
			System.out.println("무승부");
			eq++;
		} else if ((chNum + 2) % 3 == rIdx) {
			System.out.println("이김");
			win++;
		} else {
			System.out.println("짐");
			def++;
		}
		
		System.out.println("# 최종결과 #");
		System.out.println("승 : " + win);
		System.out.println("패 : " + def);
		System.out.println("무 : " + eq);
		
//		[1단계:개념] 6. 컬렉션 상위 3개 인터페이스의 특징을 기술하세요.
		/*
		 * List : 순서를 유지하고 저장, 중복 가능
		 * Set : 순서 유지하지 않음, 중복 저장 불가능
		 * Map : 키와 값이 쌍으로 저장됨. 키는 중복저장이 불가능하고 값은 중복저장이 가능함.
		 * */
//		[1단계:확인] 7. List의 주요메서드 이용하여, 장바구니 물건정보(물건명, 가격, 갯수)를 3개를 담고, 수정, 삭제 해보세요.
		/*List<String> items = new ArrayList<String>();
		items.add("사과, 1000, 2개");
		items.add("바나나, 2000, 3개");
		items.add("수박, 4000, 6개");
		items.add(0, "오렌지, 3000, 4개");
		items.set(1, "사과, 1500, 3개");
		
		for (String item : items) {
			System.out.println(item);
		}*/
		
//		[1단계:확인] 8. Map을 이용하여  key로는 1학년1반30번, value으로는 80(점수)를 넣어 학생 3명의 점수를 할당하고 출력해보세요.
		/*Map<String, Integer> students = new HashMap<String, Integer>();
		students.put("1130", 80);
		students.put("1210", 70);
		students.put("1305", 60);
		
		for (String student : students.keySet()) {
			System.out.println(student + "\t" + students.get(student));
		}*/
//		[1단계:확인] 9. List안에 class로 회원정보(아이디,패스워드,이름,권한,포인트)를 선언하고, 회원5명을 정보를 등록 및 리스트 출력하세요.
		/*List<Member> members = new ArrayList<Member>();
		
		members.add(new Member("test1", "test1", "홍길동", true, 10));
		members.add(new Member("test2", "test2", "김길동", false, 0));
		members.add(new Member("test3", "test3", "신길동", false, 5));
		members.add(new Member("test4", "test4", "마길동", false, 20));
		
		for (Member member : members) {
			System.out.println(member.getId() + "\t" + member.getPass() + "\t" + member.getName() + "\t" + member.isAdmin() + "\t" + member.getPoint());
		}*/
		
	}

}
