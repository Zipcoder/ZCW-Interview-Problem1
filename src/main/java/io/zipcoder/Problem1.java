package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    //need a map
    HashMap <Character, Character> characterMap = new HashMap<Character, Character>();

    public String replaceCharacters(String stringToReplace){
        characterMap.put('f','7');
        characterMap.put('s', '$');
        characterMap.put('1', '!');
        characterMap.put('a', '@');

        char[] charArray = stringToReplace.toCharArray();

        for (int i = 0; i < charArray.length; i++){
            if (charArray[i] == characterMap.)
        }

        return "";
    }

}
