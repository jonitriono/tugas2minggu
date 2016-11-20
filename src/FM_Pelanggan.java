
import java.util.ArrayList;
import java.util.List;


public class FM_Pelanggan extends javax.swing.JDialog {
List<pelanggan_class> daftarpelanggan=new ArrayList<>();
    public FM_Pelanggan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        initstatic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtcari = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbcari = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbtambah = new javax.swing.JButton();
        jbsimpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbedit = new javax.swing.JButton();
        jtkode = new javax.swing.JTextField();
        jbhapus = new javax.swing.JButton();
        jtnama = new javax.swing.JTextField();
        jbtutup = new javax.swing.JButton();
        jtalamat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelpelanggan = new javax.swing.JTable();
        jttelepon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setText("Alamat");

        jbcari.setText("Cari");

        jLabel5.setText("Telepon");

        jbtambah.setText("Tambah");
        jbtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtambahActionPerformed(evt);
            }
        });

        jbsimpan.setText("Simpan");
        jbsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsimpanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PELANGGAN");

        jbedit.setText("Edit");

        jbhapus.setText("Hapus");

        jbtutup.setText("Tutup");
        jbtutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtutupActionPerformed(evt);
            }
        });

        tabelpelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelpelanggan);

        jLabel2.setText("Kode");

        jLabel6.setText("Cari Berdasarkan");

        jLabel3.setText("Nama");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtkode)
                                .addComponent(jtnama)
                                .addComponent(jtalamat)
                                .addComponent(jttelepon)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jbtambah)
                            .addGap(18, 18, 18)
                            .addComponent(jbsimpan)
                            .addGap(18, 18, 18)
                            .addComponent(jbedit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbhapus)
                            .addGap(18, 18, 18)
                            .addComponent(jbtutup))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbcari)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtambah)
                    .addComponent(jbsimpan)
                    .addComponent(jbedit)
                    .addComponent(jbhapus)
                    .addComponent(jbtutup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbcari))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtambahActionPerformed
        addstatic();
    }//GEN-LAST:event_jbtambahActionPerformed

    private void jbsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsimpanActionPerformed
        pelanggan_class pel=new pelanggan_class();
        pel.setKode(jtkode.getText());
        pel.setNama(jtnama.getText());
        pel.setAlamat(jtalamat.getText());
        pel.setTelepon(jttelepon.getText());
        daftarpelanggan.add(pel);
        initstatic();
    }//GEN-LAST:event_jbsimpanActionPerformed

    private void jbtutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtutupActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtutupActionPerformed

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
            java.util.logging.Logger.getLogger(FM_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FM_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FM_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FM_Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FM_Pelanggan dialog = new FM_Pelanggan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbcari;
    private javax.swing.JButton jbedit;
    private javax.swing.JButton jbhapus;
    private javax.swing.JButton jbsimpan;
    private javax.swing.JButton jbtambah;
    private javax.swing.JButton jbtutup;
    private javax.swing.JTextField jtalamat;
    private javax.swing.JTextField jtcari;
    private javax.swing.JTextField jtkode;
    private javax.swing.JTextField jtnama;
    private javax.swing.JTextField jttelepon;
    private javax.swing.JTable tabelpelanggan;
    // End of variables declaration//GEN-END:variables

    private void addstatic() {
         jtkode.setEnabled(true);
        jtnama.setEnabled(true);
        jtalamat.setEnabled(true);
        jttelepon.setEnabled(true);
        jtkode.requestFocus();
        //aktif simpan button
        jbsimpan.setEnabled(true);
        jbtambah.setEnabled(false);
    }

    private void initstatic() {
        jtkode.setEnabled(false);
        jtnama.setEnabled(false);
        jtalamat.setEnabled(false);
        jttelepon.setEnabled(false);
        jbsimpan.setEnabled(false);
        jbhapus.setEnabled(false);
        jbedit.setEnabled(false);
        //tampilkan data tabel
        tabelpelanggan.setModel(new Pelanggan_Table(daftarpelanggan));
        jbtambah.setEnabled(true);
        jtcari.setEnabled(true);
        jbcari.setEnabled(true);
    }
}
