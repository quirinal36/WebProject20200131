package www.jca.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import www.jca.com.db.DBconn;

public class WasteController implements RecordInterface<Waste>{

	@Override
	public int insert(Waste input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Waste input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Waste input) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Waste selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Waste> selectList(Waste input) {
		List<Waste> list = new ArrayList<Waste>();
		
		try (Connection conn = new DBconn().getConnection()){
			String sql = new StringBuilder().append("SELECT * FROM waste").toString();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String year = rs.getString("year");
				String company = rs.getString("company");
				String budget = rs.getString("budget");
				
				Waste waste = new Waste();
				waste.setId(id);
				waste.setTitle(title);
				waste.setYear(year);
				waste.setCompany(company);
				waste.setBudget(budget);
				
				list.add(waste);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int count(Waste input) {
		// TODO Auto-generated method stub
		return 0;
	}

}
