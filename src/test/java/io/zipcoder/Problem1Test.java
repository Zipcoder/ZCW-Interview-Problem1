package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem1Test {

    private Problem1 problem1;
    private String input = "The Farmer went to the store to get 1 dollar\'s worth of fertilizer";
    private String output = "The 7@rmer went to the $tore to get ! doll@r\'$ worth o7 7ertilizer";

    @Before
    public void setup() {
        problem1 = new Problem1();
    }

    @Test
    public void initializeMapTest() {
        // Given
        char key = 'f';
        char expectedValue = '7';
        // When
        char actualValue = problem1.getMap().get('f');
        // Then
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void replaceCharsTest() {
        // Given
        String expectedOutput = output;
        // When
        String actualOutput = problem1.replaceChars(input);
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }


}
