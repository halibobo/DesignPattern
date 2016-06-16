package dahei.me.designpattern.CreationalPattern.FactoryMethod;

import dahei.me.designpattern.Behavioral.Strategy.NokiaPhone;

/**
 * Created by su on 2016/6/16.
 */

/**
 * nokia手机工厂
 */
public class NokiaPhoneFactory extends PhoneFactory {
    @Override
    public Phone createPhone() {
        return new NokiaPhone();
    }
}
