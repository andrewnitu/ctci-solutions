import static org.junit.Assert.*;
import org.junit.Test;

public class Question1_9Test {
	@Test
	public void testTrue() {
        Question1_9 question1_9 = new Question1_9();

        assertTrue(question1_9.isRotation("waterbottle", "erbottlewat"));
    }

    @Test
	public void testFalse() {
        Question1_9 question1_9 = new Question1_9();

        assertFalse(question1_9.isRotation("waterbottle", "erbotltewat"));
    }
}
