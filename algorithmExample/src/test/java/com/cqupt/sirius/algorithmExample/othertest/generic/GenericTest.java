package com.cqupt.sirius.algorithmExample.othertest.generic;

import com.cqupt.sirius.algorithmExample.othertest.food.Apple;
import com.cqupt.sirius.algorithmExample.othertest.food.Food;
import com.cqupt.sirius.algorithmExample.othertest.food.Fruit;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    /**
     * 编译器认为Apple数组和Fruit数组是完全不同的类
     */
    @Test
    public void testTheArray(){
        //Fruit[] fruits = new Apple[]{new Apple()};  Error
    }

    /**
     * 编译器认为Fruit和Apple的AGenericClass都是不同的类
     */
    @Test
    public void theTheGenericHolder(){
        //AGenericClass<Fruit> aGenericClass = new AGenericClass<Apple>();  Error
//        AGenericClass<Fruit> aGenericClass = new AGenericClass<>();
//        aGenericClass.setT(new Apple());


        //对通配符的使用
//        AGenericClass<?> aGenericClass = new AGenericClass<Fruit>();
//        aGenericClass.setT(new Fruit());    //Error
//        Object fruit = aGenericClass.getT();

        //上界的指定
//        AGenericClass<? extends Fruit> aGenericClass = new AGenericClass<Apple>();
//        aGenericClass.setT(new Apple());      //Error
//        aGenericClass.setT(new Fruit());      //Error
//        Fruit fruit = aGenericClass.getT();

        //下界的指定
//        AGenericClass<? super Fruit> aGenericClass = new AGenericClass<Food>();
//        aGenericClass.setT(new Apple());
//        aGenericClass.setT(new Fruit());
//        Fruit fruit = aGenericClass.getT();   //Error

        BGenericClass<Apple> bGenericClass = new BGenericClass<>();


    }

}
