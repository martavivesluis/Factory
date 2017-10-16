package edu.upc.edu;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;

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
        Assert.assertEquals(1,FactorySin.getInstance().getCommand("C1").execute());
        Assert.assertEquals(2,FactorySin.getInstance().getCommand("C2").execute());
        Assert.assertEquals(3,FactorySin.getInstance().getCommand("C3").execute());
    }

    public void comprovacio ()
    {


    }
    private void assertTrue(int c1, int i) {

    }
}
