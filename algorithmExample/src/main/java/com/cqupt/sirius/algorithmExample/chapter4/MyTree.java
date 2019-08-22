package com.cqupt.sirius.algorithmExample.chapter4;

public class MyTree<T extends Comparable<? super T>> implements Tree<T> {

    private Node<T> root = null;

    public MyTree() {
        this(null);
    }

    public MyTree(Node<T> root) {
        this.root = root;
    }

    @Override
    public void makeEmpty() {
        root = null;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contain(T t) {
        return contain(t, root);
    }

    private boolean contain(T t, Node<T> node){
        if (node == null){
            return false;
        }
        int comparaResult = t.compareTo(node.data);
        if (comparaResult < 0){
            return contain(t, node.left);
        }else if (comparaResult > 0){
            return contain(t, node.right);
        }else {
            return true;
        }
    }

    @Override
    public T findMin() {
        return findMin(root);
    }

    private T findMin(Node<T> node){
        if (node == null)
            return null;
        if (node.left == null){
            return node.data;
        }else {
            return findMin(node.left);
        }
    }

    @Override
    public T findMax() {
        return findMax(root);
    }

    private T findMax(Node<T> node){
        if (node == null)
            return null;
        while (node.right != null){
            node = node.right;
        }
        return node.data;
    }

    @Override
    public void insert(T t) {
        root = insert(t, root);
    }

    private Node<T> insert(T t, Node<T> node){
        if (node == null){
            return new Node<>(t, null, null);
        }
        int comparaResult = t.compareTo(node.data);
        if (comparaResult < 0){
            node.left = insert(t, node.left);
        }else if (comparaResult > 0){
            node.right = insert(t, node.right);
        }else ;
        return node;
    }

    @Override
    public void remove(T t) {
        remove(t, root);
    }

    private Node<T> remove(T t, Node<T> node){
        if (node == null){
            return null;
        }
        int comparaResult = t.compareTo(node.data);
        if (comparaResult < 0){
            node.left = remove(t, node.left);
        }else if (comparaResult > 0){
            node.right = remove(t, node.right);
        }else if (node.left != null && node.right != null){
            T data = findMax(node.right);
            node.data = data;
            node.right = remove(data, node.right);
        }else {
            node = (node.left == null) ? node.right: node.left;
        }
        return node;
    }

    @Override
    public void printTree() {
        if (isEmpty()){
            System.out.println("Empty tree");
        }else{
            printTree(root);
            System.out.println();
        }

    }

    private void printTree(Node<T> node){
        if (node != null){
            printTree(node.left);
            System.out.print(node.data + " ");
            printTree(node.right);
        }
    }

}
