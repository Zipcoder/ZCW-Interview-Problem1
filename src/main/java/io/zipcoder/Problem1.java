package io.zipcoder;

import  java.util.*;

public class Problem1 {

    public static void main(String[] args) {
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String keyReplacers = "‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’";
        String result = "";

        


    }

    public void createHashMap(){
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String keyReplacers = "‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’";
        String result = "";
        HashMap<String,String> values = new HashMap<String, String>();
        //values.put(input,result);
//        for (Map.Entry<String, String> entry : values.entrySet()) {
//            input = input.replace(input + entry.getKey() + result, entry.getValue());
//            result = input;
//        }
//        System.out.println(result);
        values.put("f","7");
        values.put("s","$");
        values.put("1","!");
        values.put("a","@");
        for (Map.Entry<String, String> valueReplacer : values.entrySet()) {
            result = input.replace("f" + "s","7"+"$" );

        }

    }







    //I know I am not there yet. I had a general idea. With more time I would have gotten it. I was going to use the map to replace
    //hasNext



}
