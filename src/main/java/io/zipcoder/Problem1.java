package io.zipcoder;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Problem1 {
    public String toreplaceChar(String input) {

        String input2 = input.toLowerCase();

        HashMap<Character, Character> toReplace = new HashMap<Character, Character>();
        toReplace.put('f' , '7');
        toReplace.put('s' , '$');
        toReplace.put('1' , '!');
        toReplace.put('a' , '@');

        char[] inputArray = input.toCharArray();


        for (int i = 0; i < inputArray.length; i++) {

            if (toReplace.containsKey(input.toLowerCase().charAt(i)))
                inputArray[i] = toReplace.get(input2.charAt(i));
        }

        return new String(inputArray);
    }
}













