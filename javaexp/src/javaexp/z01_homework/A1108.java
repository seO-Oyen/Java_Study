package javaexp.z01_homework;

public class A1108 {

	public static void main(String[] args) {

		/*
		[1단계:개념] 
		 */
		
		// 1. decode(), case when구문의 기본 형식을 정리하세요 
		/*
		 * decode()
		 * 		decode(컬럼|데이터, 1번값, 1번값일때 처리할 데이터,
		 * 			2번값, 2번값일때 처리할 데이터
		 * 			...,
		 * 			그외 데이터)
		 * */
		
		// 2. decode() 활용해서, 직책별 보너스를 각각 다르게 처리하여, 
		//		%로 출력하고, sal에 적용하여 금액도 출력해보세요.
		
		// 3. 3. case when 활용해서, 11,12,1,2 겨울, 3,4,5 봄,
		//		6,7,8 여름, 9,10 가을 로 입사월을 기준으로 계절을 표시하세요.
		/*SELECT to_char(hiredate, 'MM') 입사월,
		CASE to_char(hiredate, 'MM') WHEN '11' THEN '겨울'
			WHEN '12' THEN '겨울'
			WHEN '01' THEN '겨울'
			WHEN '02' THEN '겨울'
			WHEN '03' THEN '봄'
			WHEN '04' THEN '봄'
			WHEN '05' THEN '봄'
			WHEN '06' THEN '여름'
			WHEN '07' THEN '여름'
			WHEN '08' THEN '여름'
			WHEN '09' THEN '가을'
			WHEN '10' THEN '가을'
		END "입사월 계절"
		FROM emp
		ORDER BY 입사월;*/
		
		// 4. dao 처리를 위한 환경 구성을 기술하세요.
		
		// 5. 연결객체의 주요 선언 내용를 기술하세요
		
		// 6. 아래에 내용의 sql을 작성하고 해당하는 메서드를 선언하세요.
		//	1)EMP 테이블에서 부서 번호가 [조건]인 모든 직원의 이름을 선택하세요.
		/*SELECT ename
		FROM emp
		WHERE deptno = 10;*/
		// String getEnameByDeptno(int deptno)
		
	    //	2)직원들 중에서 급여가 [조건] 이상인 사람들의 이름과 급여를 선택하세요.
	    //	3)DEPT 테이블에서 모든 부서의 부서 번호와 부서 이름을 선택하세요.
	    //	4)[조건]라는 이름을 가진 직원의 모든 정보를 선택하세요.
	    //	5)각 부서별로 직원 수를 계산하세요.
	    //	6)EMP 테이블에서 직책이 [조건]인 모든 직원의 이름을 선택하세요.
	    //	7)EMP 테이블에서 [조건]년에 입사한 모든 직원의 이름과 입사 날짜를 선택하세요.
	    //	8)EMP 테이블에서 급여가 [조건]에서 [조건] 사이인 직원들의 이름을 선택하세요.
	    //	9)EMP 테이블에서 직책별로 최고 급여를 받는 직원의 이름과 급여를 찾으세요.
	    //	10)EMP 테이블에서 마지막 이름이 '[조건]'로 끝나는 직원들의 이름을 선택하세요.
	}

}
