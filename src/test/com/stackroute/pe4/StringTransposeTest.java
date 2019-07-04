package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {
    StringTranspose stringTranspose;
    @Before
    public void setUp(){
        stringTranspose=new StringTranspose();

    }
    @After
    public void tearDown()
    {
        stringTranspose=null;
    }
    @Test
    public void givenStringInputShouldReturnTransposedString()
    {

        String actual=stringTranspose.transpose("daily dry");
        assertEquals("yliad yrd",actual);

    }
    @Test
    public void givenStringInputShouldReturnTransposeOfString()
    {

        String actual=stringTranspose.transpose("this is that and is reversed");
        assertEquals("siht si taht dna si desrever",actual);

    }
    @Test
    public void givenEmptyStringShouldReturnEmptyString()
    {

        String actual=stringTranspose.transpose("");
        assertEquals("",actual);

    }


}