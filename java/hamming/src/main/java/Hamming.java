public class Hamming {

    public static Integer compute(String strandOne, String strandTwo) {
        Integer comparableLength = calcComparableLength(strandOne, strandTwo);
        Integer hammingDistance = 0;

        for (int i = 0; i < comparableLength; i++) {
            if (strandOne.charAt(i) != strandTwo.charAt(i)) {
                hammingDistance++;
            }
        }

        return hammingDistance;
    }

    private static Integer calcComparableLength(String string1, String string2) {
        return Integer.min(string1.length(), string2.length());
    }
}