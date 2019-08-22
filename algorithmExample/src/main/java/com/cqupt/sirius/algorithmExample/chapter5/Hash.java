package com.cqupt.sirius.algorithmExample.chapter5;

public class Hash {

    //把关键字的ASCII码加起来
    public static int hash1(String key, int tablesize){
        int hashVal = 0;
        for(int i = 0; i < key.length(); i++)
            hashVal += key.charAt(i);
        return hashVal % tablesize;
    }

    //根据权重计算字符串的前三个字符的ASCII码
    public static int hash2(String key, int tablesize){
        return (key.charAt(0) + 27 * key.charAt(1) + 729 * key.charAt(2)) % tablesize;
    }


    public static int hash3(String key, int tablesize){
        int hashVal = 0;
        for(int i = 0; i < key.length(); i++){
            hashVal = 37 * hashVal + key.charAt(i);
        }
        hashVal %= tablesize;
        if (hashVal < 0)
            hashVal += tablesize;
        return hashVal;
    }
}
