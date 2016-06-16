package dahei.me.designpattern.CreationalPattern.AbstractFactory;

/**
 * Created by su on 2016/6/16.
 */
public class NokiaCreateFactory extends SuperNokiaFactory {
    @Override
    Nokia920Phone createNokia920() {
        return new Nokia920Phone();
    }

    @Override
    Nokia1520Phone createNokia1520() {
        return new Nokia1520Phone();
    }
}
