public class Question1_5 {
    // O(n) time complexity, where n is the length of the shorter string
    // O(1) space complexity

    public boolean isOneEditAway(String s1, String s2) {
        // assert that s2 length >= s1 length so that
        //  we may implement the logic only once

        if (Math.abs(s1.length() - s2.length()) > 1) {
            return false;
        }

        if (s1.length() > s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        boolean inPlace = false;
        
        if (s1.length() == s2.length()) {
            inPlace = true;
        }
        else {
            inPlace = false;
        }

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;

        while (index1 < s1.length()) {
            if (s1.charAt(index1) == s2.charAt(index2)) {
                index1++;
                index2++;
            }
            else {
                if (foundDifference) {
                    return false;
                }
                else {
                    foundDifference = true;
                    index2++;
                    if (inPlace) {
                        index1++;
                    }
                }
            }
        }

        return true;
    }
}
