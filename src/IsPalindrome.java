public class IsPalindrome {
    public boolean isPalindrome(String s) {
        String formattedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String result = new StringBuilder(formattedString).reverse().toString();
        return formattedString.equals(result);
    }
}
