package dahei.me.designpattern.Structural.Proxy;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.IPhone;

/**
 * Created by su on 2016/6/17.
 */

/**
 * iphone工厂
 */
public class IPhoneProductFactory {
    private FoxconnFactory foxconnFactory = new FoxconnFactory();

    public IPhone createIPhone() {
        return foxconnFactory.createIPhone();
    }
}
