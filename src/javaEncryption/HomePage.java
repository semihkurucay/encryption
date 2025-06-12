package javaEncryption;

import javax.swing.JOptionPane;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        this.setSize(520, 186);
        
        txtFirstCharacterNum.setText(String.valueOf(encryptClass.getFirstRandomNum()));
        txtLastCharacterNum.setText(String.valueOf(encryptClass.getLastRandomNum()));
    }

    Encrypt encryptClass = new Encrypt();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtText = new javax.swing.JTextField();
        btnEncrypted = new javax.swing.JButton();
        btnDecrypted = new javax.swing.JButton();
        lblTexted = new javax.swing.JLabel();
        btnAdvanced = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtLastCharacterNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFirstCharacterNum = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Encryption App");
        setName("frmMain"); // NOI18N
        setResizable(false);

        txtText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextActionPerformed(evt);
            }
        });

        btnEncrypted.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEncrypted.setText("Şifrele");
        btnEncrypted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEncrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptedActionPerformed(evt);
            }
        });

        btnDecrypted.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDecrypted.setText("Şifre Çöz");
        btnDecrypted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDecrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptedActionPerformed(evt);
            }
        });

        lblTexted.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTexted.setText("Şifre :");

        btnAdvanced.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAdvanced.setText("Gelişmiş");
        btnAdvanced.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdvancedActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Başına Kaç Karater:");

        txtLastCharacterNum.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Sonuna Kaç Karater:");

        txtFirstCharacterNum.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSave.setText("Kaydet");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFirstCharacterNum, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(txtLastCharacterNum))
                .addGap(149, 149, 149)
                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFirstCharacterNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLastCharacterNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTexted)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnEncrypted)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDecrypted)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdvanced))
                        .addComponent(txtText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTexted)
                .addGap(12, 12, 12)
                .addComponent(txtText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecrypted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEncrypted)
                    .addComponent(btnAdvanced))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptedActionPerformed
        encryptClass.setWordCharacterArray(txtText.getText());
        
        if(encryptClass.chackWordCharcter()){
            txtText.setText(encryptClass.getEncryptedWord());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Hatalı karakter var şifrenizde","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEncryptedActionPerformed

    private void txtTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTextActionPerformed

    private void btnDecryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptedActionPerformed
        encryptClass.setWordCharacterArray(txtText.getText());
        //txtText.setText(encryptClass.decryptedWord(txtText.getText(),0)); //Test
        
        if(encryptClass.chackDecrypted()){
            txtText.setText(encryptClass.getDecryptedWord(txtText.getText()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Hatalı karakter var şifrenizde","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDecryptedActionPerformed
int category = 0;
    private void btnAdvancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdvancedActionPerformed
        // TODO add your handling code here:
        if(category != 0){
            category = 0;
            this.setSize(520, 186);
        } else {
            category = 1;
            this.setSize(520, 320);
        }
    }//GEN-LAST:event_btnAdvancedActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try{
            encryptClass.setFirstRandomNum(Integer.valueOf(txtFirstCharacterNum.getText().trim()));
        } catch(Exception e){
            encryptClass.setFirstRandomNum(0);
        }
        
        try{
            encryptClass.setLastRandomNum(Integer.valueOf(txtLastCharacterNum.getText().trim()));
        } catch(Exception e){
            encryptClass.setLastRandomNum(0);
        }
        
        txtFirstCharacterNum.setText(String.valueOf(encryptClass.getFirstRandomNum()));
        txtLastCharacterNum.setText(String.valueOf(encryptClass.getLastRandomNum()));
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdvanced;
    private javax.swing.JButton btnDecrypted;
    private javax.swing.JButton btnEncrypted;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTexted;
    private javax.swing.JTextField txtFirstCharacterNum;
    private javax.swing.JTextField txtLastCharacterNum;
    private javax.swing.JTextField txtText;
    // End of variables declaration//GEN-END:variables
}
