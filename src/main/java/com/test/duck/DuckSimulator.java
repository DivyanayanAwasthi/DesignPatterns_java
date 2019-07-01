package com.test.duck;

import com.ducks.Duck;
import com.ducks.MallardDuck;
import com.flying.behaviours.FlyNoWay;

public class DuckSimulator {
    public static void main(String[] args) {

        Duck duck=new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyingBehaviour(new FlyNoWay());
        duck.performFly();
    }
}
