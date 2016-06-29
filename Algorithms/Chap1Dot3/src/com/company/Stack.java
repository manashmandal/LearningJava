package com.company;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Manash on 6/29/2016.
 */
public class Stack <Item> implements Iterable<Item> {

    private Node first;
    private int N;

    public boolean isEmpty() {
        return first == null;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop(){
        if (!this.isEmpty()){
            Item item = first.item;
            first = first.next;
            N--;
            return item;
        } else return null;
    }

    public Item peek(){
        if (first != null) return first.item;
        else return null;
    }

    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator <Item>
    {
        private Node current = first;
        public boolean hasNext(){
            return current != null;
        }

        public void remove() {}

        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Item item;
        Node next;
    }


}
