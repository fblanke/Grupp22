import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) throws SQLException {
		 try {
		        //DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
		        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); // också ok
		    } catch(Exception e) {
		        System.out.println("Kan inte hitta database driver class: " + e);
		        } 
		    
		    Connection con = DriverManager.getConnection("JDBC:ODBC:Grupp22;database=Uppgift1;"); 
	}

}
