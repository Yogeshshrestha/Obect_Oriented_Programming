package course.management.system;

import java.sql.*;
public class Connections {
    Connection cn;
    Statement st;

    public Connections() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
            st = cn.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
