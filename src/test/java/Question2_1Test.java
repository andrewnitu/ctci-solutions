import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import impl.linked_list.LinkedList;

public class Question2_1Test {
	@Test
	public void testRemoveDupsBuffer() {
        Question2_1 question2_1 = new Question2_1();

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("a");
        ll.add("a");
        ll.add("b");
        ll.add("b");
        ll.add("a");
        ll.add("c");
        ll.add("c");
        ll.add("b");
        
        LinkedList<String> llDupsRemoved = question2_1.removeDupsBuffer(ll);

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b");
        expected.add("c");

        assertEquals(expected, llDupsRemoved.toArrayList());
    }

    @Test
	public void testRemoveDupsRunner() {
        Question2_1 question2_1 = new Question2_1();

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("a");
        ll.add("a");
        ll.add("b");
        ll.add("b");
        ll.add("a");
        ll.add("c");
        ll.add("c");
        ll.add("b");
        
        LinkedList<String> llDupsRemoved = question2_1.removeDupsRunner(ll);

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b");
        expected.add("c");

        assertEquals(llDupsRemoved.toArrayList(), expected);
    }
}
