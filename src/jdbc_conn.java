import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_conn {
    public static void main(String[] args) throws SQLException {

        String ssql="select * from student";
        Connection con= DriverManager.getConnection();
        
    }
}
