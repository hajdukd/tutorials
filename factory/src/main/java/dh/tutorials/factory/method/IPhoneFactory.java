package dh.tutorials.factory.method;

import dh.tutorials.factory.IPhone;
import dh.tutorials.factory.Phone;

public class IPhoneFactory extends PhoneFactory {

    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
