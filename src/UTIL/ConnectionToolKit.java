package UTIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToolKit {
		static String url="jdbc:mysql://localhost:3306/jdbcd21";
		static String user="root";
		static String pass="";
		static Connection con=null;
		
		
		public static Connection getConnection() {
			try {
				if(con==null)
					con=DriverManager.getConnection(url,user, pass);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return con;
		}
}
