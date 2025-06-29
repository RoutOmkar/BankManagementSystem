package bank.management.system;
import java.sql.*;
import javax.swing.*;

public class TestDB {
    public Connection connection;
    public Statement statement;

    public TestDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "Omkar@1234");
            statement = connection.createStatement();


        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "MySQL JDBC Driver not found. Please add the connector jar to the classpath.");
            e.printStackTrace();
        } catch (SQLException e1) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e1.getMessage());
            e1.printStackTrace();
        }
    }
}
