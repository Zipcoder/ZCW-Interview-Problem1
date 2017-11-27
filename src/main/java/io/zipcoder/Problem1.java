package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem1 {

//    Input = “The Farmer went to the store to get 1 dollar’s worth of fertilizer”
//    Output = “The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer”

//break it down "The Farmer" to "The 7@rmer" no change for the first word
// but I need to change F to 7 and a to @ for the second word.
    //where to scan in input? in unit test?
    // write unit test
    //key is f, value is 7, how to replace key with value?
    //{ ‘f’ : ‘7’,
    // ‘s’:’$’,
    // ‘1’:’!’,
    // ‘a’.:’@’} map?
    //change the word.. substring
    //toString back to a sentence

    public static void main(String[] args)throws Exception {

//        String s2 = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
//        String[] t = s2.split("(?= )");
//        for (String e : t)
//        System.out.println(e);

        StringBuilder pattern = new StringBuilder();


        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        Matcher m = Pattern.compile(pattern.substring(1)).matcher(input);

    }

}
