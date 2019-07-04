package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class FrequencyOfOccurencesTest {
    FrequencyOfOccurences frequencyOfOccurences;
    @Before
    public void setUp(){
        frequencyOfOccurences=new FrequencyOfOccurences();

    }
    @After
    public void tearDown()
    {
        frequencyOfOccurences=null;
    }
    @Test
    public void givenStringInputShouldReturnAMapOfOccurrences()
    {
        int  actual=frequencyOfOccurences.countChars("java is java again java",'a');
        assertEquals(8,actual);

    }
    @Test
    public void givenNullStringInputShouldReturnAMapOfOccurrences()
    {

       int  actual=frequencyOfOccurences.countChars(null,'\0');
        assertNotNull("Passed a Null",actual);
     }
    @Test
    public void givenEmptyStringInputShouldReturnAMapOfOccurrences()
    {

        int actual=frequencyOfOccurences.countChars("",'\0');
        assertNotNull("Empty String",actual);
    }


}