import static org.junit.Assert.*;
import org.junit.Test;

public class Question1_5Test {
	@Test
	public void testIsOneEditAway() {
        Question1_5 question1_5 = new Question1_5();

        assertTrue(question1_5.isOneEditAway("pale", "ple"));
        assertTrue(question1_5.isOneEditAway("ple", "pale"));
        assertTrue(question1_5.isOneEditAway("pales", "pale"));
        assertTrue(!question1_5.isOneEditAway("pales", "ple"));
        assertTrue(question1_5.isOneEditAway("apale", "pale"));
        assertTrue(question1_5.isOneEditAway("pale", "bale"));
        assertTrue(question1_5.isOneEditAway("pale", "pake"));
        assertTrue(!question1_5.isOneEditAway("pale", "bake"));
    }
}
