package com.futurecollars.lesson15.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PizzaShop {

    private final List<Pizza> pizzas;

    public PizzaShop() {
        Pizza pizzaMargherita = new Pizza("Margherita", new ArrayList<>(List.of(Ingredient.mozzarella, Ingredient.tomato, Ingredient.salami)),
                1500, false);
        Pizza pizzaCapricciosa = new Pizza("Capricciosa", new ArrayList<>(List.of(Ingredient.mozzarella, Ingredient.mushrooms, Ingredient.salami)),
                1550, false);
        Pizza pizzaPepperoni = new Pizza("Pepperoni", new ArrayList<>(List.of(Ingredient.mozzarella, Ingredient.tomato, Ingredient.pepper)),
                1600, true);
        Pizza pizzaClassic = new Pizza("Classic", new ArrayList<>(List.of(Ingredient.mozzarella, Ingredient.mushrooms, Ingredient.salami)),
                1700, false);
        Pizza pizzaChicken = new Pizza("Chicken", new ArrayList<>(List.of(Ingredient.mozzarella, Ingredient.salami, Ingredient.mushrooms, Ingredient.onion)),
                1500, false);
        Pizza pizzaCalzone = new Pizza("Calzone", new ArrayList<>(List.of(Ingredient.salami, Ingredient.mushrooms, Ingredient.celery)),
                1550, false);
        Pizza pizzaRegina = new Pizza("Regina", new ArrayList<>(List.of(Ingredient.mozzarella, Ingredient.tomato, Ingredient.onion)),
                1600, true);
        Pizza pizzaHawaii = new Pizza("Hawaii", new ArrayList<>(List.of(Ingredient.tomato, Ingredient.mushrooms, Ingredient.salami)),
                1700, false);
        Pizza pizzaNeapolitana = new Pizza("Neapolitana", new ArrayList<>(List.of(Ingredient.mozzarella, Ingredient.tomato, Ingredient.celery)),
                1650, true);
        Pizza pizzaChicago = new Pizza("Chicago", new ArrayList<>(List.of(Ingredient.salami, Ingredient.mushrooms, Ingredient.celery)),
                1750, false);
        pizzas = new ArrayList<>(List.of(pizzaCalzone, pizzaChicago, pizzaCapricciosa,
                pizzaChicken, pizzaHawaii, pizzaClassic, pizzaMargherita, pizzaNeapolitana, pizzaPepperoni, pizzaRegina));
    }

    public void printPizzas() {
        System.out.println("All Pizzas:");
        pizzas
                .forEach(System.out::println);
    }

    public void printAllergyPizzas() {
        System.out.println("Allergy Pizzas:");
        pizzas.stream()
                .filter(pizza -> pizza.getIngredients().contains(Ingredient.celery))
                .forEach(System.out::println);
    }

    public boolean isVegetarianPizzaWithTomatoAndPepper() {
        Pizza result = pizzas
                .stream()
                .filter(pizza -> pizza.isVegetarian() && pizza.getIngredients().contains(Ingredient.tomato)
                        && pizza.getIngredients().contains(Ingredient.pepper))
                .findAny()
                .orElse(null);
        return result != null;
    }

    public boolean allPizzasContainMozzarella() {
        long count = pizzas
                .stream()
                .filter(pizza -> pizza.getIngredients().contains(Ingredient.mozzarella))
                .count();
        return count == (long) pizzas.size();
    }

    public Pizza findHighestCaloriePizza() {
        Optional<Pizza> pizza = pizzas
                .stream()
                .max(Comparator.comparing(
                        Pizza::getCalories, Comparator.naturalOrder()));
        return pizza.orElse(null);
    }

    public Pizza findLowestCaloriePizza() {
        Optional<Pizza> pizza =
                pizzas
                        .stream()
                        .min(Comparator.comparing(Pizza::getCalories));
        return pizza.orElse(null);
    }

}
