import java.util.ArrayList;
import java.util.List;

public class PrintVertically {
    public List<String> printVertically(String s) {
        String[] splitString = s.split(" ");
        List<String> vertical = new ArrayList<>();
        int maxWordLength = 0;

        for (String word : splitString) {
            maxWordLength = Math.max(maxWordLength, word.length());
        }

        for (int i = 0; i < maxWordLength; i++) {
            vertical.add("");
        }

        for (String word : splitString) {
            for (int i = 0; i < maxWordLength; i++) {
                StringBuilder sb = new StringBuilder(vertical.get(i));
                if (i >= word.length()) {
                    vertical.set(i, String.valueOf(sb.append("")));
                } else {
                    vertical.set(i, String.valueOf(sb.append(word.charAt(i))));
                }
            }
        }

        vertical.replaceAll(String::stripTrailing);

        return vertical;
    }
}
