package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Problem1Test {

    @Test
    public void replaceByIterationTest() {
        String input = "The farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        Map<String,String> mapKey = new HashMap<String, String>();

        mapKey.put("f","7");
        mapKey.put("s","$");
        mapKey.put("1","!");
        mapKey.put("a","@");

        Problem1 problem1 = new Problem1();

        String actual = problem1.replaceByIteration(mapKey, input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void replaceByRecursionTest() {
        String input = "The farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        Map<String,String> mapKey = new HashMap<String, String>();

        mapKey.put("f","7");
        mapKey.put("s","$");
        mapKey.put("1","!");
        mapKey.put("a","@");

        Problem1 problem1 = new Problem1();
        String output = "";

        String actual = problem1.replaceByRecursion(mapKey, input, output,0);

        Assert.assertEquals(expected,actual);
    }
}
