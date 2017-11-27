package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

    @Test
    public void replaceByIterationTest() {
        String input = "The farmer went to the store to get 1 dollar's worth of fertilizer";

        String actual = new Problem1().replaceByIteration(input);

        String expected = "The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceByRecursionTest() {
        String input = "The farmer went to the store to get 1 dollar's worth of fertilizer";

        String actual = new Problem1().replaceByRecursion(input);

        String expected = "The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer";

        Assert.assertEquals(expected, actual);
    }

}
