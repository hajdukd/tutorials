package dh.tutorials.factory.method;

import dh.tutorials.factory.Phone;
import dh.tutorials.factory.Samsung;

public class SamsungCallCentre extends CallCentre {

    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}
