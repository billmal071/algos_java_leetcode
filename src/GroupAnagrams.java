import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grouped = new HashMap<>();
        int i = 0;
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            grouped.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
            i++;
        }
        return new ArrayList<>(grouped.values());
    }
}
