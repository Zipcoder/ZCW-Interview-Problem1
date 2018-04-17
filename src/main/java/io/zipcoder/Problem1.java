package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    private Map<Character, Character> map;

    public Problem1() {
        map = new HashMap<Character, Character>();
        initializeMap();
    }

    public Map<Character, Character> getMap() {
        return map;
    }

    public void initializeMap() {
        map.put('f', '7');
        map.put('s', '$');
        map.put('1', '!');
        map.put('a', '@');
    }

    public String replaceCharsWithIteration(String originalString) {
        char[] charArray = originalString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = Character.toLowerCase(charArray[i]);
            if (map.containsKey(c)) {
                charArray[i] = map.get(c);
            }
        }
        return new String(charArray);
    }

    public String replaceCharsWithRecursion(String originalString, int index) {
        char[] charArray = originalString.toCharArray();
        char c = Character.toLowerCase(charArray[index]);
        if (map.containsKey(c)) {
            charArray[index] = map.get(c);
        }
        if (index < originalString.length() - 1) {
            index++;
            return replaceCharsWithRecursion(new String(charArray), index);
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();

        String input = "The Farmer went to the store to get 1 dollar\'s worth of fertilizer";
        String output = "The 7@rmer went to the $tore to get ! doll@r\'$ worth o7 7ertilizer";

        String test = problem1.replaceCharsWithRecursion(input, 0);

        System.out.println(input);
        System.out.println(output);
        System.out.println(test);
    }


}
