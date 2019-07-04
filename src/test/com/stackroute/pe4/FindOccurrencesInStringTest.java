package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindOccurrencesInStringTest {

    FindOccurrencesInString findOccurrencesInString;
    @Before
    public void setUp(){
        findOccurrencesInString=new FindOccurrencesInString();

    }
    @After
    public void tearDown()
    {
        findOccurrencesInString=null;
    }
    @Test
    public void givenStringInputShouldReturnAMapOfOccurrences()
    {
        String actual=findOccurrencesInString.findOccurrences("She sells seashells by the seashore","se");
        assertEquals("Found at: 4 - 6\n" + "Found at: 10 - 12\n" + "Found at: 27 - 29\n",actual);

    }
    @Test
    public void givenStringShouldReturnAMapOfOccurrences()
    {
        String actual=findOccurrencesInString.findOccurrences("","se");
        assertEquals("",actual);
    }
    @Test
    public void givenStrShouldReturnAMapOfOccurrences()
    {
        String actual=findOccurrencesInString.findOccurrences(null,null);
        assertNull("Given Null String as Input",actual);
    }



}