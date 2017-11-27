package io.zipcoder;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.HashMap;

public class Problem1 {

    Problem1() {
    }

    public String charSwap(String input, HashMap<Character, Character> swapMap) {

        char[] inputCharArray = input.toCharArray();

        for (int i = 0; i < inputCharArray.length; i++) {
            if (swapMap.containsKey(inputCharArray[i])) {
                inputCharArray[i] = swapMap.get(inputCharArray[i]).charValue();
            }
        }

        String swappedString = new String(inputCharArray);
        return swappedString;
    }
    

}
