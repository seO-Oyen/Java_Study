/*
 * # 데이터 타입의 형식과 변환
 * 
 * 1. 숫자나 날짜, 문자열 타입은 데이터의 변환에서 중요한 부분을 이루고 있다.
 * 		데이터 베이스에서도 원하는 형식으로 타입변환이 함수에 의해서 처리된다.
 * 2. 형변환 유형
 * 		1) 묵시적 데이터 타입 변환
 * 			오라클에서 원활한 데이터 처리를 위해 부분적으로 자동형변화를 허용
 * 			select
 * 			from
 * 			where 숫자형 컬럼 = '2000' : 묵시적 형변환
 * 		2) 명시적 데이터 타입 변환(함수를 통해)
 * 			- to_char() : 문자열형
 * 			- to_date() : 날짜형
 * 			- to_number() : 숫자형
 * */

-- 묵시적
SELECT *
FROM emp
WHERE sal = '800';

-- 명시적
SELECT *
FROM emp
WHERE sal = TO_NUMBER('1600'); 

/*
 * # data 타입을 특정 형식의 문자열로 변환해주는 to_char
 * 
 * 1. to_char()을 사용하면 data 타입의 컬럼에서 특정 속성/매개변수를 이용해서
 * 		원하는 형식의 문자열을 출력할 수 있다.
 * 		1) 기본형식
 * 			to_char(날짜유형데이터, 형식)
 * 		2) 날짜 ==> 문자열로 바꾸어서 출력하는 형식의 매개변수값
 * 			'Q' : 해당 날짜의 분기 (1사분기, 2사분기, ..., 4사분기 표현)
 * 			'MM' : 월을 두자리로 표현
 * 			'MONTH' : 영문 표기
 * 			'WW' : 연단위 주차표기 @@ 년도의 @@째주차
 * 			'W' : 월단위 주차 표기 @@월의 @@째주차
 * 			'DD' : 일표기
 * 			'DY'|'DAY' : 요일 표기
 * */

SELECT ename, hiredate,
	to_char(hiredate, 'YYYY'),
	to_char(hiredate, 'Q'),
	to_char(hiredate, 'MM'),
	to_char(hiredate, 'MONTH'),
	to_char(hiredate, 'WW'),
	to_char(hiredate, 'W'),
	to_char(hiredate, 'DD'),
	to_char(hiredate, 'DAY')
FROM emp;

SELECT ename, to_char(hiredate, 'YYYY'),
	to_char(hiredate, 'MM'),
	to_char(hiredate, 'DD'),
	to_char(hiredate, 'Q')
FROM emp
--WHERE TO_CHAR(hiredate, 'YYYY') LIKE '1981'
--	AND (TO_CHAR(hiredate, 'Q') LIKE '4'
--	OR TO_CHAR(hiredate, 'Q') LIKE '1'); 
WHERE to_char(hiredate, 'YYYY Q') = '1981 1';

/*
 * # number의 데이터를 원하는 형식으로 숫자형으로 바꾸는 to_char
 * 1. 숫자형 데이터 ==> 특정형식의 문자열로 처리
 * 2. 형식
 * 		1) 단위로 표시 : to_char(데이터, '$999999')
 * 		2) 소숫점 표시 : to_char(데이터, '9999.99')
 * 		3) 천 단위 ,표시 : to_char(데이터, '9,999,999')
 * */
SELECT ename, sal, TO_CHAR(sal, '$99999') "달러표시",
	TO_CHAR(sal, '99999.99') 소숫점표시,
	TO_CHAR(sal, '9,999,999') "천단위 ,표시"
FROM emp;

SELECT ename, sal, sal + NVL(comm, 0),
	TO_CHAR(sal + NVL(comm, 0), '99,999.99')
FROM emp;

/*
 * # 숫자형 문자열을 명시적으로 숫자형으로 바꿔주는 to_number('숫자형문자열')
 * 1. 숫자 형태의 문자열로 구성된 데이터를 숫자로 변환 처리
 * 2. 형식
 * 		to_number(숫자형 문자열 데이터)
 * 		ex) 프로그램에서 입력되는 데이터는 문자열이기 때문에, 숫자형 데이터는
 * 		형변환 함수를 통해서 처리하는 경우가 많다. 하지만 자동형변환 해주는 경우도
 * 		있기때문에 상황 / 조건에 따라 처리한다.
 * */
SELECT *
FROM emp
WHERE sal >= to_number('2000'); -- 자동형변환도 가능하다

/*
 * # 문자열을 숫자형으로 바꾸어주는 to_date('날짜형문자열', 'YYYY MM DD - 형식표현')
 * 1. 대부분의 데이터는 날짜형으로 입력 불가능하다. 문자열로 입력하여
 * 		위와 같은 형변환 함수를 통해서 날짜형으로 변환하여
 * 		검색하거나 데이터를 입력처리 한다.
 * 2. 기본 형식
 * 		to_date('입력/검색문자열데이터', 'YYYY-MM-DD : 옆에 있는 문자열을 
 * 			날짜형으로 어떻게 처리되는지 선언'
 * */
SELECT ename, hiredate
FROM emp;
INSERT INTO emp01(ename, hiredate) values('마길동',
	to_date('2020/01/01', 'YYYY/MM/DD'));
SELECT *
FROM emp01;

INSERT INTO emp01(empno, hiredate) values(1401,
	to_date('2023/01/01', 'YYYY/MM/DD'));