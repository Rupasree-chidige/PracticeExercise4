package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHarryTest {

    FindHarry findHarry;
    @Before
    public void setUp(){
        findHarry=new FindHarry();

    }
    @After
    public void tearDown()
    {
        findHarry=null;
    }
    @Test
    public void givenStringInputShouldReturnContainsHarry()
    {
        boolean actual=findHarry.checkForHarry("This is Harry");
        assertTrue("It contains Harry",actual);
    }
    @Test
    public void givenStringInputShouldReturnNotContainsHarry()
    {
        boolean actual=findHarry.checkForHarry("This is HarryPotter");
        assertFalse("It does not contains Harry",actual);
    }
    @Test
    public void givenEmptyStringShouldReturn()
    {
        boolean actual=findHarry.checkForHarry("");
        assertFalse("It does not contains Harry",actual);
    }
    @Test
    public void givenNullAsInputShouldReturnNull()
    {
        boolean actual=findHarry.checkForHarry(null);
        assertNull("Passed a null string",actual);
    }


}