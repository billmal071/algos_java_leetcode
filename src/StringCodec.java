import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringCodec {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */

    public String encode(List<String> strs) {
        // pattern is len + #
        StringBuilder encodedString = new StringBuilder();
        for (String word : strs) {
            encodedString.append(word.length()).append("#").append(word);
        }
        return encodedString.toString();
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        String pattern = "(\\d#)";
        List<String> result = new ArrayList<>();
        Collections.addAll(result, str.split(pattern));
       return result;
    }
}
