package com.futurecollars.lesson15.task2;

public class Main {

    public static void main(String[] args) {
        PizzaShop pizzaShop = new PizzaShop();
        pizzaShop.printPizzas();
        pizzaShop.printAllergyPizzas();
        System.out.println("Is Vegetarian Pizza With Tomato And Pepper: " + pizzaShop.isVegetarianPizzaWithTomatoAndPepper());
        System.out.println("All Pizzas Contain Mozzarella: " + pizzaShop.allPizzasContainMozzarella());
        System.out.println("The highest Calorie Pizza: " + pizzaShop.findHighestCaloriePizza().toString());
        System.out.println("The lowest Calorie Pizza: " + pizzaShop.findLowestCaloriePizza().toString());

    }

}
