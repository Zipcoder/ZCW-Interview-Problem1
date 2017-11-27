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

        HashMap<Character, Integer> characterToReplace = new HashMap<Character, Integer>();

        characterToReplace.put('f', 1);
        characterToReplace.put('7', 2);
        characterToReplace.put('s', 3);
        characterToReplace.put('$', 4);
        characterToReplace.put('1', 5);
        characterToReplace.put('!', 6);
        characterToReplace.put('a', 7);
        characterToReplace.put('@', 8);


        HashMap<String, String> stringConverted = new HashMap<String, String>();


        String text = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";


        Map<String, String> result = Arrays.stream(text.split(" "))
                .map(s -> s.split("="))
                .collect(Collectors.toMap(
                        a -> a[0],
                        a -> a[1]
                ));



    }


}
