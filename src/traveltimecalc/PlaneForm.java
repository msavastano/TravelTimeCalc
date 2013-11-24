/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveltimecalc;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class PlaneForm extends javax.swing.JFrame {

    /**
     * Creates new form PlaneForm
     */
    Float speed;
    Plane plane;

    private final String[] engTypes = {"", "Jet", "TurboProp"};

    public PlaneForm() {
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

        txtPlaneDis = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboPlaneEngine = new javax.swing.JComboBox();
        btnPlaneSubmit = new javax.swing.JButton();
        btnPlaneCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Plane");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("Plane"); // NOI18N
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtPlaneDis.setName("Distance"); // NOI18N

        jLabel1.setText("Distance (miles)");

        jLabel2.setText("Engine");

        cboPlaneEngine.setName("Engine"); // NOI18N

        btnPlaneSubmit.setText("Submit");
        btnPlaneSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaneSubmitActionPerformed(evt);
            }
        });

        btnPlaneCancel.setText("Cancel");
        btnPlaneCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaneCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtPlaneDis)
                            .addComponent(cboPlaneEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlaneSubmit)
                        .addGap(60, 60, 60)
                        .addComponent(btnPlaneCancel)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtPlaneDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cboPlaneEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaneSubmit)
                    .addComponent(btnPlaneCancel))
                .addGap(53, 53, 53))
        );

        txtPlaneDis.getAccessibleContext().setAccessibleName("traindis");
        jLabel1.getAccessibleContext().setAccessibleName("");

        setBounds(250, 250, 274, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (String engType : engTypes) {
            cboPlaneEngine.addItem(engType);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnPlaneCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaneCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnPlaneCancelActionPerformed

    private void btnPlaneSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaneSubmitActionPerformed
        // TODO add your handling code here:
        if (Validator.StaticValidator.IsPresent(txtPlaneDis) && Validator.StaticValidator.IsCboPresent(cboPlaneEngine)
                && Validator.StaticValidator.IsFloat(txtPlaneDis)) {
            if (Float.parseFloat(txtPlaneDis.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Distance cannot be zero or negative");
            } else {
                String m = txtPlaneDis.getText();

                String v = (String) cboPlaneEngine.getSelectedItem();

                if (cboPlaneEngine.getSelectedIndex() == 1) {
                    speed = 500f;
                } else {
                    speed = 300f;
                }

                plane = new Plane("Plane", Float.parseFloat(m), speed,
                        v);

                Float time = plane.setTime(Float.parseFloat(m), speed);
                DecimalFormat df = new DecimalFormat("###.##");

                JOptionPane.showMessageDialog(null, plane.getVehicleInfo() + " will make the trip in "
                        + df.format(time) + " hours");
            }
        }
    }//GEN-LAST:event_btnPlaneSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(PlaneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaneForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlaneCancel;
    private javax.swing.JButton btnPlaneSubmit;
    private javax.swing.JComboBox cboPlaneEngine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtPlaneDis;
    // End of variables declaration//GEN-END:variables
}
