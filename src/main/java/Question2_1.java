import impl.linked_list.*;
import java.util.HashSet;

public class Question2_1 {
    // O(n) time complexity
    // O(n) space complexity
    public <T> LinkedList<T> removeDupsBuffer(LinkedList<T> ll) {
        Node<T> curr = ll.getHead();
        Node<T> prev = null;

        HashSet<T> buffer = new HashSet<T>();

        while (curr != null) {
            if (buffer.contains(curr.getData())) {
                prev.setNext(curr.getNext());
                curr = prev.getNext();
            }
            else {
                buffer.add(curr.getData());
                prev = curr;
                curr = curr.getNext();
            }
        }

        return ll;
    }

    // O(n^2) time complexity
    // O(1) space complexity
    public <T> LinkedList<T> removeDupsRunner(LinkedList<T> ll) {
        Node<T> iter = ll.getHead();

        while (iter != null) {
            Node<T> curr = iter.getNext();
            Node<T> prev = iter;

            while(curr != null) {
                if (curr.getData().equals(iter.getData())) {
                    prev.setNext(curr.getNext());
                    curr = prev.getNext();
                }
                else {
                    prev = curr;
                    curr = curr.getNext();
                }
            }
            
            iter = iter.getNext();
        }

        return ll;
    }
}
