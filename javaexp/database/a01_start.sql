SELECT * FROM emp;

-- DB 주석문
/*
 * # 여러줄 주석문 처리
 * # 조회문 기본 처리
 * 1. 데이터는 select 구문을 이용하여 저장된 데이터를 호출(query)할 수 있다.
 * 2. 기본형식
 * 		- select * : 전체 컬럼 호출
 * 			-> empno ename : 특정 컬럼 호출
 * 		- from 테이블명; 
 * */
SELECT EMPNO, ENAME, JOB
FROM EMP;

-- ex) emp테이블의 ename, job, sal 컬럼을 선택하여 출력
SELECT ENAME, JOB, SAL
FROM EMP;
-- ex) dept 테이블의 deptno, danme 컬럼 출력
SELECT DEPTNO, DNAME
FROM DEPT;
-- ex) salgrade 테이블의 전체 컬럼 출력
SELECT *
FROM SALGRADE;

/*
 * # 컬럼명 별칭으로 사용하기
 * 
 * 1. 모든 테이블의 구성요소 컬럼명은 select 컬럼명으로 사용하여 호출할 수 있다.
 * 2. 특정한 경우에는 컬럼을 변경하거나 통합된 컬럼명으로 처리해야하는 경우가 있다.
 * 		ex) 컬럼간의 연산, 문자열 연결
 * 3. 기본형식
 * 		- select 컬럼명 as 컬럼명 별칭 (as는 생략 가능)
 * 4. 별칭 컬럼명의 예외사항
 * 		1) 특수 문자나 공백을 포함할 경우
 * 			"특수문 " 와 같이 "" 사이에 넣어서 처리
 * */
SELECT EMPNO, EMPNO AS 사원번호별칭,
	ENAME 사원명,
	JOB "직 책 ?"
FROM EMP;

/*
 * ex) empno : 사원번호, ename : 사원명, job : 직책
 * 		mgr : 관리자 번호, hiredate : 입사일, sal : 급 여!
 * 		deptno : 부서번호
 * 로 각 컬럼명을 설정하여 출력
 * */

SELECT EMPNO 사원번호, ENAME 사원명, JOB 직책,
	MGR "관리자 번호", HIREDATE "입사일", SAL "급 여!", DEPTNO 부서번호
FROM EMP;

