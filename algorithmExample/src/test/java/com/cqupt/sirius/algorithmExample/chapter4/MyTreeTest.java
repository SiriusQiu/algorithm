package com.cqupt.sirius.algorithmExample.chapter4;

import com.cqupt.sirius.algorithmExample.Utils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.cqupt.sirius.algorithmExample.Utils.*;


public class MyTreeTest {

    @Test
    public void testInsertAndPrint(){
        MyTree<Integer> myTree = new MyTree<>();
        int[] array = Utils.createARandomIntArray();
        for (int i : array){
            myTree.insert(i);
        }
        System.out.println(Arrays.toString(array));
        myTree.printTree();
    }

    @Test
    public void testFindMin(){
        MyTree<Integer> myTree = new MyTree<>();
        int[] array = Utils.createARandomIntArray();
        for (int i : array){
            myTree.insert(i);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(myTree.findMin());
    }

    @Test
    public void testFindMax(){
        MyTree<Integer> myTree = new MyTree<>();
        int[] array = Utils.createARandomIntArray();
        for (int i : array){
            myTree.insert(i);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(myTree.findMax());
    }

    @Test
    public void testContain(){
        MyTree<Integer> myTree = new MyTree<>();
        int[] array = Utils.createARandomIntArray();
        for (int i : array){
            myTree.insert(i);
        }
        System.out.println(Arrays.toString(array));
        int aRandomInt = createARandomInt(-50, 50);
        System.out.println(myTree.contain(aRandomInt));
        System.out.println(aRandomInt);
    }

    @Test
    public void testRemove(){
        MyTree<Integer> myTree = new MyTree<>();
        int[] array = Utils.createARandomIntArray();
        for (int i : array){
            myTree.insert(i);
        }
        System.out.println(Arrays.toString(array));
        myTree.printTree();
        int aRandomInt = createARandomInt(-50, 50);
        while (!myTree.contain(aRandomInt))
            aRandomInt = createARandomInt(-50, 50);
        myTree.remove(aRandomInt);
        myTree.printTree();
    }



}
