/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.neu.csye6200.view;

import com.db4o.Db4o;
import edu.neu.csye6200.controller.ConfigureDayCare;
import edu.neu.csye6200.model.DayCare;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.util.FileUtil;
import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author srika
 */
public class NewDayCareForm extends javax.swing.JFrame {
    
    private String userName;
    private Vector<Student> studentList;
    private Vector<Teacher> teacherList;
    /**
     * Creates new form NewDayCareForm
     */
    public NewDayCareForm() {
        initComponents();
        studentList = new Vector<>();
        teacherList = new Vector<>();
        jButton_createDayCare.setEnabled(false);
    }
     public NewDayCareForm(String userName) {
        this.userName = userName;
        studentList = new Vector<>();
        teacherList = new Vector<>();
        initComponents();
        jButton_createDayCare.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_Heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_dayCareName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton_addStudents = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton_addTeachers = new javax.swing.JButton();
        jLabel_addStudentsFile = new javax.swing.JLabel();
        jButton_createDayCare = new javax.swing.JButton();
        jLabel_addStudentsLabel = new javax.swing.JLabel();
        jLabel_addTeachersLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Heading.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel_Heading.setText("Welcome "+ userName);

        jLabel1.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel1.setText("Please provide the below details to create a new day care system ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel_Heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Day Care Name");

        jTextField_dayCareName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_dayCareNameFocusLost(evt);
            }
        });
        jTextField_dayCareName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dayCareNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Add Students");

        jButton_addStudents.setText("Choose a CSV file");
        jButton_addStudents.setAutoscrolls(true);
        jButton_addStudents.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton_addStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addStudentsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Add Teachers");

        jButton_addTeachers.setText("Choose a CSV file");
        jButton_addTeachers.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton_addTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addTeachersActionPerformed(evt);
            }
        });

        jButton_createDayCare.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton_createDayCare.setText("Create");
        jButton_createDayCare.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jButton_createDayCare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_createDayCareActionPerformed(evt);
            }
        });

        jLabel_addStudentsLabel.setText("Select a file");
        jLabel_addStudentsLabel.setEnabled(false);

        jLabel_addTeachersLabel.setText("Select a file");
        jLabel_addTeachersLabel.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_addTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_addTeachersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton_addStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel_addStudentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField_dayCareName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_addStudentsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_createDayCare, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel_addStudentsFile, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_dayCareName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton_addStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_addStudentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_addTeachersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_addTeachers)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addComponent(jButton_createDayCare, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_dayCareNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dayCareNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dayCareNameActionPerformed

    private void jButton_addStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addStudentsActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("./"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            
            if(selectedFile.getAbsolutePath().endsWith(".csv"))
            {
                List<String> csvStrings = FileUtil.readCSVFile( selectedFile.getAbsolutePath());
                for(String csvString : csvStrings)
                    studentList.add(new Student(csvString));
                jButton_addStudents.setVisible(false);
                jLabel_addStudentsLabel.setText(selectedFile.getName());
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select csv files only!!", "CSV file required ", 2);
            }
        }
    }//GEN-LAST:event_jButton_addStudentsActionPerformed

    private void jButton_addTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addTeachersActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("./"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            
            if(selectedFile.getAbsolutePath().endsWith(".csv"))
            {
                List<String> csvStrings = FileUtil.readCSVFile( selectedFile.getAbsolutePath());
                for(String csvString : csvStrings)
                    teacherList.add(new Teacher(csvString));
                jButton_addTeachers.setVisible(false);
                jLabel_addTeachersLabel.setText(selectedFile.getName());
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select csv files only!!", "CSV file required ", 2);
            }
        }
    }//GEN-LAST:event_jButton_addTeachersActionPerformed

    private void jTextField_dayCareNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_dayCareNameFocusLost
        if(jTextField_dayCareName.getText().length() > 0 ){
            jButton_createDayCare.setEnabled(true);
        }else{
            jButton_createDayCare.setEnabled(false);
        }
    }//GEN-LAST:event_jTextField_dayCareNameFocusLost

    private void jButton_createDayCareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_createDayCareActionPerformed
        String dayCareName = jTextField_dayCareName.getText();
        DayCare dayCare =  ConfigureDayCare.configure(dayCareName);
        dayCare.setCreatedBy(userName);
        dayCare.setStudentsList(studentList);
        dayCare.setTeachersList(teacherList);
        HomePage hm = new HomePage(dayCare);
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_createDayCareActionPerformed

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
            java.util.logging.Logger.getLogger(NewDayCareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDayCareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDayCareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDayCareForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDayCareForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_addStudents;
    private javax.swing.JButton jButton_addTeachers;
    private javax.swing.JButton jButton_createDayCare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Heading;
    private javax.swing.JLabel jLabel_addStudentsFile;
    private javax.swing.JLabel jLabel_addStudentsLabel;
    private javax.swing.JLabel jLabel_addTeachersLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_dayCareName;
    // End of variables declaration//GEN-END:variables
}
