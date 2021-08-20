package Test;
import java.sql.*;
import java.util.*;
public class OracleConnect {

	 public static void main(String[] args)throws ClassNotFoundException, SQLException {
		    // TODO Auto-generated method stub
		    String url= "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		    String username = "DB_TT";
		    String password = "nhlg";
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con = DriverManager.getConnection(url,username,password);
		    System.out.println("Connection created");
		    Statement stmt = con.createStatement();
		    String CreateQuery = "UPDATE emp SET NAME= 'harish' WHERE ID=3";
		    stmt.executeUpdate(CreateQuery);
		    ResultSet rs = stmt.executeQuery("SELECT * from emp");
		    while(rs.next()) {
		      System.out.println("ID is "+rs.getInt("ID")+" Name is "+rs.getString("NAME"));
		    }
		    con.close();
		  }

		}


