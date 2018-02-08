public class Question1_6 {
    // O(n) time complexity
    // O(n) space complexity

    public String compress(String s) {
        if (s.length() == 0) {
            return "";
        }

        char last = s.charAt(0);
        int num = 1;

        StringBuilder out = new StringBuilder();

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) != last) {
                out.append(last).append(num);
                last = s.charAt(i);
                num = 1;
            }
            else {
                num++;
            }
        }

        if (s.charAt(s.length() - 1) == last) {
            out.append(last).append(num + 1);
        }
        else {
            out.append(last).append(num).append(s.charAt(s.length() - 1)).append(1);
        }

        if (out.length() < s.length()) {
            return out.toString();
        }
        
        return s;
    }
}
