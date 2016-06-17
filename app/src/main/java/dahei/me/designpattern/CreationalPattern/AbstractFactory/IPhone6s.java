package dahei.me.designpattern.CreationalPattern.AbstractFactory;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.IPhone;

/**
 * Created by su on 2016/6/16.
 */
public class IPhone6s extends IPhone {
    public String name = "iphone 6s";
    public double price = 6000;

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
