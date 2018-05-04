import impl.linked_list.*;

public class Question2_2 {
    // O(n) time complexity
    // O(1) space complexity
    public <T> T getKthToLastSimple(LinkedList<T> ll, int k) {
        int length = 0;
        Node<T> curr = ll.getHead();

        while (curr != null) {
            curr = curr.getNext();
            length++;
        }

        int targetIndex = length - k - 1;
        int currentIndex = 0;

        curr = ll.getHead();

        while (curr != null) {
            if (currentIndex == targetIndex) {
                return curr.getData();
            }
            else {
                currentIndex++;
                curr = curr.getNext();
            }
        }

        return ll.getHead().getData();
    }

    // O(n) time complexity
    // O(1) space complexity
    public <T> T getKthToLastOptimized(LinkedList<T> ll, int k) {
        Node<T> curr = ll.getHead();
        Node<T> ahead = ll.getHead();

        for(int i = 0; i < k + 1; i++) {
            ahead = ahead.getNext();
        }

        while (ahead != null) {
            curr = curr.getNext();
            ahead = ahead.getNext();
        }

        return curr.getData();
    }
}
