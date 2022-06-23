package com.futurecollars.lesson12.task2;


public class Main {

    public static void main(String[] args) {

        CustomArrayList customList = new CustomArrayList(10);
        customList.add(9);
        customList.add(2);
        customList.add(3);
        customList.add(7);
        customList.add(5);

        System.out.println("Size: " + customList.size());
        System.out.println("Empty: " + customList.isEmpty());
        System.out.println(customList);

        customList.add(12);
        System.out.println("After add element to end of list: " + customList);

        Integer value = customList.get(3);
        System.out.println("Get element on index " + 3 + " - value: " + value);

        customList.add(5, 10);
        System.out.println("After add element 10 to index 5: " + customList);

        System.out.println("Removed element: index " + 2 + " value: " + customList.remove(2));
        System.out.println("After removed element:" + customList);

        System.out.println("Size:" + customList.size());
        System.out.println(customList);

    }
}
