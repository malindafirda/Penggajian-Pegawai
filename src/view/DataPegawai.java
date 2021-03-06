/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.KoneksiDB;
import koneksi.ManPegawai;
import model.ModelPegawai;

/**
 *
 * @author uuser
 */
public class DataPegawai extends javax.swing.JFrame {
    
DefaultTableModel tabelpegawai;

    public void loadTblPegawai() throws SQLException{
        ManPegawai mptl = new ManPegawai();
        mptl.loadDataPegawai(tabelpegawai, null);
    }
    /**
     * Creates new form DataPegawai
     */
    public DataPegawai() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        cmbJabatan.addItem("Pilih jabatan");
        
        tabelpegawai = new DefaultTableModel();
        //menambahkan TableModel ke Tabel pegawai
        jTabelPegawai.setModel(tabelpegawai);        
        tabelpegawai.addColumn("ID Pegawai");
        tabelpegawai.addColumn("Nama");
        tabelpegawai.addColumn("Jabatan");
        tabelpegawai.addColumn("Shift");
        
        loadTblPegawai();
        loadJabatan();   
    }
    public void loadJabatan() throws SQLException {
        String sql = "SELECT * FROM tbl_jabatan";    
        PreparedStatement pst = KoneksiDB.getConnect().prepareStatement(sql);
        ResultSet rs;
        rs = pst.executeQuery(sql);
        while(rs.next()){           
            cmbJabatan.addItem(rs.getString("jabatan"));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        bgDataGaji1 = new view.BgDataGaji();
        bgDataGaji2 = new view.BgDataGaji();
        bgDataGaji4 = new view.BgDataGaji();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jTambah = new javax.swing.JButton();
        jUbah = new javax.swing.JButton();
        jHapus = new javax.swing.JButton();
        jButtonSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelPegawai = new javax.swing.JTable();
        cmbShift = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNama = new javax.swing.JTextField();
        cmbJabatan = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bgDataGaji4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA PEGAWAI");
        bgDataGaji4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 300, -1));

        jLabel9.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PT MFMS BAKERY");
        bgDataGaji4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Pegawai");
        bgDataGaji4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 132, -1, -1));
        bgDataGaji4.add(jTextID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 233, -1));

        jTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/TAMBAH.png"))); // NOI18N
        jTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTambahActionPerformed(evt);
            }
        });
        bgDataGaji4.add(jTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 112, 84, 27));

        jUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/EDIT.png"))); // NOI18N
        jUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUbahActionPerformed(evt);
            }
        });
        bgDataGaji4.add(jUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 157, 84, 29));

        jHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/DELETE.png"))); // NOI18N
        jHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHapusActionPerformed(evt);
            }
        });
        bgDataGaji4.add(jHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 206, 85, 27));

        jButtonSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/SAVE.png"))); // NOI18N
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        bgDataGaji4.add(jButtonSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 251, 85, 27));

        jTabelPegawai.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabelPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelPegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelPegawai);

        bgDataGaji4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 314, -1, 117));

        cmbShift.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "D" }));
        bgDataGaji4.add(cmbShift, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 43, -1));

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jam Kerja");
        bgDataGaji4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 254, -1, -1));

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jabatan");
        bgDataGaji4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 209, -1, -1));

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        bgDataGaji4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 169, -1, -1));

        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });
        bgDataGaji4.add(jTextNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 233, -1));

        bgDataGaji4.add(cmbJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 233, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Bunga kananpng.png"))); // NOI18N
        bgDataGaji4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Bunga Kiripng.png"))); // NOI18N
        bgDataGaji4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 400, 90, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo jadii.jpg"))); // NOI18N
        bgDataGaji4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDataGaji4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDataGaji4, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTambahActionPerformed
 jTextID.setEnabled(true);
        jTextID.setText("");
        jTextID.requestFocus();

        jTextNama.setEnabled(true);
        jTextNama.setText("");

        cmbJabatan.setEnabled(true);
        cmbJabatan.setSelectedIndex(0);
        
        cmbShift.setEnabled(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_jTambahActionPerformed

    private void jUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUbahActionPerformed
int i = jTabelPegawai.getSelectedRow();
        if(i== -1){
            JOptionPane.showMessageDialog(rootPane, "Tidak ada data pegawai yang dipilih");
        }

        jTextID.setEnabled(false);
        jTextNama.setEnabled(true);
        cmbJabatan.setEnabled(true);
        cmbShift.setEnabled(true);

        String nip = (String) jTabelPegawai.getValueAt(i, 0);
        jTextID.setText(nip);

        String nama = (String) jTabelPegawai.getValueAt(i, 1);
        jTextNama.setText(nama);

        Object jabatan = (Object) jTabelPegawai.getValueAt(i, 2);
        cmbJabatan.setSelectedItem(jabatan);
        
        Object shift = (Object) jTabelPegawai.getValueAt(i, 3);
        cmbShift.setSelectedItem(shift);
        // TODO add your handling code here:
    }//GEN-LAST:event_jUbahActionPerformed

    private void jHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHapusActionPerformed
 int i = jTabelPegawai.getSelectedRow();
        if(i== -1){
            return;
        }
        String nip = (String) jTabelPegawai.getValueAt(i, 0);
        String nama = (String) jTabelPegawai.getValueAt(i, 1);
        
        ModelPegawai modp = new ModelPegawai();
        modp.setIdpegawai(nip);
        modp.setNama(nama);

        int konfirmasiHapus = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin akan menghapus data pegawai "
            + "dengan \n NIP "+nip+" yang bernama "+nama+"? ", "Hapus Pegawai", JOptionPane.YES_NO_OPTION);
        if(konfirmasiHapus == JOptionPane.YES_OPTION){
            try{
                ManPegawai manp = new ManPegawai();
                manp.hapusPegawai(modp);
                JOptionPane.showMessageDialog(rootPane, "Data berhasil dihapus", "Berhasil Menghapus Data",JOptionPane.INFORMATION_MESSAGE);
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan menghapus data","Kesalahan Menghapus Data",JOptionPane.ERROR_MESSAGE);
                Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                try {
                    loadTblPegawai();
                    
                    jTextID.setEnabled(false);
                    jTextID.setText("");

                    jTextNama.setEnabled(false);
                    jTextNama.setText("");

                    cmbJabatan.setEnabled(false);
                    cmbJabatan.setSelectedIndex(0);
                } catch (SQLException ex) {
                    Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jHapusActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
       
        //inisialisasi variabel
        String id_pegawai = jTextID.getText();
        String nama_pegawai = jTextNama.getText();
        String jabatan_pegawai = "";

        switch(cmbJabatan.getSelectedIndex()){
            case 1: jabatan_pegawai = "Manajer Pemasaran"; break;
            case 2: jabatan_pegawai = "Manajer Keuangan"; break;
            case 3: jabatan_pegawai = "Manajer HRD"; break;
            case 4: jabatan_pegawai = "Staff Pemasaran"; break;
            case 5: jabatan_pegawai = "Staff Produksi"; break;
            case 6: jabatan_pegawai = "Staff HRD"; break;
            case 7: jabatan_pegawai = "Office Boy"; break;
            case 8: jabatan_pegawai = "Office Girl"; break;
            default:jabatan_pegawai = "";break;
        }

        
        String shift_pegawai = "";
        switch(cmbShift.getSelectedIndex()){
           case 0: shift_pegawai = "1"; break;
           case 1: shift_pegawai = "2"; break;
           case 2: shift_pegawai = "3"; break;
           case 3: shift_pegawai = "D"; break; 
            
        }
        
        //logika agar semua field terisi
        if(id_pegawai.equals("") | nama_pegawai.equals("") | jabatan_pegawai.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Harap isi semua field");
        }
        else{
            //panggil model, set model sesuai dgn variabel
            ModelPegawai modp = new ModelPegawai();
            modp.setIdpegawai(id_pegawai);
            modp.setNama(nama_pegawai);
            modp.setJabatan(jabatan_pegawai);
            modp.setShift(shift_pegawai);
            
            //memulai mengkoneksikan menginputkan ke database
            try{
                ManPegawai manp = new ManPegawai();
                
                //Cek apakah pegawai tersebut ada di database
                //Jika NIP pegawai tersebut sudah ada di data, maka..
                if(manp.cekPegawai(modp) == true){
                    
                    //tampilkan peringatan bahwa data sudah data, dan mau diubah?
                    int konfirmasiUbah = JOptionPane.showConfirmDialog(rootPane, "Apakah anda yakin akan mengubah data Pegawai NIP "+modp.getIdpegawai()+" menjadi \nNama : "+modp.getNama()+" \nJabatan : "+modp.getJabatan()+ "\nYakin ubah data pegawai ? ","Ubah Data Pegawai", JOptionPane.YES_NO_OPTION);
                    //jika user klik yes
                    if(konfirmasiUbah == JOptionPane.YES_OPTION){
                        //lakukan mekanisme update informasi kedatabase 
                        try{                            
                            manp.updatePegawai(modp);
                            JOptionPane.showMessageDialog(rootPane, "Data berhasil diubah", "Data berhasil diubah",JOptionPane.INFORMATION_MESSAGE);
                        }
                        catch(SQLException ex){
                            JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan mengubah data","Kesalahan Mengubah Data",JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        finally{
                            try {
                                loadTblPegawai();

                                jTextID.setEnabled(false);
                                jTextID.setText("");

                                jTextNama.setEnabled(false);
                                jTextNama.setText("");

                                cmbJabatan.setEnabled(false);
                                cmbJabatan.setSelectedItem(0);
                                
                                cmbShift.setEnabled(false);
                                cmbShift.setSelectedItem(0);

                            } catch (SQLException ex) {
                                
                                Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
                else{
                    //jika nip belum ada di database, maka 
                    //lakukan mekanisme menambah data baru di database
                    try{
                        manp.tambahPegawai(modp);
                        JOptionPane.showMessageDialog(rootPane, "Data berhasil ditambahkan", "Berhasil Menambahkan Dambahkan",JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(SQLException ex){
                        JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan memasukan data pegawai baru","Kesalahan Menambah Data",JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
                    }finally{
                        try {
                            loadTblPegawai();

                            jTextID.setEnabled(false);
                            jTextID.setText("");

                            jTextNama.setEnabled(false);
                            jTextNama.setText("");

                            cmbJabatan.setEnabled(false);
                            cmbJabatan.setSelectedIndex(0);

                            cmbShift.setEnabled(false);
                            cmbShift.setSelectedIndex(0);

                        } catch (SQLException ex) {
                            Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                
            }catch(SQLException ex){
                Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jTabelPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelPegawaiMouseClicked
        jTextID.setEnabled(false);
        jTextNama.setEnabled(false);
        cmbJabatan.setEnabled(false);
        cmbShift.setEnabled(false);
        
        int i = jTabelPegawai.getSelectedRow();
        if(i== -1){
            return;
        }
        
        String nip = (String) tabelpegawai.getValueAt(i, 0);
        jTextID.setText(nip);

        String nama = (String) tabelpegawai.getValueAt(i, 1);
        jTextNama.setText(nama);

        Object jabatan = (Object) tabelpegawai.getValueAt(i, 2);
        cmbJabatan.setSelectedItem(jabatan);
        
        Object shift = (Object) tabelpegawai.getValueAt(i, 3);
        cmbShift.setSelectedItem(shift);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabelPegawaiMouseClicked

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaActionPerformed

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
            java.util.logging.Logger.getLogger(DataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DataPegawai().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DataPegawai.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.BgDataGaji bgDataGaji1;
    private view.BgDataGaji bgDataGaji2;
    private view.BgDataGaji bgDataGaji4;
    public static javax.swing.JComboBox cmbJabatan;
    private javax.swing.JComboBox cmbShift;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jHapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTabelPegawai;
    private javax.swing.JButton jTambah;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JButton jUbah;
    // End of variables declaration//GEN-END:variables
}
