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
public class BinarySearchTree {
    private Node root;
    
    public BinarySearchTree(int[] arr) {
        this.root = buildBST(arr, 0, arr.length - 1);
    }
    
    /**
     * Builds balanced binary search tree from sorted array
     * 
     * @param arr sorted array
     * @param start start index
     * @param end end index
     * @return tree root node
     */
    public Node buildBST(int[] arr, int start, int end) {
        
        // base case
        if (start > end) return null;
        
        // get middle element and set as root
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);
        
        // recursively construct right and left subtrees
        node.right = buildBST(arr, mid + 1, end);
        node.left = buildBST(arr, start, mid - 1);
        
        return node;
    }
    
    /**
     * finds the node with the value equal to or closest to given number
     * 
     * @param tree binary search tree 
     * @param num number to compare node values
     * @return node with value closes to the given value num or null if empty If
     * there is more than one value with equal difference, the Node with lowest 
     * value is returned
     */
    public Node findClosestNode(BinarySearchTree tree, int num) {
        
        // base case
        if (tree.root == null) return null;
        
        // variables to keep track of current min node
        Node minNode = tree.root;
        int minDiff = Math.abs(num - minNode.data);
        
        Node current = tree.root;
        while (current != null) {
            
            // if current node's value is equal to num, return it
            if (current.data == num) {
                return current;
            }
            
            // if current node's value is less than num, check if min and then
            // go right
            else if (current.data < num) {
                int diffRight = num - current.data;
                if (diffRight < minDiff) {
                    minDiff = diffRight;
                    minNode = current;
                }
                current = current.right;
            }
            
            // else check if min and then go left
            else {
                int diffLeft = current.data - num;
                if (diffLeft < minDiff) {
                    minDiff = diffLeft;
                    minNode = current;
                }
                current = current.left;
            }
        }
        return minNode;
    }
    
}
