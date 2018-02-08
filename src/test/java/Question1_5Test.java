import junit.framework.Assert;
import org.junit.Test;

public class Question1_5Test {
	@Test
	public void testIsOneEditAway() {
        Question1_5 question1_5 = new Question1_5();

        Assert.assertTrue(question1_5.isOneEditAway("pale", "ple"));
        Assert.assertTrue(question1_5.isOneEditAway("ple", "pale"));
        Assert.assertTrue(question1_5.isOneEditAway("pales", "pale"));
        Assert.assertTrue(!question1_5.isOneEditAway("pales", "ple"));
        Assert.assertTrue(question1_5.isOneEditAway("apale", "pale"));
        Assert.assertTrue(question1_5.isOneEditAway("pale", "bale"));
        Assert.assertTrue(question1_5.isOneEditAway("pale", "pake"));
        Assert.assertTrue(!question1_5.isOneEditAway("pale", "bake"));
    }
}
