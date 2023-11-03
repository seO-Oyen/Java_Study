/*
 * # 날짜 함수
 * 1. 날짜 데이터 타입에 사용하는 함수
 * 2. 날짜 계산은 더하기, 빼기 연산이 가능하다.
 * 		1) 날짜형 데이터 + 숫자 : 해당 일자에 일수를 가산하여 처리한다.
 * 		2) 날짜형 데이터 + 1/24 : 시간단위 +1시간 처리가 된다.
 * 		+1은 1일 단위이기에
 * 		/ 24 : 시간단위
 * 		/ 60 : 분단위
 * 		/ 60 : 초단위로 처리가 된다.
 * 3. 현재시간 처리 : sysdate(현재 연도/월/일/시/분/초)를 처리하는 내장된 객체
 * */

SELECT sysdate "현재", sysdate-1 "전날",
	sysdate + 1 "내일"
FROM dual;

SELECT ename, hiredate "입사일", 
	sysdate "현재 날짜",
	hiredate + 1 "입사후 1일",
	sysdate - hiredate "입사후 현재까지 날짜1",
	floor(sysdate - hiredate) "입사후 현재까지 날짜2"
FROM emp;

-- ex) 사원, 이름과 입사후 90일 날짜, 지금까지 근무년도(365)를 출력
SELECT ename, hiredate + 90 "입사 후 90일",
	floor((sysdate - HIREDATE) / 365)
FROM emp;

/*
 * # 날짜 지원 함수
 * 1. months_between(날짜1, 날짜2) : 날짜와 날짜 사이의 개월 수를 계산
 * 		15일인 경우 0.5, 1월간을 1로 기준하여 날짜, 시간, 분, 초 등을
 * 		소숫점으로 계산
 * 		이 함수는 365, 366일 경우 2월의 28/29, 각월마다 30, 31인 경우를
 * 		다 적용하여 처리한다.
 * 
 * 2. add_months(날짜, 추가개월 수) : 해당 날짜에 개월을 더한 날짜계산
 * 3. next_day : 해당 요일을 기준으로 명시된 요일의 다음 날짜를 반환하는 함수
 * 4. last_day : 해당 날짜가 속한 달의 마지막 날짜를 반환
 * */

SELECT ename hiredate,
	MONTHS_BETWEEN(SYSDATE, hiredate) "근무개월",
	trunc(MONTHS_BETWEEN(sysdate, hiredate)/12) "근무 연한"
FROM emp;

SELECT ename, hiredate, ADD_MONTHS(hiredate, 3) "입사 후 3개월"
FROM emp;

SELECT ename, hiredate - 100, ADD_MONTHS(hiredate, 6)
FROM emp;

-- 오늘 날짜로부터 첫번째 돌아오는 일요일
SELECT NEXT_DAY(sysdate, '일')
FROM dual;

SELECT ename, hiredate, NEXT_DAY(hiredate, '토')
FROM emp;

SELECT LAST_DAY(sysdate)
FROM dual;

SELECT LAST_DAY(hiredate), LAST_DAY(hiredate) + 1,
	ADD_MONTHS(LAST_DAY(hiredate) + 1, -1) 
FROM emp;