package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Problem1Test {

    Problem1 problem;
    Map<Character, Character> map;
    String input;

    @Before
    public void setUp() {
        map = new HashMap<Character, Character>();
        map.put('f', '7');
        map.put('s', '$');
        map.put('1', '!');
        map.put('a', '@');

        input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
    }

    @Test
    public void replaceThroughIterationTest() {
        //Given
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";

        //When
        String actual = problem.replaceThroughIteration(input, map);

        //Then
        Assert.assertEquals(expected, actual);
    }


}
