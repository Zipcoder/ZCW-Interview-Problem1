package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class Problem1Test {

    private HashMap<Character, Character> cypher = new HashMap<Character, Character>(){{
        put('f', '7');
        put('s', '$');
        put('1', '!');
        put('a', '@');
    }};

    @Test
    public void encodeIterateTest(){
        Problem1 problem1 = new Problem1();
        String raw = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        String expected = "The F@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = problem1.encodeIterate(raw, cypher);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void encodeRecursiveTest(){
        Problem1 problem1 = new Problem1();
        String raw = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        String expected = "The F@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = problem1.encodeRecursive(raw, cypher);

        Assert.assertEquals(expected, actual);
    }
}
