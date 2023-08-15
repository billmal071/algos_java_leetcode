public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String xString = String.valueOf(x);
        for (int i = 0; i < xString.length() / 2; i++) {
            if (xString.charAt(i) != xString.charAt(xString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
