package dh.tutorials.factory.method;

import dh.tutorials.factory.IPhone;
import dh.tutorials.factory.Phone;

public class IPhoneCallCentre extends CallCentre {

    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
