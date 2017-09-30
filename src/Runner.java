public class Runner {
    public static void main(String[] args) {
        Question1_1 question1_1 = new Question1_1();
        Question1_2 question1_2 = new Question1_2();

        if (!(!question1_1.isUniqueChars("thelazybrowndogjumpedover")
                &&
                question1_1.isUniqueChars("abcdefghijklmnopqrstuvwxyz")
                &&
                question1_2.isPermutationArray("Rotor", "toroR")
                &&
                !question1_2.isPermutationArray("Lololololol", "Lolololololo")
                &&
                question1_2.isPermutationSort("Rotor", "toroR")
                &&
                !question1_2.isPermutationSort("Lololololol", "Lolololololo"))) {
            System.out.println("Some tests failed");
            System.exit(1);
        }
    }
}
