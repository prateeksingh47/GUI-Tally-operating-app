/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app_package;

import javax.swing.JOptionPane;

/**
 *
 * @author prati
 */
public class company_creation extends javax.swing.JFrame {

    /**
     * Creates new form company_creation
     */
    public company_creation() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmailing_name = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmb_country = new javax.swing.JComboBox<>();
        cmb_state = new javax.swing.JComboBox<>();
        txtpincode = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtphone_no = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        txtfaxno = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtwebsite = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_tallyvault_pass = new javax.swing.JPasswordField();
        txtrepeat_pass = new javax.swing.JPasswordField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmb_security_control = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btn_quit = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txt_base_currency = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cmb_suffix_symbol = new javax.swing.JComboBox<>();
        cmb_add_space = new javax.swing.JComboBox<>();
        cmb_show_amount = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txt_decimal_places = new javax.swing.JTextField();
        txt_word_represt = new javax.swing.JTextField();
        txt_decimal_place_words = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Directory");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("C:\\Tally.ERP9\\Data");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        txtname.setBackground(new java.awt.Color(102, 0, 102));
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 210, -1));

        jLabel4.setBackground(new java.awt.Color(204, 0, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Primary Mailing Details");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Mailing name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txtmailing_name.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(txtmailing_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 210, -1));

        txtaddress.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 210, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Country");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("State");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Pincode");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        cmb_country.setForeground(new java.awt.Color(153, 0, 153));
        cmb_country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Country --", "China", "Japan", "United Kingdom", "United States", "India", "Russia", "Germany" }));
        getContentPane().add(cmb_country, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 210, -1));

        cmb_state.setForeground(new java.awt.Color(153, 0, 153));
        cmb_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select State --", "Andhra Pradesh", "Chhatisgarh", "Uttar Pradesh", "Madhya Pradesh", "Maharastra", "Gujrat", "Rajasthan", "Bihar", " " }));
        cmb_state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_stateActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 210, -1));

        txtpincode.setForeground(new java.awt.Color(153, 0, 153));
        txtpincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpincodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtpincode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Contact Details");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Phone no.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Mobile no.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Fax no.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("E-mail");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Website");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        txtphone_no.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(txtphone_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 210, -1));

        txtmobile.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 210, -1));

        txtfaxno.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(txtfaxno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 210, -1));

        txtemail.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 210, -1));

        txtwebsite.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(txtwebsite, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 210, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 153));
        jLabel16.setText("Books and Financial Year Details");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Financial year begins from");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Books beginning from");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, -1, -1));

        jDateChooser1.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 50, 160, -1));

        jDateChooser2.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 80, 160, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 153));
        jLabel19.setText("Security Control");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("TallyVault password ( if any )");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Repeat password");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, -1, -1));

        jLabel22.setText("( Warning : Forgetting TallyVault password will render your data inaccessible)");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, -1, 20));

        txt_tallyvault_pass.setForeground(new java.awt.Color(153, 0, 153));
        txt_tallyvault_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tallyvault_passActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tallyvault_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 210, 160, -1));

        txtrepeat_pass.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(txtrepeat_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 240, 160, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Use security control");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 0, 153));
        jLabel24.setText("?");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 330, 20, 20));

        cmb_security_control.setForeground(new java.awt.Color(153, 0, 153));
        cmb_security_control.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        getContentPane().add(cmb_security_control, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 330, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Base currency symbol");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Formal name");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Suffix symbol to amount");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Add space between amount and symbol");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Show amount in millions");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 730, -1, -1));

        btn_quit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_quit.setForeground(new java.awt.Color(153, 0, 153));
        btn_quit.setText("Q : Quit");
        btn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 0, 153));
        jLabel25.setText("Base Currency information");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        txt_base_currency.setText("$ ");
        txt_base_currency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_base_currencyActionPerformed(evt);
            }
        });
        getContentPane().add(txt_base_currency, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 610, 150, -1));

        jLabel31.setText("INR");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 640, 150, -1));

        cmb_suffix_symbol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        cmb_suffix_symbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_suffix_symbolActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_suffix_symbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, -1, -1));

        cmb_add_space.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cmb_add_space.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_add_spaceActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_add_space, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, -1, -1));

        cmb_show_amount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        getContentPane().add(cmb_show_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 720, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Number of decimal places");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("Word representing amount after decimal");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("No. of decimal places for amount in words");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 690, -1, -1));
        getContentPane().add(txt_decimal_places, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 620, 90, -1));

        txt_word_represt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_word_represtActionPerformed(evt);
            }
        });
        getContentPane().add(txt_word_represt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 650, 90, -1));

        txt_decimal_place_words.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_decimal_place_wordsActionPerformed(evt);
            }
        });
        getContentPane().add(txt_decimal_place_words, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 680, 90, -1));

        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 750, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_package/company_creation.jpg"))); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tallyvault_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tallyvault_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tallyvault_passActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void cmb_stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_stateActionPerformed

    private void txtpincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpincodeActionPerformed

    private void btn_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(company_creation.this, "Are you sure to Quit");
            this.dispose();
    }//GEN-LAST:event_btn_quitActionPerformed

    private void txt_base_currencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_base_currencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_base_currencyActionPerformed

    private void txt_word_represtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_word_represtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_word_represtActionPerformed

    private void txt_decimal_place_wordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_decimal_place_wordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_decimal_place_wordsActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(company_creation.this, "Company Created Successfully...");
    }//GEN-LAST:event_btn_submitActionPerformed

    private void cmb_suffix_symbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_suffix_symbolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_suffix_symbolActionPerformed

    private void cmb_add_spaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_add_spaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_add_spaceActionPerformed

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
            java.util.logging.Logger.getLogger(company_creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(company_creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(company_creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(company_creation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new company_creation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_quit;
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cmb_add_space;
    private javax.swing.JComboBox<String> cmb_country;
    private javax.swing.JComboBox<String> cmb_security_control;
    private javax.swing.JComboBox<String> cmb_show_amount;
    private javax.swing.JComboBox<String> cmb_state;
    private javax.swing.JComboBox<String> cmb_suffix_symbol;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_base_currency;
    private javax.swing.JTextField txt_decimal_place_words;
    private javax.swing.JTextField txt_decimal_places;
    private javax.swing.JPasswordField txt_tallyvault_pass;
    private javax.swing.JTextField txt_word_represt;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfaxno;
    private javax.swing.JTextField txtmailing_name;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone_no;
    private javax.swing.JTextField txtpincode;
    private javax.swing.JPasswordField txtrepeat_pass;
    private javax.swing.JTextField txtwebsite;
    // End of variables declaration//GEN-END:variables
}
