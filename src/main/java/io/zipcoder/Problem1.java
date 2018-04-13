package io.zipcoder;

import java.util.*;

public class Problem1 {

    public static String replaceWithIteration(HashMap<String, String> map, String input) {
        Set<String> keys = map.keySet();
        for(String key : keys) {
            input = input.replaceAll(key, "\\" + map.get(key));
        }
        return input;
    }

    public static String replaceWithRecursion(HashMap<String, String> map, String input) {
        Set<String> keys = map.keySet();

        if(keys.isEmpty()) {
            return input;
        } else {
            String s = keys.iterator().next();
            input = input.replaceAll(s, "\\" + map.get(s));
            map.remove(s);
        }

        return replaceWithRecursion(map, input);
    }
}
