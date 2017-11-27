package io.zipcoder;

import java.util.HashMap;

public class Problem1 {

    public String replaceByIteration(String input) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("f", "7");
        map.put("s", "$");
        map.put("1", "!");
        map.put("a", "@");

        String returnString = "";

        for (int i = 0; i < input.length(); i++) {
            String currentSubstring = input.substring(i, i + 1);

            if (currentSubstring.equals("f") || currentSubstring.equals("s") || currentSubstring.equals("1") || currentSubstring.equals("a")) {
                returnString += map.get(currentSubstring);
            } else {
                returnString += currentSubstring;
            }
        }
        return returnString;
    }

    public String replaceByRecursion(String input) {
        String returnString;
        returnString = input.substring(0,1);
        //returnString += replaceByRecursion(returnString);
        return returnString;
    }
}
