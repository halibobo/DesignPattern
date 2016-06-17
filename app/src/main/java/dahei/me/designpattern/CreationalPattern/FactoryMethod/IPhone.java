package dahei.me.designpattern.CreationalPattern.FactoryMethod;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/16.
 */
public class IPhone extends Phone {

    public String name = "iphone";


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
