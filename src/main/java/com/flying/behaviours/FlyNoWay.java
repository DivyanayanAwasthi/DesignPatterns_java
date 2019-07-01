package com.flying.behaviours;

import com.duck.propeties.FlyingBehavior;

public class FlyNoWay  implements FlyingBehavior {
    /**
     *
     */
    public void fly(){
        System.out.println("Cannot fly");
    }
}
