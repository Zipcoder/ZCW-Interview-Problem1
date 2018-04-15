package io.zipcoder;

import java.util.Map;

public class Problem1 {


    public String replaceIteration(String expected, Map<String, String> aMap) {

        String[] stringArray = expected.split("");
        String toReturn = "";

        for (int i = 0; i < stringArray.length; i++) {
            if (aMap.keySet().contains(stringArray[i].toLowerCase())) {
                stringArray[i] = aMap.get(stringArray[i].toLowerCase());
            }
            toReturn += stringArray[i];
        }

        return toReturn;
    }


    public String replaceRecursion(String input, Map<String, String> testMap) {
        String lower = input.toLowerCase();

        if (testMap.keySet().size() == 0) {
            return input.substring(0,1).toUpperCase() + input.substring(1);
        } else {
            String toReturn = lower.replaceAll(testMap.keySet().iterator().next(), "\\" + testMap.get(testMap.keySet().iterator().next()));
            testMap.remove(testMap.keySet().iterator().next());
            return replaceRecursion(toReturn, testMap);
        }


    }


}
