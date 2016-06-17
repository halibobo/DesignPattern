package dahei.me.designpattern.Structural.AdapterPattern;

/**
 * Created by su on 2016/6/17.
 */
public class ChinaIPhoneCharger extends CommCharger implements Charger {

    @Override
    public String chargeOn220v() {
        return "ChinaIPhoneCharger --- working with 220v";
    }
}
