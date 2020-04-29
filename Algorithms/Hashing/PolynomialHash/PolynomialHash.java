
public class PolynomialHash {

    private int modulus;
    private int base;

    public PolynomialHash() {
        this.modulus = 101;
        this.base = 37;
    }

    public PolynomialHash(int modulus, int base) {
        this.modulus = modulus;
        this.base = base;
    }

    public int hash(String word) {
        int wordLength = word.length();
        int charCode, hash = 0;
        for (int i = 0; i < wordLength; i++) {
            charCode = (int) word.charAt(i);
            hash += charCode * Math.pow(this.base, wordLength - 1 - i);
            // there is a more effective process than this
            // using Horner's method
            // hash = (hash * this.base + charCode)
            hash = Math.floorMod(hash, this.modulus);
        }
        return hash;
    }

    public int roll(int hash, char prevChar, char newChar, int wordLength) {
        int prevCharHash = (int) (((int) prevChar) * Math.pow(this.base, wordLength - 1));
        int newCharHash = (int) newChar;

        int newHash = (hash - prevCharHash) * this.base + newCharHash;
        newHash = Math.floorMod(newHash, this.modulus);

        return newHash;
    }
}
