/*
 * # 숫자형 처리함수
 * 1. 테이블에 컬럼별로 저장되어 있는 숫자형 테이블을 합산하거나
 * 		통계치를 낼 때, 올림/반올림/내림 들을 처리할 필요가 있을 때가 있다
 * 		이때 사용하는 함수가 숫자형 함수이다.
 * 2. 오라클은 기본적으로 숫자형 문자열의 자동형변환을 포함
 * 3. 주요 함수의 기본 형식
 * 		1) round(데이터, 자리수) : 반올림 처리, 자리수 처리
 * 		2) trunc(데이터, 자리수) : 내림/절삭처리, 자리수 처리
 * 		3) ceil(데이터) : 올림 처리, 정수형 리턴
 * 		4) floor(데이터) : 내림 처리, 정수형 리턴
 * 		5) mod(데이터, 나눌수) : 나머지값 처리 (오라클은 나머지 연산자가 없음. 함수로 처리)
 * 
 * - 자리수 개념
 * 		- trunc(75.346, 2) : 소숫점 이하 2자리까지 표시, 이후 내용은 절삭처리
 * 		- trunc(7534.346, -1) : .을 기준으로 왼쪽으로 1자리 절삭 처리 => 7530
 * 		- trunc(7534.346, -2) : .을 기준으로 왼쪽으로 2자리 절삭 처리 => 7500
 * - 적용 범위 
 * 		- 숫자의 연산
 * 		- 날짜형 데이터 처리
 * */

SELECT round(23423.27734, 3) "반올림 소숫점 3자리",
	round(23423.27734, 1) "반올림 소숫점 1자리",
	round(23423.27734, -3) "반올림 1000자리",
	trunc(23423.27734, 1) "절삭 소숫점 1자리",
	round(23423.27734, -2) "절삭 100 자리",
	ceil(23423.27734) "올림(정수형)",
	floor(23423.27734) "내림 (정수형)"
FROM dual;

SELECT ename, round(sal, -2), trunc(SAL + NVL(COMM, 0), -3)
FROM emp;