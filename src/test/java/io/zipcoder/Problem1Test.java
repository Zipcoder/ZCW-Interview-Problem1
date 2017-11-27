package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Problem1Test {
    Problem1 problem1=new Problem1();

    @Test
    public void createMapTest(){
        Character expected='@';
        Character actual=problem1.subInLetter('a');

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void createMapTest2(){
        Character expected='t';
        Character actual=problem1.subInLetter('t');

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void replaceSentenceTest(){
        String given="The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expected="The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer";
        String actual = problem1.replaceSentence(given);

        Assert.assertEquals(expected,actual);

    }
}

