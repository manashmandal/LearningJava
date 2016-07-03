package com.company;

/**
 * Created by Manash on 7/3/2016.
 */
public abstract class AbstractTree<E> implements Tree<E> {
    @Override
    public void inorder(){

    }

    @Override
    public void postorder(){

    }

    @Override
    public void preorder(){

    }

    public boolean isEmpty(){
        return getSize() == 0;
    }
}
