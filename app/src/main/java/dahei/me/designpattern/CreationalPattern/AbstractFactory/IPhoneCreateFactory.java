package dahei.me.designpattern.CreationalPattern.AbstractFactory;

/**
 * Created by su on 2016/6/16.
 */
public class IPhoneCreateFactory extends SuperIPhoneFactory {
    @Override
    IPhone5 createIPhone5() {
        return new IPhone5();
    }

    @Override
    IPhone6s createIPhone6s() {
        return new IPhone6s();
    }
}
