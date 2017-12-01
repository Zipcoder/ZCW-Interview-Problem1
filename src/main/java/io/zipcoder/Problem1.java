package io.zipcoder;

import java.util.HashMap;
import java.util.Set;

public class Problem1 {

    String encodeIterate (String raw, HashMap<Character, Character> cypher){
        Set<Character> keyChars = cypher.keySet();
        for (Character keyChar :
                keyChars) {
            raw = raw.replace(keyChar, cypher.get(keyChar));
        }
        return raw;
    }

    public String encodeRecursive (String raw, HashMap<Character, Character> cypher){
        return encodeRecursive(raw, cypher, 0);

    }

    private String encodeRecursive (String raw, HashMap<Character, Character> cypher, int index){
        Character keyChar = raw.charAt(index);
        if(cypher.containsKey(keyChar)) {
            raw = raw.replace(keyChar, cypher.get(keyChar));
        }
        if(index == raw.length()-1) {
            return raw;
        } else {
            index++;
            return encodeRecursive(raw, cypher, index);
        }
    }
}
