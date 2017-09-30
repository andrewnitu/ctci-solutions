import java.lang.reflect.Array;
import java.util.Arrays;

public class Question1_2 {
    // O(m + n) time complexity
    // O(1) space
    public boolean isPermutationArray(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        int[] charsExist = new int[128];

        // Initialize the array to be all false
        for (int i = 0; i < 128; i++) {
            charsExist[i] = 0;
        }

        char currentChar;

        // Count every character found in the first string
        for (int i = 0; i < string1.length(); i++) {
            currentChar = string1.charAt(i);

            charsExist[i]++;
        }

        // Count every character found in the second string
        for (int j = 0; j < string2.length(); j++) {
            currentChar = string2.charAt(j);

            // Return false if we run out of characters in the first string found in the second string
            if (charsExist[j] == 0) {
                return false;
            }
            charsExist[j]--;
        }
        
        return true;
    }

    public boolean isPermutationSort(String string1, String string2) {
        char chars1[] = string1.toCharArray();
        char chars2[] = string2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (chars1.length != chars2.length) {
            return false;
        }

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }

        return true;
    }
}
