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
        Node<T> node = null;
        if(index > 0) {
            node = getNode(index - 1);
        }

        if (node == null) {
            addFirst(item);
        } else {
            Node<T> addNode = new Node<>(item);
            addNode.next = node.next;
            node.next = addNode;
            size++;
        }

    }

    @Override
    public void addFirst(T item) {
        Node<T> node = new Node<>(item);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
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
        if(nodeIdx == 0) removeFirst();
        if(nodeIdx > 0) {
            Node<T> node = getNode(indexOf(item));
            getNode(indexOf(item)-1).next = node.next;
            size--;
            return node.data;
        }
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
        return data;
    }

    @Override
    public T get(int index) {
        return getNode(index).data;
    }

    @Override
    public int indexOf(T item) {
        Node<T> node = head;
        for(int i = 0; i < getSize(); i++) {
            if(node.data == item) return i;
            node = node.next;
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
