package io.zipcoder;

import java.util.HashMap;

public class Problem1 {

    String stringInput = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
    char[] input = stringInput.toCharArray();
    String result = "";

    public String stringReplace() {

        HashMap<Object, Object> replacerMap = new HashMap<Object, Object>();
        replacerMap.put("f", 7);
        replacerMap.put("s", "$");
        replacerMap.put(1, "!");
        replacerMap.put("a", "@");

        for (HashMap.Entry<Object, Object> val : replacerMap.entrySet()) {

            result = input.replace

        }
        return result;

    }

}
