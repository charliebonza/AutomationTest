package com.cbz.automation;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Another Rigorous Test :-)
     */
    public void testTheAppByDoingSomething() {
        assertFalse (false);
    }

    /**
     * Another Rigorous Test :-)
     */
    public void testTheAppByDoingSomethingElse() {
        assertFalse(false);
    }
}
