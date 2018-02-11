/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formlar;

import DBBaglantilari.allConnections;
import DBBaglantilari.staticValues;
import Modeller.ModelLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rbarka
 */
public class frmlogin extends javax.swing.JFrame {

    /**
     * Creates new form frmlogin
     */
    
    Modeller.ModelLogin lg = new ModelLogin();
    allConnections baglanti = new allConnections();
    DBBaglantilari.staticValues DB = new DBBaglantilari.staticValues();
    
    public frmlogin() {
        initComponents();
        cbxveritabani.addItem("PostgreSQL");
        cbxveritabani.addItem("ORACLE"); 
        cbxveritabani.addItem("MSSQL"); 
        cbxveritabani.addItem("MySQL");
        cbxveritabani.addItem("Access");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cbxveritabani = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtsifre = new javax.swing.JPasswordField();
        txtkullaniciadi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel4.setText("Veritabanı");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 390, 60, 14);

        cbxveritabani.setForeground(new java.awt.Color(255, 255, 255));
        cbxveritabani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxveritabaniActionPerformed(evt);
            }
        });
        jPanel1.add(cbxveritabani);
        cbxveritabani.setBounds(540, 380, 170, 30);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(640, 430, 73, 40);

        txtsifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsifreActionPerformed(evt);
            }
        });
        jPanel1.add(txtsifre);
        txtsifre.setBounds(540, 340, 170, 30);

        txtkullaniciadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkullaniciadiActionPerformed(evt);
            }
        });
        jPanel1.add(txtkullaniciadi);
        txtkullaniciadi.setBounds(540, 300, 170, 30);

        jLabel3.setText("Şifre");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 350, 70, 14);

        jLabel2.setText("Kullanıcı Adı");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(470, 310, 70, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/healthcare.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxveritabaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxveritabaniActionPerformed
        switch(baglanti)
           case 1 = baglanti(1);
           case 2 = baglanti.baglan(2);
           
    }//GEN-LAST:event_cbxveritabaniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try {
            Class.forName("org.postgresql.Driver");
            try {
                Connection baglanti = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/HastaneOtomasyonu","postgres","root");
            } catch (SQLException ex) {
                Logger.getLogger(frmlogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //JOptionPane.showMessageDialog(null,"Başarılı Bir Şekilde Giriş Yaptınız.");
        frmAnaSayfa anasayfa = new frmAnaSayfa();
        anasayfa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtkullaniciadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkullaniciadiActionPerformed
        lg.setKullanici_adi(txtkullaniciadi.getText());
    }//GEN-LAST:event_txtkullaniciadiActionPerformed

    private void txtsifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsifreActionPerformed
        lg.setSifre(txtsifre.getSelectedText());
    }//GEN-LAST:event_txtsifreActionPerformed

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
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxveritabani;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtkullaniciadi;
    private javax.swing.JPasswordField txtsifre;
    // End of variables declaration//GEN-END:variables

    private int baglanti(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
