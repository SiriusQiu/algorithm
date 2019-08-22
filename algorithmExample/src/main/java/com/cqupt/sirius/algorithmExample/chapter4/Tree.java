package com.cqupt.sirius.algorithmExample.chapter4;

public interface Tree<T extends Comparable<? super T>> {
    class Node<T>{
        T data;
        Node<T> left;
        Node<T> right;
        Node(T t){
            this(t, null, null);
        }
        Node(T t, Node<T> left, Node<T> right){
            this.data = t;
            this.left = left;
            this.right = right;
        }
    }

    void makeEmpty();
    boolean isEmpty();
    boolean contain(T t);
    T findMin();
    T findMax();
    void insert(T t);
    void remove(T t);
    void printTree();
}
