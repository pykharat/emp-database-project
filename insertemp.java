
import java.sql.*;

public class insertemp {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "Prajwal@123"
            );


            String sql = "INSERT INTO employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);


            stmt.setInt(1, 101);
            stmt.setString(2, "Jenny");
            stmt.setInt(3, 25);
            stmt.setDouble(4, 10000.0);
            stmt.executeUpdate();


            stmt.setInt(1, 102);
            stmt.setString(2, "Jacky");
            stmt.setInt(3, 30);
            stmt.setDouble(4, 20000.0);
            stmt.executeUpdate();


            stmt.setInt(1, 103);
            stmt.setString(2, "Sam");
            stmt.setInt(3, 28);
            stmt.setDouble(4, 15000.0);
            stmt.executeUpdate();


            stmt.setInt(1, 104);
            stmt.setString(2, "Emma");
            stmt.setInt(3, 22);
            stmt.setDouble(4, 18000.0);
            stmt.executeUpdate();


            stmt.setInt(1, 105);
            stmt.setString(2, "Mike");
            stmt.setInt(3, 35);
            stmt.setDouble(4, 25000.0);
            stmt.executeUpdate();

            System.out.println("✅ All 5 employee records inserted.");

            
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
