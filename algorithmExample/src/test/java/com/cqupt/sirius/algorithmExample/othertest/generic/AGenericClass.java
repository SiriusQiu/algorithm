package com.cqupt.sirius.algorithmExample.othertest.generic;

import com.cqupt.sirius.algorithmExample.othertest.food.Fruit;

public class AGenericClass <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class BGenericClass<Apple extends Fruit> {
    private Apple apple;

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
}

//class CGenericClass<? extends Fruit>{ }   Error
