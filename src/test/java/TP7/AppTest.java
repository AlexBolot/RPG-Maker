package TP7;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/*................................................................................................................................
 . Copyright (c)
 .
 . The AppTest	 Class was Coded by :
 . -> Alexandre BOLOT
 . -> Christopher SABOYA
 .
 . Last Modified : 29/01/17 16:43
 .
 . Contact : bolotalex06@gmail.com
 ...............................................................................................................................*/

/**
 Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     Create the test case
 
     @param testName name of the test case
     */
    public AppTest (String testName)
    {
        super(testName);
    }
    
    /**
     @return the suite of tests being tested
     */
    public static Test suite ()
    {
        return new TestSuite(AppTest.class);
    }
    
    /**
     Rigourous Test :-)
     */
    public void testApp ()
    {
        assertTrue(true);
    }
}
