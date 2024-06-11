/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datastructures;

import java.util.Random;

/**
 *
 * @author oguzhangokcekoca
 */
class OğuzhanGökcekocaMultiLinkedList {

    static Random random = new Random();

    OğuzhanGökcekocaNode card;
    OğuzhanGökcekocaNode head = null;
    OğuzhanGökcekocaNode tail = null;

    public OğuzhanGökcekocaMultiLinkedList(int data, int[][] card1) {
        this.card = new OğuzhanGökcekocaNode(data);
        if (card1 == null) {
            System.out.println("null array");
            int[][] randomCard = createRandomCard();
            createMultiLinkedList(randomCard);
        } else {
            createMultiLinkedList(card1);
        }
    }

    private static int[][] createRandomCard() {
        int[][] newCard = new int[3][9];
        int[] numbers = new int[90];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                newCard[i][j] = -1;
            }
            for (int j = 0; j < 5; j++) {
                int randomColumn = random.nextInt(9);
                while (newCard[i][randomColumn] != -1) {
                    randomColumn = random.nextInt(9);
                }

                int randomNum = random.nextInt(9) + 1;
                int fixedRandomNum = (randomColumn * 10) + randomNum;
                while (numbers[fixedRandomNum - 1] != 0) {
                    randomColumn = random.nextInt(9);
                    randomNum = random.nextInt(9) + 1;
                    fixedRandomNum = (randomColumn * 10) + randomNum;
                }
                numbers[fixedRandomNum - 1] = 1;
                newCard[i][randomColumn] = fixedRandomNum;
            }
        }
        return newCard;
    }

    private void createMultiLinkedList(int[][] card1) {
        int column = 0;
        int row = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                OğuzhanGökcekocaNode newNode;
                if (card1[i][j] != -1) {
                    newNode = new OğuzhanGökcekocaNode(card1[i][j]);
                    if (head == null) {
                        head = newNode;
                        tail = head;
                        column++;
                    } else {
                        if (column < 5) {
                            OğuzhanGökcekocaNode temp = head;
                            while (temp.nextColumn != null) {
                                temp = temp.nextColumn;
                            }
                            if (temp.nextColumn == null && temp.nextRow != null) {
                                temp = temp.nextRow;
                                while (temp.nextColumn != null) {
                                    temp = temp.nextColumn;
                                }
                            }
                            if (temp.nextColumn == null && temp.nextRow != null) {
                                temp = temp.nextRow;
                                while (temp.nextColumn != null) {
                                    temp = temp.nextColumn;
                                }
                            }
                            temp.nextColumn = newNode;
                            tail = temp.nextColumn;
                            column++;
                        } else if (column >= 5) {
                            OğuzhanGökcekocaNode temp = tail;
                            temp.nextRow = newNode;
                            tail = temp.nextRow;
                            column = 0;
                            column++;
                        }
                    }
                }
            }
            row++;
        }
    }

    private void print() {
        OğuzhanGökcekocaNode temp = head;

        while (temp != null) {
            if (temp.nextColumn != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.nextColumn;
            } else if (temp.nextColumn == null && temp.nextRow != null) {
                System.out.print(temp.data + " next row -> ");
                temp = temp.nextRow;
            } else if (temp.nextColumn == null && temp.nextRow == null) {
                System.out.println(temp.data);
                temp = null;
            }
        }
    }

    public static void main(String[] args) {
        int[][] card1 = {{5, -1, 22, -1, 45, -1, 60, 73, -1},
        {-1, 10, -1, 31, 47, 58, 68, -1, -1},
        {-1, 17, 26, 38, -1, -1, -1, 79, 86}};
        int[][] card2 = null;
        OğuzhanGökcekocaMultiLinkedList player1Card = new OğuzhanGökcekocaMultiLinkedList(0, card2);
        player1Card.print();
    }
}
