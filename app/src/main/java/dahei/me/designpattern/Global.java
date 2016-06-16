package dahei.me.designpattern;

import dahei.me.designpattern.Behavioral.Strategy.StrategyActivity;
import dahei.me.designpattern.CreationalPattern.AbstractFactory.AbstractFactoryActivity;
import dahei.me.designpattern.CreationalPattern.Builder.BuilderActivity;
import dahei.me.designpattern.CreationalPattern.FactoryMethod.FactoryMethodActivity;

/**
 * Created by su on 2016/6/16.
 */
public class Global {
    public static String[][] mData = {
            {"Strategy(策略模式)", StrategyActivity.class.getName()},
            {"Factory Method(工厂方法模式)", FactoryMethodActivity.class.getName()},
            {"Abstract Factory(抽象工厂模式)", AbstractFactoryActivity.class.getName()},
            {"Builder(建造者模式)", BuilderActivity.class.getName()},
    };
}
