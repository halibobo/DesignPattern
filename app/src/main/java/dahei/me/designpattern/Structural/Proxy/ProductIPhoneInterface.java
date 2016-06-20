package dahei.me.designpattern.Structural.Proxy;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.IPhone;

/**
 * Created by su on 2016/6/17.
 */

/**
 * 生产iphone接口
 */
public abstract class ProductIPhoneInterface {
    public abstract IPhone createIPhone();
}
