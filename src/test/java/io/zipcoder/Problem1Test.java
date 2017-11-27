package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

    @Test
    public void getCharTest(){
        Problem1 problem1 = new Problem1();
        String raw = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        Character expected = 'F';
        Character actual = problem1.getCharAt(raw, 4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decideIfReplaceTrueTest(){
        Problem1 problem1 = new Problem1();
        String raw = "the farmer went to the store to get 1 dollar’s worth of fertilizer";

        Boolean actual = problem1.decideIfReplace(problem1.getCharAt(raw, 5));

        Assert.assertTrue(actual);
    }

    @Test
    public void decideIfReplaceFalseTest(){
        Problem1 problem1 = new Problem1();
        String raw = "the farmer went to the store to get 1 dollar’s worth of fertilizer";

        Boolean actual = problem1.decideIfReplace(problem1.getCharAt(raw, 6));

        Assert.assertFalse(actual);
    }

    @Test
    public void replaceCharTest(){
        Problem1 problem1 = new Problem1();
        String raw = "the farmer went to the store to get 1 dollar’s worth of fertilizer";

        String expected = "the 7armer went to the store to get 1 dollar’s worth o7 7ertilizer";
        String actual = problem1.replaceChar(raw, 'f', 4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void encodeIterateTest(){
        Problem1 problem1 = new Problem1();
        String raw = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer";
        String actual = problem1.encodeIterate(raw);

        Assert.assertEquals(expected, actual);
    }
}
