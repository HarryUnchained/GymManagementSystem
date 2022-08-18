/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymmanagementsystem;

import Backend.Scaling;
import Backend.database.DataBase;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class AdminLoginGUI extends javax.swing.JFrame {

    // image paths
    ImageIcon logoImage = new ImageIcon("images\\GymLogo.png");

    public AdminLoginGUI() {
        initComponents();
        // seting logo image
        textLogo.setIcon(Scaling.scale(logoImage, textLogo));
        // showing password
        editTextPassword.setEchoChar((char) 0);
        // centering the copyright line
        textCopy.setHorizontalAlignment(SwingConstants.CENTER);
        // setting initial foucs on login button
        btnLogIn.requestFocus();
    }

    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
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
        textEye = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JToggleButton();
        textLogo = new javax.swing.JLabel();
        editTextEmail = new javax.swing.JTextField();
        editTextPassword = new javax.swing.JPasswordField();
        textCopy = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textEye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textEyeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textEyeMouseReleased(evt);
            }
        });
        jPanel1.add(textEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 30, 30));

        btnLogIn.setBackground(new java.awt.Color(255, 255, 255));
        btnLogIn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(51, 51, 51));
        btnLogIn.setText("Log in");
        btnLogIn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 130, 50));
        jPanel1.add(textLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 330, 310));

        editTextEmail.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editTextEmail.setForeground(new java.awt.Color(51, 51, 51));
        editTextEmail.setText(" Email");
        editTextEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editTextEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextEmailFocusLost(evt);
            }
        });
        editTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextEmailActionPerformed(evt);
            }
        });
        jPanel1.add(editTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 368, 31));

        editTextPassword.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editTextPassword.setForeground(new java.awt.Color(51, 51, 51));
        editTextPassword.setText(" Password");
        editTextPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editTextPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextPasswordFocusLost(evt);
            }
        });
        editTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(editTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 370, 31));

        textCopy.setForeground(new java.awt.Color(255, 255, 255));
        textCopy.setText("@Copyright 2022 All Rights reseverd");
        jPanel1.add(textCopy, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 210, -1));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginPageBack.png"))); // NOI18N
        jPanel1.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editTextEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextEmailFocusGained
        if (editTextEmail.getText().equals(" Email")) {
            editTextEmail.setText(null);
        }
    }//GEN-LAST:event_editTextEmailFocusGained

    private void editTextEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextEmailFocusLost
        if (editTextEmail.getText().isEmpty()) {
            editTextEmail.setText(" Email");
        }
    }//GEN-LAST:event_editTextEmailFocusLost

    private void editTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextEmailActionPerformed

    private void editTextPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextPasswordFocusGained
        if (editTextPassword.getText().equals(" Password")) {
            editTextPassword.setText(null);
            editTextPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_editTextPasswordFocusGained

    private void editTextPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextPasswordFocusLost
        if (editTextPassword.getText().isEmpty()) {
            editTextPassword.setText(" Password");
            editTextPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_editTextPasswordFocusLost

    private void editTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextPasswordActionPerformed

    private void textEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEyeMousePressed
        editTextPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_textEyeMousePressed

    private void textEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEyeMouseReleased
        if (!editTextPassword.getText().equals("Password"))
            editTextPassword.setEchoChar('*');
    }//GEN-LAST:event_textEyeMouseReleased

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed

        String email = editTextEmail.getText();
        String password = editTextPassword.getText();
        DataBase db = new DataBase();
        if (email.equals(" Email") || password.equals(" Password")) {
            JOptionPane.showMessageDialog(null, "Please enter your email and password!");
        } else {
            if (email.contains("@admin")&&db.adminLogin(email, password)) {
                close();
                new MainPage(db.getAdmin()).setVisible(true);
            }
            else{
                //TODO: Member Login
            }
        }


    }//GEN-LAST:event_btnLogInActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JToggleButton btnLogIn;
    private javax.swing.JTextField editTextEmail;
    private javax.swing.JPasswordField editTextPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textCopy;
    private javax.swing.JLabel textEye;
    private javax.swing.JLabel textLogo;
    // End of variables declaration//GEN-END:variables
}