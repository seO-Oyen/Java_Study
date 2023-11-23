package javaexp.z01_homework;

public class A1114 {

	public static void main(String[] args) {

		// 1. PreparedStatement의 사용하는 이유와 장단점을 기술하세요.
		/*
		 * - 이유
		 * SQL쿼리에 파라미터를 동적으로 삽입하는 기능을 제공하며,
		 * 데이터베이스와의 상호작용을 보다 효율적이고 안정하게 만들어줍니다.
		 * - 장점
		 * 1. SQL Injection방지
		 * 2. 성능 향상
		 * 3. 코드 가독성 및 유지 보수
		 * 
		 * - 단점
		 * 1. 초기 비용
		 * 2. 유연성 제한
		 * */

		// 2. login 처리 예제를 기준으로 PreparedStatement를 활용하여 id, pwd를 입력하는 처리를 해보세요.
		// select * from member01 where id=? and pwd=? 기능메서드 처리
		/*
		public Member login(String id, String pwd) {
		Member member = null;
		String sql = "select * from member01 where id=? and pwd=?";
		
		try (
				Connection con = DBCon.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			) {
			// 처리코드1
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			try(
					ResultSet rs = pstmt.executeQuery();
				) {
				if(rs.next()) {
					member = new Member(
						rs.getInt("mno"),
						rs.getString("name"),
						rs.getString("id"),
						rs.getString("pwd"),
						rs.getString("auth"),
						rs.getInt("point")
					);
				}
				
			}
			
		} catch(SQLException e) {
			System.out.println("DB에러 : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		return member;
		}
		*/
		
		// 3. select * from member01 where name like ? 기능메서드 처리
		/*
		public List<Member> getMemberByName(String name) {
		List<Member> members = new ArrayList<Member>();
		String sql = "select * from member01 where name like ?";
		
		try (
				Connection con = DBCon.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			) {
			// 처리코드1
			pstmt.setString(1, "%" + name + "%");
			try(
					ResultSet rs = pstmt.executeQuery();
				) {
				while (rs.next()) {
					members.add(new Member(
						rs.getInt("mno"),
						rs.getString("name"),
						rs.getString("id"),
						rs.getString("pwd"),
						rs.getString("auth"),
						rs.getInt("point")
					));
				}
			}
		} catch(SQLException e) {
			System.out.println("DB에러 : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		return members;
		}
		*/
		
		// 4. SELECT * FROM locations WHERE STREET_ADDRESS LIKE ? AND city LIKE ?;
		/*
		public List<Location> getLocations(String street, String city) {
		List<Location> locations = new ArrayList<Location>();
		String sql = "SELECT * \r\n"
				+ "FROM locations\r\n"
				+ "WHERE STREET_ADDRESS LIKE ?\r\n"
				+ "AND city LIKE ?";
		
		try (
				Connection con = DBCon.con();
				PreparedStatement pstmt = con.prepareStatement(sql);
			) {
			// 처리코드1
			pstmt.setString(1, "%" + street + "%");
			pstmt.setString(2, "%" + city + "%");
			try(
					ResultSet rs = pstmt.executeQuery();
				) {
				while (rs.next()) {
					locations.add(new Location(
						rs.getInt("location_id"),
						rs.getString("street_address"),
						rs.getString("postal_code"),
						rs.getString("city"),
						rs.getString("state_province"),
						rs.getString("country_id")
					));
				}
			}
		} catch(SQLException e) {
			System.out.println("DB에러 : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("일반 에러 : " + e.getMessage());
		}
		return locations;
		}
		*/
		
		
	}

}
