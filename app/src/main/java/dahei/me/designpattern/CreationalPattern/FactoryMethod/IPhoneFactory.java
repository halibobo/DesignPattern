package dahei.me.designpattern.CreationalPattern.FactoryMethod;

/**
 * Created by su on 2016/6/16.
 */

/**
 * iphone工厂
 */
public class IPhoneFactory extends PhoneFactory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
