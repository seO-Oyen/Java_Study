SELECT * FROM EMP;
/*
 * # where 조건문 처리
 * 
 * 1. 행단위 데이터로 필터링하여 검색할 때 주로 사용
 * 2. where 조건절에는 컬럼명을 기준으로 여러가지 비교연산식과
 * 		논리 연산식을 처리
 * 3. 기본 형식
 * 		SELECT 컬럼
 * 		FROM 테이블
 * 		WHERE 비교연산식 or 논리연산식
 * 		1) 비교 연산식 : 컬럼명 = 데이터 (동등비교 ** == 아님) 
 * 				비교연산자 =, >, <, >=, <=, !=. <>
 * 		2) 논리연산식 : 비교연산자와 함께 and, or, not
 * 				지원하는 연산 키워드 in, between등 사용
 * */

-- 숫자형 데이터 비교
-- 연봉이 2000이상인 사원정보 출력
SELECT *
FROM EMP
WHERE SAL >= 2000;

SELECT *
FROM EMP
WHERE JOB = 'SALESMAN';

-- ex) 관리자번호(mgr)이 7839인 사원명 사원번호 관리자 번호 출력
SELECT ENAME, EMPNO, MGR
FROM EMP
WHERE MGR = 7839;

-- ex) 직책(job)이 'CLERK'인 사원번호, 직책명, 사원명을 출력하세요
SELECT EMPNO, JOB, ENAME
FROM EMP
WHERE JOB = 'CLERK';

-- ex) 부서번호 (deptno)가 10인 사원전체 정보를 출력하세요
SELECT *
FROM EMP
WHERE DEPTNO = 10;

-- 비교연산자 and 비교연산자
-- 비교연산자 or 비교연산자
-- not(비교연산자)

-- 부서번호가 10이고 급여가 3000미만인 사원을 출력
SELECT *
FROM EMP
WHERE DEPTNO = 10 AND SAL < 3000;

-- 급여가 5000 이상이거나 관리자 번호가 7782인 경우 사원정보 출력
SELECT *
FROM emp
WHERE sal >= 5000 OR mgr = 7782;

SELECT *
FROM emp
WHERE sal >= 2000 AND job = 'MANAGER';

SELECT *
FROM emp
WHERE deptno = 30 OR sal < 2000;

SELECT *
FROM emp
WHERE job != 'PRESIDENT';