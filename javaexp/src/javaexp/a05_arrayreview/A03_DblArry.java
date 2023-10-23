package javaexp.a05_arrayreview;

public class A03_DblArry {

	public static void main(String[] args) {
		/*
		 * # 이중 배열
		 * 1. 데이터유형[][] = new 데이터유형[크기][크기];
		 * 		[][] : 차원의 갯수
		 * */
		
		// 반별 학생의 국어점수
		// 반이 5반까지 있고, 한반에 학생이 30명이 있을때, 국어점수 할당 배열
		/*int[][] kors = new int[5][30];
		// 반은 5반인데 각 반에 학생수를 다르게 할때 
		int[][] kors2 = new int[5][];
		
		// 1반의 1번에 점수할당
		kors[0][0] = 70;
		// 5반의 30번에 점수할당
		kors[4][29] = 80;
		
		// 1반학생들 점수를 임의로 할당 
		for (int i = 0; i < 30; i++) {
			// 1반에 1~30까지 점수 할당
			kors[0][i] = (int)(Math.random() * 101);
			System.out.println(i + 1 + "번 : " + kors[0][i]);
		}
		System.out.println("반의 갯수 : " + kors.length);
		System.out.println("2반의 학생인원 : " + kors[1].length);
		
		for (int i = 0; i < kors.length; i++) {
			System.out.println(i + " : " + (i + 1) + "반");
			System.out.println(kors[i].length + "명");
			for (int j = 0; j < kors[i].length; j++) {
				kors[i][j] = (int)(Math.random() * 101);
				System.out.println(i + 1 + "반 " + (j + 1) + "번 : " +  kors[i][j]);
			}
		}*/
		
		// 2차원 데이터가 for 문에서 할당하는 구조 이해여부 확인
		// 1. kors.length 와 kors.[i].length의 차이점
		// 2. kors[i][j] 왜 두개를 다른 i, j 를 사용해서 데이터를 할당하는지 i는 무엇이고, j는 무엇인지
		/*
		 * i : 반정보에 대한 index 0부터
		 * j : 반 안에 학생들의 번호 index 0부터
		 * */
		// 3. 2차원데이터를 for문에 2개를 사용해야하는 이유를 알고 있는지
		/*
		 * 반 / 번호라는 계층구조로 2차원 배열을 선언했기 때문에 반을 접근할 때 for 문과 번호를 접근할때
		 * for 문이 필요로 한다
		 * */
		
		// ex) 기차가 ktx 1~5호 있고, 각 호차별로 좌석이 60개 있을때
		//	   예약자명을 할당하는 배열을 선언하고
		// 	   1호차 30번, 2호차 2번, 5호차 3번 좌석에
		//		홍길동		김길동		신길동을 예약처리하고 for 문을 통해서 출력해보세요
		
		String[][] ktx = new String[5][60];
		ktx[0][29] = "홍길동";
		ktx[1][1] = "김길동";
		ktx[4][2] = "신길동";
		
		for (int i = 0; i < ktx.length; i++) {
			for (int j = 0; j < ktx[i].length; j++) {
				if (ktx[i][j] != null) {
					System.out.println(i + 1 + "호차 " + (j + 1) + "번 예약자 : " + ktx[i][j]);
				}
			} 
		}
		
		
	}

}
