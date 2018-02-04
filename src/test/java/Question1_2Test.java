import junit.framework.Assert;
import org.junit.Test;

public class Question1_2Test {
	@Test
	public void testArrayImpl() {
        Question1_2 question1_2 = new Question1_2();

		Assert.assertTrue(question1_2.isPermutationArray("Rotor", "toroR"));
        Assert.assertTrue(!question1_2.isPermutationArray("Lololololol", "Lolololololo"));
        Assert.assertTrue(!question1_2.isPermutationArray("Rotor", "Rotoe"));
	}

    @Test
    public void testSortImpl() {
        Question1_2 question1_2 = new Question1_2();

        Assert.assertTrue(question1_2.isPermutationSort("Rotor", "toroR"));
        Assert.assertTrue(!question1_2.isPermutationSort("Lololololol", "Lolololololo"));
        Assert.assertTrue(!question1_2.isPermutationArray("Rotor", "Rotoe"));
    }
}
