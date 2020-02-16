package com.ujjwal.beverages;

import java.util.HashMap;
import java.util.Map;

public class LemonTea extends Beverage{
    private Map<String, Integer> ingredients = new HashMap<>();

    public Map<String,Integer> getRecipe(){
        ingredients.put("LEMON", 1);
        ingredients.put("WATER", 3);
        ingredients.put("TEA LEAVES", 2);
        ingredients.put("SUGAR", 2);
        return ingredients;
    }

}
