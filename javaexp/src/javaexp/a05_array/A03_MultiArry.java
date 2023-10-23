package javaexp.a05_array;


// 0919 # 다차원배열
public class A03_MultiArry {

	public static void main(String[] args) {
		
		// 기본 데이터유형 ==> 배열 ==> 배열안에 배열 (다차원 배열) ==> Object
		
		// 기차 5개 호차가 있고, 각 호차마다 좌석 60개가 있는데 각 좌석에 비어있으면 false, 차 있으면 true 로 처리		
		/*boolean[][] trainSeats = new boolean[5][60];
		
		System.out.println(trainSeats[0][0]);
		System.out.println(trainSeats[4][59]);
		
		// ex) 3호차 40번
		// ex) 4호차 2번
		// ex) 5호차 16번
		trainSeats[2][39] = true;
		trainSeats[3][1] = true;
		trainSeats[4][15] = true;*/
		
		// 학년에 반과 번호에 해당하는 점수
		// 6반 20번 국어
		int[][] kors = new int[6][20];
		// 3반 2번  80
		// 4반 16번 90
		// 5반 7번 85
		
		kors[2][1] = 80;
		kors[3][15] = 90;
		kors[4][6] = 85;
		
		System.out.println("반의 수 : " + kors.length);
		System.out.println("1반의 학생수 : " + kors[0].length);
		
		for (int i = 0; i < kors.length; i++) {
			System.out.println(i + 1 + "반의 점수");
			for (int j = 0; j < kors[i].length; j++) {
				// 배열명[상위index][하위index]
				System.out.println(j + 1 + "번호 점수 : " + kors[i][j]);
			}
			System.out.println();
		}

	}

}
