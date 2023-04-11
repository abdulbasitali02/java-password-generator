/*
 * This class represents an alphabet. I'm going to use StringBuilders to help me.
 */

public class Alphabet {
    
    // Fields
    private StringBuilder alphabet;

    public static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String DIGITS = "0123456789";
    public static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+-=,./<>?;:'\"[]{}\\|`~";

    public Alphabet(boolean containsUppercase, boolean containsLowecase, boolean containsDigits, boolean containsSpecialCharacters) {
        alphabet = new StringBuilder();
        if (containsUppercase) {
            alphabet.append(UPPERCASE);
        }
        if (containsLowecase) {
            alphabet.append(LOWERCASE);
        }
        if (containsDigits) {
            alphabet.append(DIGITS);
        }
        if (containsSpecialCharacters) {
            alphabet.append(SPECIAL_CHARACTERS);
        }
        else {
            System.out.println("You must include at least one character set.");
        }
    }

    // Returns the alphabet as a String
    public String getAlphabet() {
        return alphabet.toString();
    }
}
