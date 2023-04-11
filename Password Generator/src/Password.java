public class Password {
    
    private String password;
    private int length;

    public Password(String password) {
        this.password = password;
        this.length = password.length();
    }

    public String getPassword() {
        return password;
    }

    /*
     * Need to calculate the Strength of the password to feed into the scoring system. 
     * Scoring System: 
     * Add 2 points to each fulfilled criteria from usage of: UPPERCASE, LOWERCASE, DIGITS, SPECIAL_CHARACTERS;
     * Score --> prints out password strength based on numbers 
     */

     public int generatedPasswordStrengthScore(){
        int score = 0;

        boolean usedUpper = false;
        boolean usedLower = false;
        boolean usedNumber = false;
        boolean usedSpecChar = false;

        if (usedUpper == true) score += 2;
        if (usedLower == true) score += 2;
        if (usedNumber == true) score += 2;
        if (usedSpecChar == true) score += 2;

        if (password.length() >= 9 ) score += 2;
        if (password.length() >= 15) score =+ 2;
        
        return score;
     }
    
}
