package dahei.me.designpattern.Behavioral.Strategy;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/16.
 */
public class IPhone extends Phone implements PriceStrategy {

    public String name = "iphone";

    @Override
    public double getStrategyPrice() {
        return getPrice();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}