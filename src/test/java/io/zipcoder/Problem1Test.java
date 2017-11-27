package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


import static javax.swing.UIManager.put;

public class Problem1Test {



    Problem1 problem1 = new Problem1();

    @Test
    public void findPostionInStringArray(){

        String find = "F";
        Integer expected = 4;
        char convertedString = find.charAt(0) ;
        Integer actual = problem1.findStringInStringArray( convertedString);

        Assert.assertTrue(expected==actual);
    }

    



}
