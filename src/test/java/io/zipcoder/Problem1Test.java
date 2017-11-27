package io.zipcoder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Problem1Test {

    String myString = "The ${F}armer went to the ${s}tore to get ${1} doll${a}r’s worth of fertilizer";
    Problem1 prob = new Problem1();

    @Test
    public void testKataSolution1(){

        String expected = "The 7armer went to the $tore to get ! doll@r’s worth of fertilizer";
        String actual = prob.kataSolution1(myString);
        Assert.assertEquals(expected, actual);

    }
}
