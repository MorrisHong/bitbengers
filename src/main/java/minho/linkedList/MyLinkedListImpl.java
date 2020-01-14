package minho.linkedList;

import interfaces.linkedList.MyLinkedList;
import interfaces.linkedList.Node;

import java.util.LinkedList;

public class MyLinkedListImpl<T> implements MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedListImpl() {
        head = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void add(int index, T item) {

        if (index == 0) {
            addFirst(item);
        } else {
            addAfter(getNode(index-1), item);
        }

    }

    @Override
    public void addFirst(T item) {
        Node<T> node = new Node<>(item);
        node.next = head;
        head = node;
        size++;
    }

    @Override
    public void addAfter(Node<T> before, T item) {
        Node<T> node = new Node<>(item);
        node.next = before.next;
        before.next = node;
        size++;
    }

    @Override
    public T remove(T item) {
        int nodeIdx = indexOf(item);
        if (nodeIdx == 0) removeFirst();
        if (nodeIdx > 0) return removeAfter(getNode(nodeIdx - 1));
        return null;
    }

    @Override
    public T removeFirst() {
        Node<T> node = getNode(0);
        head = node.next;
        size--;
        return node.data;
    }

    @Override
    public T removeAfter(Node<T> before) {
        T data = before.next.data;
        before.next = before.next.next;
        size--;
        return data;
    }

    @Override
    public T get(int index) {
        return getNode(index).data;
    }

    @Override
    public int indexOf(T item) {

        for (int i = 0; i < getSize(); i++) {
            if (get(i) == item) return i;
        }
        return -1;
    }

    @Override
    public Node<T> getNode(int index) {
        Node<T> node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;

    }
}
