package io.zipcoder;

import java.util.HashMap;

import static javax.swing.UIManager.put;

public class Problem1 {

    String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
    HashMap map = new HashMap<String, String>();
    {
        {
            put("f", "7");
            put("s", "$");
            put("1", "!");
            put("a", "@");
        }
    }

    public Integer findStringInStringArray(char s){

        for(int i = 0; i< input.length(); i++){

            char check = input.charAt(i);

            if(check == s){
                return i;
            }
        }
        return null;
    }

    public Integer[] findAllStringsInStringArray(String s){
        return null;
    }
}
