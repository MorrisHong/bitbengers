package eunmo.linkedList;

import interfaces.linkedList.MyLinkedList;
import interfaces.linkedList.Node;

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

    }

    @Override
    public void addFirst(T item) {
        Node<T> node = new Node<>();
        node.data = item;
        node.next = head;
        head = node;
        size++;
    }

    @Override
    public void addAfter(Node<T> before, T item) {
        Node<T> node = new Node<>();
        node.data = item;
        node.next = before.next;
        before.next = node;
        size++;
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
        return getNode(index).data;
    }

    @Override
    public int indexOf(T item) {
        for(int i = 0; i < size; i++) {
            if(get(i).equals(item)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public Node<T> getNode(int index) {
        if(index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
