package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {

    @Test
    public void replaceThroughIterationTest() {
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer";
        String actual = replaceThroughIterationTest(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replacedThroughRecursionTest() {

    }


}
