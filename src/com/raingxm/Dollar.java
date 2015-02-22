package com.raingxm;

/**
 * Created by xuzhang on 2/22/15.
 */
public class Dollar extends Money{

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int time) {
        return new Dollar(amount * time);
    }

}
