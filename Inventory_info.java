/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app_package;

/**
 *
 * @author prati
 */
public class Inventory_info extends javax.swing.JFrame {

    /**
     * Creates new form Inventory_info
     */
    public Inventory_info() {
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        btn_vouchers_type = new javax.swing.JButton();
        btn_quit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btn_stock_groups = new javax.swing.JButton();
        btn_stk_items = new javax.swing.JButton();
        btn_unit = new javax.swing.JButton();
        btn_copy_alloca = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Current Peroid");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 19, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 51, 115, -1));

        jLabel3.setText("To");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 51, -1, -1));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 51, 115, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Current Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 19, -1, -1));
        getContentPane().add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 51, 118, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("List of Companies");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 141, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name of Company");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 199, -1, -1));
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 237, 126, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Date of Last Entry");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 199, -1, -1));
        getContentPane().add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 237, 120, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Inventory Info");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 190, -1, -1));

        btn_vouchers_type.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_vouchers_type.setText("Vouchers types");
        getContentPane().add(btn_vouchers_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 420, -1, -1));

        btn_quit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_quit.setText("Quit");
        btn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 540, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("Gateway of Tally");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 160, -1, -1));

        btn_stock_groups.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_stock_groups.setText("Stock Groups");
        btn_stock_groups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stock_groupsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_stock_groups, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, -1, -1));

        btn_stk_items.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_stk_items.setText("Stock items");
        getContentPane().add(btn_stk_items, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, -1, -1));

        btn_unit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_unit.setText("Unit of Measures");
        getContentPane().add(btn_unit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 370, -1, -1));

        btn_copy_alloca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_copy_alloca.setText("Copy Allocation Details");
        getContentPane().add(btn_copy_alloca, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 470, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_package/account_info.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_quitActionPerformed

    private void btn_stock_groupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stock_groupsActionPerformed
        // TODO add your handling code here:
        new stock_group().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_stock_groupsActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_copy_alloca;
    private javax.swing.JButton btn_quit;
    private javax.swing.JButton btn_stk_items;
    private javax.swing.JButton btn_stock_groups;
    private javax.swing.JButton btn_unit;
    private javax.swing.JButton btn_vouchers_type;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
