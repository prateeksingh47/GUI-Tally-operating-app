/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app_package;

/**
 *
 * @author prati
 */
public class work_in_educational_mode extends javax.swing.JFrame {

    /**
     * Creates new form work_in_educational_mode
     */
    public work_in_educational_mode() {
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
        acc_info = new javax.swing.JButton();
        invnt_info = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        acc_voucher = new javax.swing.JButton();
        invnt_voucher = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        imp_data = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bal_sheet = new javax.swing.JButton();
        pro_loss_ac = new javax.swing.JButton();
        stock_summy = new javax.swing.JButton();
        ratio_analy = new javax.swing.JButton();
        display = new javax.swing.JButton();
        multi_acc_print = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Masters");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, 70, 30));

        acc_info.setText("Accounts Info.");
        acc_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_infoActionPerformed(evt);
            }
        });
        getContentPane().add(acc_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 190, -1, -1));

        invnt_info.setText("Inventory Info.");
        invnt_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invnt_infoActionPerformed(evt);
            }
        });
        getContentPane().add(invnt_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Transactions");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, -1, -1));

        acc_voucher.setText("Accounting Vouchers");
        getContentPane().add(acc_voucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 310, -1, -1));

        invnt_voucher.setText("Inventory Vouchers");
        invnt_voucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invnt_voucherActionPerformed(evt);
            }
        });
        getContentPane().add(invnt_voucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Import");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 380, -1, -1));

        imp_data.setText("Import of Data");
        imp_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imp_dataActionPerformed(evt);
            }
        });
        getContentPane().add(imp_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Reports");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 460, -1, -1));

        bal_sheet.setText("Balance Sheet");
        getContentPane().add(bal_sheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 500, -1, -1));

        pro_loss_ac.setText("Profit & Loss A/C");
        getContentPane().add(pro_loss_ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 530, -1, -1));

        stock_summy.setText("Stock Summary");
        getContentPane().add(stock_summy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 560, -1, -1));

        ratio_analy.setText("Ratio Analysis");
        getContentPane().add(ratio_analy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 590, -1, -1));

        display.setText("Display");
        getContentPane().add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 640, -1, -1));

        multi_acc_print.setText("Multi Account Printing");
        getContentPane().add(multi_acc_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 670, -1, -1));

        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });
        getContentPane().add(Quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 720, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("List Of Selected Companies");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Name Of Company");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Date Of Last Entry");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Pallavi N");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("1-April-2008");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("GateWay Of Tally");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("Current Period");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jDateChooser1.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("To");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jDateChooser2.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 130, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 153));
        jLabel13.setText("Current Date");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, 20));

        jDateChooser3.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 140, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_package/work_mode.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void invnt_voucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invnt_voucherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invnt_voucherActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_QuitActionPerformed

    private void imp_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imp_dataActionPerformed
        // TODO add your handling code here:
        new Create_company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imp_dataActionPerformed

    private void acc_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_infoActionPerformed
        // TODO add your handling code here:
        new Account_info().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_acc_infoActionPerformed

    private void invnt_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invnt_infoActionPerformed
        // TODO add your handling code here:
        new Inventory_info().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_invnt_infoActionPerformed

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
            java.util.logging.Logger.getLogger(work_in_educational_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(work_in_educational_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(work_in_educational_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(work_in_educational_mode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new work_in_educational_mode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Quit;
    private javax.swing.JButton acc_info;
    private javax.swing.JButton acc_voucher;
    private javax.swing.JButton bal_sheet;
    private javax.swing.JButton display;
    private javax.swing.JButton imp_data;
    private javax.swing.JButton invnt_info;
    private javax.swing.JButton invnt_voucher;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton multi_acc_print;
    private javax.swing.JButton pro_loss_ac;
    private javax.swing.JButton ratio_analy;
    private javax.swing.JButton stock_summy;
    // End of variables declaration//GEN-END:variables
}
