import org.junit.Assert;
import org.junit.Test;

public class Question1_3Test {
	@Test
	public void testUrlify() {
        Question1_3 question1_3 = new Question1_3();

        Assert.assertTrue(question1_3.urlify("Mr John Smith    ", 13).equals("Mr%20John%20Smith"));
        Assert.assertTrue(question1_3.urlify("This is a test      ", 14).equals("This%20is%20a%20test"));
    }
}
