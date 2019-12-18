/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;
import acc.BankingMain;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author arshd
 */
public class JavaConnect {
    Connection conn;
    public ResultSet rs;;
    public PreparedStatement pst;
    public String sql;
    public Connection connectDb() throws Exception{
        if(conn == null){
            
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\arshd\\Desktop\\BankingSystem\\BankingSystem.db");
            JOptionPane.showMessageDialog(null, "Connected");

            
        }
        return conn;
    }
    // Checking if the connection is working
    public static void main(String[] args) throws Exception{
        // Creating new Object
        JavaConnect javaconnect = new JavaConnect();
        BankingMain main = new BankingMain();
        javaconnect.connectDb();
    }
}
