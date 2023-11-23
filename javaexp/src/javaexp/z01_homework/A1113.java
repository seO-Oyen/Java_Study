package javaexp.z01_homework;

import java.util.ArrayList;
import java.util.List;

public class A1113 {

	/*private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;*/

	/*public double getStreets() {
		// 1. **최대 급여 조회** 
				SELECT max(sal)
				FROM emp;
		double maxSal = 0;
		String sql = "SELECT max(sal)\r\n"
				+ "FROM emp";
		
		try {
			con = DBCon.con();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				maxSal = rs.getDouble(1);
			}
			
		} catch (SQLException e) {
			System.out.println("DB 예외 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 예외 : " + e.getMessage());
		} finally {
			DBCon.close(rs, stmt, con);
		}
		
		return maxSal;
	}*/

	public static void main(String[] args) {

		// 2. **총 직원 수 계산**
		/*SELECT count(empno)
		FROM emp;*/

		// 3. **평균 급여 계산**
		/*SELECT avg(sal)
		FROM emp;*/

		// 4. **최소 급여 조회**
		/*SELECT min(sal) 
		FROM emp;*/

		// 5. **부서 번호 @@의 총 직원 수**
		/*SELECT count(empno)
		FROM emp
		WHERE deptno = 10;*/

		// 1. **전체 직원의 평균 급여와 총 급여**
		/*SELECT avg(sal), sum(sal)
		FROM emp;*/

		// 2. **직원이름 에서 일하는 직원의 이름과 입사일,
		/*SELECT ename, hiredate
		FROM emp
		WHERE ename LIKE 'SMITH';*/

		// 1. **모든 부서의 부서 번호 목록**
		/*SELECT deptno
		FROM dept;*/

		// 2. **@@@ 이상 급여를 받는 직원들의 이름**
		/*SELECT ename
		FROM emp
		WHERE sal >= 2000;*/

		// 3. **직책이 @@ 인 직원들의 이름**:
		/*SELECT ename
		FROM emp
		WHERE job = 'SALESMAN';*/

		// 1. **각 부서이름과 급여를 기준으로 직원의 이름, 직책, 급여**:
		/*SELECT ename, job, sal
		FROM emp
		WHERE deptno = 10 AND sal >= 2000*/

		// 2. **각 직책별 평균 급여**:
		/*SELECT job, avg(sal)
		FROM emp
		GROUP BY job;*/

		// 3. **각 부서의 직원 수 및 평균 급여**:
		/*SELECT deptno, count(empno), avg(sal)
		FROM emp
		GROUP BY deptno;*/

	}

}
