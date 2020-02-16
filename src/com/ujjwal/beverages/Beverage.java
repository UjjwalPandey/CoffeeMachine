package com.ujjwal.beverages;

import java.util.Map;

public abstract class Beverage {
    public abstract Map<String,Integer> getRecipe();
//    public abstract void prepare();
    public int calculateCost(){
        Map<String,Integer> recepie = getRecipe();
        int cost =  0;

        return cost;
    }
}
