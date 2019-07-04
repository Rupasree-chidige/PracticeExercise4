package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortStringTest {
    SortString sortString;
    @Before
    public void setUp(){
        sortString=new SortString();

    }
    @After
    public void tearDown()
    {
        sortString=null;
    }
    @Test
    public void givenStringInputShouldReturnAMapOfOccurrences()
    {
        List<String> expected=new ArrayList<>();
        expected.add("be");
        expected.add("is");
        expected.add("sorted");
        expected.add("this");
        expected.add("to");

        List<String> actual=sortString.sortText("this is to be sorted");
        assertEquals(expected,actual);


    }

    @Test
    public void givenNullInputShouldReturnAMapOfOccurrences()
    {

        List<String> actual=sortString.sortText(null);
        assertNull("Passed a null",actual);
    }
    @Test
    public void givenEmptyInputShouldReturnAMapOfOccurrences()
    {

        List<String> actual=sortString.sortText("");
        assertNull("Passed a null",actual);
    }




}