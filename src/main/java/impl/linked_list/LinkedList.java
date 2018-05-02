package impl.linked_list;

import java.util.ArrayList;

public class LinkedList<T> {
    private Node<T> head = null;

    // O(1)
    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);
        
        newNode.setNext(head);

        head = newNode;
    }

    // O(n)
    public void add(T data) {
        if (head == null) {
            head = new Node<T>(data);
        }
        else {
            Node<T> curr = head;
            while(curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node<T>(data));
        }
    }

    // O(n)
    public ArrayList<T> toArrayList() {
        ArrayList<T> result = new ArrayList<T>();

        Node<T> curr = head;

        while (curr != null) {
            result.add(curr.getData());
            curr = curr.getNext();
        }

        return result;
    }

    public Node<T> getHead() {
        return head;
    }
}
