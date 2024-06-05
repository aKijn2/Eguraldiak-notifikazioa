/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.app.notifikazioak.interfazea;

import com.app.notifikazioak.Logeatu;
import com.app.notifikazioak.Navigazioa;

/**
 *
 * @author 1ag3.achralla
 */
public class logeatuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form logeatuJFrame
     */
    private Logeatu loginHandler;
    private Navigazioa navigationHandler;

    public logeatuJFrame() {
        initComponents();
        loginHandler = new Logeatu();
        navigationHandler = new Navigazioa();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logeatujPanel1 = new javax.swing.JPanel();
        tituloajPanel1 = new javax.swing.JPanel();
        erregistratujLabel1 = new javax.swing.JLabel();
        erabiltzaileajTextField1 = new javax.swing.JTextField();
        pasahitzajTextField2 = new javax.swing.JTextField();
        emailajTextField3 = new javax.swing.JTextField();
        hasiSaioajButton2 = new javax.swing.JButton();
        erregistratujButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logeatujPanel1.setBackground(new java.awt.Color(0, 0, 0));
        logeatujPanel1.setLayout(new java.awt.GridLayout(6, 0));

        tituloajPanel1.setLayout(new java.awt.GridLayout(1, 0));

        erregistratujLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        erregistratujLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erregistratujLabel1.setText("LOGEATU");
        tituloajPanel1.add(erregistratujLabel1);

        logeatujPanel1.add(tituloajPanel1);

        erabiltzaileajTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        erabiltzaileajTextField1.setText("erabiltzailea");
        logeatujPanel1.add(erabiltzaileajTextField1);

        pasahitzajTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pasahitzajTextField2.setText("pasahitza");
        pasahitzajTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasahitzajTextField2ActionPerformed(evt);
            }
        });
        logeatujPanel1.add(pasahitzajTextField2);

        emailajTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailajTextField3.setText("emaila");
        logeatujPanel1.add(emailajTextField3);

        hasiSaioajButton2.setText("HASI SAIOA");
        hasiSaioajButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasiSaioajButton2ActionPerformed(evt);
            }
        });
        logeatujPanel1.add(hasiSaioajButton2);

        erregistratujButton1.setText("ERREGISTRATU");
        erregistratujButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erregistratujButton1ActionPerformed(evt);
            }
        });
        logeatujPanel1.add(erregistratujButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logeatujPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logeatujPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pasahitzajTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasahitzajTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasahitzajTextField2ActionPerformed

    private void hasiSaioajButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_hasiSaioajButton2ActionPerformed
        String erabiltzailea = erabiltzaileajTextField1.getText();
        String pasahitza = pasahitzajTextField2.getText();
        String emaila = emailajTextField3.getText();

        if (loginHandler.authenticate(erabiltzailea, pasahitza, emaila)) {
            navigationHandler.navigateToHasiera(this);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Login failed. Please try again.");
        }
    }

    private void erregistratujButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        navigationHandler.navigateToErregistratu(this);
    }

    // GEN-LAST:event_hasiSaioajButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(logeatuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logeatuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logeatuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logeatuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logeatuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailajTextField3;
    private javax.swing.JTextField erabiltzaileajTextField1;
    private javax.swing.JButton erregistratujButton1;
    private javax.swing.JLabel erregistratujLabel1;
    private javax.swing.JButton hasiSaioajButton2;
    private javax.swing.JPanel logeatujPanel1;
    private javax.swing.JTextField pasahitzajTextField2;
    private javax.swing.JPanel tituloajPanel1;
    // End of variables declaration//GEN-END:variables
}
