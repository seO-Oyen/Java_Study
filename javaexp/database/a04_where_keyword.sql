/*
 * # 기타 비교/논리 연산 처리 구문
 * 
 * 1. 컬럼 in(데이터1, 데이터2 ...)
 * 		=> 해당 컬럼에 or 조건으로 데이터가 있을 경우를 지칭한다.
 * 			subquery로도 사용할 때가 많다.
 * 		=> 컬럼 = 데이터1 or 컬럼 = 데이터2 or 컬럼 = 데이터3 ...
 * 2. not, !=, <> 해당 조건이 아닐때
 * 3. 컬럼 = null	=> 컬럼 = 'null'처리
 * 		컬럼 is null
 * 		컬럼 in not null
 * 		ps) null : 데이터 자체가 할당되지 않음
 * 			'null' : 문자열 'null'이 할당되어있는 경우
 * */

SELECT *
FROM emp;

-- 사원번호가 7369, 7499, 7521인 데이터 조회
SELECT *
FROM emp
WHERE empno in(7369, 7499, 7521);

SELECT ename, comm
FROM emp
WHERE comm = NULL; -- 컬럼 = 'NULL' 

SELECT ename, comm
FROM emp
WHERE comm IS NOT NULL; 

-- ex) 부서번호가 10, 30인경우 사원 정보 출력
SELECT *
FROM emp
WHERE deptno IN (10, 30);

-- ex) comm이 null이 아닌경우 사원번호, 급여 + 보너스 합산을 출력
SELECT empno, sal, comm, sal + comm "급여 + 보너스"
FROM emp
WHERE comm IS NOT NULL;