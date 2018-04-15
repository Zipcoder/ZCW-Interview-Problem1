package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Problem1Test {

    @Test
    public void replacementTest(){
        Problem1 test = new Problem1();
        Map<Character, Character> testMap = new HashMap<Character, Character>();

        testMap.put('f','7');
        testMap.put('s', '$');
        testMap.put('1', '!');
        testMap.put('a', '@');

        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = test.stringReplacer(input);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void replacementRecursionTest(){
        Problem1 test = new Problem1();
        HashMap<String, String> testMap = new HashMap<String, String>();


        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = test.stringRecursion(input);

        Assert.assertEquals(expected, actual);
    }
}
