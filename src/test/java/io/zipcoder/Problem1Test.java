package io.zipcoder;
import io.zipcoder.Problem1;

//Example:
//One method using iteration, another using recursion
//Given the following map { ‘f’ : ‘7’, ‘s’:’$’, ‘1’:’!’, ‘a’.:’@’}, your method should
// replace any character represented by a key in the map, with its corresponding value.

import org.junit.Assert;
import org.junit.Test;

//Input = “The Farmer went to the store to get 1 dollar’s worth of fertilizer”
// Output = “The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer”
public class Problem1Test {

    @Test
    public void testIterativeSolution(){

        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expectedOutput = "The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer";
        String actualOutput = Problem1.iterativeSolution(input);
        Assert.assertEquals(expectedOutput, actualOutput);

    }



    @Test
    public void testRecursiveSolution(){
        String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";
        String expectedOutput = "The 7@rmer went to the $tore to get ! doll@r’$ worth of 7ertilizer";
        String actualOutput = Problem1.recursiveSolution(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}
