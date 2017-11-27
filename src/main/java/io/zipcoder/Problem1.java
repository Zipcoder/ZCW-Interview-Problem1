package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given the following map { ‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’},
// your method should replace any character represented by a key in the map, with its corresponding value.
//
// Input = “The Farmer went to the store to get 1 dollar’s worth of fertilizer”
// Output = “The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer”
public class Problem1 {



    public static String replaceCharsInString(String input) {
        HashMap<Character,Character> map = populateMap();
        ArrayList<Character> charArrary = getArray(input);

        for (char c: charArrary) {
            if(charArrary.contains(map.get('f')));

        }



//        input.replace('f','7');
//        input.replace('s','$'); //ignored
        return input;
    }

    public static HashMap populateMap(){
        HashMap<Character,Character> map = new HashMap<Character, Character>();

        map.put('f','7');
        map.put('s','$');
        map.put('1','!');
        map.put('a','@');
        return map;
    }

    public static ArrayList<Character> getArray(String input){
        ArrayList<Character> charArrary = new ArrayList <Character>();
        for (char c: input.toCharArray()) {
            charArrary.add(c);
        }
        return charArrary;
    }
}
