package com.xyz.solution;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SolutionTest extends TestCase{
	  /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolutionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SolutionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSolution()
    {
        assertTrue( true );
    }
}
