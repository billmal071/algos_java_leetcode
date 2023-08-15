public class NumOfStrings {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) count++;
        }
        System.out.println(count);
        return count;
    }
}
