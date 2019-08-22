package com.cqupt.sirius.algorithmExample.chapter2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static com.cqupt.sirius.algorithmExample.Utils.createASortedRandomIntArray;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void binarySearchTest(){
        Random random = new Random();
        int[] arrays1 = createASortedRandomIntArray();
        int[] arrays2 = createASortedRandomIntArray();
        int[] arrays3 = createASortedRandomIntArray();
        int[] arrays4 = createASortedRandomIntArray();
        int[] arrays5 = createASortedRandomIntArray();
        int[] arrays6 = createASortedRandomIntArray();
        int[] arrays7 = createASortedRandomIntArray();
        int[] arrays8 = createASortedRandomIntArray();
        int[] arrays9 = createASortedRandomIntArray();
        int[] arrays10 = createASortedRandomIntArray();
        int x1 = random.nextInt(30);
        int x2 = random.nextInt(30);
        int x3 = random.nextInt(30);
        int x4 = random.nextInt(30);
        int x5 = random.nextInt(30);
        int x6 = random.nextInt(30);
        int x7 = random.nextInt(30);
        int x8 = random.nextInt(30);
        int x9 = random.nextInt(30);
        int x10 = random.nextInt(30);
        assertEquals(findIndex(arrays1, x1), BinarySearch.binarySearch(arrays1, x1), Arrays.toString(arrays1).toString() + "and x is " + x1);
        assertEquals(findIndex(arrays2, x2), BinarySearch.binarySearch(arrays2, x2), Arrays.toString(arrays2).toString() + "and x is " + x2);
        assertEquals(findIndex(arrays3, x3), BinarySearch.binarySearch(arrays3, x3), Arrays.toString(arrays3).toString() + "and x is " + x3);
        assertEquals(findIndex(arrays4, x4), BinarySearch.binarySearch(arrays4, x4), Arrays.toString(arrays4).toString() + "and x is " + x4);
        assertEquals(findIndex(arrays5, x5), BinarySearch.binarySearch(arrays5, x5), Arrays.toString(arrays5).toString() + "and x is " + x5);
        assertEquals(findIndex(arrays6, x6), BinarySearch.binarySearch(arrays6, x6), Arrays.toString(arrays6).toString() + "and x is " + x6);
        assertEquals(findIndex(arrays7, x7), BinarySearch.binarySearch(arrays7, x7), Arrays.toString(arrays7).toString() + "and x is " + x7);
        assertEquals(findIndex(arrays8, x8), BinarySearch.binarySearch(arrays8, x8), Arrays.toString(arrays8).toString() + "and x is " + x8);
        assertEquals(findIndex(arrays9, x9), BinarySearch.binarySearch(arrays9, x9), Arrays.toString(arrays9).toString() + "and x is " + x9);
        assertEquals(findIndex(arrays10, x10), BinarySearch.binarySearch(arrays10, x10), Arrays.toString(arrays10).toString() + "and x is " + x10);
    }

    public static int findIndex(int[] array, int x){
        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
                return i;
            }
        }
        return -1;
    }


    @Test
    public void testUtils(){
        System.out.println(Arrays.toString(createASortedRandomIntArray()));
    }
}
