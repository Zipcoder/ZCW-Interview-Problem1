package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem1Test {

    Problem1 prollem;

    @Before
    public void setup() {
        prollem = new Problem1();
    }

    @Test
    public void iterationConversionTest() {
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer";
        String actual = prollem.iterationReplacement(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void recursionConversionTest() {
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer";
        String actual = prollem.iterationReplacement(input);

        Assert.assertEquals(expected, actual);
    }

}
