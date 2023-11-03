/*
 * # sql 함수
 * 
 * 1. 컬럼의 값이나 데이터 타입을 선언된 내용을 변경하는 경우를 말한다.
 * 2. 숫자 또는 날짜 데이터의 출력 형식이 변경하는 경우
 * 3. 하나 이상의 행에 대한 집계를 하는 경우
 * 
 * ex) select 함수(컬럼)
 * 		from 테이블
 * 		where 함수(컬럼) = 데이터
 * 		and 컬럼 = 함수(데이터)
 * 
 * # sql 함수의 유형
 * 1. 단일행 함수 : 테이블에 저장되어 있는 개별 행을 대상으로 함수를 적용하여
 * 		하나의 결과를 반환하는 함수
 * 		- 데이터 값을 조작하는 데 주로 사용한다.
 * 		- 행별로 함수를 적용하여 하나의 결과를 반환하는 함수
 * 		1) 종류
 * 		- 문자함수
 * 		- 숫자함수
 * 		- 날짜함수
 * 		- 변환함수 : 묵시적 데이터변환/명시적 데이터 변환
 * 		- 일반함수
 * 		2) 사용법
 * 			함수명(컬럼명|표현식, 매개변수1, 매개변수2, ...)
 * 2. 복수행 함수 : 조건에 따라 여러행을 그룹화하여 그룹별로 결과를 하나씩 반환하는 함수
 * 		1) 사용방법
 * 			select 그룹대상컬럼, 그룹함수(그룹데이터)
 * 			form 테이블
 * 			group by 그룹대신컬럼
 * 			ex) 부서 번호별 최고 급여
 * 			select deptno, max(sal)
 * 			from emp
 * 			group by deptno;
 * 
 * # 문자함수
 * - 문자 데이터를 입력하여 문자나 숫자를 결과로 변환하는 함수
 * - initcap() : 문자의 첫번째 문자만 대문자로 변환
 * - 대소문자 변환 함수
 * 		실무에서 대소문자 구분없이 검색이 필용한 경우 입력, 수정, 조회 조건문 사용으로 활용
 * 		1) lower() : 문자열 전체를 소문자로 변환처리
 * 		2) upper() : 문자열 전체를 대문자로 처리
 * */
SELECT ename, initcap(ename) ename2, job, initcap(job) job2
FROM emp;

-- ex) || 연결 연산자를 활용하여 사원명 is a 직책명으로 출력하세요 ex) Smith is a clerk!
SELECT initcap(ename)||' is a '||initcap(job)||'!' show	
FROM emp;

SELECT ename, lower(ename) "사원명 소문자",
	job || upper('-hi! Man!!') "직책과 조합 대문자"
FROM emp;

SELECT * FROM EMPLOYEES;
SELECT first_name||' - '||last_name "전체이름",
	lower(first_name) "소문자로 변경", upper(last_name) "대문자로 변경"
FROM EMPLOYEES;

SELECT job_id, email,
	first_name, '직책 '||lower(job_id)||'인 '||upper(first_name)
	||'의 이메일은 '||lower(email)||'입니다.'
FROM employees;

SELECT * FROM employees;
-- first_name 컬럼을 기준으로 do DO dO 입력값 상관없이 Do 라는 글자가
-- 대소문자 관련 없이 검색이 되게 하려면 다음과 같이 처리하여야한다.
SELECT first_name, employee_id
FROM employees
WHERE upper(FIRST_NAME) LIKE '%'||upper('do')||'%';
-- upper('do') 부분에 어떤 데이터를 입력하더라도 대문자로 바꾸고
-- 다시 컬럼을 upper(컬럼명에 의해 대문자로 변환된 내용을 검색하게 한다.)

-- ex) employees 테이블에 email와 job_id가 대소문자 관련없이 키워드 검색되게 하세요
SELECT email, job_id
FROM EMPLOYEES
WHERE upper(email) LIKE '%'||upper('O')||'%'
	AND upper(job_id) LIKE '%'||upper('O  ')||'%';