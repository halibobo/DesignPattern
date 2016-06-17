package dahei.me.designpattern.CreationalPattern.Prototype;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/16.
 */
public class PhoneMachine {
    private PhoneModel phoneModel;

    public PhoneMachine(PhoneModel phoneModel) {
        this.phoneModel = phoneModel;
    }

    public Phone createPhone() {
        return phoneModel.clone();
    }
}
