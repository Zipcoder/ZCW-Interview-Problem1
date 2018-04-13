package io.zipcoder;

import java.util.HashMap;
import java.util.Set;

public class Problem1 {

    public static String replaceWithIteration(HashMap<String, String> map, String input) {
        Set<String> keys = map.keySet();
        for(String key : keys) {
            input = input.replaceAll(key, "\\" + map.get(key));
        }
        return input;
    }
}
