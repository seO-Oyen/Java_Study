CREATE TABLE emp_dept
AS SELECT e.*, dname, loc
FROM emp e, dept d
WHERE e.deptno = d.deptno;

SELECT * FROM emp_dept;

-- ex) 사원정보 1개 삽입
INSERT INTO emp_dept
VALUES
(
1000,
'홍길동',
'사원',
7782,
sysdate,
3000,
100,
10,
'ACCOUNTING',
'NEW YORK'
)

SELECT * FROM emp_dept
WHERE empno = 1000;

/*
정규화가 되지 않는 테이블에는
1. 새 데이터를 삽입하기 위해 불필요한 데이터도 함께 삽입해야하는 문제가 발생한다.
2. 갱신 이상 : 중복 튜플 중 일부만 변경하여 데이터가 불일치하게 되는 모순의 문제가
	발생한다.
3. 삭제 이상 : 튜플을 삭제하면 꼭 필요한 데이터까지 함께 삭제되는 데이터 손실의 문제
	발생
*/
SELECT * FROM emp_dept;
-- 7839의 부서이름을 ACCOUNTING ==> 회계로 변경
UPDATE emp_dept
	SET dname = '회계'
	WHERE empno = 7839;
	
-- 특정한 사원정보를 삭제
DELETE FROM emp_dept
WHERE ename IN ('FORD', 'SMITH', 'JONES');

/*
# 정규화
1. 이상 현상이 발생하지 않도록, 릴레이션을 관련 있는 속성들로만 구성하기 위해
	릴레이션을 분해(decomposition)하는 과정을 말한다.
2. 함수적 종속성을 판하하여 정규화를 수행한다.

# 함수적 종속성
1. 속성들 간의 관련성

# 정규화를 위한 단계적 학습 내용
1. 정규화 과정을 이러한 이상 현상을 효과적으로 처리하기 위한 내용이고, 단계별 과정을
	거친다.
2. 이 과정은 각 단계별로 정규화를 효과적으로 처리하기 위한 내용이고,
	이전 과정을 거쳐야 다음 과정을 처리할 수 있다.
3. 개괄적으로
	1) 제 1정규화 : 데이터의 원자성
	2) 제 2정규화 : 완전함수 종속성
	3) 제 3정규화 : 이해적 함수 종속성
	4) BCNF 정규화
	5) 제 4정규화
	6) 제 5정규화
	로 구분이 되는데, 실무적으로는 1~3정규화까지 많이 활용되고 데이터의 용량과
	복잡성에 따라 정규화 과정에 의해서 무결성은 보장되지만 속도 이슈때문에
	역정규화 과정을 거치는 경우도 많다. 
	
# 제 2정규화
1. 이미 제1정규화를 충족하는 테이블을 대상으로 수행된다. 제2정규화를 달성하기
	위해서는 테이블이 1정규화를 만족해야하면, 모든 주요 속성이 완전함수 종속
	즉, 기본 키의 전체에 대해서만
*/