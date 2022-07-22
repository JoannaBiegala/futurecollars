package com.futurecollars.lesson12.task3;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addToHead("Ala");
        doublyLinkedList.addToHead("Kasia");
        doublyLinkedList.addToHead("Małgosia");
        doublyLinkedList.addToHead("Franek");

        System.out.println("List: " + doublyLinkedList);

        doublyLinkedList.add(2, "Zosia");
        System.out.println("After add Zosia: " + doublyLinkedList);

        doublyLinkedList.removeNode(4);
        System.out.println("After delete index 4: " + doublyLinkedList);

        doublyLinkedList.removeNode(1);
        System.out.println("After delete index 1: " + doublyLinkedList);

        doublyLinkedList.addToTail("Olek");
        System.out.println("After add Olek to tail: " + doublyLinkedList);
    }

}
