public class Question1_8 {
    // O(m*n) time complexity
    // O(1) space complexity

    public int[][] setToZero(int[][] matrix) {
        if (matrix.length == 0 || matrix.length == 1) {
            return matrix;
        }

        boolean firstRowContainsZero = false;
        boolean firstColContainsZero = false;

        int height = matrix.length;
        int width = matrix[0].length;

        for (int col = 0; col < height; col++) {
            if (matrix[0][col] == 0) {
                firstRowContainsZero = true;
            }
        }

        for (int row = 0; row < height; row++) {
            if (matrix[row][0] == 0) {
                firstColContainsZero = true;
            }
        }

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        for (int row = 1; row < height; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 1; col < width; col++) {
                    matrix[row][col] = 0;
                }
            }
        }

        for (int col = 1; col < width; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 1; row < height; row++) {
                    matrix[row][col] = 0;
                }
            }
        }

        if (firstRowContainsZero) {
            for (int col = 0; col < width; col++) {
                matrix[0][col] = 0;
            }
        }

        if (firstColContainsZero) {
            for (int row = 0; row < height; row++) {
                matrix[row][0] = 0;
            }
        }

        return matrix;
    }
}
