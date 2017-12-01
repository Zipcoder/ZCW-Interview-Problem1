package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class Problem1Test {


    Problem1 problem1 = new Problem1();
    @Test
    public void replaceKey() throws Exception {


        String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";

        String actual = problem1.toreplaceChar("The Farmer went to the store to get 1 dollar’s worth of fertilizer");

        Assert.assertEquals(expected, actual);

    }
}
