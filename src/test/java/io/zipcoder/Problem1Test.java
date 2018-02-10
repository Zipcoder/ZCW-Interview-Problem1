package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class Problem1Test {

    Problem1 problem1;
    HashMap<Character,Character> map;
    String input;

    @Before
    public void setUp() {
        map = new HashMap<Character, Character>();
        map.put('f', '7');
        map.put('s', '$');
        map.put('1', '!');
        map.put('a', '@');
        problem1 = new Problem1();
        input = "The farmer went to the store to get 1 dollar’s worth of fertilizer";

    }

    @Test
    public void Test(){


        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = Problem1.replaceCharsInString(input,map);

        Assert.assertEquals(expected,actual);
    }
}
