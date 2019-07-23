package ch08;

public class Exercise06 {

    private static boolean allLetters(String word) {
        return word.codePoints().allMatch(i ->Character.isAlphabetic(i));
    }

    private static boolean isValidJavaIdentifier(String word) {
        if (!Character.isJavaIdentifierStart(word.codePointAt(0))) {
           return false;
        }

        return word.codePoints().allMatch(i -> Character.isJavaIdentifierPart(i));
    }

    public static void main(String[] args) {
        //Exercise #06
        System.out.println("Exercise #06");

        //String sentence = "This is a test";
        String sentence = "Hello";

        System.out.println("Are all letters in the word from allLetters method ? = " + allLetters(sentence));

        System.out.println("All all letters in the word from isValidJavaIdentifier method ? = " +
                isValidJavaIdentifier(sentence));
    }
}
