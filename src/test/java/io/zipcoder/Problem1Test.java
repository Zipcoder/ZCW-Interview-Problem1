package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class Problem1Test {
    Problem1 problem1;
    HashMap<Character,Character> changeMap;
    String input;

    @Before
    public void setUp() {
        changeMap = new HashMap<Character, Character>();
        changeMap.put('f', '7');
        changeMap.put('s', '$');
        changeMap.put('1', '!');
        changeMap.put('a', '@');
        problem1 = new Problem1();
        input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

    }

    @Test
    public void withLoop(){
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = problem1.changeLetters(input,changeMap);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void withRecursion(){
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = problem1.recursion(input,changeMap);
        Assert.assertEquals(expected,actual);
    }
}
