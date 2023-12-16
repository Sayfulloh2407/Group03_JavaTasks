package week_04;

import java.util.HashMap;
import java.util.Map;

public class Task1 {


    public static Map<Character, Integer> getCharacterFrequency(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Convert input string to character array
        char[] characters = input.toCharArray();

        // Count frequency of each character
        for (char ch : characters) {
            // If the character is already in the map, increment its count
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                frequencyMap.put(ch, 1);
            }
        }
        {
        }
        return frequencyMap;
    }
}