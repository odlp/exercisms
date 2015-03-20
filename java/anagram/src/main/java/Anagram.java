import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private final String targetWord;

    public Anagram(String word) {
        this.targetWord = sortedLowercaseLetters(word);
    }

    public List<String> match(List<String> wordList) {
        ArrayList<String> matches = new ArrayList<String>();
        for (String potentialMatch : wordList) {
            if (isAnagram(potentialMatch)) {
                matches.add(potentialMatch);
            }
        }
        return matches;
    }

    private boolean isAnagram(String potentialMatch) {
        return sortedLowercaseLetters(potentialMatch).contentEquals(this.targetWord);
    }

    private String sortedLowercaseLetters(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
}