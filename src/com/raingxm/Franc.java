package com.raingxm;

/**
 * Created by xuzhang on 2/22/15.
 */
public class Franc extends Money{

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int time) {
        return Money.franc(amount * time);
    }

}
