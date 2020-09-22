import java.util.Random;

public class Main
{
    /**
     * Main method.
     *
     * @param args Command line args.
     */
    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++) {
            System.out.println(estimatePie(100000));
        }
    }

    /**
     * Generate a random double between 0 and 1 inclusive.
     *
     * @return The random double.
     */
    private static double random()
    {
        return new Random().nextDouble();
    }

    /**
     * Estimate pie using the random() method.
     *
     * @param n The Number of coordinate pairs to be generated.
     * @return The pie estimate.
     */
    public static double estimatePie(int n)
    {
        double insideCircle = 0;
        double total = 0;
        for (int i = 0; i < n; i++) {
            double x = random();
            double y = random();
            double ans = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            if (ans <= 1) {
                insideCircle++;
            }
            total++;
        }
        return 4 * (insideCircle / total);
    }
}
