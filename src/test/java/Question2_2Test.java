import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import impl.linked_list.LinkedList;

public class Question2_2Test {
    @Test
	public void testGetKthToLastSimple() {
        Question2_2 question2_2 = new Question2_2();

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.add("e");
        ll.add("f");
        ll.add("g");
        ll.add("h");

        assertEquals("f", question2_2.getKthToLastSimple(ll, 2));
        assertEquals("a", question2_2.getKthToLastSimple(ll, 7));
        assertEquals("h", question2_2.getKthToLastSimple(ll, 0));
    }

    @Test
	public void testGetKthToLastOptimized() {
        Question2_2 question2_2 = new Question2_2();

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.add("e");
        ll.add("f");
        ll.add("g");
        ll.add("h");

        assertEquals("f", question2_2.getKthToLastOptimized(ll, 2));
        assertEquals("a", question2_2.getKthToLastOptimized(ll, 7));
        assertEquals("h", question2_2.getKthToLastOptimized(ll, 0));
    }
}
