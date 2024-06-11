package com.mycompany.datastructures;

/**
 *
 * @author oguzhangokcekoca
 */
public class OğuzhanGökcekocaNode {

    int data;
    OğuzhanGökcekocaNode nextColumn;
    OğuzhanGökcekocaNode prevColumn;
    OğuzhanGökcekocaNode nextRow;
    OğuzhanGökcekocaNode prevRow;

    public OğuzhanGökcekocaNode(int data) {
        this.data = data;
        this.nextColumn = null;
        this.prevColumn = null;
        this.nextRow = null;
        this.prevRow = null;
    }
}
