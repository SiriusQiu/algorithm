package com.cqupt.sirius.algorithmExample.chapter2;

public class MaxSumOfSubSequence {

    /**
     * Exhaustive method
     */
    public static int algorithmOne(int[] arrays){
        int maxSum = 0;
        for (int i = 0; i < arrays.length; i++){
            for (int j = i; j <arrays.length ; j++){
                int currentSum = 0;
                for (int k = i; k <= j; k++){
                    currentSum += arrays[k];
                    if (currentSum > maxSum){
                        maxSum = currentSum;
                    }
                }
            }
        }
        return maxSum;
    }

    public static int algorithmTwo(int[] arrays){
        int maxSum = 0;
        for (int i = 0; i < arrays.length; i++){
            int currentSum = 0;
            for (int j = i; j <arrays.length ; j++){
                currentSum += arrays[j];
                for (int k = i; k <= j; k++){
                    if (currentSum > maxSum){
                        maxSum = currentSum;
                    }
                }
            }
        }
        return maxSum;
    }

    public static int algorithmThree(int[] arrays){
        if (arrays.length == 0){
            return 0;
        }
        return algorithmThree(arrays, 0, arrays.length - 1);
    }


    public static int algorithmThree(int[] arrays, int left, int right){

        //判断基准情况
        if (left == right){
            if (arrays[left] >= 0)
                return arrays[left];
            else return 0;
        }

        //寻找两边的最大值

        int center = (left + right) / 2;
        int theMaxInLeft = algorithmThree(arrays, left, center);
        int theMaxInRight = algorithmThree(arrays, center + 1, right);

        //寻找处于中间的最大值
        int theMaxInMiddle = 0, theCurrent = 0;
        int theLeftMiddleMax = 0;
        for (int i = center; i >= left; i--){
            theCurrent += arrays[i];
            if (theCurrent > theLeftMiddleMax){
                theLeftMiddleMax = theCurrent;
            }
        }

        theCurrent = 0;
        int theRightMiddleMax = 0;
        for (int i = center + 1; i <= right; i++){
            theCurrent += arrays[i];
            if (theCurrent > theRightMiddleMax){
                theRightMiddleMax = theCurrent;
            }
        }

        theMaxInMiddle = theLeftMiddleMax + theRightMiddleMax;
        int theMax =  theMaxInLeft;
        if (theMaxInMiddle > theMax){
            theMax = theMaxInMiddle;
        }
        if (theMaxInRight > theMax){
            theMax = theMaxInRight;
        }
        int hello = 0;
        return theMax;
    }

    public static int algorithmFour(int[] arrays){
        int theMax = 0;
        int theCurrent = 0;
        for (int i = 0; i < arrays.length; i++){
            theCurrent += arrays[i];
            if (theCurrent > theMax){
                theMax = theCurrent;
            }else if (theCurrent < 0){
                theCurrent = 0;
            }else ;
        }


        return theMax;
    }




}
