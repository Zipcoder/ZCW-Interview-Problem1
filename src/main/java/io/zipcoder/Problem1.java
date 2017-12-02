package io.zipcoder;

import java.util.Map;

public class Problem1 {

    public String replaceByIteration(Map aMap, String input) {
        StringBuilder output = new StringBuilder();
        for (String aChar : input.split("")){
            if (aMap.containsKey(aChar)){
                output.append(aMap.get(aChar));
            }
            else {
                output.append(aChar);
            }
        }
        return output.toString();
    }

    public String replaceByRecursion(Map aMap, String input, String output, Integer index) {
        String[] inputSplit = input.split("");

        String currentChar = inputSplit[index];
        if (aMap.containsKey(currentChar)){
            output += aMap.get(currentChar);
        }
        else {
            output += currentChar;
        }

        if (index<inputSplit.length-1) {
            index++;
            output = replaceByRecursion(aMap, input, output, index);
        }

        return output;
    }

}
