package it.struts_tris.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.Driver;

import com.opensymphony.xwork2.ActionSupport;

public class TrisConnection extends ActionSupport{

	private static final long serialVersionUID = 1L;

	public String TrisForm() {
			try {
				DriverManager.registerDriver(Driver.load());
				Connection c = DriverManager.getConnection("jdbc:h2:~/test");
				Statement s2= c.createStatement();
				int count= s2.executeUpdate("CREATE TABLE TRIS(ID INT)");
				Statement s= c.createStatement();
				ResultSet r= s.executeQuery("SELECT * FROM TRIS" );
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
