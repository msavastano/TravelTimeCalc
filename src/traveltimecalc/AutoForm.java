/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveltimecalc;

import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author michael
 */
public class AutoForm extends javax.swing.JFrame {

    /**
     * Creates new form AutoForm
     */
    private String[] trannyTypes = {"", "Manual", "Auto"};
    Auto auto;
    Float speed = 60f;

    public AutoForm() {
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
        txtAutoDis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cboAutoTrans = new javax.swing.JComboBox();
        btnAutoSubmit = new javax.swing.JButton();
        btnAutoCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automobile");
        setName("Automobile"); // NOI18N
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Distance (miles)");

        txtAutoDis.setName("Distance"); // NOI18N

        jLabel2.setText("Transmittion");

        cboAutoTrans.setName("Transmittion"); // NOI18N

        btnAutoSubmit.setText("Submit");
        btnAutoSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoSubmitActionPerformed(evt);
            }
        });

        btnAutoCancel.setText("Cancel");
        btnAutoCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboAutoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtAutoDis, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAutoSubmit)
                        .addGap(41, 41, 41)
                        .addComponent(btnAutoCancel)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtAutoDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cboAutoTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAutoSubmit)
                    .addComponent(btnAutoCancel))
                .addGap(27, 27, 27))
        );

        setBounds(250, 250, 281, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (String tranny : trannyTypes) {
            cboAutoTrans.addItem(tranny);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAutoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAutoCancelActionPerformed

    private void btnAutoSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoSubmitActionPerformed
        // TODO add your handling code here:        

        if (Validator.StaticValidator.IsPresent(txtAutoDis) && Validator.StaticValidator.IsCboPresent(cboAutoTrans)
                && Validator.StaticValidator.IsFloat(txtAutoDis)) {
            if (Float.parseFloat(txtAutoDis.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Distance cannot be zero or negative");
            } else {

                String m = txtAutoDis.getText();

                String v = (String) cboAutoTrans.getSelectedItem();

                auto = new Auto("Automobile", Float.parseFloat(m), speed, v);

                Float time = auto.setTime(Float.parseFloat(m), speed);
                DecimalFormat df = new DecimalFormat("###.##");

                JOptionPane.showMessageDialog(null, auto.getVehicleInfo() + " will make the trip in "
                        + df.format(time) + " hours");
            }
        }
    }//GEN-LAST:event_btnAutoSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(AutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoCancel;
    private javax.swing.JButton btnAutoSubmit;
    private javax.swing.JComboBox cboAutoTrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtAutoDis;
    // End of variables declaration//GEN-END:variables
}