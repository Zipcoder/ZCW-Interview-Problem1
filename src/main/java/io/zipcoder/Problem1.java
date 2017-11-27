package io.zipcoder;

import java.util.HashMap;
import java.util.*;

public class Problem1 {

    public Problem1() {
    }

    public String kataSolution1(String str) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("F", "7");
        map.put("s", "$");
        map.put("1", "!");
        map.put("a", "@");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str = str.replace("${" + entry.getKey() + "}", entry.getValue());
        }
        System.out.println(str);
        return str;
    }
}
