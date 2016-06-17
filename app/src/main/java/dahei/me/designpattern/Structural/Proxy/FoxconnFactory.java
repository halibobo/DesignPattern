package dahei.me.designpattern.Structural.Proxy;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.IPhone;

/**
 * Created by su on 2016/6/17.
 */

/**
 * 富士康工厂
 */
public class FoxconnFactory implements ProductIPhoneInterface {

    @Override
    public IPhone createIPhone() {
        IPhone iPhone = new IPhone();
        iPhone.setName("iphone product by Foxconn");
        iPhone.setPrice(3599);
        return iPhone;
    }
}
