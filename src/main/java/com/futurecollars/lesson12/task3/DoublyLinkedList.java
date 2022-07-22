package com.futurecollars.lesson12.task3;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    int getLength() {
        return this.length;
    }

    void addToHead(String value) {
        if (head == null) {
            head = tail = new Node(value, null, null);
        } else {
            Node node = new Node(value, null, head);
            head.previousNode = node;
            head = node;
        }
        length++;
    }

    void addToTail(String value) {
        if (head == null)
            head = tail = new Node(value, null, null);
        else {
            Node node = new Node(value, head, null);
            tail.nextNode = node;
            tail = node;
        }
        length++;
    }

    void add(int index, String value) {
        if (index > length || index < 0) {
            throw new IllegalArgumentException("The incorrect index " + index + " the length of list:" + length);
        }
        if (index == 0 && head == null) {
            head = tail = new Node(value, null, null);
            length++;
            return;
        }
        if (index == 0) {
            addToHead(value);
            return;
        }
        Node nodeBeforeAdd = findNodeBeforeOperation(index);
        Node node = new Node(value, nodeBeforeAdd, nodeBeforeAdd.nextNode);
        Node nodeAfterAdd = nodeBeforeAdd.nextNode;
        nodeBeforeAdd.nextNode = node;
        if (nodeAfterAdd != null) {
            nodeAfterAdd.previousNode = node;
        }
        if (index == length - 1) {
            tail = node;
        }
        length++;
    }

    void removeNode(int index) {
        if (index > length || index < 0) {
            throw new IllegalArgumentException("The incorrect index " + index + " the length of list:" + length);
        }
        if (index == 0 && length == 1) {
            head = tail = null;
            length--;
            return;
        }
        Node nodeBeforeDelete = findNodeBeforeOperation(index);
        Node nodeDelete = nodeBeforeDelete.nextNode;
        Node nodeAfterDelete = null;
        if (index == length - 1) {
            tail = nodeBeforeDelete;
        } else {
            nodeAfterDelete = nodeDelete.nextNode;
        }
        nodeBeforeDelete.nextNode = nodeAfterDelete;
        if (index == 0) {
            head = nodeAfterDelete;
        }
        length--;
    }

    private Node findNodeBeforeOperation(int index) {
        Node nodeBeforeAdd = head;
        for (int i = 0; i < index - 1; i++) {
            nodeBeforeAdd = nodeBeforeAdd.nextNode;
        }
        return nodeBeforeAdd;
    }

    @Override
    public String toString() {
        String elementsOfList = head.value;

        Node node = head;
        while (node.nextNode != null) {
            node = node.nextNode;
            elementsOfList = elementsOfList + ", " + node.value;
        }
        return "DoublyLinkedList{" +
                "head=" + head.value +
                ", tail=" + tail.value +
                ", length=" + getLength() +
                ", elements= " + elementsOfList +
                '}';
    }


    private static class Node {

        private final String value;
        private Node previousNode;
        private Node nextNode;

        private Node(String value, Node previousNode, Node nextNode) {
            this.value = value;
            this.previousNode = previousNode;
            this.nextNode = nextNode;
        }

    }

}