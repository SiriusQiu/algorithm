package com.cqupt.sirius.algorithmExample.chapter5;


import java.util.LinkedList;
import java.util.List;

import static com.cqupt.sirius.algorithmExample.Utils.nextPrime;

public class MySeparateChainingHashTable<T> implements HashTable<T> {
    private LinkedList<T>[] theLists;
    private int currentSize = -1;
    public MySeparateChainingHashTable(int size) {
        currentSize = 0;
        theLists = new LinkedList[nextPrime(size)];
        for (int i = 0; i < theLists.length; i++){
            theLists[i] = new LinkedList<>();
        }
    }



    @Override
    public void insert(T t) {
        LinkedList<T> linkedList = theLists[hash(t, theLists.length)];
        if (!linkedList.contains(t))
            linkedList.addFirst(t);
            if (++currentSize > theLists.length)
                reHash();
    }

    @Override
    public void remove(T t) {
        LinkedList<T> linkedList = theLists[hash(t, theLists.length)];
        if (linkedList.contains(t)){
            linkedList.remove(t);
            currentSize--;
        }
    }

    @Override
    public boolean contains(T t) {
        LinkedList<T> linkedList = theLists[hash(t, theLists.length)];
        return linkedList.contains(t);
    }

    @Override
    public void makeEmpty() {
        for (LinkedList list : theLists)
            list.clear();
        currentSize = 0;
    }


    @Override
    public void reHash() {
        LinkedList<T>[] oldLists = theLists;
        theLists = new LinkedList[nextPrime(oldLists.length*2)];

        for (int i = 0; i < theLists.length; i++){
            theLists[i] = new LinkedList<>();
        }

        currentSize = 0;
        for (LinkedList<T> linkedList : oldLists){
            for (T t : linkedList){
                insert(t);
            }
        }

    }
}
