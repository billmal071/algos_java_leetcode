public class IsPalindrome {
    public boolean isPalindrome(String s) {
        String formattedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String result = new StringBuilder(formattedString).reverse().toString();
        return formattedString.equals(result);
    }

    public boolean useTwoPointer(String s) {
//        String formattedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.toLowerCase().charAt(i++) != s.toLowerCase().charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
