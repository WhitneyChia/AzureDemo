package whitneyIndexCalculator;

import junit.framework.Assert;
import junit.framework.TestCase;

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
    
    public void testIndexCalculator()
    {	
    	IndexCalculator whitneyCalculator = new IndexCalculator();
    	double todayMarketCap = 999999;
    	double todayDivisor = 4;
    	double todayIndexValue = whitneyCalculator.calculateIndex(todayMarketCap, todayDivisor);
        Assert.assertEquals(249999.75, todayIndexValue);
    }
}
