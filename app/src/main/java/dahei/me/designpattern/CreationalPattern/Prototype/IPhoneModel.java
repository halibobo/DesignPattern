package dahei.me.designpattern.CreationalPattern.Prototype;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.IPhone;
import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/16.
 */
public class IPhoneModel extends PhoneModel {
    @Override
    public Phone clone() {
        Phone iphone = new IPhone();
        iphone.setPrice(4500);
        return iphone;
    }
}
