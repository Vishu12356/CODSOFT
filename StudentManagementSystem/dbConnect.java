package CodSoft.StudentManagementSystem;

import java.sql.*;

public class dbConnect {
    private static Connection mycon=null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String db="firstdb"; // replace with your database name
        String user = "root", pass ="#Vishu@2691";
        String url = "jdbc:mysql://localhost:3306/"+db;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,user,pass);
        return conn;
    }
}

