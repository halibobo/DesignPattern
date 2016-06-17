package dahei.me.designpattern.CreationalPattern.Prototype;

import dahei.me.designpattern.Behavioral.Strategy.NokiaPhone;
import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/16.
 */
public class NokiaPhoneModel extends  PhoneModel {
    @Override
    public Phone clone() {
        NokiaPhone phone = new NokiaPhone();
        phone.setPrice(1500);
        return phone;
    }
}
