import static org.junit.Assert.*;
import org.junit.Test;

public class Question1_6Test {
	@Test
	public void testCompress() {
        Question1_6 question1_6 = new Question1_6();

        assertTrue(question1_6.compress("aabcccccaaa").equals("a2b1c5a3"));
        assertTrue(question1_6.compress("aabcccccccccca").equals("a2b1c10a1"));
        assertTrue(question1_6.compress("abcccccccccca").equals("a1b1c10a1"));
        assertTrue(question1_6.compress("abcd").equals("abcd"));
        assertTrue(question1_6.compress("aabb").equals("aabb"));
    }
}
