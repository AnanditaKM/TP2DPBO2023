/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TP2DPBO;

import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author anandita k
 */
public class DataDiri extends javax.swing.JFrame {

    /**
     * Creates new form DataPembeli
     */
    public DataDiri() {
        initComponents();
        
        fieldNama.setText(temp.getNama_lengkap());
        fieldEmail.setText(temp.getEmail());
        fieldNoHP.setText(temp.getAlamat());
        
        BufferedImage img;
        try{
            img = ImageIO.read(new File("src/foto_profile/" + temp.getFoto()));
            labelImage.setIcon(new ImageIcon(img.getScaledInstance(128, 144, Image.SCALE_SMOOTH)));
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }      
        
        labelProfile.setText("Selamat Datang, " + temp.getNama_lengkap());
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
        Data_transaksibuttton = new javax.swing.JButton();
        labelProfile = new javax.swing.JLabel();
        Logoutbutton = new javax.swing.JButton();
        Datapembelibutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        labelNoHP1 = new javax.swing.JLabel();
        labelNoHP2 = new javax.swing.JLabel();
        labelNoHP3 = new javax.swing.JLabel();
        labelImage = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        fieldNoHP = new javax.swing.JTextField();
        jUpdatedata = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        Data_transaksibuttton.setText("Data Transaksi");
        Data_transaksibuttton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Data_transaksibutttonActionPerformed(evt);
            }
        });

        labelProfile.setFont(new java.awt.Font("Adobe Arabic", 1, 24)); // NOI18N
        labelProfile.setText("ini Home");

        Logoutbutton.setText("Logout");
        Logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbuttonActionPerformed(evt);
            }
        });

        Datapembelibutton.setText("Data Diri");
        Datapembelibutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatapembelibuttonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        labelNoHP1.setFont(new java.awt.Font("Adobe Arabic", 1, 18)); // NOI18N
        labelNoHP1.setText("Nama:");

        labelNoHP2.setFont(new java.awt.Font("Adobe Arabic", 1, 18)); // NOI18N
        labelNoHP2.setText("Email:");

        labelNoHP3.setFont(new java.awt.Font("Adobe Arabic", 1, 18)); // NOI18N
        labelNoHP3.setText("No HP:");

        labelImage.setBackground(new java.awt.Color(0, 0, 0));
        labelImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelImage.setPreferredSize(new java.awt.Dimension(128, 144));

        fieldNama.setEditable(false);
        fieldNama.setBackground(new java.awt.Color(255, 255, 255));
        fieldNama.setText("jTextField1");

        fieldEmail.setEditable(false);
        fieldEmail.setBackground(new java.awt.Color(255, 255, 255));
        fieldEmail.setText("jTextField1");

        fieldNoHP.setEditable(false);
        fieldNoHP.setBackground(new java.awt.Color(255, 255, 255));
        fieldNoHP.setText("jTextField1");

        jUpdatedata.setText("Update");
        jUpdatedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdatedataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelNoHP2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNoHP1)
                                    .addComponent(labelNoHP3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                            .addComponent(fieldNoHP)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jUpdatedata)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNoHP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNoHP2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNoHP3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jUpdatedata)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelProfile, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Logoutbutton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Datapembelibutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Data_transaksibuttton)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logoutbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Datapembelibutton)
                    .addComponent(Data_transaksibuttton))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Data_transaksibutttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Data_transaksibutttonActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Data_transaksibutttonActionPerformed

    private void LogoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbuttonActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutbuttonActionPerformed

    private void DatapembelibuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatapembelibuttonActionPerformed
        new DataDiri().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DatapembelibuttonActionPerformed

    private void jUpdatedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdatedataActionPerformed
        // TODO add your handling code here:
        new UpdateData().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jUpdatedataActionPerformed

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
            java.util.logging.Logger.getLogger(DataDiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataDiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataDiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataDiri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataDiri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Data_transaksibuttton;
    private javax.swing.JButton Datapembelibutton;
    private javax.swing.JButton Logoutbutton;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNoHP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jUpdatedata;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelNoHP1;
    private javax.swing.JLabel labelNoHP2;
    private javax.swing.JLabel labelNoHP3;
    private javax.swing.JLabel labelProfile;
    // End of variables declaration//GEN-END:variables
}
