package com.company;
import edu.princeton.cs.algs4.StdOut;


public class Main {

    public static void main(String[] args) {
	// write your code here
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        tree.inorder();

        StdOut.println("Hello world");
    }
}
