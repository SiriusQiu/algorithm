package com.cqupt.sirius.algorithmExample;

import java.math.BigInteger;
import java.util.*;

public class Utils {

    private static Random random = new Random();

    public static int[] createARandomIntArray(){
        int length = random.nextInt(20);
        int[] array = new int[length];
        for (int i = 0; i < length; i++){
            array[i] = random.nextInt(100) - 50;
        }
        return array;
    }
    public static int[] createASortedRandomIntArray(){
        int length = random.nextInt(10);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++){
            list.add(random.nextInt(30));
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return intList2IntArray(list);
    }

    public static ArrayList<Integer> intArray2IntList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array)
            list.add(i);
        return list;
    }

    public static int[] intList2IntArray(ArrayList<Integer> list){
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        return array;
    }

    public static int createARandomInt(int boundLeft, int bountRight){
        int length = bountRight - boundLeft;
        return random.nextInt(length) + boundLeft;
    }

    public static int createARandomInt(){
        return createARandomInt(0, 10);
    }

    public static int createARandomInt(int bound){
        return createARandomInt(0, bound);
    }

    public static int nextPrime(int n){
        BigInteger bigInteger = new BigInteger(String.valueOf(n));
        return bigInteger.nextProbablePrime().intValue();
    }

    public static boolean isPrime(int n){
        BigInteger bigInteger = new BigInteger(String.valueOf(n));
        return bigInteger.isProbablePrime(n);
    }


}
