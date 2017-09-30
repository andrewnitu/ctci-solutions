public class Question1_1 {
    // O(n) time complexity.
    // O(1) memory.

    // Can also sort and then compare adjacent characters for O(nlogn) time complexity.
    public boolean isUniqueChars(String string) {
        boolean[] charsExist = new boolean[128];

        for (int i = 0; i < 26; i++) {
            charsExist[i] = false;
        }

        char current;

        for (int i = 0; i < string.length(); i++) {
            current = string.charAt(i);

            if (charsExist[current]) {
                return false;
            }
            charsExist[current] = true;
        }

        return true;
    }
}
