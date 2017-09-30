public class Runner {
    public static void main(String[] args) {
        Question1_1 question1_1 = new Question1_1();
        Question1_2 question1_2 = new Question1_2();
        Question1_3 question1_3 = new Question1_3();

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
                !question1_2.isPermutationSort("Lololololol", "Lolololololo")
                &&
                question1_3.urlify("Mr John Smith    ", 13).equals("Mr%20John%20Smith")
                &&
                question1_3.urlify("This is a test      ", 14).equals("This%20is%20a%20test"))) {
            System.out.println("Some tests failed");
            System.exit(1);
        }
    }
}
