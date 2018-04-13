package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class Problem1Test {

    @Test
    public void replaceTest() {

        HashMap<String, String> map = new HashMap<>();
        map.put("f", "7");
        map.put("s", "$");
        map.put("1", "!");
        map.put("a", "@");

        String input = "the farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "the 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";

        String actual = Problem1.replaceWithIteration(map, input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceTest2() {
        HashMap<String, String> map = new HashMap<>();
        map.put("f", "7");
        map.put("s", "$");
        map.put("1", "!");
        map.put("a", "@");

        String input = "the farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "f";

        String actual = Problem1.replaceWithIteration(map, input);

        Assert.assertEquals(expected, actual);
    }
}
