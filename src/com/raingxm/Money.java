package com.raingxm;

/**
 * Created by xuzhang on 2/22/15.
 */
public class Money {
    protected int amount;
    
    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
