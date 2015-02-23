package com.raingxm;

/**
 * Created by xuzhang on 2/22/15.
 */
public class Dollar extends Money{

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int time) {
        return Money.dollar(amount * time);
    }
}
