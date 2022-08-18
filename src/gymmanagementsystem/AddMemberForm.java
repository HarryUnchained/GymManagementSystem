/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gymmanagementsystem;

import Backend.Dates;
import Backend.database.DataBase;
import Backend.managementclasses.Admin;
import Backend.managementclasses.Member;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class AddMemberForm extends javax.swing.JFrame {
    
    private Admin admin;
    private int selectedPackage = 0;

    public AddMemberForm(Admin admin) {
        this.admin=admin;
        initComponents();
        btnAddMember.requestFocus();
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

    private void setPackage(int a) {
        if (selectedPackage != 0) {
            if (selectedPackage == 1) {
                panelPlan.setBackground(Color.WHITE);
            } else if (selectedPackage == 2) {
                panelPlan1.setBackground(Color.WHITE);
            } else if (selectedPackage == 3) {
                panelPlan2.setBackground(Color.WHITE);
            }
        }
        selectedPackage = a;

        if (a == 1) {
            panelPlan.setBackground(Color.BLUE);
        } else if (a == 2) {
            panelPlan1.setBackground(Color.BLUE);
        } else if (a == 3) {
            panelPlan2.setBackground(Color.BLUE);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPlan2 = new javax.swing.JPanel();
        textPlanName2 = new javax.swing.JLabel();
        textPlanDetials2 = new javax.swing.JLabel();
        panelPlan1 = new javax.swing.JPanel();
        textPlanName1 = new javax.swing.JLabel();
        textPlanDetials1 = new javax.swing.JLabel();
        panelPlan = new javax.swing.JPanel();
        textPlanName = new javax.swing.JLabel();
        textPlanDetials = new javax.swing.JLabel();
        btnBack = new javax.swing.JToggleButton();
        btnAddMember = new javax.swing.JToggleButton();
        editTextEmail = new javax.swing.JTextField();
        editTextName = new javax.swing.JTextField();
        editTextAge = new javax.swing.JTextField();
        editTextCnic = new javax.swing.JTextField();
        editTextAddress = new javax.swing.JTextField();
        editTextPassword = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listGender = new javax.swing.JList<>();
        textAddMember = new javax.swing.JLabel();
        textBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPlan2.setBackground(new java.awt.Color(255, 255, 255));
        panelPlan2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPlan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPlan2MouseClicked(evt);
            }
        });

        textPlanName2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textPlanName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPlanName2.setText("Basic Package RS:2500");

        textPlanDetials2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textPlanDetials2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPlanDetials2.setText("Gym only");

        javax.swing.GroupLayout panelPlan2Layout = new javax.swing.GroupLayout(panelPlan2);
        panelPlan2.setLayout(panelPlan2Layout);
        panelPlan2Layout.setHorizontalGroup(
            panelPlan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlan2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(textPlanName2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlan2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(textPlanDetials2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        panelPlan2Layout.setVerticalGroup(
            panelPlan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPlanName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPlanDetials2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelPlan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 400, 90));

        panelPlan1.setBackground(new java.awt.Color(255, 255, 255));
        panelPlan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPlan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPlan1MouseClicked(evt);
            }
        });

        textPlanName1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textPlanName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPlanName1.setText("Pro Package RS:5000");

        textPlanDetials1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textPlanDetials1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPlanDetials1.setText("Gym + Diet");

        javax.swing.GroupLayout panelPlan1Layout = new javax.swing.GroupLayout(panelPlan1);
        panelPlan1.setLayout(panelPlan1Layout);
        panelPlan1Layout.setHorizontalGroup(
            panelPlan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlan1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(textPlanName1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlan1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(textPlanDetials1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        panelPlan1Layout.setVerticalGroup(
            panelPlan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPlanName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPlanDetials1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelPlan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 400, 90));

        panelPlan.setBackground(new java.awt.Color(255, 255, 255));
        panelPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPlanMouseClicked(evt);
            }
        });

        textPlanName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textPlanName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPlanName.setText("Premium Package RS:8000");

        textPlanDetials.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textPlanDetials.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPlanDetials.setText("Gym + Trainer + Diet");

        javax.swing.GroupLayout panelPlanLayout = new javax.swing.GroupLayout(panelPlan);
        panelPlan.setLayout(panelPlanLayout);
        panelPlanLayout.setHorizontalGroup(
            panelPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(textPlanName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlanLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(textPlanDetials, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        panelPlanLayout.setVerticalGroup(
            panelPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textPlanName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPlanDetials, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(panelPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 400, 90));

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 610, 120, 50));

        btnAddMember.setBackground(new java.awt.Color(255, 255, 255));
        btnAddMember.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnAddMember.setForeground(new java.awt.Color(51, 51, 51));
        btnAddMember.setText("Add Member");
        btnAddMember.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMemberActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, 120, 50));

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
        jPanel1.add(editTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 368, 31));

        editTextName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editTextName.setForeground(new java.awt.Color(51, 51, 51));
        editTextName.setText(" Name");
        editTextName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editTextName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextNameFocusLost(evt);
            }
        });
        editTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextNameActionPerformed(evt);
            }
        });
        jPanel1.add(editTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 368, 31));

        editTextAge.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editTextAge.setForeground(new java.awt.Color(51, 51, 51));
        editTextAge.setText(" Age");
        editTextAge.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editTextAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextAgeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextAgeFocusLost(evt);
            }
        });
        editTextAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextAgeActionPerformed(evt);
            }
        });
        jPanel1.add(editTextAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 368, 31));

        editTextCnic.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editTextCnic.setForeground(new java.awt.Color(51, 51, 51));
        editTextCnic.setText(" CNIC");
        editTextCnic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editTextCnic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextCnicFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextCnicFocusLost(evt);
            }
        });
        editTextCnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextCnicActionPerformed(evt);
            }
        });
        jPanel1.add(editTextCnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 368, 31));

        editTextAddress.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editTextAddress.setForeground(new java.awt.Color(51, 51, 51));
        editTextAddress.setText(" Address");
        editTextAddress.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editTextAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextAddressFocusLost(evt);
            }
        });
        editTextAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextAddressActionPerformed(evt);
            }
        });
        jPanel1.add(editTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 368, 31));

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
        jPanel1.add(editTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 368, 31));

        listGender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listGender.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Male", "Female", "Others", "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listGender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listGender.setDropMode(javax.swing.DropMode.ON);
        jScrollPane1.setViewportView(listGender);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 370, 30));

        textAddMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AddMemberLogo.png"))); // NOI18N
        textAddMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(textAddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 110, 110));

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

    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }


    private void btnAddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMemberActionPerformed
        String name = editTextName.getText();
        String age = editTextAge.getText();
        String email = editTextEmail.getText();
        String password = editTextPassword.getText();
        String address = editTextAddress.getText();
        String cnic = editTextCnic.getText();
        String gender = listGender.getSelectedValue();

        if (name.equals(" Name") || age.equals(" Age") || email.equals(" Email") || password.equals(" Password")
                || address.equals(" Address") || cnic.equals(" Cnic") || listGender.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill all the fields first!");
        } else {
            try {
                Integer.parseInt(age);

                if (selectedPackage == 0) {
                    JOptionPane.showMessageDialog(null, "Select a package first!");
                } else {
                    new DataBase().addMember(new Member(name, age, email, password, address, cnic, gender, Dates.getCurrentDate(), Dates.getExpiryDate(),""+selectedPackage));
                    close();
                    new MainPage(admin).setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please enter a correct age!");
            }
        }

    }//GEN-LAST:event_btnAddMemberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        close();
        new MainPage(admin).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void editTextEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextEmailFocusGained
        gainFocus(editTextEmail, " Email");
    }//GEN-LAST:event_editTextEmailFocusGained

    private void editTextEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextEmailFocusLost
        lostFocus(editTextEmail, " Email");
    }//GEN-LAST:event_editTextEmailFocusLost

    private void editTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextEmailActionPerformed

    private void editTextNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextNameFocusGained
        gainFocus(editTextName, " Name");
    }//GEN-LAST:event_editTextNameFocusGained

    private void editTextNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextNameFocusLost
        lostFocus(editTextName, " Name");
    }//GEN-LAST:event_editTextNameFocusLost

    private void editTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextNameActionPerformed

    }//GEN-LAST:event_editTextNameActionPerformed

    private void editTextAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextAgeFocusGained
        gainFocus(editTextAge, " Age");
    }//GEN-LAST:event_editTextAgeFocusGained

    private void editTextAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextAgeFocusLost
        lostFocus(editTextAge, " Age");
    }//GEN-LAST:event_editTextAgeFocusLost

    private void editTextAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextAgeActionPerformed

    private void editTextCnicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextCnicFocusGained
        gainFocus(editTextCnic, " CNIC");
    }//GEN-LAST:event_editTextCnicFocusGained

    private void editTextCnicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextCnicFocusLost
        lostFocus(editTextCnic, " CNIC");
    }//GEN-LAST:event_editTextCnicFocusLost

    private void editTextCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextCnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextCnicActionPerformed

    private void editTextAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextAddressFocusGained
        gainFocus(editTextAddress, " Address");
    }//GEN-LAST:event_editTextAddressFocusGained

    private void editTextAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextAddressFocusLost
        lostFocus(editTextAddress, " Address");
    }//GEN-LAST:event_editTextAddressFocusLost

    private void editTextAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextAddressActionPerformed

    private void editTextPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextPasswordFocusGained
        gainFocus(editTextPassword, " Password");
    }//GEN-LAST:event_editTextPasswordFocusGained

    private void editTextPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextPasswordFocusLost
        lostFocus(editTextPassword, " Password");
    }//GEN-LAST:event_editTextPasswordFocusLost

    private void editTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextPasswordActionPerformed

    private void panelPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPlanMouseClicked
        setPackage(1);
    }//GEN-LAST:event_panelPlanMouseClicked

    private void panelPlan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPlan1MouseClicked
        setPackage(2);
    }//GEN-LAST:event_panelPlan1MouseClicked

    private void panelPlan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPlan2MouseClicked
        setPackage(3);
    }//GEN-LAST:event_panelPlan2MouseClicked

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
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMemberForm(new Admin("Name","Email","Password")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAddMember;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JTextField editTextAddress;
    private javax.swing.JTextField editTextAge;
    private javax.swing.JTextField editTextCnic;
    private javax.swing.JTextField editTextEmail;
    private javax.swing.JTextField editTextName;
    private javax.swing.JTextField editTextPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listGender;
    private javax.swing.JPanel panelPlan;
    private javax.swing.JPanel panelPlan1;
    private javax.swing.JPanel panelPlan2;
    private javax.swing.JLabel textAddMember;
    private javax.swing.JLabel textBackground;
    private javax.swing.JLabel textPlanDetials;
    private javax.swing.JLabel textPlanDetials1;
    private javax.swing.JLabel textPlanDetials2;
    private javax.swing.JLabel textPlanName;
    private javax.swing.JLabel textPlanName1;
    private javax.swing.JLabel textPlanName2;
    // End of variables declaration//GEN-END:variables
}
