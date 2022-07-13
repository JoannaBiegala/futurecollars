package com.futurecollars.lesson15.task2;

import java.util.List;

public class Pizza {

    String name;
    List<Ingredient> ingredients;
    int calories;
    boolean isVegetarian;

    public Pizza(String name, List<Ingredient> ingredients, int calories, boolean isVegetarian) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.isVegetarian = isVegetarian;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", calories=" + calories +
                ", isVegetarian=" + isVegetarian +
                '}';
    }

}
