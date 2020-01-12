package interfaces.linkedList;

public class Node<T> {
    public T data;
    public Node<T> next;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
