package com.cqupt.sirius.algorithmExample.chapter2;

public class BinarySearch {
    public static int binarySearch(int[] array, int x){
        int left = 0;
        int right = array.length-1;
        while (left<right){
            int center = (left + right) / 2;
            if (array[center] > x){
                right = center;
            }else if (array[center] < x){
                left = center + 1;
            }else {
                 return center;
            }
        }
        if (left > right)
            return -1;
        else if (array[left] == x) return left;
        else return -1;
    }
}
