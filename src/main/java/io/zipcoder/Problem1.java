package io.zipcoder;

import java.util.HashMap;

public class Problem1 {

    private HashMap <Character, Character> characterMap = new HashMap<Character, Character>();

    public Problem1() {
        characterMap.put('f', '7');
        characterMap.put('s', '$');
        characterMap.put('1', '!');
        characterMap.put('a', '@');
    }

    public String replaceCharacters(String stringToReplace){

        char[] charArray = stringToReplace.toCharArray();

        for (int i = 0; i < charArray.length; i++){
            char charToReplace = charArray[i];
            if (characterMap.containsKey(Character.toLowerCase(charToReplace))){
                charArray[i] = characterMap.get(Character.toLowerCase(charToReplace));
            }
        }

        return new String(charArray);
    }

}
