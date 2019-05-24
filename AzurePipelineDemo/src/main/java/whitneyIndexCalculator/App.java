package whitneyIndexCalculator;

public class App 
{
    public static void main( String[] args )
    {	
    	IndexCalculator whitneyCalculator = new IndexCalculator();
    	double todayMarketCap = 838399382;
    	double todayDivisor = 38345;
    	double todayIndexValue = whitneyCalculator.calculateIndex(todayMarketCap, todayDivisor);
    	System.out.println(todayIndexValue);
    }
}
