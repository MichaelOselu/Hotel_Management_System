/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import project.*;
import java.sql.*;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultEditorKit;
import java.util.Date;

/**
 *
 * @author user
 */
public class CustomerCheckOut extends javax.swing.JFrame {

    /**
     * Creates new form CustomerCheckOut
     */
    public CustomerCheckOut() {
        initComponents();
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);

    }
    int id = 0;
    String Query;
    String roomType;
    String bed;
    String roomNo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hotel Images & Icon/Hotel Images & Icon/Customer Check Out.png"))); // NOI18N
        jLabel1.setText("Customer CheckOut");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 27, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hotel Images & Icon/Hotel Images & Icon/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1256, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Room No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 230, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile NO", "Nationality", "Gender", "Email", "IdProof", "Address", "CheckIn Date", "Room number", "Bed", "Room Type", "Price per Day"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1290, 330));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Check In Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 240, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Check Out Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 210, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Customer Mobile No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, -1, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 160, 230, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Price Per Day");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 210, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("No OF Days Stay");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 240, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Total Amount to Pay");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, -1, -1));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 200, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("CheckOut");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Emaill");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 220, -1, -1));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, 220, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hotel Images & Icon/Hotel Images & Icon/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -40, 1780, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ResultSet rs = Select.GetData("select * from customer where checkOut is NULL");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)});
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String roomNo = jTextField1.getText();

        try {
            ResultSet rs = Select.GetData("select * from customer where roomNo = '" + roomNo + "' and checkOut is NULL");
            if (rs.next()) {
                jTextField1.setEditable(false);
                id = rs.getInt(1);
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(9));
                jTextField5.setText(rs.getString(3));
                jTextField6.setText(rs.getString(13));

                SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
                Calendar cal = Calendar.getInstance();
                jTextField4.setText(myFormat.format(cal.getTime()));
                String dateBeforeString = rs.getString(9);
                java.util.Date dateBefore = myFormat.parse(dateBeforeString);
                String dateAfterString = myFormat.format(cal.getTime());
                java.util.Date dateAfter = myFormat.parse(dateAfterString);
                long difference = dateAfter.getTime() - dateBefore.getTime();
                int noOfDaysStay = (int) (difference / 1000 * 60 * 60 * 24);

                if (noOfDaysStay == 0) {
                    noOfDaysStay = 1;
                }
                jTextField7.setText(String.valueOf(noOfDaysStay));
                float price = Float.parseFloat(jTextField6.getText());

                jTextField8.setText(String.valueOf(noOfDaysStay * price));
                jTextField9.setText(rs.getString(6));
                roomType = rs.getString(12);
                bed = rs.getString(11);

            } else {
                JOptionPane.showMessageDialog(null, "Room Number Is Not Booked Or Room Number Does Not Exist");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String name = jTextField2.getText();
        String mobileNo = jTextField5.getText();
        String email = jTextField9.getText();

        String checkOut = jTextField4.getText();
        String noOfDaysStay = jTextField7.getText();
        String totalAmount = jTextField8.getText();
        roomNo = jTextField1.getText();
        Query = "update customer set numberOfDaysStay = '" + noOfDaysStay + "', totalAmount = '" + totalAmount + "', checkOut = '" + checkOut + "' where id = '" + id + "'";
        InsertUpdateDelete.setData(Query, "");
        Query = "update room set status = 'Not Booked' where roomNo = '" + roomNo + "'";
        InsertUpdateDelete.setData(Query, "");

        String path = "D:\\";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();

        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "" + id + ".pdf"));
            doc.open();
            Paragraph paragraph1 = new Paragraph("                                    IBIS DAYS HOTEL MANAGEMENT SYSTEM\n");
            doc.add(paragraph1);
            Paragraph paragraph2 = new Paragraph("***********************************************************************************************************");
            doc.add(paragraph2);
            Paragraph paragraph3 = new Paragraph("\tBill ID: " + id + "\nCUSTOMER DETAILS: \nName: " + name + " \nMobile Number: " + mobileNo + "\nEmail: " + email + "\n");
            doc.add(paragraph3);
            doc.add(paragraph2);
            Paragraph paragraph4 = new Paragraph("\tROOM DETAILS:\nNumber: " + jTextField1.getText() + " \nType: " + roomType + "\nBed: " + bed + "\nPrice Per Day: " + jTextField6.getText() + " ");
            doc.add(paragraph4);
            doc.add(paragraph2);
            PdfPTable tb1 = new PdfPTable(4);
            tb1.addCell("Check In Date " + jTextField3.getText());
            tb1.addCell("Check Out Date " + checkOut);
            tb1.addCell("Number Of Days Stay " + noOfDaysStay);
            tb1.addCell("Total Amount Paid " + totalAmount);
            doc.add(tb1);
            doc.add(paragraph2);
            Paragraph paragraph5 = new Paragraph("Thank You, Please Visit Again");
            doc.add(paragraph5);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        int a = JOptionPane.showConfirmDialog(null, "Do you want to print bill", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            try {
                if ((new File("D:\\" + id + ".pdf")).exists()) {
                    Process p = Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler D:\\" + id + ".pdf");
                }else
                    System.out.println("File does not exists");
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
