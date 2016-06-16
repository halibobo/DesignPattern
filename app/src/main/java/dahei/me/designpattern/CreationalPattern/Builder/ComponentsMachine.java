package dahei.me.designpattern.CreationalPattern.Builder;

import dahei.me.designpattern.CreationalPattern.FactoryMethod.Phone;

/**
 * Created by su on 2016/6/16.
 */
public class ComponentsMachine extends PhoneBuilder {

    private Phone phone = new Phone() {
        @Override
        public String getName() {
            return super.getName();
        }
    };

    @Override
    public void setPhoneType(String name, double price) {
        phone.setName(name);
        phone.setPrice(price);
    }

    @Override
    public Phone getPhone() {
        return phone;
    }
}
