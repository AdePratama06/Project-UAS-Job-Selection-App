package Pelamar;


import Admin.Interface;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ade
 */
public class FormPelamar extends javax.swing.JFrame {

    /**
     * Creates new form FormPelamar
     */
    public FormPelamar() {
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

        JP_Hiitam = new javax.swing.JPanel();
        JP_kuning = new javax.swing.JPanel();
        JB_Register = new javax.swing.JButton();
        JB_login = new javax.swing.JButton();
        JL_Pelamar = new javax.swing.JLabel();
        JB_Keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Job Applicant Selection System");
        setLocation(new java.awt.Point(600, 245));

        JP_Hiitam.setBackground(new java.awt.Color(0, 51, 51));

        JP_kuning.setBackground(new java.awt.Color(255, 255, 0));

        JB_Register.setText("Register");
        JB_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_RegisterActionPerformed(evt);
            }
        });

        JB_login.setText("Login");
        JB_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_loginActionPerformed(evt);
            }
        });

        JL_Pelamar.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        JL_Pelamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/009-group.png"))); // NOI18N
        JL_Pelamar.setText(" PELAMAR");

        javax.swing.GroupLayout JP_kuningLayout = new javax.swing.GroupLayout(JP_kuning);
        JP_kuning.setLayout(JP_kuningLayout);
        JP_kuningLayout.setHorizontalGroup(
            JP_kuningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_kuningLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(JB_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(JB_login, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(JP_kuningLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(JL_Pelamar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JP_kuningLayout.setVerticalGroup(
            JP_kuningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_kuningLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JL_Pelamar)
                .addGap(32, 32, 32)
                .addGroup(JP_kuningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_login, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        JB_Keluar.setText("Keluar");
        JB_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_HiitamLayout = new javax.swing.GroupLayout(JP_Hiitam);
        JP_Hiitam.setLayout(JP_HiitamLayout);
        JP_HiitamLayout.setHorizontalGroup(
            JP_HiitamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_kuning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_HiitamLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JB_Keluar)
                .addGap(100, 100, 100))
        );
        JP_HiitamLayout.setVerticalGroup(
            JP_HiitamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_HiitamLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(JP_kuning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JB_Keluar)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Hiitam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Hiitam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_RegisterActionPerformed
        // TODO add your handling code here:
        dispose();
        try {
            new FormRegister().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FormPelamar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_JB_RegisterActionPerformed

    private void JB_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_loginActionPerformed
        // TODO add your handling code here:
        dispose();
        Data.reg.ambil();
    }//GEN-LAST:event_JB_loginActionPerformed

    private void JB_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_KeluarActionPerformed
        // TODO add your handling code here:
         
         dispose();
         new Interface().setVisible(true);
    }//GEN-LAST:event_JB_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(FormPelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPelamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Keluar;
    private javax.swing.JButton JB_Register;
    private javax.swing.JButton JB_login;
    private javax.swing.JLabel JL_Pelamar;
    private javax.swing.JPanel JP_Hiitam;
    private javax.swing.JPanel JP_kuning;
    // End of variables declaration//GEN-END:variables
}
