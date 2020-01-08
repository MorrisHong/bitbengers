package eunmo.linkedList;

import interfaces.linkedList.MyLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListImplTest {

    @Test
    public void getSize() {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.addFirst("aa");
        linkedList.addFirst("bb");
        linkedList.addFirst("cc");
        assertTrue(linkedList.getSize() == 3);
    }

    @Test
    public void add() {
    }

    @Test
    public void addFirst() {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.addFirst("aa");
        linkedList.addFirst("bb");
        linkedList.addFirst("cc");
        assertTrue(linkedList.getSize() == 3);
    }

    @Test
    public void addAfter() {
    }

    @Test
    public void remove() {
    }

    @Test
    public void removeFirst() {
    }

    @Test
    public void removeAfter() {
    }

    @Test
    public void get() {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.addFirst("dd");
        linkedList.addFirst("cc");
        linkedList.addFirst("bb");
        linkedList.addFirst("aa");

        System.out.println("linkedList0 = " + linkedList.get(0));
        System.out.println("linkedList1 = " + linkedList.get(1));
        System.out.println("linkedList2 = " + linkedList.get(2));
        System.out.println("linkedList3 = " + linkedList.get(3));
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void getNode() {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.addFirst("aa");
        linkedList.addFirst("bb");
        linkedList.addFirst("cc");
        assertTrue(linkedList.getSize() == 3);
    }
}