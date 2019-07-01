package com.ducks;

import com.duck.propeties.FlyingBehavior;
import com.duck.propeties.*;

/**
 *
 */
public abstract class Duck {

    FlyingBehavior flyingBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract  void display();

    public void performFly(){
        flyingBehaviour.fly();
    }

    public void setFlyingBehaviour(FlyingBehavior flyingBehaviour){
        this.flyingBehaviour=flyingBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour=quackBehaviour;
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void swim(){
        System.out.println("All Ducks Swim!");
    }
}
