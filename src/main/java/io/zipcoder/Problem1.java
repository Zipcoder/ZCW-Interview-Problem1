package io.zipcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem1 {

    public static void main(String[] args) {

        replaceChar();

    }

    public static void replaceChar() {

        HashMap<Character, Character> map = new HashMap<>();
        // ‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’
        map.put('f', '7');
        map.put('s', '$');
        map.put('1', '!');
        map.put('a', '@');

        String text = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        char[] splitString = text.toCharArray();

        for (int i = 0; i < splitString.length; i++) {
            if (map.containsKey(splitString[i])) {
                splitString[i] = map.get(splitString[i]);
            }
        }

        System.out.println(new String(splitString));


    }


}
