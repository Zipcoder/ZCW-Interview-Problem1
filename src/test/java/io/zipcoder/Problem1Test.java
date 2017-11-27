package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class Problem1Test {

    @Test
    public void charSwapTest(){
        Problem1 problem1 = new Problem1();
        HashMap<Character, Character> swapMap = new HashMap<>();
        swapMap.put('f','7');
        swapMap.put('s','$');
        swapMap.put('1','!');
        swapMap.put('a','@');

        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = problem1.charSwap("The farmer went to the store to get 1 dollar’s worth of fertilizer", swapMap);

        Assert.assertEquals(expected,actual);
    }
}
