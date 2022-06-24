package com.futurecollars.lesson12.task3;

public class Node {

    String value;
    Node previousNode;
    Node nextNode;

    public Node(String value, Node previousNode, Node nextNode){
        this.value = value;
        this.previousNode = previousNode;
        this.nextNode = nextNode;
    }

}