/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package daftarmahasiswa;
import java.sql.*;
import java.text.Format;
import javax.swing.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author ADITYA
 */
public class CrudDaftar extends javax.swing.JFrame {
public String tgl_lahir;
    /**
     * Creates new form CrudDaftar
     */
    public CrudDaftar() {
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

        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tb_simpan = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tb_hapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tb_exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tb_cari = new javax.swing.JButton();
        no = new javax.swing.JTextField();
        agama = new javax.swing.JComboBox<>();
        cari = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        gender = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tempat = new javax.swing.JTextField();
        tgl = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jurusan = new javax.swing.JComboBox<>();
        tb_edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Program Studi");

        jLabel4.setText("Nama");

        jLabel5.setText("Jenis Kelamin");

        tb_simpan.setText("Simpan");
        tb_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_simpanActionPerformed(evt);
            }
        });

        jLabel6.setText("Tempat/Tgl. Lahir");

        tb_hapus.setText("Hapus");

        jLabel7.setText("Agama");

        tb_exit.setText("Exit");
        tb_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_exitActionPerformed(evt);
            }
        });

        jLabel8.setText("Email");

        tb_cari.setText("Cari");

        agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Katolik", "Hindu", "Budha" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NO DAFTAR", "PROGRAM STUDI", "NAMA", "JENIS KELAMIN", "TEMPAT/TGL LAHIR", "AGAMA", "EMAIL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CRUD MAHASISWA");

        tgl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglPropertyChange(evt);
            }
        });

        jLabel2.setText("No. Pendaftaran");

        jurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika - S1", "Sistem Informasi - S1", "Ilmu Komunikasi - S1", "Akutansi- S1", "Manajemen -S1", "Sastra Inggris - S1" }));

        tb_edit.setText("Edit");
        tb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tb_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_edit)
                        .addGap(18, 18, 18)
                        .addComponent(tb_hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tb_cari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama)
                            .addComponent(no)
                            .addComponent(email)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tempat, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(323, 323, 323))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_simpan)
                    .addComponent(tb_hapus)
                    .addComponent(tb_exit)
                    .addComponent(tb_cari)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_edit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglPropertyChange
        // TODO add your handling code here:
        if (tgl.getDate()!=null){
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            tgl_lahir=format.format (tgl.getDate());
        }try{
            String sql="insert into tbdata values('"
                    +no.getText()+"','"
                    +jurusan.getSelectedItem()+"','"
                    +nama.getText()+"','"
                    +gender.getSelectedItem()+"','"
                    +tempat.getText()+"','"
                    +tgl_lahir+"','"
                    +agama.getSelectedItem()+"','"
                    +email.getText()+"')";
                 java.sql.Connection conn=(java.sql.Connection)daftarmahasiswa.Koneksi.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tglPropertyChange

    private void tb_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_simpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql="insert into tbdata values('"
                    +no.getText()+"','"
                    +jurusan.getSelectedItem()+"','"
                    +nama.getText()+"','"
                    +gender.getSelectedItem()+"','"
                    +tempat.getText()+"','"
                    +tgl_lahir+"','"
                    +agama.getSelectedItem()+"','"
                    +email.getText()+"')";
                 java.sql.Connection conn=(java.sql.Connection)daftarmahasiswa.Koneksi.koneksiDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            tampil_data();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal disimpan");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_simpanActionPerformed

    private void tb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_editActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.Connection conn = (java.sql.Connection) daftarmahasiswa.Koneksi.koneksiDB();
            String sql = "UPDATE tbdata SET nama=?, gender=?, tempat=?, tgl=?, alamat=?, hp=? WHERE no=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
    
    // Mengatur nilai untuk parameter
            pst.setString(1, (String) jurusan.getSelectedItem());
            pst.setString(2, nama.getText());
            pst.setString(3, (String) gender.getSelectedItem());
            pst.setString(4, tempat.getText());
            pst.setString(5, tgl_lahir);
            pst.setString(6, (String) agama.getSelectedItem());
            pst.setString(7, email.getText());
            pst.setInt(8, Integer.parseInt(no.getText()));
    
    // Menjalankan perintah update
            pst.executeUpdate();
    
            JOptionPane.showMessageDialog(null, "Data berhasil di Koreksi");
            tampil_data();git i
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Proses Edit data Gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_editActionPerformed

    private void tb_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tb_exitActionPerformed
    
    
    public void tampil_data(){
        DefaultTableModel tabel=new DefaultTableModel();
        tabel.addColumn("NO PENDAFTARAN");
        tabel.addColumn("PROGRAM STUDI");
        tabel.addColumn("NAMA");
        tabel.addColumn("GENDER");
        tabel.addColumn("TEMPAT");
        tabel.addColumn("TGL LAHIR");
        tabel.addColumn("AGAMA");
        tabel.addColumn("EMAIL");
    try {
    java.sql.Connection conn = (java.sql.Connection) daftarmahasiswa. Koneksi.koneksiDB();
    String sql = "select * from tbdata";
    java.sql.PreparedStatement pst= conn.prepareStatement ( sql);
    ResultSet rs = pst.executeQuery( sql);
      while(rs.next())
        {
        tabel.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5),
            rs.getString(6),
            rs.getString(7),
            rs.getString(8)});
        }
        jTable1.setModel(tabel);
        }
    catch (Exception e){
    }
}
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
            java.util.logging.Logger.getLogger(CrudDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudDaftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudDaftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agama;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jurusan;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no;
    private javax.swing.JButton tb_cari;
    private javax.swing.JButton tb_edit;
    private javax.swing.JButton tb_exit;
    private javax.swing.JButton tb_hapus;
    private javax.swing.JButton tb_simpan;
    private javax.swing.JTextField tempat;
    private com.toedter.calendar.JDateChooser tgl;
    // End of variables declaration//GEN-END:variables
}
