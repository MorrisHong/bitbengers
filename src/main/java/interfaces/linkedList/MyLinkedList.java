package interfaces.linkedList;


public interface MyLinkedList<T> {
    int getSize();
    void add(int index, T item);
    void addFirst(T item);
    void addAfter(Node<T> before, T item);
    T remove(T item);
    T removeFirst();
    T removeAfter(Node<T> before);
    T get(int index);
    int indexOf(T item);
    Node<T> getNode(int index);
}
