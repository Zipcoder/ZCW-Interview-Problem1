package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    public static void main(String[] args) {

    }

    public static String replaceThroughIteration(String input) {
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('f','7');
        map.put('s', '$');
        map.put('1', '!');
        map.put('a', '@');

        for(Map.Entry<Character, Character> entry : map.entrySet()) {
            //if a key in the map, matches a character in a string, replace with maps value for respective key
            //have the new string returned
        }
    }

    public String replaceThroughRecursion() {

    }

}
