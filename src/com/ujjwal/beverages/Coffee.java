package com.ujjwal.beverages;

import java.util.HashMap;
import java.util.Map;

public class Coffee extends  Beverage{
    private Map<String, Integer> ingredients = new HashMap<>();

    public Map<String,Integer> getRecipe(){
        ingredients.put("MILK", 2);
        ingredients.put("WATER", 3);
        ingredients.put("COFFEE BEANS", 2);
        ingredients.put("SUGAR", 3);
        return ingredients;
    }

}
