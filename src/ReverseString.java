public class ReverseString {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[length - i - 1];
            chars[length - i - 1] = chars[i];
            chars[i] = temp;
        }
        return new String(chars);
    }
}
