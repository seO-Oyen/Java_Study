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
 * 5. case 키워드 처리(조건문 처리)
 * */

-- 8. EMPLOYEES의 salary와 commission_pct를 이용해서 급여와 보너스 합산을 구할 때, nvl2를 이용해서 처리해보세요.
SELECT to_char(hiredate, 'Q')||'분기' 입사분기, floor(avg(sal))
FROM emp
GROUP BY to_char(hiredate, 'Q')
ORDER BY 입사분기;
