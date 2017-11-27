package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
    Map<Character, Character> map = new HashMap<Character, Character>();

    public void mapCreate() {
        map.put('f', '7');
        map.put('s', '$');
        map.put('1', '!');
        map.put('a', '@');

    }

    public String changeString(String input, Map<Character, Character> map) {
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.indexOf(i) != ' ') {
                Character character = convertToMapValues(input.charAt(i));
                input.replace(input.charAt(i),character);

            }
        }
        return input;
    }

    public Character convertToMapValues(Character character) {
        Character newChar = null;
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (character.toString().equalsIgnoreCase(entry.getKey().toString())) {
                newChar = entry.getValue();
                return newChar;
            }
            else return character;

        }
        return null;
    }
}
