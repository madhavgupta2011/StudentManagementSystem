/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static java.lang.Integer.parseInt;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Madhav Gupta
 */
public class Update extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    public Update() {
        try {
            initComponents();
            Insert i=new Insert();
            i.Show_in_table(jStudentDetails);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    int roll_no;
    String roll_no1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jRollno2 = new javax.swing.JLabel();
        tfrollno1 = new javax.swing.JFormattedTextField();
        bUpdate1 = new javax.swing.JButton();
        jRollno4 = new javax.swing.JLabel();
        jRollno5 = new javax.swing.JLabel();
        jRollno6 = new javax.swing.JLabel();
        jRollno7 = new javax.swing.JLabel();
        jname1 = new javax.swing.JTextField();
        jfname1 = new javax.swing.JTextField();
        jdob1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jRollno = new javax.swing.JLabel();
        tfrollno = new javax.swing.JFormattedTextField();
        bUpdate = new javax.swing.JButton();
        jRollno1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jStudentDetails = new javax.swing.JTable();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setBounds(new java.awt.Rectangle(50, 50, 540, 380));
        jDialog1.getContentPane().setLayout(new java.awt.BorderLayout(50, 50));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        jRollno2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno2.setForeground(new java.awt.Color(255, 0, 51));
        jRollno2.setText("Update the details of the Student and then Click the Update button");

        tfrollno1.setColumns(12);
        tfrollno1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####0"))));

        bUpdate1.setBackground(new java.awt.Color(153, 255, 153));
        bUpdate1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bUpdate1.setText("Update");
        bUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdate1ActionPerformed(evt);
            }
        });

        jRollno4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno4.setText("Roll no :");

        jRollno5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno5.setText("Name :");

        jRollno6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno6.setText("Date Of Birth :");

        jRollno7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno7.setText("Father's Name :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jRollno2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRollno5)
                            .addComponent(jRollno6)
                            .addComponent(jRollno4)
                            .addComponent(jRollno7))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfrollno1)
                            .addComponent(jname1)
                            .addComponent(jfname1)
                            .addComponent(jdob1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(bUpdate1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRollno2)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRollno4)
                    .addComponent(tfrollno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jname1)
                    .addComponent(jRollno5))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRollno6)
                    .addComponent(jdob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRollno7))
                .addGap(29, 29, 29)
                .addComponent(bUpdate1)
                .addGap(38, 38, 38))
        );

        jDialog1.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jRollno.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno.setText("Enter The roll number of Student");

        tfrollno.setColumns(12);
        tfrollno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####0"))));
        tfrollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfrollnoActionPerformed(evt);
            }
        });

        bUpdate.setBackground(new java.awt.Color(153, 255, 153));
        bUpdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        jRollno1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno1.setText("Whose Details you want to update :");

        jStudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll Number", "Name", "Date Of Birth", "Father's Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jStudentDetails);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bUpdate)
                        .addGap(136, 136, 136))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRollno)
                            .addComponent(jRollno1))
                        .addGap(10, 10, 10)
                        .addComponent(tfrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRollno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRollno1)
                                .addGap(18, 18, 18)
                                .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfrollno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfrollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfrollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfrollnoActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        String rollno=tfrollno.getText();
        int roll=Integer.parseInt(rollno);
        roll_no=roll;
        roll_no1=tfrollno.getText();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            Statement st=con.createStatement();
            String query="Select * from student where roll_no="+rollno;
            ResultSet rst=st.executeQuery(query);
            rst.next();
            String name=rst.getString("name");
            Date dob=rst.getDate("date_of_birth");
            String fname=rst.getString("father_name");
            jDialog1.setVisible(true);
            tfrollno1.setText(rollno);
            jname1.setText(name);
            jdob1.setDate(dob);
            jfname1.setText(fname);
            
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdate1ActionPerformed
        try {
            String rollno=tfrollno.getText();
            int roll=Integer.parseInt(rollno);
            
            String name=jname1.getText();
            java.util.Date dob=jdob1.getDate();
            java.sql.Date dat=new java.sql.Date(dob.getTime());
            String fname=jfname1.getText();
            String query="update student set roll_no='"+rollno+"',name='"+name+"',date_of_birth='"+dat+"',father_name='"+fname+"' where roll_no="+rollno;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            Statement st=con.createStatement();
            int count=st.executeUpdate(query);
            jDialog1.dispose();
            setVisible(false);
            StaffMenu sm=new StaffMenu();
            sm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bUpdate1ActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton bUpdate1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jRollno;
    private javax.swing.JLabel jRollno1;
    private javax.swing.JLabel jRollno2;
    private javax.swing.JLabel jRollno4;
    private javax.swing.JLabel jRollno5;
    private javax.swing.JLabel jRollno6;
    private javax.swing.JLabel jRollno7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jStudentDetails;
    private com.toedter.calendar.JDateChooser jdob1;
    private javax.swing.JTextField jfname1;
    private javax.swing.JTextField jname1;
    private javax.swing.JFormattedTextField tfrollno;
    private javax.swing.JFormattedTextField tfrollno1;
    // End of variables declaration//GEN-END:variables
}