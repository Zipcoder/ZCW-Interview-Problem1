package io.zipcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    private HashMap<Character, Character> cypher = new HashMap<Character, Character>(){{
        put('f', '7');
        put('s', '$');
        put('1', '!');
        put('a', '@');
    }};

    //step1 read character
    //step2 decide if needs replacing
    //step3 replace

    Character getCharAt(String raw, int index){
        return raw.charAt(index);
    }

    Boolean decideIfReplace(Character character){//assume .toLowerCase() has already been called on input String
        Boolean output = false;
        ArrayList<Character> wanted = new ArrayList<>(cypher.keySet());
        for (Character wantChar :
                wanted) {
            if(character.equals(wantChar)) {
                output = true;
            }
        }
        return output;
    }

    String replaceChar(String raw, Character character, int index){
        Character replacement = cypher.get(character);
        return raw.replace(character, replacement);
    }

    public String encodeIterate(String raw){
        String flattened = raw.toLowerCase();
        String output = raw;
        for (int i = 0; i < raw.length(); i++) {
            Character character = getCharAt(flattened, i);
            if (decideIfReplace(character)){
                output = replaceChar(output, character, i);
            }
        }
        return output;
    }
}
