## 링크드리스트

### interfaces/linkedList/Node
````java
public class Node<T> {
    private T data; 
    private Node<T> next;
}
````
- `private T data` 
  - Node에 담겨있는 T 타입의 참조변수. 
- `private Node<T> next`
  - 다음 Node를 가리키는 참조변수.
  
### MyLinkedListImpl의 일부
`````java
public class MyLinkedListImpl<T> implements MyLinkedList<T> {
    private Node<T> head;
    private int size;

    int getSize(){...}
    void add(int index, T item){...}
    void addFirst(T item){...}
    void addAfter(Node<T> before, T item){...}
    T remove(T item){...}
    T removeFirst(){...}
    T removeAfter(Node<T> before){...}
    T get(int index){...}
    int indexOf(T item){...}
    Node<T> getNode(int index){...}
}
`````
- `int getSize()`
  - 현재 LinkedList의 size를 리턴한다.
  
- `void add(int index, T item)`
  - 인자값 item을 필드로 갖는 Node를 인자값 index 위치에 끼워넣는다.
  
- `void addFirst(T item)`
  - 인자값 item을 필드로 갖는 Node를 첫번째 위치에 끼워넣는다.
  
- `void addAfter(Node<T> before, T item)`
  - 인자값 item을 필드로 갖는 Node를 인자값 before 다음 Node에 끼워넣는다.
  
- `T remove(T item)`
  - 인자값으로 주어진 item을 필드로 갖고있는 Node를 삭제한다. 리턴값은 해당 Node의 data다
  
- `T removeFitst()`
  - 첫번째 위치한 Node를 삭제한다. 리턴값은 해당 Node의 data다
  
- `T removeAfter(Node<T> before)`
  - 인자값 before 다음 Node를 삭제시킨다. 리턴값은 before의 다음 노드가 갖고있는 data다.
  
- `T get(int index)`
  - 인자값 index에 위치한 Node의 data를 리턴한다
  
- `int indexOf(T item)`
  - 인자값 item을 필드로 갖고있는 첫번째 Node의 index를 리턴한다.
  
- `Node<T> getNode(int index)`
  - 인자값 index에 위치하고있는 Node를 리턴한다.
