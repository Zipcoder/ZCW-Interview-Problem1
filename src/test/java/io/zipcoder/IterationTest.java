package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class IterationTest {

    String rawData = "‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’";
    String map = "f7s$1!a@";
    char toReplaceWith = 'D';

    @Test
    public void replaceIterationTest(){
        String expected = "";
        Iteration iteration = new Iteration();

        String actual = iteration.replaceUsingIteration(rawData, map, toReplaceWith);

        Assert.assertEquals(expected, actual);
    }
}
