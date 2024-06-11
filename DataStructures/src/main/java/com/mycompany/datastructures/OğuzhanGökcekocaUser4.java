/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.datastructures;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author oguzhangokcekoca
 */
public class OğuzhanGökcekocaUser4 extends javax.swing.JFrame {

    OğuzhanGökcekocaMultiLinkedList player4;

    private void giveNumbersToCard() {
        JButton[] buttons = {Button1_1, Button1_2, Button1_3, Button1_4, Button1_5,
            Button1_6, Button1_7, Button1_8, Button1_9, Button2_1, Button2_2, Button2_3, Button2_4, Button2_5,
            Button2_6, Button2_7, Button2_8, Button2_9, Button3_1, Button3_2, Button3_3, Button3_4, Button3_5,
            Button3_6, Button3_7, Button3_8, Button3_9};

        OğuzhanGökcekocaNode temp = player4.head;
        
        for (int i = 0; i < 15; i++) {
            int data = temp.data;
            if (i < 5 && data < 90) {
                int buttonIndex = (data - 1) / 10;
                buttons[buttonIndex].setText(String.valueOf(data));
                buttons[buttonIndex].setBackground(Color.YELLOW);
            } else if (i < 10 && i >= 5 && data < 90) {
                int buttonIndex = (data - 1) / 10;
                buttons[buttonIndex + 9].setText(String.valueOf(data));
                buttons[buttonIndex + 9].setBackground(Color.YELLOW);
            } else if (i < 15 && i >= 10 && data < 90) {
                int buttonIndex = (data - 1) / 10;
                buttons[buttonIndex + 18].setText(String.valueOf(data));
                buttons[buttonIndex + 18].setBackground(Color.YELLOW);
            }

            if (i == 4 || i == 9) {
                temp = temp.nextRow;
            } else {
                temp = temp.nextColumn;
            }
        }
        for (JButton button : buttons) {
            if (button.getText().equals("num1")) {
                button.setBackground(Color.RED);
                button.setText("X");
            }
        }
    }

    public OğuzhanGökcekocaUser4(int [][]card1) {
        initComponents();
        player4 = new OğuzhanGökcekocaMultiLinkedList(0,card1);
        giveNumbersToCard();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Button1_1 = new javax.swing.JButton();
        Button1_2 = new javax.swing.JButton();
        Button1_3 = new javax.swing.JButton();
        Button1_4 = new javax.swing.JButton();
        Button1_5 = new javax.swing.JButton();
        Button1_6 = new javax.swing.JButton();
        Button1_7 = new javax.swing.JButton();
        Button1_8 = new javax.swing.JButton();
        Button1_9 = new javax.swing.JButton();
        Button2_9 = new javax.swing.JButton();
        Button2_1 = new javax.swing.JButton();
        Button2_2 = new javax.swing.JButton();
        Button2_3 = new javax.swing.JButton();
        Button2_4 = new javax.swing.JButton();
        Button2_5 = new javax.swing.JButton();
        Button2_6 = new javax.swing.JButton();
        Button2_7 = new javax.swing.JButton();
        Button2_8 = new javax.swing.JButton();
        Button3_9 = new javax.swing.JButton();
        Button3_1 = new javax.swing.JButton();
        Button3_2 = new javax.swing.JButton();
        Button3_3 = new javax.swing.JButton();
        Button3_4 = new javax.swing.JButton();
        Button3_5 = new javax.swing.JButton();
        Button3_6 = new javax.swing.JButton();
        Button3_7 = new javax.swing.JButton();
        Button3_8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("User 4 Card");

        Button1_1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button1_1.setText("num1");
        Button1_1.setToolTipText("");
        Button1_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button1_2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button1_2.setText("num1");
        Button1_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button1_3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button1_3.setText("num1");
        Button1_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button1_4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button1_4.setText("num1");
        Button1_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button1_5.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button1_5.setText("num1");
        Button1_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button1_6.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button1_6.setText("num1");
        Button1_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button1_7.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button1_7.setText("num1");
        Button1_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button1_8.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button1_8.setText("num1");
        Button1_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button1_9.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button1_9.setText("num1");
        Button1_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button2_9.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button2_9.setText("num1");
        Button2_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button2_1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button2_1.setText("num1");
        Button2_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button2_2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button2_2.setText("num1");
        Button2_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button2_3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button2_3.setText("num1");
        Button2_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button2_4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button2_4.setText("num1");
        Button2_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button2_5.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button2_5.setText("num1");
        Button2_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button2_6.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button2_6.setText("num1");
        Button2_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button2_7.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button2_7.setText("num1");
        Button2_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button2_8.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button2_8.setText("num1");
        Button2_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button3_9.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button3_9.setText("num1");
        Button3_9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button3_1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button3_1.setText("num1");
        Button3_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button3_2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button3_2.setText("num1");
        Button3_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button3_3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button3_3.setText("num1");
        Button3_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button3_4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button3_4.setText("num1");
        Button3_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button3_5.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button3_5.setText("num1");
        Button3_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button3_6.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button3_6.setText("num1");
        Button3_6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button3_7.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button3_7.setText("num1");
        Button3_7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Button3_8.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        Button3_8.setText("num1");
        Button3_8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1_8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1_9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2_8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2_9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3_5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3_6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3_7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3_8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3_9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public javax.swing.JButton getButton1_1() {
        return Button1_1;
    }

    public javax.swing.JButton getButton1_2() {
        return Button1_2;
    }

    public javax.swing.JButton getButton1_3() {
        return Button1_3;
    }

    public javax.swing.JButton getButton1_4() {
        return Button1_4;
    }

    public javax.swing.JButton getButton1_5() {
        return Button1_5;
    }

    public javax.swing.JButton getButton1_6() {
        return Button1_6;
    }

    public javax.swing.JButton getButton1_7() {
        return Button1_7;
    }

    public javax.swing.JButton getButton1_8() {
        return Button1_8;
    }

    public javax.swing.JButton getButton1_9() {
        return Button1_9;
    }

    public javax.swing.JButton getButton2_1() {
        return Button2_1;
    }

    public javax.swing.JButton getButton2_2() {
        return Button2_2;
    }

    public javax.swing.JButton getButton2_3() {
        return Button2_3;
    }

    public javax.swing.JButton getButton2_4() {
        return Button2_4;
    }

    public javax.swing.JButton getButton2_5() {
        return Button2_5;
    }

    public javax.swing.JButton getButton2_6() {
        return Button2_6;
    }

    public javax.swing.JButton getButton2_7() {
        return Button2_7;
    }

    public javax.swing.JButton getButton2_8() {
        return Button2_8;
    }

    public javax.swing.JButton getButton2_9() {
        return Button2_9;
    }

    public javax.swing.JButton getButton3_1() {
        return Button3_1;
    }

    public javax.swing.JButton getButton3_2() {
        return Button3_2;
    }

    public javax.swing.JButton getButton3_3() {
        return Button3_3;
    }

    public javax.swing.JButton getButton3_4() {
        return Button3_4;
    }

    public javax.swing.JButton getButton3_5() {
        return Button3_5;
    }

    public javax.swing.JButton getButton3_6() {
        return Button3_6;
    }

    public javax.swing.JButton getButton3_7() {
        return Button3_7;
    }

    public javax.swing.JButton getButton3_8() {
        return Button3_8;
    }

    public javax.swing.JButton getButton3_9() {
        return Button3_9;
    }

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
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaUser4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaUser4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaUser4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaUser4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int[][] empty= {{}};
                new OğuzhanGökcekocaUser4(empty).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1_1;
    private javax.swing.JButton Button1_2;
    private javax.swing.JButton Button1_3;
    private javax.swing.JButton Button1_4;
    private javax.swing.JButton Button1_5;
    private javax.swing.JButton Button1_6;
    private javax.swing.JButton Button1_7;
    private javax.swing.JButton Button1_8;
    private javax.swing.JButton Button1_9;
    private javax.swing.JButton Button2_1;
    private javax.swing.JButton Button2_2;
    private javax.swing.JButton Button2_3;
    private javax.swing.JButton Button2_4;
    private javax.swing.JButton Button2_5;
    private javax.swing.JButton Button2_6;
    private javax.swing.JButton Button2_7;
    private javax.swing.JButton Button2_8;
    private javax.swing.JButton Button2_9;
    private javax.swing.JButton Button3_1;
    private javax.swing.JButton Button3_2;
    private javax.swing.JButton Button3_3;
    private javax.swing.JButton Button3_4;
    private javax.swing.JButton Button3_5;
    private javax.swing.JButton Button3_6;
    private javax.swing.JButton Button3_7;
    private javax.swing.JButton Button3_8;
    private javax.swing.JButton Button3_9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
