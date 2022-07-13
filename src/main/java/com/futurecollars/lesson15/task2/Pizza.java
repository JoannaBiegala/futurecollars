package com.futurecollars.lesson15.task2;

import java.util.List;

public class Pizza {

    private final String name;
    private final List<Ingredient> ingredients;
    private final int calories;
    private final boolean isVegetarian;

    public Pizza(String name, List<Ingredient> ingredients, int calories, boolean isVegetarian) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.isVegetarian = isVegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public boolean isVegetarian() {
        return isVegetarian;
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
