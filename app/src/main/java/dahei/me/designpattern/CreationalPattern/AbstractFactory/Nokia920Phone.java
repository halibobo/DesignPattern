package dahei.me.designpattern.CreationalPattern.AbstractFactory;

import dahei.me.designpattern.Behavioral.Strategy.NokiaPhone;

/**
 * Created by su on 2016/6/16.
 */
public class Nokia920Phone extends NokiaPhone {
    public String name = "Nokia 920";
    public double price = 2000;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
