// Class containing the recursive forecasting method
public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {

        // Base case: no more years left
        if (years == 0) {
            return currentValue;
        }

        // Calculate value for the next year
        double nextValue = currentValue * (1 + growthRate);

        // Recursive call for remaining years
        return predictFutureValue(nextValue, growthRate, years - 1);
    }
}