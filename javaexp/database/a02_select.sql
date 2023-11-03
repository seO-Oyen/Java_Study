/*
 * # 데이터의 산술 연산자와 문자열 연결 처리
 * 
 * 1. 컬럼의 타입이 숫자이면 연산 (+, -, *, / -> 사칙연산)이 처리된다.
 * 2. 컬럼이나 문자열을 연결하여 출력할 때
 * */

SELECT sal, sal * 2 두배, sal + 10 "+10"
FROM emp;

-- ex) 각 사원의 급여의 3배를 사원명과 함께 출력
SELECT ENAME "사원명", SAL * 3 "급여 3배"
FROM EMP;

SELECT * 
FROM EMP;

-- ex) 사원번호와 사원명, 급여 + 보너스를 출력하세요
SELECT EMPNO, ENAME, SAL + COMM, SAL + NVL(COMM, 0) "급여 + 보너스(0)" 
FROM EMP;

-- ex) 사원명 - 부서번호, 사원번호 - 사원명, 입사일을 출력하세요
SELECT ENAME||' - '||DEPTNO "사원명과 부서번호", 
	EMPNO||' - '||ENAME "사원번호와 사원명", HIREDATE
FROM EMP;

SELECT ENAME||'의 급여는 '||SAL||'이고, 부서번호는 '
	||DEPTNO "문장으로 설명"
FROM EMP;

/*
 * 1. 동일한 데이터의 중복 제거
 * 2. 중복되지 않는 데이터를 출력하기 위해서는 distinct를 사용한다.
 * */
SELECT DISTINCT deptno
FROM emp;

SELECT DEPTNO, MGR
FROM EMP;

SELECT DISTINCT deptno, mgr
FROM EMP;

-- ex) job을 중복되지 않게 출력하세요
SELECT DISTINCT job
FROM emp;

-- ex) 관리자번호(mgr)를 중복되지 않게 출력하세요
SELECT DISTINCT mgr
FROM emp;
