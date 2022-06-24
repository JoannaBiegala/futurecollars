package com.futurecollars.lesson12.task3;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int length;

    public DoublyLinkedList() {
        head = tail = null;
        length = 0;
    }

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
        if (index > length + 1 || index <= 0) {
            throw new IllegalArgumentException("The incorrect index " + index + " the length of list:" + length);
        }
        if (index == 1 && head == null) {
            head = tail = new Node(value, null, null);
            length++;
            return;
        }
        if (index == 1) {
            addToHead(value);
            return;
        }
        Node nodeBeforeAdd = head;
        for (int i = 1; i < index; i++) {
            nodeBeforeAdd = nodeBeforeAdd.nextNode;
        }
        Node node = new Node(value, nodeBeforeAdd, nodeBeforeAdd.nextNode);
        Node nodeAfterAdd = nodeBeforeAdd.nextNode;
        nodeBeforeAdd.nextNode = node;
        nodeAfterAdd.previousNode = node;
        if (index == length + 1) {
            tail = node;
        }
        length++;
    }

    void removeNode(int index) {
        if (index > length || index <= 0) {
            throw new IllegalArgumentException("The incorrect index " + index + " the length of list:" + length);
        }
        if (index == 1 && length == 1) {
            head = tail = null;
            length--;
            return;
        }
        Node nodeBeforeDelete = head;
        for (int i = 1; i < index; i++) {
            nodeBeforeDelete = nodeBeforeDelete.nextNode;
        }
        Node nodeDelete = nodeBeforeDelete.nextNode;
        Node nodeAfterDelete = nodeDelete.nextNode;
        nodeBeforeDelete.nextNode = nodeAfterDelete;
        if (index == 1) {
            head = nodeAfterDelete;
        }
        if (index == length - 1) {
            tail = nodeBeforeDelete;
        }
        length--;
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

}
