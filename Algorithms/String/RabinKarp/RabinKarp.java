import java.util.ArrayList;

public class RabinKarp {

    public ArrayList<Integer> search(String text, String pattern) {
        ArrayList<Integer> matches = new ArrayList<>();

        PolynomialHash hasher = new PolynomialHash();

        int patHash = hasher.hash(pattern);
        int patLength = pattern.length();
        int textLength = text.length();

        int currentHash = -1;
        char prevChar, newChar;
        String currentStr;

        for (int index = 0; index <= textLength - patLength; index++) {

            if (currentHash == -1) {
                currentStr = text.substring(index, index + patLength);
                currentHash = hasher.hash(currentStr);

            } else {
                prevChar = text.charAt(index - 1);
                newChar = text.charAt(index + patLength - 1);
                currentHash = hasher.roll(currentHash, prevChar, newChar, patLength);

            }

            if (currentHash == patHash) {
                // Hashes matched
                if (text.substring(index, index + patLength).equals(pattern)) {
                    // Strings are equal
                    matches.add(index);
                }
            }

        }

        return matches;
    }

    public static void main(String[] args) {

        String text = "this is example of Rabin Karp's algorithm, this example algorithm searches patterns in any text";

        String pattern = "this";

        RabinKarp rabinKarp = new RabinKarp();

        ArrayList<Integer> matches = rabinKarp.search(text, pattern);

        if (matches.isEmpty()) {
            System.out.println("Pattern not found in given text");
        }
        for (int i : matches) {
            System.out.println("Found index -> " + i);
        }
    }

}