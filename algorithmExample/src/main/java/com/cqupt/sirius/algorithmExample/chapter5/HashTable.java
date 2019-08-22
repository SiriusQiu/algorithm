package com.cqupt.sirius.algorithmExample.chapter5;

import java.math.BigInteger;

public interface HashTable<T> {
    void insert(T t);
    void remove(T t);
    boolean contains(T t);
    void makeEmpty();
    int DEFAULT_TABLE_SIZE = 101;
    int hash(T t);
}
