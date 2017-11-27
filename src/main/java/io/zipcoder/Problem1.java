package io.zipcoder;

import java.util.HashMap;

public class Problem1 {

    // map { ‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’}
    // Input = “The Farmer went to the store to get 1 dollar’s worth of fertilizer”
    //Output = “The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer”

    public static void main(String[] args) {

        HashMap<String, String> mapKeyValue = new HashMap<String, String>();
        mapKeyValue.put("f", "7");
        mapKeyValue.put("s", "$");
        mapKeyValue.put("1","!");
        mapKeyValue.put("a", "@");



    }



    public static String iterationMethod(){
        String value = "";
        value = value.replaceAll("f", "7");
     //   for (HashMap<String, String> map: )
        if (value.matches("f"))
            value = "7";
        return value;
    }


}
