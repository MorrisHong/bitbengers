package eunmo.linkedList;

import interfaces.linkedList.MyLinkedList;
import interfaces.linkedList.Node;
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
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.add(0, "aa");
        linkedList.add(0, "cc");
        linkedList.add(1, "bb");

        assertEquals(linkedList.get(0), "cc");
        assertEquals(linkedList.get(1), "bb");
        assertEquals(linkedList.get(2), "aa");
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
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();

        linkedList.addFirst("cc");
        Node<String> node = linkedList.getNode(0);
        assertEquals(node.data, "cc");

        linkedList.addAfter(node, "dd");
        assertEquals(linkedList.get(1), "dd");
        assertEquals(linkedList.getSize(), 2);

        linkedList.addAfter(node, "a");
        assertEquals(linkedList.get(1), "a");
        assertEquals(linkedList.get(2), "dd");
        assertEquals(linkedList.getSize(), 3);
    }

    @Test
    public void remove() {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.add(0, "aa");
        linkedList.add(1, "bb");
        linkedList.add(2, "cc");
        assertEquals(3, linkedList.getSize());

        linkedList.remove("aa");
        assertEquals(2, linkedList.getSize());

        String bb = linkedList.get(0);
        String cc = linkedList.get(1);
        assertEquals("bb", bb);
        assertEquals("cc", cc);

    }

    @Test
    public void removeFirst() {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.add(0, "aa");
        linkedList.add(1, "bb");
        linkedList.add(2, "cc");

        assertEquals(linkedList.getSize(), 3);

        linkedList.removeFirst();
        assertEquals(linkedList.getSize(), 2);
        assertEquals(linkedList.get(0), "bb");
        assertEquals(linkedList.get(1), "cc");

    }

    @Test
    public void removeAfter() {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.add(0, "aa");
        linkedList.add(1, "bb");
        linkedList.add(2, "cc");

        Node<String> node = linkedList.getNode(0);
        String str = linkedList.removeAfter(node);

        assertEquals("bb", str);
    }

    @Test
    public void get() {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.addFirst("dd");
        linkedList.addFirst("cc");
        linkedList.addFirst("bb");
        linkedList.addFirst("aa");

        assertEquals(linkedList.get(0), "aa");
        assertEquals(linkedList.get(1), "bb");
        assertEquals(linkedList.get(2), "cc");
        assertEquals(linkedList.get(3), "dd");
    }

    @Test
    public void indexOf() {
        MyLinkedList<String> linkedList = new MyLinkedListImpl<>();
        linkedList.addFirst("dd");
        linkedList.addFirst("cc");
        linkedList.addFirst("bb");
        linkedList.addFirst("aa");

        assertEquals(linkedList.indexOf("aa"), 0);
        assertEquals(linkedList.indexOf("bb"), 1);
        assertEquals(linkedList.indexOf("cc"), 2);
        assertEquals(linkedList.indexOf("dd"), 3);
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