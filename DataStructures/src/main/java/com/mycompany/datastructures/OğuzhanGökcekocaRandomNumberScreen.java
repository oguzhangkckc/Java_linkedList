/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.datastructures;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author oguzhangokcekoca
 */
public class OğuzhanGökcekocaRandomNumberScreen extends javax.swing.JFrame {

    int[][] card1 = null;
    
    Random random = new Random();
    OğuzhanGökcekocaNode[] randomNumberLinkedList;
    OğuzhanGökcekocaNode head;
    OğuzhanGökcekocaNode tail;
    OğuzhanGökcekocaUser1 user1 = new OğuzhanGökcekocaUser1(card1);
    OğuzhanGökcekocaUser2 user2 = new OğuzhanGökcekocaUser2(card1);
    OğuzhanGökcekocaUser3 user3 = new OğuzhanGökcekocaUser3(card1);
    OğuzhanGökcekocaUser4 user4 = new OğuzhanGökcekocaUser4(card1);
    int user1_bingo1 = 0;
    int user1_bingo2 = 0;
    int user1_bingo3 = 0;
    int user2_bingo1 = 0;
    int user2_bingo2 = 0;
    int user2_bingo3 = 0;
    int user3_bingo1 = 0;
    int user3_bingo2 = 0;
    int user3_bingo3 = 0;
    int user4_bingo1 = 0;
    int user4_bingo2 = 0;
    int user4_bingo3 = 0;
    int screenCounts = 0;

    private void checkUser1Card(int randomNum) {
        JButton[] user1Buttons = {user1.getButton1_1(), user1.getButton1_2(), user1.getButton1_3(), user1.getButton1_4(), user1.getButton1_5(), user1.getButton1_6(), user1.getButton1_7(), user1.getButton1_8(), user1.getButton1_9(),
            user1.getButton2_1(), user1.getButton2_2(), user1.getButton2_3(), user1.getButton2_4(), user1.getButton2_5(), user1.getButton2_6(), user1.getButton2_7(), user1.getButton2_8(), user1.getButton2_9(),
            user1.getButton3_1(), user1.getButton3_2(), user1.getButton3_3(), user1.getButton3_4(), user1.getButton3_5(), user1.getButton3_6(), user1.getButton3_7(), user1.getButton3_8(), user1.getButton3_9()
        };

        for (JButton button : user1Buttons) {
            if (button.getText().equals(String.valueOf(randomNum))) {
                button.setBackground(Color.GREEN);
                break;
            }
        }

        int greenButtonCount = 0;
        JButton[][] buttonRows = {
            {user1.getButton1_1(), user1.getButton1_2(), user1.getButton1_3(), user1.getButton1_4(), user1.getButton1_5(), user1.getButton1_6(), user1.getButton1_7(), user1.getButton1_8(), user1.getButton1_9()},
            {user1.getButton2_1(), user1.getButton2_2(), user1.getButton2_3(), user1.getButton2_4(), user1.getButton2_5(), user1.getButton2_6(), user1.getButton2_7(), user1.getButton2_8(), user1.getButton2_9()},
            {user1.getButton3_1(), user1.getButton3_2(), user1.getButton3_3(), user1.getButton3_4(), user1.getButton3_5(), user1.getButton3_6(), user1.getButton3_7(), user1.getButton3_8(), user1.getButton3_9()}
        };

        for (JButton[] row : buttonRows) {
            int rowGreenButtonCount = 0;
            for (JButton button : row) {
                if (button.getBackground() == Color.GREEN) {
                    rowGreenButtonCount++;
                }
            }
            if (rowGreenButtonCount == 5) {
                greenButtonCount += rowGreenButtonCount;
            }
        }

        if (greenButtonCount == 5 && user1_bingo1 == 0) {
            user1_bingo1 = 1;
            System.out.println("User1, 1. Çinko");
        }
        if (greenButtonCount == 10 && user1_bingo2 == 0) {
            user1_bingo2 = 1;
            System.out.println("User1, 2. Çinko");
        }
        if (greenButtonCount == 15 && user1_bingo3 == 0) {
            user1_bingo3 = 1;
            System.out.println("User1, Tombala");
        }
    }

    private void checkUser2Card(int randomNum) {
        JButton[] user2Buttons = {user2.getButton1_1(), user2.getButton1_2(), user2.getButton1_3(), user2.getButton1_4(), user2.getButton1_5(), user2.getButton1_6(), user2.getButton1_7(), user2.getButton1_8(), user2.getButton1_9(),
            user2.getButton2_1(), user2.getButton2_2(), user2.getButton2_3(), user2.getButton2_4(), user2.getButton2_5(), user2.getButton2_6(), user2.getButton2_7(), user2.getButton2_8(), user2.getButton2_9(),
            user2.getButton3_1(), user2.getButton3_2(), user2.getButton3_3(), user2.getButton3_4(), user2.getButton3_5(), user2.getButton3_6(), user2.getButton3_7(), user2.getButton3_8(), user2.getButton3_9()
        };

        for (JButton button : user2Buttons) {
            if (button.getText().equals(String.valueOf(randomNum))) {
                button.setBackground(Color.GREEN);
                break;
            }
        }
        int greenButtonCount = 0;
        JButton[][] buttonRows = {
            {user2.getButton1_1(), user2.getButton1_2(), user2.getButton1_3(), user2.getButton1_4(), user2.getButton1_5(), user2.getButton1_6(), user2.getButton1_7(), user2.getButton1_8(), user2.getButton1_9()},
            {user2.getButton2_1(), user2.getButton2_2(), user2.getButton2_3(), user2.getButton2_4(), user2.getButton2_5(), user2.getButton2_6(), user2.getButton2_7(), user2.getButton2_8(), user2.getButton2_9()},
            {user2.getButton3_1(), user2.getButton3_2(), user2.getButton3_3(), user2.getButton3_4(), user2.getButton3_5(), user2.getButton3_6(), user2.getButton3_7(), user2.getButton3_8(), user2.getButton3_9()}
        };

        for (JButton[] row : buttonRows) {
            int rowGreenButtonCount = 0;
            for (JButton button : row) {
                if (button.getBackground() == Color.GREEN) {
                    rowGreenButtonCount++;
                }
            }
            if (rowGreenButtonCount == 5) {
                greenButtonCount += rowGreenButtonCount;
            }
        }

        if (greenButtonCount == 5 && user2_bingo1 == 0) {
            user2_bingo1 = 1;
            System.out.println("User2, 1. Çinko");
        }
        if (greenButtonCount == 10 && user2_bingo2 == 0) {
            user2_bingo2 = 1;
            System.out.println("User2, 2. Çinko");
        }
        if (greenButtonCount == 15 && user2_bingo3 == 0) {
            user2_bingo3 = 1;
            System.out.println("User2, Tombala");
        }
    }

    private void checkUser3Card(int randomNum) {
        JButton[] user3Buttons = {user3.getButton1_1(), user3.getButton1_2(), user3.getButton1_3(), user3.getButton1_4(), user3.getButton1_5(), user3.getButton1_6(), user3.getButton1_7(), user3.getButton1_8(), user3.getButton1_9(),
            user3.getButton2_1(), user3.getButton2_2(), user3.getButton2_3(), user3.getButton2_4(), user3.getButton2_5(), user3.getButton2_6(), user3.getButton2_7(), user3.getButton2_8(), user3.getButton2_9(),
            user3.getButton3_1(), user3.getButton3_2(), user3.getButton3_3(), user3.getButton3_4(), user3.getButton3_5(), user3.getButton3_6(), user3.getButton3_7(), user3.getButton3_8(), user3.getButton3_9()
        };

        for (JButton button : user3Buttons) {
            if (button.getText().equals(String.valueOf(randomNum))) {
                button.setBackground(Color.GREEN);
                break;
            }
        }
        int greenButtonCount = 0;
        JButton[][] buttonRows = {
            {user3.getButton1_1(), user3.getButton1_2(), user3.getButton1_3(), user3.getButton1_4(), user3.getButton1_5(), user3.getButton1_6(), user3.getButton1_7(), user3.getButton1_8(), user3.getButton1_9()},
            {user3.getButton2_1(), user3.getButton2_2(), user3.getButton2_3(), user3.getButton2_4(), user3.getButton2_5(), user3.getButton2_6(), user3.getButton2_7(), user3.getButton2_8(), user3.getButton2_9()},
            {user3.getButton3_1(), user3.getButton3_2(), user3.getButton3_3(), user3.getButton3_4(), user3.getButton3_5(), user3.getButton3_6(), user3.getButton3_7(), user3.getButton3_8(), user3.getButton3_9()}
        };

        for (JButton[] row : buttonRows) {
            int rowGreenButtonCount = 0;
            for (JButton button : row) {
                if (button.getBackground() == Color.GREEN) {
                    rowGreenButtonCount++;
                }
            }
            if (rowGreenButtonCount == 5) {
                greenButtonCount += rowGreenButtonCount;
            }
        }

        if (greenButtonCount == 5 && user3_bingo1 == 0) {
            user3_bingo1 = 1;
            System.out.println("User3, 1. Çinko");
        }
        if (greenButtonCount == 10 && user3_bingo2 == 0) {
            user3_bingo2 = 1;
            System.out.println("User3, 2. Çinko");
        }
        if (greenButtonCount == 15 && user3_bingo3 == 0) {
            user3_bingo3 = 1;
            System.out.println("User3, Tombala");
        }
    }

    private void checkUser4Card(int randomNum) {
        JButton[] user4Buttons = {user4.getButton1_1(), user4.getButton1_2(), user4.getButton1_3(), user4.getButton1_4(), user4.getButton1_5(), user4.getButton1_6(), user4.getButton1_7(), user4.getButton1_8(), user4.getButton1_9(),
            user4.getButton2_1(), user4.getButton2_2(), user4.getButton2_3(), user4.getButton2_4(), user4.getButton2_5(), user4.getButton2_6(), user4.getButton2_7(), user4.getButton2_8(), user4.getButton2_9(),
            user4.getButton3_1(), user4.getButton3_2(), user4.getButton3_3(), user4.getButton3_4(), user4.getButton3_5(), user4.getButton3_6(), user4.getButton3_7(), user4.getButton3_8(), user4.getButton3_9()
        };

        for (JButton button : user4Buttons) {
            if (button.getText().equals(String.valueOf(randomNum))) {
                button.setBackground(Color.GREEN);
                break;
            }
        }
        int greenButtonCount = 0;
        JButton[][] buttonRows = {
            {user4.getButton1_1(), user4.getButton1_2(), user4.getButton1_3(), user4.getButton1_4(), user4.getButton1_5(), user4.getButton1_6(), user4.getButton1_7(), user4.getButton1_8(), user4.getButton1_9()},
            {user4.getButton2_1(), user4.getButton2_2(), user4.getButton2_3(), user4.getButton2_4(), user4.getButton2_5(), user4.getButton2_6(), user4.getButton2_7(), user4.getButton2_8(), user4.getButton2_9()},
            {user4.getButton3_1(), user4.getButton3_2(), user4.getButton3_3(), user4.getButton3_4(), user4.getButton3_5(), user4.getButton3_6(), user4.getButton3_7(), user4.getButton3_8(), user4.getButton3_9()}
        };

        for (JButton[] row : buttonRows) {
            int rowGreenButtonCount = 0;
            for (JButton button : row) {
                if (button.getBackground() == Color.GREEN) {
                    rowGreenButtonCount++;
                }
            }
            if (rowGreenButtonCount == 5) {
                greenButtonCount += rowGreenButtonCount;
            }
        }

        if (greenButtonCount == 5 && user4_bingo1 == 0) {
            user4_bingo1 = 1;
            System.out.println("User4, 1. Çinko");
        }
        if (greenButtonCount == 10 && user4_bingo2 == 0) {
            user4_bingo2 = 1;
            System.out.println("User4, 2. Çinko");
        }
        if (greenButtonCount == 15 && user4_bingo3 == 0) {
            user4_bingo3 = 1;
            System.out.println("User4, Tombala");
        }
    }

    private int randomTombalaNumber() {
        int randomNumber = 0;
        randomNumber = random.nextInt(89) + 1;

        if (randomNumberLinkedList != null) {
            boolean isInclude = false;
            for (int i = 0; i < randomNumberLinkedList.length; i++) {
                if (randomNumberLinkedList[i] != null && randomNumberLinkedList[i].data == randomNumber) {
                    isInclude = true;
                    break;
                }
            }
            if (isInclude) {
                return randomTombalaNumber();
            } else {
                for (int i = 0; i < randomNumberLinkedList.length; i++) {
                    if (randomNumberLinkedList[i] == null) {
                        randomNumberLinkedList[i] = new OğuzhanGökcekocaNode(randomNumber);
                        randomNumberLinkedList[i].data = randomNumber;
                        tail = randomNumberLinkedList[i];
                        break;
                    }
                }
            }
        } else {
            randomNumberLinkedList = new OğuzhanGökcekocaNode[90];
            randomNumberLinkedList[0] = new OğuzhanGökcekocaNode(randomNumber);
            randomNumberLinkedList[0].data = randomNumber;
            head = randomNumberLinkedList[0];
            tail = randomNumberLinkedList[0];
        }

        return randomNumber;
    }

    private void createScreen(int a) {
        screenCounts = a;
        if (a == 1) {
            user1.setVisible(true);
        }
        if (a == 2) {
            user1.setVisible(true);
            user2.setVisible(true);
        }
        if (a == 3) {
            user1.setVisible(true);
            user2.setVisible(true);
            user3.setVisible(true);
        }
        if (a == 4) {
            user1.setVisible(true);
            user2.setVisible(true);
            user3.setVisible(true);
            user4.setVisible(true);
        }
    }

    public OğuzhanGökcekocaRandomNumberScreen(int a) {
        initComponents();
        createScreen(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RandomNumberButton = new javax.swing.JButton();
        RandomNumberLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RandomNumberButton.setText("Random Number");
        RandomNumberButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RandomNumberButtonMouseClicked(evt);
            }
        });

        RandomNumberLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        RandomNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RandomNumberLabel.setText("35");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tombala Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(RandomNumberLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RandomNumberButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(RandomNumberLabel)
                .addGap(18, 18, 18)
                .addComponent(RandomNumberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RandomNumberButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandomNumberButtonMouseClicked
        int randomNum = randomTombalaNumber();
        RandomNumberLabel.setText(String.valueOf(randomNum));
        switch (screenCounts) {
            case 1:
                checkUser1Card(randomNum);
                break;
            case 2:
                checkUser1Card(randomNum);
                checkUser2Card(randomNum);
                break;
            case 3:
                checkUser1Card(randomNum);
                checkUser2Card(randomNum);
                checkUser3Card(randomNum);
                break;
            case 4:
                checkUser1Card(randomNum);
                checkUser2Card(randomNum);
                checkUser3Card(randomNum);
                checkUser4Card(randomNum);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_RandomNumberButtonMouseClicked

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
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaRandomNumberScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaRandomNumberScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaRandomNumberScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OğuzhanGökcekocaRandomNumberScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OğuzhanGökcekocaRandomNumberScreen(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RandomNumberButton;
    private javax.swing.JLabel RandomNumberLabel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
