package com.bridgelabz.BinarySearchTree;

public class BSTImplimentation {
    /*
     * @Purpose : Insert Elements in BST
     */
    public static void main(String[] args) {
        BST tree = new BST();
        Node root = null;
        root = tree.insert(root, 56);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);

        tree.printInorder(root);
        System.out.println(root);
    }
}