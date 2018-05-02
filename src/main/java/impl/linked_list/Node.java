package impl.linked_list;

public class Node<T> {
    private Node<T> next;
    private T data;

    public Node(T data) {
        this.next = null;
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }
}
