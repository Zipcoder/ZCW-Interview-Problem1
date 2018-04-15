package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Problem1Test {

    private Problem1 tester;

    @Before
    public void setup() {
        tester = new Problem1();
    }

    @Test
    public void replaceIterationTest1() {
        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("f", "7");
        testMap.put("s", "$");
        testMap.put("1", "!");
        testMap.put("a", "@");
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = tester.replaceIteration(input, testMap);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceRecursionTest1() {
        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("f", "7");
        testMap.put("s", "$");
        testMap.put("1", "!");
        testMap.put("a", "@");
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = tester.replaceRecursion(input, testMap);
        Assert.assertEquals(expected, actual);
    }

}
