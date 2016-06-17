package dahei.me.designpattern.CreationalPattern.Singleton;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/17.
 */
public class MyOwnPhone extends Phone {


    private MyOwnPhone() {}

    private static MyOwnPhone instance = null;

    public static MyOwnPhone getInstance(){
        if(instance==null){
            synchronized(MyOwnPhone.class){
                if (instance == null) {
                    instance = new MyOwnPhone();
                    instance.setName("my own phone");
                    instance.setPrice(9999);
                }
            }
        }
        return instance;
    }
}
