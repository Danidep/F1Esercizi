package it.javatostruts.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.h2.Driver;
import com.opensymphony.xwork2.ActionSupport;

public class DBConnection {
		
	  public String TestForm() {
		try {
			DriverManager.registerDriver(Driver.load());
			Connection c = DriverManager.getConnection("jdbc:h2:~/test");
			Statement s2= c.createStatement();
			int count= s2.executeUpdate("CREATE TABLE TEST(ID INT)");
			Statement s= c.createStatement();
			ResultSet r= s.executeQuery("SELECT * FROM TEST" );
			while (r.next()) {
				r.getString("ID");
			}
			System.out.println("ok");
		}catch(SQLException e) {
	    	return "error";
	    }
	return "ok";
  }
}
