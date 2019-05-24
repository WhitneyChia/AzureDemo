package whitneyIndexCalculator;

public class IndexCalculator {
	
	public double calculateIndex(double marketCap, double divisor) {
		double indexValue = marketCap/divisor;
		return indexValue;
	}
}
