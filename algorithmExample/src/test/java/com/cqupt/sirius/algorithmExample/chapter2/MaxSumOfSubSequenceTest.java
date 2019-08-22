package com.cqupt.sirius.algorithmExample.chapter2;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static com.cqupt.sirius.algorithmExample.chapter2.MaxSumOfSubSequence.*;
import static com.cqupt.sirius.algorithmExample.Utils.*;



public class MaxSumOfSubSequenceTest {

    @Test
    public void testAlgorithmn(){
        int[] arrays1 = createARandomIntArray();
        int[] arrays2 = createARandomIntArray();
        int[] arrays3 = createARandomIntArray();
        int[] arrays4 = createARandomIntArray();
        int[] arrays5 = createARandomIntArray();
        int[] arrays6 = createARandomIntArray();
        int[] arrays7 = createARandomIntArray();
        int[] arrays8 = createARandomIntArray();
        int[] arrays9 = createARandomIntArray();
        int[] arrays10 = createARandomIntArray();
        assertEquals(algorithmOne(arrays1), algorithmTwo(arrays1), Arrays.toString(arrays1).toString());
        assertEquals(algorithmOne(arrays2), algorithmTwo(arrays2), Arrays.toString(arrays2).toString());
        assertEquals(algorithmOne(arrays3), algorithmTwo(arrays3), Arrays.toString(arrays3).toString());
        assertEquals(algorithmOne(arrays4), algorithmTwo(arrays4), Arrays.toString(arrays4).toString());
        assertEquals(algorithmOne(arrays5), algorithmTwo(arrays5), Arrays.toString(arrays5).toString());
        assertEquals(algorithmOne(arrays6), algorithmTwo(arrays6), Arrays.toString(arrays6).toString());
        assertEquals(algorithmOne(arrays7), algorithmTwo(arrays7), Arrays.toString(arrays7).toString());
        assertEquals(algorithmOne(arrays8), algorithmTwo(arrays8), Arrays.toString(arrays8).toString());
        assertEquals(algorithmOne(arrays9), algorithmTwo(arrays9), Arrays.toString(arrays9).toString());
        assertEquals(algorithmOne(arrays10), algorithmTwo(arrays10), Arrays.toString(arrays10).toString());
        assertEquals(algorithmOne(arrays1), algorithmThree(arrays1), Arrays.toString(arrays1).toString());
        assertEquals(algorithmOne(arrays2), algorithmThree(arrays2), Arrays.toString(arrays2).toString());
        assertEquals(algorithmOne(arrays3), algorithmThree(arrays3), Arrays.toString(arrays3).toString());
        assertEquals(algorithmOne(arrays4), algorithmThree(arrays4), Arrays.toString(arrays4).toString());
        assertEquals(algorithmOne(arrays5), algorithmThree(arrays5), Arrays.toString(arrays5).toString());
        assertEquals(algorithmOne(arrays6), algorithmThree(arrays6), Arrays.toString(arrays6).toString());
        assertEquals(algorithmOne(arrays7), algorithmThree(arrays7), Arrays.toString(arrays7).toString());
        assertEquals(algorithmOne(arrays8), algorithmThree(arrays8), Arrays.toString(arrays8).toString());
        assertEquals(algorithmOne(arrays9), algorithmThree(arrays9), Arrays.toString(arrays9).toString());
        assertEquals(algorithmOne(arrays10), algorithmThree(arrays10), Arrays.toString(arrays10).toString());
        assertEquals(algorithmOne(arrays1), algorithmFour(arrays1), Arrays.toString(arrays1).toString());
        assertEquals(algorithmOne(arrays2), algorithmFour(arrays2), Arrays.toString(arrays2).toString());
        assertEquals(algorithmOne(arrays3), algorithmFour(arrays3), Arrays.toString(arrays3).toString());
        assertEquals(algorithmOne(arrays4), algorithmFour(arrays4), Arrays.toString(arrays4).toString());
        assertEquals(algorithmOne(arrays5), algorithmFour(arrays5), Arrays.toString(arrays5).toString());
        assertEquals(algorithmOne(arrays6), algorithmFour(arrays6), Arrays.toString(arrays6).toString());
        assertEquals(algorithmOne(arrays7), algorithmFour(arrays7), Arrays.toString(arrays7).toString());
        assertEquals(algorithmOne(arrays8), algorithmFour(arrays8), Arrays.toString(arrays8).toString());
        assertEquals(algorithmOne(arrays9), algorithmFour(arrays9), Arrays.toString(arrays9).toString());
        assertEquals(algorithmOne(arrays10), algorithmFour(arrays10), Arrays.toString(arrays10).toString());
    }





    @Test
    public void testError(){
        int[] array = new int[] {9, -7, -5, -6, -10, -9};
        assertEquals(algorithmOne(array), algorithmFour(array), Arrays.toString(array).toString());
    }









}
