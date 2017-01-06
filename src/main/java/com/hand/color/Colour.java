package com.hand.color;

/**
 * Created by 陈伟 on 2017/1/5.
 */
public enum Colour {
    Green(1),
    Red(2),
    Yellow(3);

    private int index;
    Colour(int index){
        this.index=index;
    }
}
