import java.sql.*;

public class jdbc_conn {
    public static void main(String[] args) throws SQLException {

        String ssql="select * from students";
        String user="postgres";
        String password="postgres";
        String url="jdbc:postgresql://34.172.164.130:5432/postgres";

       /* Connection con= DriverManager.getConnection(url,user,password);
        Statement st= con.createStatement();
        ResultSet rs= st.executeQuery(ssql);
        System.out.println(rs);
        rs.next();*/
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(ssql)) {

            // Loop through each row of the result set
            while (rs.next()) {
                // Assuming you have columns named 'id' (integer) and 'name' (string)
                int id = rs.getInt("student_id");
                String name = rs.getString("first_name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



        
    }
}
