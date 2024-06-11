/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.datastructures;

/**
 *
 * @author oguzhangokcekoca
 */
public class OğuzhanGökcekocaHomeScreen extends javax.swing.JFrame {


    public OğuzhanGökcekocaHomeScreen() {
        initComponents();
    }

    int userCount = 0;

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        User1Button = new javax.swing.JButton();
        User2Button = new javax.swing.JButton();
        User3Button = new javax.swing.JButton();
        User4Button = new javax.swing.JButton();
        StartGameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("TOMBALA");

        jLabel2.setText("Determine user count :");

        User1Button.setText("1 User");
        User1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User1ButtonMouseClicked(evt);
            }
        });

        User2Button.setText("2 User");
        User2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User2ButtonMouseClicked(evt);
            }
        });

        User3Button.setText("3 User");
        User3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User3ButtonMouseClicked(evt);
            }
        });

        User4Button.setText("4 User");
        User4Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                User4ButtonMouseClicked(evt);
            }
        });

        StartGameButton.setText("Start Game");
        StartGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartGameButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StartGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(235, 235, 235)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel2)
                            .addGap(40, 40, 40)
                            .addComponent(User1Button)
                            .addGap(18, 18, 18)
                            .addComponent(User2Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(User3Button)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(User4Button))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User1Button)
                    .addComponent(User2Button)
                    .addComponent(User3Button)
                    .addComponent(User4Button)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addComponent(StartGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void User1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User1ButtonMouseClicked
        userCount = 1;
    }//GEN-LAST:event_User1ButtonMouseClicked

    private void User2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User2ButtonMouseClicked
        userCount = 2;
    }//GEN-LAST:event_User2ButtonMouseClicked

    private void User3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User3ButtonMouseClicked
        userCount = 3;
    }//GEN-LAST:event_User3ButtonMouseClicked

    private void User4ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User4ButtonMouseClicked
        userCount = 4;
    }//GEN-LAST:event_User4ButtonMouseClicked

    private void StartGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartGameButtonMouseClicked
        if (userCount > 0) {
            new OğuzhanGökcekocaRandomNumberScreen(userCount).setVisible(true);
        } else {
            System.out.println("Please select user count");
        }
    }//GEN-LAST:event_StartGameButtonMouseClicked

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
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaHomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaHomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaHomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaHomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OğuzhanGökcekocaHomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartGameButton;
    private javax.swing.JButton User1Button;
    private javax.swing.JButton User2Button;
    private javax.swing.JButton User3Button;
    private javax.swing.JButton User4Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
