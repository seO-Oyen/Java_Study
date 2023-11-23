/*
 * 1. nvl(param1, param2)
 * 		param1 : 컬럼이나 데이터
 * 		param2 : param1의 컬럼이나 데이터가 null일때 대신해서 처리해야할 데이터 내용
 */
SELECT ename, sal, comm, sal + comm 합산, nvl(comm, 0) "0처리 comm",
	sal+nvl(comm, 0) 합산2
FROM emp;

SELECT employee_id, salary,
	nvl(commission_pct, 0) * 100 || '%' "보너스%",
	salary * nvl(commission_pct, 0) "보너스"
FROM EMPLOYEES;

/*
 * 2. nvl2(컬럼 또는 데이터, param1, param2)
 * 		컬럼이 null이 아닐때 param1처리
 * 		컬럼이 null일때 param2로 처리
 */
SELECT ename, sal, comm, nvl2(comm, 0.2, 0.1)
FROM emp;

SELECT ename, nvl2(comm, sal+comm, sal)
FROM emp;

/*
 * 3. nullif(컬럼1, 컬럼2)
 * 		2개의 컬럼 또는 데이터가 동일하면 null, 그렇지 않으면 컬럼 1을 출력
 * */
SELECT NULLIF('a', 'a') 결과1, NULLIF('a', 'b') 결과2
FROM dual;

/*
 * 4.mod(컬럼1, 데이터)
 * 		특정 컬럼의 데이터를 나눈 나머지값
 */
SELECT empno, mod(empno, 2)
FROM emp;

SELECT empno, MOD(empno, 2) 
FROM emp
WHERE MOD(empno, 2) = 0;

SELECT MOD(employee_id, 3) div, count(*)
FROM EMPLOYEES
GROUP BY mod(EMPLOYEE_ID, 3)
ORDER BY div;

-- 입사일을 기준으로 월별로 입사인원 처리, 분기별로 입사인원
SELECT hiredate, to_char(hiredate, 'MM') 입사월,
	to_char(hiredate, 'Q')||'/4'분기
FROM emp
ORDER BY to_char(hiredate, 'MM');

SELECT to_char(hiredate, 'MM') 입사월, count(*) 인원수
FROM emp
GROUP BY to_char(hiredate, 'MM')
ORDER BY 입사월;

-- 분기별 입사 인원수
SELECT to_char(hiredate, 'Q')||'분기' 입사분기, count(*) 인원수
FROM emp
GROUP BY to_char(hiredate, 'Q')
ORDER BY 입사분기;

/*
 * 5. decode()
 * 	1) 특정 데이터의 비교를 통한 데이터값을 처리할 때 활용된다.
 * 	2) 형식
 * 		decode(컬럼|데이터, 1번값, 1번값일때 처리할 데이터,
 * 			2번값, 2번값일때 처리할 데이터
 * 			...,
 * 			그외 데이터)
 * 	ps) decode 함수는 프로그래밍에 있어서 case when 구문과 유사한 특징을 가지고 있다.
 * 		해당 기중 컬럼의 데이터가 어떤 case인 경우냐를 기준으로 처리할 데이터와 컬럼을
 * 		지정하는 것이라 할 수 있음
 * */
-- 부서번호 기준으로 부서명 지정
SELECT ename, deptno,
	decode(deptno, 10, '인사',
		20, '재무',
		30, '총무',
		40, '기획',
		'미정') dname
FROM emp;

SELECT empno, mod(empno, 2) 구분
FROM emp;

SELECT empno, 
	decode(MOD(empno, 2), 1, '홍팀',
		'청팀') 팀
FROM emp;

/*
 * 6. case 키워드 처리(조건문 처리)
 * 	1) decode의 확장된 함수 형식을 표현식 또는 컬럼 값 '=' 비교를 통해
 * 		조건이 일치하는 경우에만 다른값으로 대치하지만, case함수에서는
 * 		산술연산, 관계연산, 논리 연산과 같이 다양한 비교가 가능하다.
 * 	2) 기본형식
 * 		case [컬럼명]
 * 			when 비교/논리 연산식 then 처리할 데이터,
 * 			when 비교/논리 연산식 then 처리할 데이터,
 * 			...
 * 			else 기타 처리할 데이터
 *		end
 * => 이와같이 특정한 컬럼이나 비교 논리식으로 데이터를 처리해서 프로그램에
 * 		if 구문의 처리와 유사하다고 할 수 있다.
 * */
SELECT ename, sal,
	CASE WHEN sal >= 5000 THEN 'A등급'
		WHEN sal >= 4000 THEN 'B등급'
		WHEN sal >= 3000 THEN 'C등급'
		WHEN sal >= 2000 THEN 'D등급'
		ELSE 'F등급'
	END "등급 분류"
FROM emp;

SELECT ename, sal,
	CASE WHEN sal >= 5000 THEN 'A등급'
		WHEN sal >= 4000 THEN 'B등급'
		WHEN sal >= 3000 THEN 'C등급'
		WHEN sal >= 2000 THEN 'D등급'
		ELSE 'F등급'
	END "등급 분류",
	CASE deptno WHEN 10 THEN '인사'
		WHEN 20 THEN '재무'
		WHEN 30 THEN '무역'
		WHEN 40 THEN '기획'
		ELSE '미정'
	END "부서명"
FROM emp;

-- ex) 분기에 따른 보너스 %설정
--		1 => 15%, 2 => 20, 3 => 8%, 4 => 5% 설정을
--		case when 구문을 이용해서 처리
SELECT ename, to_char(hiredate, 'Q') 분기,
	CASE to_char(hiredate, 'Q') WHEN '1' THEN '15%'
		WHEN '2' THEN '20'
		WHEN '3' THEN '8%'
		WHEN '4' THEN '5%'
		ELSE '미정'
	END "보너스"
FROM emp;








select * from emp;
SELECT to_char(hiredate, 'MM') 입사월,
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
ORDER BY 입사월;

-- 1)EMP 테이블에서 부서 번호가 [조건]인 모든 직원의 이름을 선택하세요.
SELECT ename
FROM emp
WHERE deptno = 10;