/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app_package;

/**
 *
 * @author prati
 */
public class Create_company extends javax.swing.JFrame {

    /**
     * Creates new form Create_company
     */
    public Create_company() {
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
        btn_select_comp = new javax.swing.JButton();
        btn_login_remote = new javax.swing.JButton();
        btn_create_company = new javax.swing.JButton();
        btn_company = new javax.swing.JButton();
        btn_restore = new javax.swing.JButton();
        btn_quit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name_of_compny = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 0, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Company Info.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, -1, -1));

        btn_select_comp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_select_comp.setForeground(new java.awt.Color(153, 0, 153));
        btn_select_comp.setText("Select Company");
        getContentPane().add(btn_select_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 220, -1, -1));

        btn_login_remote.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_login_remote.setForeground(new java.awt.Color(153, 0, 153));
        btn_login_remote.setText("Login as Remote User");
        getContentPane().add(btn_login_remote, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 280, -1, -1));

        btn_create_company.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_create_company.setForeground(new java.awt.Color(153, 0, 153));
        btn_create_company.setText("Create Company");
        btn_create_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_companyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 350, -1, -1));

        btn_company.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_company.setForeground(new java.awt.Color(153, 0, 153));
        btn_company.setText("Backup");
        getContentPane().add(btn_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, -1, -1));

        btn_restore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_restore.setForeground(new java.awt.Color(153, 0, 153));
        btn_restore.setText("Restore");
        getContentPane().add(btn_restore, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 470, -1, -1));

        btn_quit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_quit.setForeground(new java.awt.Color(153, 0, 153));
        btn_quit.setText("Quit");
        btn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Current Period");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Current Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("List of Selected Companies");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Name of Company");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Date of last Entry");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        name_of_compny.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(name_of_compny, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, -1));

        jDateChooser1.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 150, -1));

        jDateChooser2.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 140, -1));

        jDateChooser3.setForeground(new java.awt.Color(153, 0, 153));
        getContentPane().add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_package/create_company.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_create_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_companyActionPerformed
        // TODO add your handling code here:
        new company_creation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_create_companyActionPerformed

    private void btn_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_quitActionPerformed

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
            java.util.logging.Logger.getLogger(Create_company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_company;
    private javax.swing.JButton btn_create_company;
    private javax.swing.JButton btn_login_remote;
    private javax.swing.JButton btn_quit;
    private javax.swing.JButton btn_restore;
    private javax.swing.JButton btn_select_comp;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField name_of_compny;
    // End of variables declaration//GEN-END:variables
}
