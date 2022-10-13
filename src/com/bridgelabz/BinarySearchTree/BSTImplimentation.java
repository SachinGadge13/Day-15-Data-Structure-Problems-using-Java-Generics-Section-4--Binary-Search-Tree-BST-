package com.bridgelabz.BinarySearchTree;

public class BSTImplimentation {
    /*
     * @Purpose : Insert & Search And Getting Size Of Elements in BST
     */
    public static void main(String[] args) {
        BST tree = new BST();
        Node root = null;
        root = tree.insert(root, 56);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);
        root = tree.insert(root, 22);
        root = tree.insert(root, 40);
        root = tree.insert(root, 60);
        root = tree.insert(root, 95);
        root = tree.insert(root, 11);
        root = tree.insert(root, 65);
        root = tree.insert(root, 3);
        root = tree.insert(root, 16);
        root = tree.insert(root, 63);
        root = tree.insert(root, 67);

        tree.printInorder(root);
        System.out.println();
        System.out.println("Number of Nodes in binary tree :" + tree.size());
        System.out.println(tree.search(root, 63));
        System.out.println(tree.search(root, 55));
    }

}