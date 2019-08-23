package com.cqupt.sirius.algorithmExample.chapter5;

import org.omg.CORBA.Any;

import static com.cqupt.sirius.algorithmExample.Utils.nextPrime;

public class MyQuadraticProbingHashTable<T> implements HashTable<T> {
    private static class HashEntry<T>{
        public T data;
        public boolean isActive;

        public HashEntry(T t) {
            this(t, true);
        }

        public HashEntry(T t, boolean isActive) {
            this.data = t;
            this.isActive = isActive;
        }
    }

    private HashEntry<T>[] array;
    private int currentSize;

    public MyQuadraticProbingHashTable(int size) {
        allocateArray(size);
        makeEmpty();
    }

    public MyQuadraticProbingHashTable() {
        this(DEFAULT_TABLE_SIZE);
    }

    @Override
    public void insert(T t) {
        int currentPos = findPos(t);
        if (isActive(currentPos))
            return;
        array[currentPos] = new HashEntry<>(t);
        if (++currentSize > array.length/2)
            reHash();
    }

    @Override
    public void remove(T t) {
        int currentPos = findPos(t);
        if (isActive(currentPos))
            array[currentPos].isActive = false;
    }

    @Override
    public boolean contains(T t) {
        int currentPos = findPos(t);
        return isActive(currentPos);
    }

    @Override
    public void makeEmpty() {
        currentSize = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = null;
        }
    }



    @Override
    public void reHash() {
        HashEntry<T>[] oldArray = array;
        allocateArray(nextPrime(2 * oldArray.length));
        currentSize = 0;
        for (int i = 0; i < oldArray.length; i++)
            if (oldArray[i] != null && oldArray[i].isActive)
                insert(oldArray[i].data);

    }

    private boolean isActive(int currentPos){
        return array[currentPos] != null && array[currentPos].isActive;
    }

    private int findPos(T t){
        int offset = 1;
        int currentPos = hash(t,array.length);
        while (array[currentPos]!=null&&!array[currentPos].data.equals(t)){
            currentPos += offset;
            offset +=2;
            if (currentPos >= array.length)
                currentPos -= array.length;
        }
        return currentPos;
    }


    private void allocateArray(int arraySize){
        array = new HashEntry[nextPrime(arraySize)];
    }


}
