package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    //need a map
    private HashMap <Character, Character> characterMap = new HashMap<Character, Character>();

    public Problem1() {
        characterMap.put('f', '7');
        characterMap.put('s', '$');
        characterMap.put('1', '!');
        characterMap.put('a', '@');
    }

    public String replaceCharacters(String stringToReplace){

        char[] charArray = stringToReplace.toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length; i++){
            char charToReplace = charArray[i];
            if (characterMap.containsKey(charToReplace)){
                charArray[i] = characterMap.get(charToReplace);
            }
        }

        return new String(charArray);
    }//replaces letters but gotta fix capitalization

}
