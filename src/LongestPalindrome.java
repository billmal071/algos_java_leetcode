public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int length = s.length();
        int maxLength = 0;
        String longestPalindrome = "";
        for (int i = 0; i < length; i++) {
            for (int j = length; j > i; j--) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring)) {
                    if (substring.length() > maxLength) {
                        maxLength = substring.length();
                        longestPalindrome = substring;
                    }
                }
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindrome(String substring) {
        // use 2 pointers
        int i = 0;
        int j = substring.length() - 1;
        while (i < j) {
            if (substring.charAt(i) != substring.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
