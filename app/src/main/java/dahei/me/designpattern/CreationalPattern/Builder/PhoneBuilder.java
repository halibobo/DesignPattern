package dahei.me.designpattern.CreationalPattern.Builder;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/16.
 */
public abstract class PhoneBuilder {
    public abstract void setPhoneType(String name, double price);

    public abstract Phone getPhone();
}
