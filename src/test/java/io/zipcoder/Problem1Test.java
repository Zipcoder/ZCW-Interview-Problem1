package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Problem1Test {
    Problem1 problem = new Problem1();
    @Test
    public void testAddMap(){
        problem.addMap();
    }
    @Test
    public void testReplaceChar(){
        problem.addMap();
        problem.replaceChar();
       String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer";
       String actual= problem.replaceChar();
        Assert.assertEquals(expected,actual);
    }
}
