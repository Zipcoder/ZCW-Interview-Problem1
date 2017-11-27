package io.zipcoder;

import java.util.HashMap;

public class Problem1 {

    private HashMap<Character, Character> replaceChars = new HashMap<Character, Character>();

    public Problem1() {
        replaceChars.put('f', '7');
        replaceChars.put('s', '$');
        replaceChars.put('1', '!');
        replaceChars.put('a', '@');
    }

    public String replaceCharsByIteration(String input) {
        char[] allChars = input.toCharArray();
        for(int i = 0; i < allChars.length; i++) {
            char c = allChars[i];
            if(replaceChars.containsKey(Character.toLowerCase(c))) {
                allChars[i] = replaceChars.get(Character.toLowerCase(c));
            }
        }

        return new String(allChars);
    }

    public String replaceCharsByRecursion(String input) {
        char[] allChars = input.toCharArray();
        for(char c : replaceChars.keySet()) {
            int index = input.indexOf(Character.toLowerCase(c));
            if(index > -1) {
                allChars[index] = replaceChars.get(c);
                input = new String(allChars);
                replaceCharsByRecursion(input);
            }
            else {
                index = input.indexOf(Character.toUpperCase(c));
                if(index > -1) {
                    allChars[index] = replaceChars.get(c);
                    input = new String(allChars);
                    replaceCharsByRecursion(input);
                }
            }
        }
        return input;
    }

}
