/*
 * # 그룹함수란? 
 * 1. 테이블의 전체 행을 하나 이상의 컬럼을 기준으로 그룹화하여 그룹별로 결과를 출력하는
 * 		함수를 말한다.
 * 2. 그룹함수는 통계적인 결과를 출력하는데 자주 사용된다.
 * 3. 형식
 * 		select 그룹할 컬럼, 그룹함수(대상컬럼)
 * 		from 테이블
 * 		group by 그룹할 컬럼
 * 		having 그룹함수의 결과 기준으로 조건처리
 * 4. 그룹함수의 종류
 * 		count() : 행의 갯수
 * 		max() : null을 제외한 모든 행의 최대값
 * 		min() : null을 제외한 모든 행의 최소값
 * 		sum() : null을 제외한 모든 행의 합
 * 		avg() : null을 제외한 모든 행의 평균값
 * 		stddev(표준편차), variance(분산) 
 * */

-- 함수명(컬럼명) : null을 제외한 전체 데이터
SELECT count(empno) "사원번호 갯수"
FROM emp;
SELECT count(*) "전체 컬럼 데이터건수"
FROM emp;

SELECT max(sal)
FROM emp;
SELECT min(sal)
FROM emp;

SELECT count(*) "건수", max(sal) 급여최대, min(sal) 급여최소,
	avg(sal) "평균급여"
FROM emp;

SELECT * FROM EMPLOYEES;
SELECT min(employee_id), max(employee_id), avg(salary)
FROM EMPLOYEES;

SELECT employee_id, job_id, salary
FROM EMPLOYEES
ORDER BY job_id, SALARY

SELECT * FROM EMPLOYEES;
SELECT count(job_id), max(salary), min(salary), sum(salary), avg(salary)
FROM EMPLOYEES;

-- having : group by 해서 통계치를 낸 결과값을 기준으로 검색조건을 만들때 사용
SELECT job, avg(sal) 평균급여
FROM emp
GROUP BY job;

SELECT department_id, avg(salary)
FROM employees
GROUP BY department_id
HAVING avg(salary) >= 5000;
