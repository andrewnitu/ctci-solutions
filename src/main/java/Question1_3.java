public class Question1_3 {
    // O(n) time complexity
    // O(1) space complexity if we used char array as parameter from the start, avoided to simplify Runner
    public String urlify(String string, int trueLength) {
        char[] chars = string.toCharArray();

        int trueSpaces = 0;

        for (int i = 0; i < trueLength; i++) {
            if (chars[i] == ' ') {
                trueSpaces++;
            }
        }

        int index = trueLength - 1;
        int currentReplace = chars.length - 1;
        int spacesLeft = trueSpaces;

        while (spacesLeft > 0) {
            if (chars[index] == ' ') {
                currentReplace = currentReplace - 3;
                chars[currentReplace + 1] = '%';
                chars[currentReplace + 2] = '2';
                chars[currentReplace + 3] = '0';
                spacesLeft--;
            } else {
                chars[currentReplace] = chars[index];
                currentReplace--;
            }
            index--;
        }

        return new String(chars);
    }
}
