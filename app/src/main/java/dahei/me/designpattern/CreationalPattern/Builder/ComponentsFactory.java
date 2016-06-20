package dahei.me.designpattern.CreationalPattern.Builder;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/16.
 */
public class ComponentsFactory {
    private PhoneBuilder phoneBuilder;

    public ComponentsFactory(PhoneBuilder componentsMachine) {
        this.phoneBuilder = componentsMachine;
    }

    public Phone getIphone4() {
        phoneBuilder.setPhoneType("iphone4", 1000);
        return phoneBuilder.getPhone();
    }

    public Phone getXiaoMi5() {
        phoneBuilder.setPhoneType("xiami 5", 1999);
        return phoneBuilder.getPhone();
    }

    public Phone getHuaWeiMate() {
        phoneBuilder.setPhoneType("huawei mate8", 3600);
        return phoneBuilder.getPhone();
    }

}
