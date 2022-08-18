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

public class ShowAllMembersForm extends javax.swing.JFrame {

    private Admin admin;
    
    public ShowAllMembersForm(Admin admin) {
        this.admin=admin;
        initComponents();
        showAllMembers();
    }

    private void showAllMembers(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Member i : new DataBase().getAllMembers()){
            stringBuilder.append(i.toString()+"\n\n\n");
        }
        textMember.setText(stringBuilder.toString());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textUsername = new javax.swing.JLabel();
        btnBack = new javax.swing.JToggleButton();
        textLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textMember = new javax.swing.JTextPane();
        textBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textUsername.setForeground(new java.awt.Color(255, 255, 255));
        textUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textUsername.setText("All Members");
        jPanel1.add(textUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 200, -1));

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 650, 120, 50));

        textLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ShowAllMembersLogo.png"))); // NOI18N
        textLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(textLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 110, 110));

        textMember.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        textMember.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textMember.setFocusable(false);
        jScrollPane1.setViewportView(textMember);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 860, 470));

        textBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MainPageBackground.png"))); // NOI18N
        textBackground.setText("  ");
        jPanel1.add(textBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

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

    
    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }
     
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        close();
        new MainPage(admin).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ShowAllMembersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAllMembersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAllMembersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAllMembersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAllMembersForm(new Admin()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textBackground;
    private javax.swing.JLabel textLogo;
    private javax.swing.JTextPane textMember;
    private javax.swing.JLabel textUsername;
    // End of variables declaration//GEN-END:variables
}
