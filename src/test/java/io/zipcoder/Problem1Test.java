package io.zipcoder;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;

public class Problem1Test {

    Problem1 problem1;
    HashMap<Character, Character> swapCharacter;
    String input;

    @Before
    public void setUp(){
        swapCharacter = new HashMap<Character, Character>();
        swapCharacter.put('f', '7');
        swapCharacter.put('s', '$');
        swapCharacter.put('1', '!');
        swapCharacter.put('a', '@');
        problem1 = new Problem1();
        input = "The Farmer went to the store to get 1 dollar's worth of fertilizer";
    }

    @Test
    public void iterationMethod(){
        String expected = "The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer";
        String actual = problem1.iterationMethod(input, swapCharacter);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void recursionMethod(){
        String expected = "The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer";
        String actual = problem1.recursionMethod(input, swapCharacter);
        Assert.assertEquals(expected,actual);
    }
}
