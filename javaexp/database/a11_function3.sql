/*
 * # instr(지정한문자열데이터|컬럼, '검색문자')
 * 1. 특정한 문자열을 검색해서 해당 문자열의 위치를 index로 반환처리하는 함수
 * 		ex) 주로 대용량의 문자열 데이터를 검색해서 해당 문자열의
 * 		첫번째 위치를 index로 표현해준다. 없으면 0
 * 2. 추가옵션
 * 		instr(데이터|컬럼, '검색문자', 시작위치, 검색된 횟수)
 * 
 * # 문자열을 특정한 크기를 만들어 부족한 문자는 특정 문자열로 채워서 처리하는 lpad, rpad
 * 1. 크기가 10자를 기준으로 해당 문자열보다 적으로 공백인, #으로 채워서
 * 		일괄적으로 해당 크기로 표현하는 경우에 사용된다.
 * 2. lpad ; left padding 왼쪽을 특정 문자열로 채우는 경우
 * 		lpad(데이터, 크기, 왼쪽에 덧붙일 문자열)
 * 3. rpad : right padding 오른쪽을 특정 문자열로 채우는 경우
 * 		rpad(데이터, 크기, 오른쪽에 덧붙일 문자열)
 * 
 * # 왼쪽과 오른쪽에 특정한 문자열을 삭제하는 trim
 * 1. trim이라는 말은 절삭이라는 말로, 왼쪽이나 오른쪽 끝에 있는 특정한 문자열을
 * 		반복적으로 삭제할 때 사용
 * 2. 주요 기능 함수
 * 		1) ltrim(컬럼|데이터, '제거할 문자') : 왼쪽에 제거할 문자를 반복적으로 없애준다.
 * 		2) rtrim(컬럼|데이터, '제거할 문자') : 오른쪽에 제거할 문자를 반복적으로 없애준다.
 * 		3) trim('양쪽에 삭제할문자' from 컬럼|데이터)
 * 			: 양쪽에 제거할 문자가 있을때 한번에 제거처리 한다.
 * */

SELECT instr('sql*plus', '*') sch1,
	instr('sq*lp*lu*s', '*', 3, 1) sch2,
	instr('sq*lp*lu*s', '*', 3, 2) sch3,
	instr('sq*lp*lu*s', '*', 3, 2) sch4
FROM dual;

-- ex) 직책에서 MAN이 있는경우에 해당 위치를 직책과함께 출력
SELECT job, instr(job, 'MAN')
FROM emp
WHERE instr(job, 'MAN') != 0;

SELECT lpad('sql', 5, '*') show1,
	rpad('sql', 10, '#') show2
FROM dual;

-- ex) 사원명의 최대크기(max)확인 해서, 그 보다 작은 문자는 왼쪽에 *, 오른쪽에 #을 넣어서 처리
SELECT ename, rpad(ename, 6, '#'), lpad(ename, 6, '*')
FROM emp;


SELECT LTRIM('*****sql*****', '*') str1, 
	rtrim('*****sql*****', '*') str2, 
	trim('*' FROM '*****sql*****') str3
FROM dual;

SELECT ltrim(job, 'S'),
	rtrim(job, 'N')
FROM emp;
