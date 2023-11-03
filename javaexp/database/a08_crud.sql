/*
 * # 데이터베이스에서 CRUD란?
 * 
 * - C : create (생성, INSERT)
 * - R : read (읽기, SELECT)
 * - U : update (수정, UPDATE)
 * - D : delete (삭제, DELETE)
 * 
 * */

SELECT * FROM emp01;

-- sysdate : 현재 날짜와 시간으로 가져오는 키워드 오라클 내장 객체
-- dual : 하나의 데이터를 확인할 때 사용하는 오라클의 내장된 테이블
SELECT sysdate FROM dual;

INSERT INTO emp01 VALUES(1000, '홍길동', '사원', 7780, sysdate, 4000, 100, 10);

SELECT * FROM emp01;

-- ex) emp01에 위와같이 1001 사원번호로 사원정보 입력
INSERT INTO emp01
	VALUES(1001, '김길동', '대리', 7782, sysdate, 3500, NULL, 20);
SELECT * FROM emp01;

-- ex) emp02 사원번호, 직책, 입사일, 급여, 부서번호
INSERT INTO emp02(empno, job, hiredate, sal, deptno)
	VALUES(1003, '과장', sysdate, 4000, 30);

SELECT * FROM emp02;

/*
 * # 수정 기본 형식
 * 
 * 1. update 테이블
 * 		set 컬럼명1 = 수정할데이터,
 * 			컬럼명2 = 수정할데이터
 * 		where 조건(비교 / 논리) 
 * */
SELECT * FROM emp01;
UPDATE emp01
	SET ename = '김길동'
	WHERE empno = 7369;

UPDATE emp01
	SET job = '사원',
		mgr = 7777
	WHERE empno = 7369;

-- ex) emp01 테이블의 empno가 7499인 사원의 ename, job, deptno를 변경하세요
UPDATE emp01
	SET ename = '김철수',
		job = '대리',
		deptno = '20'
	WHERE EMPNO = 7499;
SELECT * FROM emp01;

/*
 * # 삭제 기본형식
 * 
 * 1. delete 
 * 		from 테이블명
 * 		where 비교/논리
 * 2. 테이블에 비교/논리식을 통하여 특정 데이터를 행단위로 삭제
 * 		delete 컬럼명 지정이 의미없음
 * */

DELETE
FROM emp01
WHERE empno = 1000;

DELETE
FROM emp01
WHERE sal BETWEEN 1000 AND 2000;

SELECT * FROM emp01;

DELETE
FROM emp01
WHERE job = 'MANAGER';

DELETE 
FROM emp01
WHERE deptno = 20 AND job = '대리';