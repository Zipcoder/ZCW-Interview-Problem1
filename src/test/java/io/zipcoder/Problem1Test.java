package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {



    @Test
    public void Test(){
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

        String expected = "";
        String actual = Problem1.replaceCharsInString(input);

        Assert.assertEquals(expected,actual);
    }
}
