package project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 *
 * @author user
 */
public class InsertUpdateDelete {
    public static void setData(String Query, String Msg){
        Connection con =null;
        Statement st = null;
        try {
            con = DBConnection.getConnection();
            st = con.createStatement();
            st.executeUpdate(Query);
            
            if (!Msg.equals("")) {
                JOptionPane.showMessageDialog(null, Msg);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, Msg);
        }
        finally{
            try {
            
        } catch (Exception e) {
        } 
        }
    }
}
