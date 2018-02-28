package dh.tutorials.factory.method;

import dh.tutorials.factory.Phone;
import dh.tutorials.factory.Samsung;

public class SamsungFactory extends PhoneFactory {

    @Override
    public Phone createPhone() {
        return new Samsung();
    }
}
