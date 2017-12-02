package io.zipcoder;

import java.util.HashMap;

public class Problem1 {

    public String iterationMethod(String string, HashMap<Character, Character> swapCharacter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++){
            Character current = string.charAt(i);
            if (swapCharacter.containsKey(Character.toLowerCase(current))) {
                current = swapCharacter.get(Character.toLowerCase(current));
            }
            stringBuilder.append(current);
        }
        return stringBuilder.toString();
    }

    public String recursionMethod(String string, HashMap<Character, Character> swapCharacter){
        if(string.length() == 0) {
            return "";
        }
        Character current = string.charAt(0);
        if(swapCharacter.containsKey(Character.toLowerCase(current))){
            current = swapCharacter.get(Character.toLowerCase(current));
        }
        return current + recursionMethod(string.substring(1), swapCharacter);
    }
}
