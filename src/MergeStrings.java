public class MergeStrings {

    public String mergeAlternatively(String word1, String word2) {
        int lengthOfWord1 = word1.length();
        int lengthOfWord2 = word2.length();
        int smallestWord = Math.min(word1.length(), word2.length());
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        while (counter != smallestWord) {
            sb.append(word1.charAt(counter));
            sb.append(word2.charAt(counter));
            counter++;
        }
        if (lengthOfWord1 > lengthOfWord2)
            sb.append(word1, counter, lengthOfWord1);
        else if (lengthOfWord2 > lengthOfWord1)
            sb.append(word2, counter, lengthOfWord2);
        return sb.toString();
    }

}
