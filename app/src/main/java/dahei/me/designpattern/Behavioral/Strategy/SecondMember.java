package dahei.me.designpattern.Behavioral.Strategy;

/**
 * Created by su on 2016/6/17.
 */
public class SecondMember implements PriceStrategy {

    @Override
    public double getStrategyPrice(double price) {
        return 0.9 * price;
    }
}
