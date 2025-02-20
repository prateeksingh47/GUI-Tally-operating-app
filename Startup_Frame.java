/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app_package;

/**
 *
 * @author prati
 */
public class Startup_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Startup_Frame
     */
    public Startup_Frame() {
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

        jLabel2 = new javax.swing.JLabel();
        A = new javax.swing.JButton();
        V = new javax.swing.JButton();
        I = new javax.swing.JButton();
        C = new javax.swing.JButton();
        L = new javax.swing.JButton();
        W = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(1530, 830));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Licensing Operations");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        A.setBackground(new java.awt.Color(153, 0, 153));
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setText("A : Activate Your License");
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 20));

        V.setBackground(new java.awt.Color(153, 0, 153));
        V.setForeground(new java.awt.Color(255, 255, 255));
        V.setText("V : Reactivate Your Existing License");
        getContentPane().add(V, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 220, -1));

        I.setBackground(new java.awt.Color(153, 0, 153));
        I.setForeground(new java.awt.Color(255, 255, 255));
        I.setText("I : Get a Rental License");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        getContentPane().add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        C.setBackground(new java.awt.Color(153, 0, 153));
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setText("C : Configure Existing License");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        L.setBackground(java.awt.Color.lightGray);
        L.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L.setText("L : Login as Remote Tally.Net User");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        getContentPane().add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        W.setBackground(java.awt.Color.lightGray);
        W.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        W.setText("W : Work in Educational Mode");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });
        getContentPane().add(W, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        Q.setBackground(java.awt.Color.lightGray);
        Q.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Q.setText("Q : Quit");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });
        getContentPane().add(Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("If you have a valid Tally.Net ID, you can access the data of companies which are currently connected, if you have  the reqired permission.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 860, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("The Educational Mode allows you to learn and use Tally>ERP 9 without buying a license . you can work on data on your computer with some  restrictions . For example,  ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, -1, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setText("you will not be able to enter transaction for all days in a month.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app_package/startup_img.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_QActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        // TODO add your handling code here:
        new work_in_educational_mode().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_WActionPerformed

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
            java.util.logging.Logger.getLogger(Startup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Startup_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton C;
    private javax.swing.JButton I;
    private javax.swing.JButton L;
    private javax.swing.JButton Q;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
