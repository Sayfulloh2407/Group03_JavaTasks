package week_04;

import java.util.HashSet;
import java.util.Set;

public class Task3 {

    public static void removeDup(String input) {
        if (input == null || input.isEmpty()) {

        }

        StringBuilder result = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

    }
}
