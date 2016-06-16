package dahei.me.designpattern.CreationalPattern.FactoryMethod;

/**
 * Created by su on 2016/6/16.
 */
public abstract class Phone  {
    public String name;
    public double price;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
