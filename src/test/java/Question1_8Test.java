import static org.junit.Assert.*;
import org.junit.Test;

public class Question1_8Test {
	@Test
	public void testEasyCase() {
        Question1_8 question1_8 = new Question1_8();

        int[][] testMatrix = 
        {
            { 1, 2, 0, 4, 8, 5 },
            { 5, 6, 7, 8, 2, 3 },
            { 2,10,11,12, 6, 23},
            {13,14,15,16, 0, 3 }
        };

        int[][] answer =
        {
            { 0, 0, 0, 0, 0, 0 },
            { 5, 6, 0, 8, 0, 3 },
            { 2,10, 0,12, 0, 23},
            { 0, 0, 0, 0, 0, 0 }
        };

        assertArrayEquals(answer, question1_8.setToZero(testMatrix));
    }

    @Test
    public void testEmpty() {
        Question1_8 question1_8 = new Question1_8();

        int[][] testMatrix = {};

        int[][] answer = {};

        assertArrayEquals(answer, question1_8.setToZero(testMatrix));
    }

    @Test
    public void testSingleNoZero() {
        Question1_8 question1_8 = new Question1_8();

        int[][] testMatrix = { {1} };

        int[][] answer = { {1} };

        assertArrayEquals(answer, question1_8.setToZero(testMatrix));
    }

    @Test
    public void testSingleZero() {
        Question1_8 question1_8 = new Question1_8();

        int[][] testMatrix = { {0} };

        int[][] answer = { {0} };

        assertArrayEquals(answer, question1_8.setToZero(testMatrix));
    }

    @Test
    public void testDouble() {
        Question1_8 question1_8 = new Question1_8();

        int[][] testMatrix =
        {
            {0, 1},
            {1, 1}
        };

        int[][] answer =
        {
            {0, 0},
            {0, 1}
        };

        assertArrayEquals(answer, question1_8.setToZero(testMatrix));
    }
}
