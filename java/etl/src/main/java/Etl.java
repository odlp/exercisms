import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> oldValues) {
        Map<String, Integer> newFormat = new HashMap<String, Integer>();

        for (Map.Entry<Integer, List<String>> entry : oldValues.entrySet()) {
            List<String> letters = entry.getValue();
            Integer score = entry.getKey();

            for (String letter : letters) {
                newFormat.put(letter.toLowerCase(), score);
            }
        }
        return newFormat;
    }
}