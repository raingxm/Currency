package com.raingxm;

/**
 * Created by xuzhang on 2/22/15.
 */
public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int time) {
        return new Franc(amount * time);
    }

    @Override
    public boolean equals(Object object) {
        Franc dollar = (Franc) object;
        return amount == dollar.amount;
    }
}
