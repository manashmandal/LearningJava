package com.company;

/**
 * Created by Manash on 6/28/2016.
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

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }
}
