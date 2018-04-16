package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    public static void main(String[] args) {

    }

    public static String replaceThroughIteration(String string, Map<Character, Character> swapCharacter) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            Character current = string.charAt(i);
            if (swapCharacter.containsKey(Character.toLowerCase(current))) {
                current = swapCharacter.get(Character.toLowerCase(current));
            }
            stringBuilder.append(current);
            }

        return stringBuilder.toString();
    }
}

