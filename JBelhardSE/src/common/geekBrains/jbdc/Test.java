package common.geekBrains.jbdc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/cars";
		Connection con = null;
		try {
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);
		} catch (Exception e) {
			System.out.println("Error of driver loading");
			return;
		}

		try {
			con = DriverManager.getConnection(url, "root", "root");
			Statement select = con.createStatement();
			ResultSet result = select.executeQuery("Select * from cars");
			while (result.next()) {
				int key = result.getInt("id_model");
				String val = result.getString("model_name");
				System.out.println("key = " + key);
				System.out.println("val = " + val);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}