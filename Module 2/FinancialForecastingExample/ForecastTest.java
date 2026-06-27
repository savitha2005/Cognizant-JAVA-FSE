// Main class to test the forecasting program
public class ForecastTest {

    public static void main(String[] args) {

        // Current investment value
        double currentValue = 10000;

        // Annual growth rate (10%)
        double growthRate = 0.10;

        // Number of years
        int years = 5;

        // Calculate future value using recursion
        double futureValue = FinancialForecast.predictFutureValue(currentValue, growthRate, years);

        // Display result
        System.out.println("Current Value : ₹" + currentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);
        System.out.printf("Future Value  : ₹%.2f%n", futureValue);
    }
}