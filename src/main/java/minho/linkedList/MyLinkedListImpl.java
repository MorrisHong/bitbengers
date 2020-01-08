package minho.linkedList;

import interfaces.linkedList.MyLinkedList;
import interfaces.linkedList.Node;

public class MyLinkedListImpl<T> implements MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedListImpl() {
        head = new Node<>();
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addAfter(Node<T> before, T item) {

    }

    @Override
    public T remove(T item) {
        return null;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeAfter(Node<T> before) {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T item) {
        return 0;
    }

    @Override
    public Node<T> getNode(int index) {
        return null;
    }
}
