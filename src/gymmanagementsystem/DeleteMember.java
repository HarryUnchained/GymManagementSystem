/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymmanagementsystem;

import Backend.database.DataBase;
import Backend.managementclasses.Admin;
import Backend.managementclasses.Member;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class DeleteMember extends javax.swing.JFrame {

    DataBase db;
    private Member member;
    private Admin admin;

    public DeleteMember(Admin admin) {
        db = new DataBase();
        initComponents();
        this.admin = admin;
        textMember.setVisible(false);
        btnDelete.setVisible(false);
        btnSearch.requestFocus();
        panelReason.setVisible(false);
    }

    private void gainFocus(javax.swing.JTextField field, String name) {
        if (field.getText().equals(name)) {
            field.setText(null);
        }
    }

    private void lostFocus(javax.swing.JTextField field, String name) {
        if (field.getText().isEmpty()) {
            field.setText(name);
        }
    }

    private void search() {
        System.out.println("Searching");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelReason = new javax.swing.JPanel();
        editTextReason = new javax.swing.JTextField();
        btnDelete2 = new javax.swing.JToggleButton();
        btnDeleteBack = new javax.swing.JToggleButton();
        btnDelete = new javax.swing.JToggleButton();
        btnBack = new javax.swing.JToggleButton();
        textMessage = new javax.swing.JLabel();
        editTextEmail = new javax.swing.JTextField();
        textMember = new javax.swing.JTextPane();
        btnSearch = new javax.swing.JToggleButton();
        textLogo = new javax.swing.JLabel();
        textBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editTextReason.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editTextReason.setForeground(new java.awt.Color(51, 51, 51));
        editTextReason.setText(" Reason for deleting");
        editTextReason.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editTextReason.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextReasonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextReasonFocusLost(evt);
            }
        });
        editTextReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextReasonActionPerformed(evt);
            }
        });
        editTextReason.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editTextReasonKeyPressed(evt);
            }
        });

        btnDelete2.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnDelete2.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete2.setText("Delete");
        btnDelete2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        btnDeleteBack.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteBack.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnDeleteBack.setForeground(new java.awt.Color(51, 51, 51));
        btnDeleteBack.setText("Back");
        btnDeleteBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReasonLayout = new javax.swing.GroupLayout(panelReason);
        panelReason.setLayout(panelReasonLayout);
        panelReasonLayout.setHorizontalGroup(
            panelReasonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReasonLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(editTextReason, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReasonLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnDeleteBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        panelReasonLayout.setVerticalGroup(
            panelReasonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReasonLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(editTextReason, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(panelReasonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete2)
                    .addComponent(btnDeleteBack))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel1.add(panelReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 440, 250));

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 120, 50));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 51, 51));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 620, 120, 50));

        textMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textMessage.setForeground(new java.awt.Color(255, 255, 255));
        textMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMessage.setText(" ");
        jPanel1.add(textMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 200, -1));

        editTextEmail.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editTextEmail.setForeground(new java.awt.Color(51, 51, 51));
        editTextEmail.setText(" Search Email");
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
        editTextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editTextEmailKeyPressed(evt);
            }
        });
        jPanel1.add(editTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 368, 31));

        textMember.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textMember.setFocusable(false);
        jPanel1.add(textMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 620, 400));

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(51, 51, 51));
        btnSearch.setText("Search");
        btnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 90, 30));

        textLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DeleteMemberLogo.png"))); // NOI18N
        textLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(textLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 110, 110));

        textBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MainPageBackground.png"))); // NOI18N
        textBackground.setText("  ");
        jPanel1.add(textBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 1280, 720));

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
        gainFocus(editTextEmail, " Search Email");
    }//GEN-LAST:event_editTextEmailFocusGained

    private void editTextEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextEmailFocusLost
        lostFocus(editTextEmail, " Search Email");
    }//GEN-LAST:event_editTextEmailFocusLost

    private void editTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextEmailActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        textMessage.setText(null);
        String email = editTextEmail.getText();
        if (!email.equals(" Search Email")) {

            if (db.searchMember(email)) {
                member = db.getMember();
                textMember.setText(member.toString());
                textMember.setVisible(true);
                btnDelete.setVisible(true);
            } else {
                textMessage.setText("No record Found!");
                textMember.setVisible(false);
                btnDelete.setVisible(false);
            }
        } else {
            textMessage.setText("Pleasse enter the email first!");
            textMember.setVisible(false);
            btnDelete.setVisible(false);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }


    private void editTextEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editTextEmailKeyPressed

    }//GEN-LAST:event_editTextEmailKeyPressed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        close();
        new MainPage(admin).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        panelReason.setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void editTextReasonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextReasonFocusGained
        gainFocus(editTextReason, " Reason for deleting");
    }//GEN-LAST:event_editTextReasonFocusGained

    private void editTextReasonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextReasonFocusLost
        lostFocus(editTextReason, " Reason for deleting");
    }//GEN-LAST:event_editTextReasonFocusLost

    private void editTextReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextReasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextReasonActionPerformed

    private void editTextReasonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editTextReasonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextReasonKeyPressed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        String reason = editTextReason.getText();
        if (!reason.equals(" Reason for deleting")) {
            db.deleteMember(member, reason);
            textMember.setVisible(false);
            btnDelete.setVisible(false);
            btnSearch.requestFocus();
            panelReason.setVisible(false);
            editTextEmail.setText(null);
            JOptionPane.showMessageDialog(null,"Record Deleted!");
            btnSearch.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Enter a reason first!");
        }
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnDeleteBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBackActionPerformed
        panelReason.setVisible(false);
    }//GEN-LAST:event_btnDeleteBackActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteMember(new Admin()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnDelete;
    private javax.swing.JToggleButton btnDelete2;
    private javax.swing.JToggleButton btnDeleteBack;
    private javax.swing.JToggleButton btnSearch;
    private javax.swing.JTextField editTextEmail;
    private javax.swing.JTextField editTextReason;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelReason;
    private javax.swing.JLabel textBackground;
    private javax.swing.JLabel textLogo;
    private javax.swing.JTextPane textMember;
    private javax.swing.JLabel textMessage;
    // End of variables declaration//GEN-END:variables
}
