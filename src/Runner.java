public class Runner {
    public static void main(String[] args) {
        Question1_1 question1_1 = new Question1_1();

        if (!((!question1_1.isUniqueChars("thelazybrowndogjumpedover"))
                &&
                question1_1.isUniqueChars("abcdefghijklmnopqrstuvwxyz"))) {
            System.exit(1);
        }
    }
}
