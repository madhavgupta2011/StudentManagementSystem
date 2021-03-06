/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Madhav Gupta
 */
public class Insert extends javax.swing.JFrame {

    /**
     * Creates new form Insert
     */
    public Insert() throws SQLException {
        initComponents();
        Show_in_table(jStudentDetails);
        jComboBoxbranch.setSelectedIndex(-1);
        jComboBoxyear.setSelectedIndex(-1);
        jComboBoxsection.setSelectedIndex(-1);
    }
    
    public Connection getConnection() throws SQLException
    {
        Connection con;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
        return con;
    }
    public ArrayList<Student> getStudents() throws SQLException
    {
        ArrayList<Student> list=new ArrayList<>();
        Connection connection=getConnection();
        Statement st;
        ResultSet rs;
        String query="Select * from student where branch='"+branch+"' and year="+year1+" and section="+section1;
        st=connection.createStatement();
        rs=st.executeQuery(query);
        while(rs.next())
        {
           Student stu=new Student(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4));
           list.add(stu);
        }
        return list;
    }
    public void Show_in_table(JTable student) throws SQLException
    {
        ArrayList<Student> list=getStudents();
        //Just To do the table 
        DefaultTableModel model=(DefaultTableModel)student.getModel();
        Object[] row=new Object[4];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getRollno();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getDate();
            row[3]=list.get(i).getFname();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogAlert = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jStudentDetails = new javax.swing.JTable();
        jRollno = new javax.swing.JLabel();
        jRollno1 = new javax.swing.JLabel();
        jRollno2 = new javax.swing.JLabel();
        jRollno3 = new javax.swing.JLabel();
        tfrollno = new javax.swing.JFormattedTextField();
        tfname = new javax.swing.JTextField();
        tffname = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        bInsert = new javax.swing.JButton();
        jComboBoxbranch = new javax.swing.JComboBox<>();
        jComboBoxyear = new javax.swing.JComboBox<>();
        jComboBoxsection = new javax.swing.JComboBox<>();
        jbtngo = new javax.swing.JButton();
        jRollno4 = new javax.swing.JLabel();
        jNamec = new javax.swing.JLabel();
        jNamec1 = new javax.swing.JLabel();

        jDialogAlert.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogAlert.setAlwaysOnTop(true);
        jDialogAlert.setBounds(new java.awt.Rectangle(200, 200, 500, 340));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("Enter Valid Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton1)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogAlertLayout = new javax.swing.GroupLayout(jDialogAlert.getContentPane());
        jDialogAlert.getContentPane().setLayout(jDialogAlertLayout);
        jDialogAlertLayout.setHorizontalGroup(
            jDialogAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogAlertLayout.setVerticalGroup(
            jDialogAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jStudentDetails.setBackground(new java.awt.Color(204, 255, 153));
        jStudentDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll Number", "Name", "Date OF Birth", "Father's Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jStudentDetails.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jStudentDetails);
        jStudentDetails.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jRollno.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno.setText("Roll Number :");

        jRollno1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno1.setText("Branch :");

        jRollno2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno2.setText("Date Of Birth :");

        jRollno3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno3.setText("Father's Name :");

        tfrollno.setColumns(12);
        tfrollno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####0"))));

        tfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnameActionPerformed(evt);
            }
        });

        tffname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffnameActionPerformed(evt);
            }
        });

        bInsert.setBackground(new java.awt.Color(153, 255, 153));
        bInsert.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bInsert.setText("Insert");
        bInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertActionPerformed(evt);
            }
        });

        jComboBoxbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "IT", "EC", "EE", "CE", "ME" }));
        jComboBoxbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxbranchActionPerformed(evt);
            }
        });

        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jComboBoxsection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jbtngo.setText("Go");
        jbtngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtngoActionPerformed(evt);
            }
        });

        jRollno4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jRollno4.setText("Name :");

        jNamec.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jNamec.setText("Section :");

        jNamec1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jNamec1.setText("Year :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRollno2)
                                    .addComponent(jRollno3)
                                    .addComponent(jRollno)
                                    .addComponent(jRollno4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfrollno, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addComponent(tfname)
                                        .addComponent(tffname))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(bInsert)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRollno1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jNamec1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jNamec)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxsection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jbtngo)
                        .addGap(15, 15, 15)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRollno)
                    .addComponent(tfrollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRollno4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRollno2)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRollno3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tffname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxsection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtngo)
                    .addComponent(jRollno1)
                    .addComponent(jNamec)
                    .addComponent(jNamec1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnameActionPerformed

    private void tffnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffnameActionPerformed

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed
        String rollno=tfrollno.getText();
        int roll=Integer.parseInt(rollno);
        String name=tfname.getText();
        Date dob=jDateChooser1.getDate();
        String fname=tffname.getText();
        java.sql.Date dat=new java.sql.Date(dob.getTime());
        try {
            int rows=connect.addStudent(roll, name, dat, fname,branch,year1,section1);
        } catch (Exception ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DefaultTableModel model=(DefaultTableModel)jStudentDetails.getModel();
            model.setRowCount(0);
            tfrollno.setText("");
            tfname.setText("");
            jDateChooser1.setDate(null);
            tffname.setText("");
            Show_in_table(jStudentDetails);
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bInsertActionPerformed

    private void jComboBoxbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxbranchActionPerformed

    private void jbtngoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtngoActionPerformed
        branch=(String)jComboBoxbranch.getSelectedItem();
        year=(String)jComboBoxyear.getSelectedItem();
        section=(String)jComboBoxsection.getSelectedItem();
        if(year!=null && section!=null)
        {
        year1=Integer.parseInt(year);
        section1=Integer.parseInt(section);
        }
        if(year==null && branch==null && section==null)
        {
            jDialogAlert.setVisible(true);
        }
        else
        {
            try {
                DefaultTableModel model=(DefaultTableModel)jStudentDetails.getModel();
                model.setRowCount(0);
                Show_in_table(jStudentDetails);
            } catch (SQLException ex) {
                Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtngoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDialogAlert.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Insert().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
    String branch;
    String section;
    String year;
    int year1;
    int section1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bInsert;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxbranch;
    private javax.swing.JComboBox<String> jComboBoxsection;
    private javax.swing.JComboBox<String> jComboBoxyear;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JDialog jDialogAlert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jNamec;
    private javax.swing.JLabel jNamec1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jRollno;
    private javax.swing.JLabel jRollno1;
    private javax.swing.JLabel jRollno2;
    private javax.swing.JLabel jRollno3;
    private javax.swing.JLabel jRollno4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jStudentDetails;
    private javax.swing.JButton jbtngo;
    private javax.swing.JTextField tffname;
    private javax.swing.JTextField tfname;
    private javax.swing.JFormattedTextField tfrollno;
    // End of variables declaration//GEN-END:variables
}
