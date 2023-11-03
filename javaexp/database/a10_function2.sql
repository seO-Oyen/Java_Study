/*
 * # 문자열 길이 반환
 * 
 * 1. length(데이터/컬럼) : 해당 데이터나 컬럼의 문자열 길이를 반환하는 함수. 글자열 크기를 리턴
 * 2. lengthb(데이터/컬럼) : 입력되는 문자열의 바이트를 반환하는 함수
 * 		1) 영문은 1자와 1byte가 같다
 * 		2) 한글은 1자가 3byte이다.
 * 
 * # 문자열을 연결하는 concat 함수
 * 1. concat(문자열1, 문자열2) : 두 문자열을 결합처리한다.
 * 		문자열1||문자열2 과 동일
 * 		ex) 문자열1||문자열2||문자열3
 * 			=> concat(concat(문자열1, 문자열2), 문자열3)
 * 
 * # 문자열을 추출하는 substr 함수
 * 1. substr(문자열데이터, 시작위치(0부터), 시작위치로부터 추출할 갯수)
 * 		문자열 데이터를 시작위치와 마지막위치를 기준으로 절삭처리하여 사용하는 것을 말한다.
 * 		ex) substr('sql*plus', 5, 4) ==> plus
 * 
 * # 중첩함수
 * 1. 함수를 2중 3중 이상으로 적용하여, 원하는 결과를 가져오고자 할 때 사용
 * 2. 기본형식
 * 		함수3(함수2(함수1(매개변수1), 매개변수2, ...), 매개변수3, ...)
 * 
 * */

SELECT 'himan' en_name, length('himan') 길이1, lengthb('himan') 길이2,
	'홍길동' ko_name, length('홍길동') 길이3, lengthb('홍길동') 길이4
FROM dual;
-- 영문은 동일하지만 한글의 경우 lengthb가 length의 3배가 된다.

-- ex) 사원 테이블에서 사원명과 직책의 글자 수를 표현하되, 직책의
--	글자 개수가 6이상인 데이터를 출력하세요.
SELECT ename, job, length(ename), length(job)
FROM emp
WHERE LENGTH(job) >= 6;


SELECT empno, ename, job, concat(ename, job) "이름과 직책"
FROM emp;

SELECT job, substr(job, 2, 3) "직책 부분추출" -- 3번째 문자열로부터 3개
FROM emp;

-- ex) 사원테이블에서 사원명 첫 3글자를 추출하세요
SELECT substr(ename, 0, 3)
FROM emp;

-- 사원 테이블에서 사원명을 소문자로 바꾸고 직무 소문자와 함께 이어서 표현 처리
SELECT concat(lower(ename), lower(job)) "이름과 직무(소문자)"
FROM emp;

-- 사원테이블에서 사원명과 직무를 이어서 표현하고, 직무를 대문자로 변환하여 출력
SELECT concat(ename, upper(job)) "이름과 직무 (대문자)"
FROM emp;

-- ex) ename의 앞에 3글자와 job 뒤에 3글자를 추출해서 연결하여 출력
SELECT concat(lower(substr(ename, 0, 3)), lower(substr(job, -3)))
FROM emp;

-- ex) ename의 2번째부터 3글자를 추출해서 소문자를 만들어 출력
SELECT lower(SUBSTR(ename, 2, 3))
FROM emp;


