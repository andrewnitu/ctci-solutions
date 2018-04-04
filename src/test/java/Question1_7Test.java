import static org.junit.Assert.*;
import org.junit.Test;

public class Question1_7Test {
	@Test
	public void testRotateMatrix() {
        Question1_7 question1_7 = new Question1_7();

        int[][] testMatrix = 
        {
            {1, 2, 3, 4 },
            {5, 6, 7, 8 },
            {9, 10,11,12},
            {13,14,15,16}
        };

        int[][] answer =
        {
            {13, 9, 5, 1},
            {14,10, 6, 2},
            {15,11, 7, 3},
            {16,12, 8, 4}
        };

        assertArrayEquals(answer, question1_7.rotateMatrix(testMatrix));
    }
}
