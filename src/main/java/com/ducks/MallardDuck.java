package com.ducks;

import com.flying.behaviours.FlywithWings;
import com.quack.behaviours.Quack;

public class MallardDuck extends Duck {


    public MallardDuck(){
    quackBehaviour=new Quack();
    flyingBehaviour=new FlywithWings();
    }
    @Override
    public void display() {
        System.out.println("I am mallard duck");
    }
}
