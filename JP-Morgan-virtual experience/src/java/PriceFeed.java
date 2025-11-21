
import java.util.Random;

public class PriceFeed {
    private Random r = new Random();

    public double generatePrice(double lastPrice) {
        double change = (r.nextDouble() - 0.5) * 2;
        return Math.max(1, lastPrice + change);
    }
}
