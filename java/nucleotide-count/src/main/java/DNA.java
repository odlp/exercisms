import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNA {

    private String nucleotides;
    private static final List<Character> VALID_NUCLEOTIDES = Arrays.asList('A', 'C', 'G', 'T');

    public DNA(String nucleotides) {
        this.nucleotides = nucleotides;
    }

    public Integer count(Character nucleotide) {
        if (isInvalidNucleotide(nucleotide)) throw new IllegalArgumentException();

        int lengthWithoutNucleotide = nucleotides.replace(nucleotide.toString(), "").length();
        return nucleotides.length() - lengthWithoutNucleotide;
    }

    public Map<Character, Integer> nucleotideCounts() {
        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();

        for (Character character : VALID_NUCLEOTIDES) {
            counts.put(character, count(character));
        }

        return counts;
    }

    private boolean isInvalidNucleotide(Character nucleotide) {
        return !VALID_NUCLEOTIDES.contains(nucleotide);
    }

}