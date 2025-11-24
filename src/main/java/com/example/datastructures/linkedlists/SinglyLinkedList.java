package com.example.datastructures.linkedlists;

public class SinglyLinkedList<T> {

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // TODO  Implemente aqui:
    // - append(T value)
    // - prepend(T value)
    // - insertAt(int index, T value)
    // - remove(T value)
    // - reverse()
    // - find(T value)
    // - hasCycle()
    // - size()
    // - isEmpty()
    // - toList()
}
