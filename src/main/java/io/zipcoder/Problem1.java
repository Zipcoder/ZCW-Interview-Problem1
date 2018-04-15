package io.zipcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    private Map<Character, Character> replaceMap;

    public Problem1(){
        replaceMap = new HashMap<Character, Character>();
        replaceMap.put('f','7');
        replaceMap.put('s', '$');
        replaceMap.put('1', '!');
        replaceMap.put('a', '@');
    }

    public String stringReplacer(String input){
        replaceMap.put('f','7');
        replaceMap.put('s', '$');
        replaceMap.put('1', '!');
        replaceMap.put('a', '@');
        char[] inputString = input.toCharArray();
        for (int i = 0; i < inputString.length; i++){
            char c = inputString[i];
            if(replaceMap.containsKey(Character.toLowerCase(c))){
                inputString[i] = replaceMap.get(Character.toLowerCase(c));
            }
        }
        return new String(inputString);
    }

    public String stringRecursion(String input){

        char[] inputString = input.toCharArray();
        for (char c : replaceMap.keySet()){
            int index = input.indexOf(Character.toLowerCase(c));
            if (index > -1 ){
                inputString[index] = replaceMap.get(c);
                input = new String(inputString);
                stringRecursion(input);
            }
            else {
                index = input.indexOf(Character.toUpperCase(c));
                if (index > -1) {
                    inputString[index] = replaceMap.get(c);
                    input = new String(inputString);
                    stringRecursion(input);
                }
            }
        }
        return input;
    }


}
