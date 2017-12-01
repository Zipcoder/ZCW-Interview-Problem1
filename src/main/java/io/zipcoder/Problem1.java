package io.zipcoder;

import java.util.HashMap;

public class Problem1 {

    public String changeLetters(String str,HashMap<Character,Character> changeMap){
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            Character currentChar = str.charAt(i);
            if(changeMap.containsKey(Character.toLowerCase(currentChar))){
                currentChar = changeMap.get(Character.toLowerCase(currentChar));
            }
            builder.append(currentChar);
        }
        return builder.toString();
    }

    public String recursion(String str,HashMap<Character,Character> changeMap){
        if(str.length() == 0){
            return "";
        }
        Character currentChar = str.charAt(0);
        if(changeMap.containsKey(Character.toLowerCase(currentChar))){
            currentChar = changeMap.get(Character.toLowerCase(currentChar));
        }
        return currentChar + recursion(str.substring(1),changeMap);

    }



    // use replace
}
