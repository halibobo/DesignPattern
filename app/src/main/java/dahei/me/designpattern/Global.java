package dahei.me.designpattern;

import dahei.me.designpattern.Behavioral.Strategy.StrategyActivity;
import dahei.me.designpattern.CreationalPattern.AbstractFactory.AbstractFactoryActivity;
import dahei.me.designpattern.CreationalPattern.Builder.BuilderActivity;
import dahei.me.designpattern.CreationalPattern.FactoryMethod.FactoryMethodActivity;
import dahei.me.designpattern.CreationalPattern.Prototype.PrototypeActivity;
import dahei.me.designpattern.CreationalPattern.Singleton.SingletonActivity;
import dahei.me.designpattern.Structural.AdapterPattern.AdapterActivity;
import dahei.me.designpattern.Structural.Proxy.ProxyActivity;

/**
 * Created by su on 2016/6/16.
 */
public class Global {
    public static String[][] mData = {
            {"Strategy(策略模式)", StrategyActivity.class.getName()},
            {"Factory Method(工厂方法模式)", FactoryMethodActivity.class.getName()},
            {"Abstract Factory(抽象工厂模式)", AbstractFactoryActivity.class.getName()},
            {"Builder(建造者模式)", BuilderActivity.class.getName()},
            {"Prototype(原型模式)", PrototypeActivity.class.getName()},
            {"Singleton(单例模式)", SingletonActivity.class.getName()},
            {"Proxy(代理模式)", ProxyActivity.class.getName()},
            {"Adapter(适配器模式)", AdapterActivity.class.getName()},
    };
}
