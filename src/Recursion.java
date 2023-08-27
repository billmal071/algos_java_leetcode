// https://3dfolio-ivory.vercel.app/
public class Recursion {
    // string reversal
    public static String stringReversal(String word) {
        if (word.isEmpty()) return "";
        int count = word.length() - 1;
        return word.charAt(count) + stringReversal(word.substring(0, count));
    }
}
