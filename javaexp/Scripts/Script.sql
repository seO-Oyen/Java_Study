SELECT empno, ename, job, sal
FROM emp
WHERE sal BETWEEN 1000 AND 3000;

-- ResultSet rs
-- rs. next() : 행 단위로 이동, 1번째 호출 첫번째 row 데이터가 있을 시 true
--			rs.getInt("empno") : 7499 정수형으로 가져온다.
--			rs. getString("ename") : "ALLEN" 문자열로 가져온다.
-- ? MANAGER rs.next() 5번 호출, rs.getString("job")
-- 10번째 rs.next() : false	