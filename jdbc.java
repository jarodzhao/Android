package a;

import java.sql.*;


// jdbc ��д����
public class abc
{
	static final String USER = "root";
	static final String PASS = "root";
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
	
	public static void main(String[] args)
	{
		Connection conn = null;
		Statement stmt = null;
		String sql = "";
		
		try {
			Class.forName(JDBC_DRIVER);
			
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			// ɾ������
//			PreparedStatement pst = conn.prepareStatement("delete from member");
//			pst.executeUpdate();
			
			// ��������
//			sql = "insert into member (id, state, nick) values(?,?,?)";
//			pst = conn.prepareStatement(sql);
//			
//			for(int i=1;i<20000;i++) {
//				pst.setObject(1, i);
//				pst.setObject(2, 0);
//				pst.setObject(3, "jarod #" + i);
//				pst.executeUpdate();
//			}
			
			// ��ȡ����
			stmt = conn.createStatement();
			sql = "select * from member";
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next())
				System.out.println(rs.getString("nick"));
			
//			pst.close();
			rs.close();
			stmt.close();
			conn.close();
			
			
		}catch(Exception e) {
			System.err.print(e);
		}
	}
}
