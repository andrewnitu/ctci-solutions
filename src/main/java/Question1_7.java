public class Question1_7 {
    // O(x) time complexity
    // O(x) space complexity

    // Should rotate clockwise 90 degrees
    public int[][] rotateMatrix(int[][] matrix) {
        int s = matrix.length;

        // Iterate each layer
        for(int i = 0; i < s/2; i++) {
            // Iterate each position on the side
            for(int j = i; j < s - i - 1; j++) {
                int tmp = matrix[i][j];

                matrix[i][j] = matrix[s-j-1][i];

                matrix[s-j-1][i] = matrix[s-i-1][s-j-1];

                matrix[s-i-1][s-j-1] = matrix[j][s-i-1];

                matrix[j][s-i-1] = tmp;
            }
        }

        return matrix;
    }
}
