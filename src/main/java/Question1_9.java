public class Question1_9 {
    // O(x) time complexity
    // O(x) space complexity

    public boolean isRotation(String s1, String s2) {
        String twice = s2 + s2;

        return twice.contains(s1);
    }
}
