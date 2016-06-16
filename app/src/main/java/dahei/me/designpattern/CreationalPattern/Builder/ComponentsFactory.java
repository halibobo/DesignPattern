package dahei.me.designpattern.CreationalPattern.Builder;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/16.
 */
public class ComponentsFactory {
    private ComponentsMachine componentsMachine = new ComponentsMachine();

    public Phone getIphone4() {
        componentsMachine.setPhoneType("iphone4", 1000);
        return componentsMachine.getPhone();
    }

    public Phone getXiaoMi5() {
        componentsMachine.setPhoneType("xiami 5", 1999);
        return componentsMachine.getPhone();
    }

    public Phone getHuaWeiMate() {
        componentsMachine.setPhoneType("huawei mate8", 3600);
        return componentsMachine.getPhone();
    }

}
