import junit.framework.Assert;
import org.junit.Test;

public class Question1_1Test {
	@Test
	public void testNotUnique() {
        Question1_1 question1_1 = new Question1_1();

		Assert.assertTrue(!question1_1.isUniqueChars("thelazybrowndogjumpedover"));
	}

    @Test
    public void testUnique() {
        Question1_1 question1_1 = new Question1_1();

        Assert.assertTrue(question1_1.isUniqueChars("abcdefghijklmnopqrstuvwxyz"));
    }
}
