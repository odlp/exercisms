public class Bob {

    public String hey(String string) {
        if (isSilence(string)) {
            return "Fine. Be that way!";
        } else if (isShouting(string)) {
            return "Whoa, chill out!";
        } else if (isAQuestion(string)) {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }

    private boolean isShouting(String string) {
        String lettersOnly = string.replaceAll("[^\\p{L}]", "");
        return lettersOnly.length() > 0 && lettersOnly.contentEquals(lettersOnly.toUpperCase());
    }

    private boolean isSilence(String string) {
        return string.replaceAll("\\s+", "").length() == 0;
    }

    private boolean isAQuestion(String string) {
        return string.endsWith("?");
    }
}
