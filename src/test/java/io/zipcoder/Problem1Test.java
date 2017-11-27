package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

    @Test
    public void replaceCharsByIterationTest() {
        Problem1 problem1 = new Problem1();
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = problem1.replaceCharsByIteration(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceCharsByRecursionTest() {
        Problem1 problem1 = new Problem1();
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = problem1.replaceCharsByRecursion(input);
        Assert.assertEquals(expected, actual);
    }
}
