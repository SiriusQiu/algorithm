package com.cqupt.sirius.algorithmExample.chapter3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    @Test
    public void checkTheListType(){
        List<Integer> list = Arrays.asList( 1, 2, 3 );

        try {
            list.add(4);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(list.getClass().getCanonicalName());
        }

    }


}
