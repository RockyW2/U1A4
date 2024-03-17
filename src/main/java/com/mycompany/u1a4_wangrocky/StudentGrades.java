/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a4_wangrocky;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rocky
 */
public class StudentGrades extends javax.swing.JFrame {

    /**
     * Creates new form StudentGrades
     */
    public StudentGrades() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        test2Label = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        StudentAverageButton = new javax.swing.JButton();
        courseAverageButton = new javax.swing.JButton();
        test1Field = new javax.swing.JTextField();
        test2Label1 = new javax.swing.JLabel();
        test2Field = new javax.swing.JTextField();
        test3Field = new javax.swing.JTextField();
        test2Label2 = new javax.swing.JLabel();
        test4Field = new javax.swing.JTextField();
        test2Label3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Grades ");

        titleLabel.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 18)); // NOI18N
        titleLabel.setText("STUDENT GRADES ");

        firstNameLabel.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        firstNameLabel.setText("First Name: ");

        lastNameLabel.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        lastNameLabel.setText("Last Name: ");

        displayArea.setEditable(false);
        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        test2Label.setText("Test 1:");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        StudentAverageButton.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        StudentAverageButton.setText("Student Average");
        StudentAverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentAverageButtonActionPerformed(evt);
            }
        });

        courseAverageButton.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        courseAverageButton.setText("Course Average");
        courseAverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseAverageButtonActionPerformed(evt);
            }
        });

        test2Label1.setText("Test 2:");

        test2Label2.setText("Test 3:");

        test2Label3.setText("Test 4:");

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane2.setViewportView(outputArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lastNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(test2Label)
                                        .addGap(9, 9, 9)
                                        .addComponent(test1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(test2Label1)
                                        .addGap(9, 9, 9)
                                        .addComponent(test2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(test2Label3)
                                        .addGap(9, 9, 9)
                                        .addComponent(test4Field, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(test2Label2)
                                        .addGap(9, 9, 9)
                                        .addComponent(test3Field, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(courseAverageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StudentAverageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(exitButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastNameField)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstNameField)
                        .addComponent(firstNameLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test2Label)
                            .addComponent(test1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test2Label1)
                            .addComponent(test2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test2Label2)
                            .addComponent(test3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(test2Label3)
                            .addComponent(test4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(StudentAverageButton)
                        .addGap(12, 12, 12)
                        .addComponent(courseAverageButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String[][] studentArr = new String[20][6];
    int numStudents = 0;
    String display = "";
    
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        double test1Double, test2Double, test3Double, test4Double;
        boolean validMark = false;
        String firstName, lastName;
        
        try{
            test1Double = Math.round(Double.parseDouble(test1Field.getText())*10.0)/10.0;
            test2Double = Math.round(Double.parseDouble(test2Field.getText())*10.0)/10.0;
            test3Double = Math.round(Double.parseDouble(test3Field.getText())*10.0)/10.0;
            test4Double = Math.round(Double.parseDouble(test4Field.getText())*10.0)/10.0;
            firstName = firstNameField.getText();
            lastName = lastNameField.getText();
            if(test1Double < 0.0 || test2Double < 0.0 || test3Double < 0.0 || test4Double < 0.0){
                outputArea.setText("Please Enter A Positive Test Mark ");
            }else{
                validMark = true;
                
                
                for (int i=0; i <= numStudents; i++){
                    if (firstName.equals(studentArr[i][0]) && lastName.equals(studentArr[i][1])){
                        validMark = false;
                        outputArea.setText("Name Already Exists Within The Class List ");
                    }
                }
                
                if (validMark == true){
                    studentArr[numStudents][0] = firstNameField.getText();
                    studentArr[numStudents][1] = lastNameField.getText();
                    studentArr[numStudents][2] = test1Double+"";
                    studentArr[numStudents][3] = test2Double+"";
                    studentArr[numStudents][4] = test3Double+"";
                    studentArr[numStudents][5] = test4Double+"";

                    display += "\n Student #"+(numStudents+1)+": ";
                    display += studentArr[numStudents][0]+" ";
                    display += studentArr[numStudents][1]+" ";
                    display += "Grade 1: "+studentArr[numStudents][2]+ ", ";
                    display += "Grade 2: "+studentArr[numStudents][3]+ ", ";
                    display += "Grade 3: "+studentArr[numStudents][4]+ ", ";
                    display += "Grade 4: "+studentArr[numStudents][5];

                    numStudents ++;

                    displayArea.setText(display);
                    outputArea.setText("");
                }
            }
            
        }
        catch(Exception e){
            outputArea.setText("Invalid Input. Please Enter The Correct Test Marks");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void StudentAverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentAverageButtonActionPerformed
        double test1Double, test2Double, test3Double, test4Double, gradeAverage;
        boolean validMark = false;
        String firstName, lastName;
        
        try{
            test1Double = Math.round(Double.parseDouble(test1Field.getText())*10.0)/10.0;
            test2Double = Math.round(Double.parseDouble(test2Field.getText())*10.0)/10.0;
            test3Double = Math.round(Double.parseDouble(test3Field.getText())*10.0)/10.0;
            test4Double = Math.round(Double.parseDouble(test4Field.getText())*10.0)/10.0;
            firstName = firstNameField.getText();
            lastName = lastNameField.getText();
            if(test1Double < 0.0 || test2Double < 0.0 || test3Double < 0.0 || test4Double < 0.0){
                outputArea.setText("Please Enter A Positive Test Mark ");
            }else{
                validMark = true;
                
                
                if (validMark == true){
                    gradeAverage = Math.round(((test1Double + test2Double + test3Double + test4Double)/4.0)*10.0)/10.0;
                    firstName = firstNameField.getText();
                    lastName = lastNameField.getText();

                    displayArea.setText(display);
                    outputArea.setText(firstName + " " + lastName + "'s Average Grade is " + gradeAverage + "%");
                }
            }
            
        }
        catch(Exception e){
            outputArea.setText("Invalid Input. Please Enter The Correct Test Marks");
        }
    }//GEN-LAST:event_StudentAverageButtonActionPerformed

    private void courseAverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseAverageButtonActionPerformed
        double classAverage=0, studentNum=0;
        for(int i=0; i < numStudents; i++){
            for(int j=2; j<6; j++){
                classAverage += Double.parseDouble(studentArr[i][j]);
                studentNum++;
            }
        }
        classAverage =Math.round((classAverage/studentNum)*10)/10.0;
        
        outputArea.setText("The Class Average Is "+classAverage+"%");
        
    }//GEN-LAST:event_courseAverageButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StudentAverageButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton courseAverageButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JTextField test1Field;
    private javax.swing.JTextField test2Field;
    private javax.swing.JLabel test2Label;
    private javax.swing.JLabel test2Label1;
    private javax.swing.JLabel test2Label2;
    private javax.swing.JLabel test2Label3;
    private javax.swing.JTextField test3Field;
    private javax.swing.JTextField test4Field;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
