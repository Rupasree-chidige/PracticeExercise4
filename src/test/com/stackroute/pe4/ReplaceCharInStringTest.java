package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class ReplaceCharInStringTest {
    ReplaceCharInString replaceCharInString;
    @Before
    public void setUp(){
        replaceCharInString=new ReplaceCharInString();

    }
    @After
    public void tearDown()
    {
        replaceCharInString=null;
    }
    @Test
    public void givenStringInputShouldReturnReplacedString()
    {

        String actual=replaceCharInString.replaceChars("daily dry");
        assertEquals("faity fry",actual);

    }
    @Test
    public void givenNullInputShouldReturnNull()
    {

        String actual=replaceCharInString.replaceChars(null);
        assertNull("Given Null input",actual);

    }
    @Test
    public void givenEmptyInputShouldReturnNull()
    {

        String actual=replaceCharInString.replaceChars(null);
        assertNull("Given Null input",actual);

    }



}