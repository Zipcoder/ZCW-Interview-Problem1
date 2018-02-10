package io.zipcoder;


import java.util.Map;

// Given the following map { ‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’},
// your method should replace any character represented by a key in the map, with its corresponding value.
//
// Input = “The Farmer went to the store to get 1 dollar’s worth of fertilizer”
// Output = “The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer”
public class Problem1 {



    public static String replaceCharsInString(String input,Map<Character,Character> map) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < input.length(); i++ ) {
            Character currentChar = input.charAt(i);

            if (map.containsKey(currentChar)) {
                currentChar = map.get(currentChar);
                //get returns the value of the key
            }
            builder.append(currentChar);
        }
        return builder.toString();
    }


}
