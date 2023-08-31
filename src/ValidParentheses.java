import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> match = new Stack<>();
        List<Character> openingBrackets = new ArrayList<>(List.of('(', '[', '{'));
        List<Character> closingBrackets = new ArrayList<>(List.of(')', ']', '}'));
        if (s.isEmpty()) return false;
        // if the first one is not an opening bracket, it's false
        if (!openingBrackets.contains(s.toCharArray()[0])) {
            return false;
        }
        // if the last one is not a closing bracket, it's false
        if (!closingBrackets.contains(s.toCharArray()[s.length() - 1])) return false;
        // if the first one is a closing bracket, it's false
        if (closingBrackets.contains(s.toCharArray()[0])) return false;
        for (char c : s.toCharArray()) {
            if (openingBrackets.contains(c)) {
                match.push(c);
            } else if (closingBrackets.contains(c)) {
                if (match.isEmpty()) return false;
                char popped = match.pop();
                int indexOfOpeningBracket = openingBrackets.indexOf(popped);
                int indexOfClosingBracket = closingBrackets.indexOf(c);
                if (indexOfClosingBracket != indexOfOpeningBracket) {
                    return false;
                }
            }
        }
        return match.isEmpty();
    }
}
