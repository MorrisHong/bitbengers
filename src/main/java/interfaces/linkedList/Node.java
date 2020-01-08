package interfaces.linkedList;

public class Node<T> {
    public T data;
    public Node<T> next;

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
