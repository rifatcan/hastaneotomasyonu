/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formlar;

/**
 *
 * @author rbarka
 */
public class frmDoktorTanimlari extends javax.swing.JFrame {

    /**
     * Creates new form frmDoktorTanimlari
     */
    public frmDoktorTanimlari() {
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

        jPanel1 = new javax.swing.JPanel();
        txttckimlik = new javax.swing.JFormattedTextField();
        txtadi = new javax.swing.JTextField();
        txtsoyadi = new javax.swing.JTextField();
        txtbrans = new javax.swing.JTextField();
        txttelefon = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadres = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btncikis = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnsil = new javax.swing.JButton();
        btnsorgula = new javax.swing.JButton();
        btnduzenle = new javax.swing.JButton();
        btnkaydet = new javax.swing.JButton();
        btnyenikaydet = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        txttckimlik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttckimlikActionPerformed(evt);
            }
        });
        jPanel1.add(txttckimlik);
        txttckimlik.setBounds(80, 50, 290, 20);
        jPanel1.add(txtadi);
        txtadi.setBounds(80, 80, 290, 20);
        jPanel1.add(txtsoyadi);
        txtsoyadi.setBounds(80, 110, 290, 20);
        jPanel1.add(txtbrans);
        txtbrans.setBounds(80, 140, 290, 20);
        jPanel1.add(txttelefon);
        txttelefon.setBounds(80, 170, 290, 20);

        jScrollPane1.setViewportView(txtadres);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 200, 290, 90);

        jLabel6.setText("Branş");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 140, 40, 14);

        jLabel7.setText("Telefon");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 170, 36, 14);
        jPanel1.add(txtid);
        txtid.setBounds(80, 20, 290, 20);

        jLabel8.setText("Adres");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 200, 40, 14);

        jLabel5.setText("Soyadı");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 110, 32, 14);

        btncikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cikis.png"))); // NOI18N
        btncikis.setText("Çıkış");
        jPanel1.add(btncikis);
        btncikis.setBounds(440, 340, 90, 33);

        jLabel4.setText("Adı");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 80, 15, 14);

        btnsil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sil.png"))); // NOI18N
        btnsil.setText("Sil");
        btnsil.setMaximumSize(new java.awt.Dimension(107, 33));
        btnsil.setMinimumSize(new java.awt.Dimension(107, 33));
        btnsil.setName(""); // NOI18N
        btnsil.setPreferredSize(new java.awt.Dimension(107, 33));
        jPanel1.add(btnsil);
        btnsil.setBounds(440, 300, 90, 33);

        btnsorgula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sorgula.png"))); // NOI18N
        btnsorgula.setText("Sorgula");
        btnsorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsorgulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnsorgula);
        btnsorgula.setBounds(230, 300, 97, 33);

        btnduzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/duzenle.png"))); // NOI18N
        btnduzenle.setText("Düzenle");
        jPanel1.add(btnduzenle);
        btnduzenle.setBounds(330, 300, 99, 33);

        btnkaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/duzenle.png"))); // NOI18N
        btnkaydet.setText("Kaydet");
        btnkaydet.setMaximumSize(new java.awt.Dimension(107, 33));
        btnkaydet.setMinimumSize(new java.awt.Dimension(107, 33));
        btnkaydet.setPreferredSize(new java.awt.Dimension(107, 33));
        jPanel1.add(btnkaydet);
        btnkaydet.setBounds(120, 300, 107, 33);

        btnyenikaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yeni_kayit.png"))); // NOI18N
        btnyenikaydet.setText("Yeni Kayıt");
        jPanel1.add(btnyenikaydet);
        btnyenikaydet.setBounds(10, 300, 107, 33);

        jLabel3.setText("TC Kimlik");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 50, 41, 14);

        jLabel2.setText("ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 70, 14);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/healthcare.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttckimlikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttckimlikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttckimlikActionPerformed

    private void btnsorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsorgulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsorgulaActionPerformed

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
            java.util.logging.Logger.getLogger(frmDoktorTanimlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDoktorTanimlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDoktorTanimlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDoktorTanimlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDoktorTanimlari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncikis;
    private javax.swing.JButton btnduzenle;
    private javax.swing.JButton btnkaydet;
    private javax.swing.JButton btnsil;
    private javax.swing.JButton btnsorgula;
    private javax.swing.JButton btnyenikaydet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtadi;
    private javax.swing.JTextPane txtadres;
    private javax.swing.JTextField txtbrans;
    private javax.swing.JFormattedTextField txtid;
    private javax.swing.JTextField txtsoyadi;
    private javax.swing.JFormattedTextField txttckimlik;
    private javax.swing.JFormattedTextField txttelefon;
    // End of variables declaration//GEN-END:variables
}
