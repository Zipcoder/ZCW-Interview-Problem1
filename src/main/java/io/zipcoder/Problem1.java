package io.zipcoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem1 {

    Map map;

    private void initializeMap() {
        map = new HashMap<Character, Character>();
        map.put('f', '7');
        map.put('s', '$');
        map.put('1', '!');
        map.put('a', '@');
    }

    //{ 'f' : '7', 's':'$', '1':'!', 'a':'@'}

    public String iterationReplacement(String input) {
        initializeMap();

        String output = input;

        //StringBuilder output = new StringBuilder();
//        output.append(input);

        for (int i = 0; i < output.length(); i++) {
            Character ch = output.charAt(i);
            if(map.containsKey(ch)) {
                Character value = map.
                output = output.replaceAll(ch.toString(), map.get(ch));
            }
        }

        return output.toString();
    }

    public String recursionReplacement(String input) {
        String output = null;
        return output;
    }


}
