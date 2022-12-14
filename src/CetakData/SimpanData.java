/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CetakData;

import DB.Koneksi;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agung
 */
public class SimpanData extends javax.swing.JFrame {
    Statement stt;
    ResultSet rss;
    DefaultTableModel model;
    String tgl;
    /**
     * Creates new form SimpanData
     */
    public SimpanData() {
        initComponents();
        tabel_makanan();
        tampil_tabel();
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
        jLabel1 = new javax.swing.JLabel();
        typeTXt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        noTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        batchTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        packingTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        netTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_simpan = new javax.swing.JTable();
        simpan_btn = new javax.swing.JButton();
        hapusTxt = new javax.swing.JButton();
        ubahTxt = new javax.swing.JButton();
        cetakMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("PENGELOLAAN DATA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 11, -1, -1));

        typeTXt.setBackground(new java.awt.Color(204, 255, 102));
        jPanel1.add(typeTXt, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 96, 165, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("TYPE              :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 99, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NO                  :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 61, -1, -1));

        noTxt.setBackground(new java.awt.Color(204, 255, 102));
        noTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTxtActionPerformed(evt);
            }
        });
        noTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noTxtKeyTyped(evt);
            }
        });
        jPanel1.add(noTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 58, 46, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("No Batch       :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 138, -1, -1));

        batchTxt.setBackground(new java.awt.Color(204, 255, 102));
        jPanel1.add(batchTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 135, 169, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Net Weight   :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 181, -1, -1));

        packingTxt.setBackground(new java.awt.Color(204, 255, 102));
        packingTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                packingTxtKeyTyped(evt);
            }
        });
        jPanel1.add(packingTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 219, 169, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Packing No   :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 227, -1, -1));

        netTxt.setBackground(new java.awt.Color(204, 255, 102));
        jPanel1.add(netTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 178, 169, -1));

        tbl_simpan.setBackground(new java.awt.Color(204, 255, 102));
        tbl_simpan.setForeground(new java.awt.Color(51, 51, 51));
        tbl_simpan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "TYPE", "No Batch", "Net Weight", "Packing No"
            }
        ));
        tbl_simpan.setGridColor(new java.awt.Color(102, 102, 102));
        tbl_simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_simpanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_simpan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 287, 589, 143));

        simpan_btn.setBackground(new java.awt.Color(255, 255, 102));
        simpan_btn.setForeground(new java.awt.Color(102, 102, 102));
        simpan_btn.setText("Simpan");
        simpan_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_btnActionPerformed(evt);
            }
        });
        jPanel1.add(simpan_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 134, -1, -1));

        hapusTxt.setBackground(new java.awt.Color(255, 255, 102));
        hapusTxt.setForeground(new java.awt.Color(102, 102, 102));
        hapusTxt.setText("Hapus");
        hapusTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapusTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusTxtActionPerformed(evt);
            }
        });
        jPanel1.add(hapusTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 134, -1, -1));

        ubahTxt.setBackground(new java.awt.Color(255, 255, 102));
        ubahTxt.setForeground(new java.awt.Color(102, 102, 102));
        ubahTxt.setText("Ubah");
        ubahTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ubahTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahTxtActionPerformed(evt);
            }
        });
        jPanel1.add(ubahTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 177, -1, -1));

        cetakMenu.setBackground(new java.awt.Color(255, 255, 102));
        cetakMenu.setForeground(new java.awt.Color(102, 102, 102));
        cetakMenu.setText("Menu Cetak");
        cetakMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cetakMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakMenuActionPerformed(evt);
            }
        });
        jPanel1.add(cetakMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 218, 186, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ic/aristek-highpolymer-pt.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ic/Button_12-128.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void simpan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_btnActionPerformed
         Connection con = Koneksi.getConnection();
        try {
         if(simpan_btn.getText().equals("Batal")){
             clear();
             simpan_btn.setText("Simpan");
         }
         else{
            if(noTxt.getText().equals("")||typeTXt.getText().equals("")||batchTxt.getText().equals("")||netTxt.getText().equals("")||packingTxt.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Mohon diisi data yang kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            }
            else{    
            stt = con.createStatement();
            String sql = "INSERT INTO informationdata VALUES('"+noTxt.getText()+"', '"+typeTXt.getText()+"', '"+batchTxt.getText()+"','"+netTxt.getText()+"','"+packingTxt.getText()+"')";   
            stt.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Berhasil Masuk");
            tabel_makanan();
            tampil_tabel();
            clear();
           }
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal");
        }
    }//GEN-LAST:event_simpan_btnActionPerformed

    private void ubahTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahTxtActionPerformed
        Connection con = Koneksi.getConnection();
        int row = tbl_simpan.getSelectedRow();
        try {
            stt = con.createStatement();
            if(row == -1){
                JOptionPane.showMessageDialog(this, "Mohon pilih tabel terlebih dahulu","Pesan",JOptionPane.WARNING_MESSAGE);
            }
            else{
                String sql = "UPDATE informationdata SET netWeight = '"+typeTXt.getText()+"'"
                        + ", type = '"+batchTxt.getText()+"', theme = '"+netTxt.getText()+"', noKemasan = '"+packingTxt.getText()+"' WHERE packingNo = '"+noTxt.getText()+"'";
                stt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil Diubah");
                tabel_makanan();
                tampil_tabel();
                clear();
                simpan_btn.setText("Simpan");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Diubah");
        }
    }//GEN-LAST:event_ubahTxtActionPerformed

    private void tbl_simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_simpanMouseClicked
        int row = tbl_simpan.getSelectedRow();
        noTxt.setText(tbl_simpan.getValueAt(row, 0).toString());
        typeTXt.setText(tbl_simpan.getValueAt(row, 1).toString());
        batchTxt.setText(tbl_simpan.getValueAt(row, 2).toString());
        netTxt.setText(tbl_simpan.getValueAt(row, 3).toString());
        packingTxt.setText(tbl_simpan.getValueAt(row, 4).toString());
        noTxt.setEnabled(false);
        simpan_btn.setText("Batal");
    }//GEN-LAST:event_tbl_simpanMouseClicked

    private void hapusTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusTxtActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah Kamu Yakin Ingin Hapus Ini ?");
        if(confirm == JOptionPane.YES_OPTION){
                 Connection con = Koneksi.getConnection();
                    int row = tbl_simpan.getSelectedRow();
                     try {
                        stt = con.createStatement();
                        if(row == -1){
                            JOptionPane.showMessageDialog(this, "Mohon pilih tabel terlebih dahulu","Pesan",JOptionPane.WARNING_MESSAGE);
                        }
                        else{
                            String sql = "DELETE FROM informationdata WHERE packingNo = '"+noTxt.getText()+"'";
                            stt.executeUpdate(sql);
                            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
                            tabel_makanan();
                            tampil_tabel();
                            clear();
                            simpan_btn.setText("Simpan");
                        }
                    } catch (Exception e) {
                    }
        }else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Ok MasBro");
        }else{
           
        }
       
    }//GEN-LAST:event_hapusTxtActionPerformed

    private void cetakMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakMenuActionPerformed
        CetakUI cu = new CetakUI();
        this.setVisible(false);
        cu.setVisible(true);
    }//GEN-LAST:event_cetakMenuActionPerformed

    private void noTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTxtActionPerformed

    }//GEN-LAST:event_noTxtActionPerformed

    private void noTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noTxtKeyTyped
      char c=evt.getKeyChar();
        if (!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Harus Angka Broh");
        }
    }//GEN-LAST:event_noTxtKeyTyped

    private void packingTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_packingTxtKeyTyped
          char c=evt.getKeyChar();
        if (!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Harus Angka Broh");
        }
    }//GEN-LAST:event_packingTxtKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
     System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked
 public void clear(){
    batchTxt.setText("");
    typeTXt.setText("");
    netTxt.setText("");
    packingTxt.setText("");
    noTxt.setText("");
    noTxt.setEnabled(true);
    }
 private void tabel_makanan(){
        model = new DefaultTableModel();
        tbl_simpan.setModel(model);
        model.addColumn("No");
        model.addColumn("TYPE");
        model.addColumn("No Batch");
        model.addColumn("Net Weight");
        model.addColumn("Packing No");
    }
    private void tampil_tabel(){
       Connection con = Koneksi.getConnection();
       try {
           stt = con.createStatement();
           String sql = "SELECT * FROM informationdata";
           rss = stt.executeQuery(sql);
           while(rss.next()){
               Object[] o;
               o = new Object[5];
               o[0] = rss.getString("packingNo");
               o[1] = rss.getString("netWeight");
               o[2] = rss.getString("type");
               o[3] = rss.getString("theme");
               o[4] = rss.getString("noKemasan");
               model.addRow(o);
           }
       } catch (Exception e) {
           e.printStackTrace();
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
            java.util.logging.Logger.getLogger(SimpanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpanData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpanData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchTxt;
    private javax.swing.JButton cetakMenu;
    private javax.swing.JButton hapusTxt;
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
    private javax.swing.JTextField netTxt;
    private javax.swing.JTextField noTxt;
    private javax.swing.JTextField packingTxt;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JTable tbl_simpan;
    private javax.swing.JTextField typeTXt;
    private javax.swing.JButton ubahTxt;
    // End of variables declaration//GEN-END:variables
}
