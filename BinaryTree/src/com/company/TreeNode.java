package com.company;

/**
 * Created by Manash on 6/28/2016.
 */
public class TreeNode <E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode(E e){
        element = e;
    }
}
