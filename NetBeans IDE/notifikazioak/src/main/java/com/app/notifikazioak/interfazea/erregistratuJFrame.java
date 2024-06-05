package com.app.notifikazioak.interfazea;

import com.app.notifikazioak.Erregistratu;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 1ag3.achralla
 */
public class erregistratuJFrame extends javax.swing.JFrame {

    public erregistratuJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        erregistratujPanel1 = new javax.swing.JPanel();
        tituloajPanel1 = new javax.swing.JPanel();
        erregistratujLabel1 = new javax.swing.JLabel();
        erabiltzaileajTextField1 = new javax.swing.JTextField();
        pasahitzajTextField2 = new javax.swing.JTextField();
        emailajTextField3 = new javax.swing.JTextField();
        erregistratujButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        erregistratujPanel1.setBackground(new java.awt.Color(0, 0, 0));
        erregistratujPanel1.setLayout(new java.awt.GridLayout(5, 0));

        tituloajPanel1.setLayout(new java.awt.GridLayout(1, 1));

        erregistratujLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        erregistratujLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        erregistratujLabel1.setText("ERREGISTRATU");
        tituloajPanel1.add(erregistratujLabel1);

        erregistratujPanel1.add(tituloajPanel1);

        erabiltzaileajTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        erabiltzaileajTextField1.setText("erabiltzailea");
        erregistratujPanel1.add(erabiltzaileajTextField1);

        pasahitzajTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pasahitzajTextField2.setText("pasahitza");
        erregistratujPanel1.add(pasahitzajTextField2);

        emailajTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailajTextField3.setText("emaila");
        erregistratujPanel1.add(emailajTextField3);

        erregistratujButton2.setText("GORDE");
        erregistratujButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erregistratujButton2ActionPerformed(evt);
            }
        });
        erregistratujPanel1.add(erregistratujButton2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(erregistratujPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(erregistratujPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void erregistratujButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_erregistratujButton2ActionPerformed
        String erabiltzailea = erabiltzaileajTextField1.getText();
        String pasahitza = pasahitzajTextField2.getText();
        String emaila = emailajTextField3.getText();

        try {
            Erregistratu erregistratu = new Erregistratu();
            erregistratu.gordeErabiltzailea(erabiltzailea, pasahitza, emaila);
            JOptionPane.showMessageDialog(this, "Erabiltzailea ongi gorde da.");
        } catch (SQLException ex) {
            Logger.getLogger(erregistratuJFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Errorea gertatu da erabiltzailea gordetzean.", "Errorea",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_erregistratujButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new erregistratuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailajTextField3;
    private javax.swing.JTextField erabiltzaileajTextField1;
    private javax.swing.JButton erregistratujButton2;
    private javax.swing.JLabel erregistratujLabel1;
    private javax.swing.JPanel erregistratujPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField pasahitzajTextField2;
    private javax.swing.JPanel tituloajPanel1;
    // End of variables declaration//GEN-END:variables
}
