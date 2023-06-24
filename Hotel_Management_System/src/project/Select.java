package project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Select {
    public static ResultSet GetData(String Query){
        Connection con =null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            con = DBConnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(Query);
            return rs;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
