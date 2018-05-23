/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bstclosestvalue;

/**
 * 
 * @author greta
 */
public class Node {
    int data;
    Node left, right;
        
    public Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
    
    public int getData() {
        return this.data;
    }
    
    public Node getLeftNode() {
        return this.left;
    }
    
    public Node getRightNode() {
        return this.right;
    }

}
