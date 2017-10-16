package edu.upc.edu;

import junit.framework.Assert;
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
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        Assert.assertEquals(1,FactorySin.getInstance().getCommand("C1").execute());
        Assert.assertEquals(2,FactorySin.getInstance().getCommand("C2").execute());
        Assert.assertEquals(3,FactorySin.getInstance().getCommand("C3").execute());

            }
}
