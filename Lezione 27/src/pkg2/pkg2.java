package pkg2;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class pkg2 {
	    public static void main(String[] args) {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn =
					DriverManager.getConnection(
						"jdbc:mysql://localhost/test?" + "user=root&password=root"
					);
	            Statement stmt;
	            PreparedStatement pstmt;
	            ResultSet rs;
	            
	            //conn.setAutoCommit(false);

	            // creo la tabella
	            stmt = conn.createStatement();

	            stmt.executeUpdate("DROP TABLE IF EXISTS students");
	            stmt.executeUpdate("CREATE TABLE students " +
	                    "(id INTEGER primary key auto_increment, " +
	                    "firstname TEXT NOT NULL, " +
	                    "lastname TEXT NOT NULL)");

	            // inserisco due record
	            pstmt = conn.prepareStatement("INSERT INTO students " +
	                    "(firstname, lastname) values (?,?)");

	            pstmt.setString(1, "Antonio");
	            pstmt.setString(2, "Rossi");
	            pstmt.execute();

	            pstmt.setString(1, "Marco");
	            pstmt.setString(2, "Bianchi");
	            pstmt.execute();

	            // recupero i dati
	            rs = stmt.executeQuery("SELECT * from students");

	            while(rs.next())
	            {
	                System.out.println("id: " + rs.getString("id"));
	                System.out.println("firstname: " + rs.getString("firstname"));
	                System.out.println("lastname: " + rs.getString("lastname"));
	                System.out.println("--------------------------------------");
	            }
	            //conn.commit();
				pstmt.close(); // rilascio le risorse
				stmt.close(); // rilascio le risorse
	            conn.close(); // termino la connessione
	        }
	        catch(ClassNotFoundException e)
	        {
	            System.out.println(e);
	        }
	        catch(SQLException e)
	        {
	            System.out.println(e);
	        }
	    }
	}
