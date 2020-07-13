/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.daycare.views;
import edu.neu.csye6200.daycare.controller.DayCareController;
import java.awt.event.*;

import javax.swing.JOptionPane;

import edu.neu.csye6200.daycare.controller.DayCareController;

import java.awt.*;
/**
 *
 * @author dheer
 */
public class AddTeacher extends javax.swing.JFrame {
	private static DayCareController controller = null;

	public static DayCareController getController() {
		return controller;
	}

	public static void setController(DayCareController controller) {
		AddTeacher.controller = controller;
	}
    
 public void close(){
 
 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
 
 }
    /**
     * Creates new form AddTeacher
     */
    public AddTeacher(DayCareController controller) {
        initComponents();
        System.out.println("Add Teacher init components complete");
        setController(controller);
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
        TeacherFirstName = new javax.swing.JLabel();
        TeacherLastName = new javax.swing.JLabel();
        availibility = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        TeacherFirstNameField = new javax.swing.JTextField();
        TeacherLastNameField = new javax.swing.JTextField();
        TeacherAddressField = new javax.swing.JTextField();
        TeacherPhoneField = new javax.swing.JTextField();
        AvailibilityComboBox = new javax.swing.JComboBox<>();
        Back = new javax.swing.JButton();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.inactiveCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)), "Add Teacher", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 3, 20))); // NOI18N

        TeacherFirstName.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        TeacherFirstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TeacherFirstName.setText("First Name");
        TeacherFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        TeacherLastName.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        TeacherLastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TeacherLastName.setText("Last Name");
        TeacherLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        availibility.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        availibility.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        availibility.setText("Availibility");
        availibility.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        Address.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        Address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Address.setText("Address");
        Address.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        Phone.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        Phone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Phone.setText("Phone");
        Phone.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        TeacherFirstNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        TeacherFirstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeacherFirstNameFieldKeyPressed(evt);
            }
        });

        TeacherLastNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        TeacherLastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeacherLastNameFieldKeyPressed(evt);
            }
        });

        TeacherAddressField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        TeacherPhoneField.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        TeacherPhoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeacherPhoneFieldKeyPressed(evt);
            }
        });

        AvailibilityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        AvailibilityComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        AvailibilityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailibilityComboBoxActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        Back.setText("Back");
        Back.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Save.setFont(new java.awt.Font("Calibri", 3, 16)); // NOI18N
        Save.setText("Save");
        Save.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					SaveActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TeacherFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addComponent(TeacherLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(availibility, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TeacherAddressField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TeacherFirstNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TeacherLastNameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AvailibilityComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 204, Short.MAX_VALUE)
                            .addComponent(TeacherPhoneField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeacherFirstName)
                    .addComponent(TeacherFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeacherLastName)
                    .addComponent(TeacherLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(availibility)
                    .addComponent(AvailibilityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address)
                    .addComponent(TeacherAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Phone)
                    .addComponent(TeacherPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Save))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvailibilityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailibilityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvailibilityComboBoxActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_SaveActionPerformed
    	boolean addTeacherStatus = false;
    	boolean availibility = false;
        if (TeacherFirstNameField.getText().equals("")||TeacherLastNameField.getText().equals("")||TeacherAddressField.getText().equals("")||TeacherPhoneField.getText().equals("")) 
        {
            System.out.println("All Fields Are Compulsory");
        }// 
        else
        {
            System.out.println("First Name:"+" "+TeacherFirstNameField.getText());
            System.out.println("Last Name:"+" "+TeacherLastNameField.getText());
            System.out.println("Address:"+" "+TeacherAddressField.getText());
            System.out.println("Availibility:"+" "+AvailibilityComboBox.getSelectedItem());
            System.out.println("Phone:"+" "+TeacherPhoneField.getText());
            if (AvailibilityComboBox.getSelectedItem() == "Yes") {
            	availibility = true;
            	System.out.println("Setting availibility true");
            }
            String teacherList = TeacherFirstNameField.getText()+","+TeacherLastNameField.getText()+","+TeacherAddressField.getText()+","+
            		availibility+","+TeacherPhoneField.getText();
            addTeacherStatus = controller.getDayCareObj().enrollTeacher(controller.getTeacherFactoryObj(), teacherList);
            if (addTeacherStatus == true) {
            	//popup successfull
            	System.out.println("Add teacher successful");
            	JOptionPane.showMessageDialog(null, "Teacher Successfully Added","Success",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            	//failure pop up
            	System.out.println("Add teacher failed, try again");
            	JOptionPane.showMessageDialog(null, "Teacher Addition failed","Failed",JOptionPane.INFORMATION_MESSAGE);
            }
            TeacherFirstNameField.setText("");
            TeacherLastNameField.setText("");
            TeacherAddressField.setText("");
            TeacherPhoneField.setText("");
            
        }
        
    }//GEN-LAST:event_SaveActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
            MainPage form = new MainPage(controller);
            form.setVisible(true);   
            close();
            // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void TeacherFirstNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TeacherFirstNameFieldKeyPressed
        char c = evt.getKeyChar(); 
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            TeacherFirstNameField.setEditable(true);
        }// TODO add your handling code here:
        else
        {
            getToolkit().beep();
            TeacherFirstNameField.setEditable(false); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_TeacherFirstNameFieldKeyPressed

    private void TeacherLastNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TeacherLastNameFieldKeyPressed
        char c = evt.getKeyChar(); 
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            TeacherLastNameField.setEditable(true);
        }// TODO add your handling code here:
        else
        {
            getToolkit().beep();
            TeacherLastNameField.setEditable(false); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_TeacherLastNameFieldKeyPressed

    private void TeacherPhoneFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TeacherPhoneFieldKeyPressed
        char c = evt.getKeyChar(); 
        if(Character.isDigit(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            TeacherPhoneField.setEditable(true);
        }// TODO add your handling code here:
        else
        {
            getToolkit().beep();
            TeacherPhoneField.setEditable(false); 
        }         // TODO add your handling code here:
    }//GEN-LAST:event_TeacherPhoneFieldKeyPressed

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
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeacher(controller).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JComboBox<String> AvailibilityComboBox;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Phone;
    private javax.swing.JButton Save;
    private javax.swing.JTextField TeacherAddressField;
    private javax.swing.JLabel TeacherFirstName;
    private javax.swing.JTextField TeacherFirstNameField;
    private javax.swing.JLabel TeacherLastName;
    private javax.swing.JTextField TeacherLastNameField;
    private javax.swing.JTextField TeacherPhoneField;
    private javax.swing.JLabel availibility;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
