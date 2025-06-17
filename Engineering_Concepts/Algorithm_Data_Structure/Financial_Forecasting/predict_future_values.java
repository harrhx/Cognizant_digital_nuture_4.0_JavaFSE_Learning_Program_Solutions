public class predict_future_values {
    public static void main(String[] args) {
        double initialvalue = 1000.0;
        double annualgrowth = 0.67;
        int yearstoforcast = 10;
        System.out.println("The Financial Forcasting are ");
        System.out.println("Inital Value is " + String.format("%.2f", initialvalue) );
        System.out.println("Annual growth is " + (annualgrowth*100));
        System.out.println("Years stoforast is " + yearstoforcast);


        double futurevalue = predictFutureValue(initialvalue, annualgrowth, yearstoforcast);

        System.out.println("Future value is " + String.format("%.2f", futurevalue));


    }

    public static double predictFutureValue(double currentValue, double growthRate, int periodsLeft) {
        if (periodsLeft == 0) {
            return currentValue;
        }
        double nextValue = currentValue * (1 + growthRate);

        return predictFutureValue(nextValue, growthRate, periodsLeft - 1);
    }
}