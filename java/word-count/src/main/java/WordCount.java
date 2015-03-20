import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> Phrase(String phrase) {
        String sanitizedPhrase = stripUnwantedChars(phrase);
        String[] words = splitToLowercaseWords(sanitizedPhrase);
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        for (String word : words) {
            int newCount = wordCount.getOrDefault(word, 0) + 1;
            wordCount.put(word, newCount);
        }

        return wordCount;
    }

    private String[] splitToLowercaseWords(String string) {
        return string.toLowerCase().split("\\s");
    }

    private String stripUnwantedChars(String rawString) {
        String withoutSpecialChars = rawString.replaceAll("[^a-zA-Z0-9 ]", "");
        return withoutSpecialChars.replaceAll(" +", " ");
    }

}