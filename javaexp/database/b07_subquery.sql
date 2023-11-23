-- 부서번호가 10인 사원정보의 급여를 부서정보 20인 사원의 최고 급여로 변경 처리
CREATE TABLE emp07
AS SELECT * FROM emp;

UPDATE emp07
	SET sal = (
		SELECT max(sal)
		FROM emp07
		WHERE deptno = 10
	)
WHERE deptno = 10;

SELECT * FROM emp07;
SELECT * FROM emp;

UPDATE emp07
	SET job = (
		SELECT job
		FROM emp07
		WHERE job 
	)