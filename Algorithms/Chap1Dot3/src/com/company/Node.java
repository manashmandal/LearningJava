package com.company;

/**
 * Created by Manash on 7/1/2016.
 */
public class Node<T extends  Comparable<T> >  {
    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node(T data){
        this.data = data;
        left = new Node();
        right = new Node();
    }

    public Node(){
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public T getData(){
        return this.data;
    }

    public int compareTo(T t){
        return 0;
    }
}
