public class Question1_4 {
    // O(n) time complexity
    // O(1) space complexity

    private boolean isLetter(char c) {
        return Character.isLetter(c);
    }

    public boolean isPermutationOfPalindrome(String string) {
        int[] charsFound = new int[128];

        for (int i = 0; i < string.length(); i++) {
            if (isLetter(string.charAt(i))) {
                charsFound[Character.isUpperCase(string.charAt(i)) ? string.charAt(i) + 32 : string.charAt(i)]++;
            }
        }

        boolean foundSingle = false;

        for (int i = 0; i < 128; i++) {
            if (charsFound[i] % 2 == 1) {
                if (!foundSingle) {
                    foundSingle = true;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}
